package ir.parsianinsurance.he.domain.scheduled;

import ir.parsianinsurance.he.domain.model.*;
import ir.parsianinsurance.he.domain.model.enums.NoeShakhs;
import ir.parsianinsurance.he.domain.service.IKhesaratService;
import ir.parsianinsurance.he.infrastructure.logging.ArtifactLog;
import ir.parsianinsurance.he.infrastructure.logging.SanamLog;
import ir.parsianinsurance.he.infrastructure.repository.ArtifactLogRepository;
import ir.parsianinsurance.he.infrastructure.repository.SanamLogRepository;
import ir.parsianinsurance.he.infrastructure.service.IArtifactLogService;
import ir.parsianinsurance.he.infrastructure.service.ISanamService;
import org.primefaces.json.JSONObject;

import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Mohammad on 8/24/2017.
 */
@Startup
@Singleton
public class SanamJob {

    @Inject
    ISanamService sanamService;

    @Inject
    ArtifactLogRepository artifactLogRepository;

    @Inject
    SanamLogRepository sanamLogRepository;

    @Inject
    IKhesaratService khesaratService;

    @Inject
    IArtifactLogService artifactLogService;

    @Schedule(hour="*", minute = "*/1", persistent = false)
    public void callSanamDebitJsonService() {

        System.out.print("Try to call sanamService on... ");
        List<ArtifactLog> totalRecordToProcess = artifactLogRepository.findArtifactLogBySanamDoneIsFalse();
        System.out.println(totalRecordToProcess.size()+" records");
        totalRecordToProcess.forEach(x -> takeCareOf(x));
    }

    private void takeCareOf(ArtifactLog log) {

        Artifact artifact = artifactLogService.getArtifact(log);

        if (artifact != null) {
            String requestJson = generateJsonFromArtifact(artifact);
            SanamLog sanamLog = tryToCallSanamService(requestJson);

            sanamLogRepository.save(sanamLog);

            if (sanamLog.getStatus().equals("SANAM_INVOKED_SUCCESSFULLY")) {
                log.setSanamDone(true);
                artifactLogRepository.save(log);
            }
        }
    }

    private String generateJsonFromArtifact(Artifact artifact) {

        String amount = "";
        String rcptName = "";
        String description = "";
        String identifier ="";
        String sarresidDate = "";
        String codeNamayande = "";
        String codeVahedeSodor ="";
        String subsystemName = "IndividualAccident";
        String uniqueCode = "";
        String field = "2610";
        String mohlatSarResid = "0";
        String nationalCode = "";
        String shomareGharardad = "";
        String isDolati = "0";
        String isReal = "0";


        if (artifact instanceof Bimename)
        {
            description = "Policy";
            amount = String.valueOf(((Bimename)artifact).getPishnahadeFaal().getHagheBime().getHaghe_bime_ghabelepardakht());
            rcptName = ((Bimename)artifact).getPishnahadeFaal().getBimeShode().getShakhseHaghighi().toString();
            identifier = ((Bimename)artifact).getShomare();
            uniqueCode = "ACC_BIMENAME_"+((Bimename)artifact).getId();
            codeVahedeSodor = ((Bimename)artifact).getVahedeSodoor().getCode();
            codeNamayande = ((Bimename)artifact).getPishnahadeFaal().getVahed().getCode();
            sarresidDate = ((Bimename)artifact).getTarikhesodoor();
            nationalCode = ((Bimename)artifact).getPishnahadeFaal().getBimeGozar().getShakhs().getShenase();
            shomareGharardad = ((Bimename)artifact).getPishnahadeFaal().getGharardad().getShomare();
            isReal = isReal(((Bimename)artifact).getPishnahadeFaal());
        }

        if(artifact instanceof Elhaghiye)
        {
            description = "Endorse";
            amount = String.valueOf(((Elhaghiye)artifact).getMablagheElhaghiye());
            identifier = ((Elhaghiye)artifact).getShomareElhaghiye();
            uniqueCode = "ACC_ELHAGHIYE_"+((Elhaghiye)artifact).getId();
            codeVahedeSodor = ((Elhaghiye)artifact).getBimename().getVahedeSodoor().getCode();
            codeNamayande = ((Elhaghiye)artifact).getVahed().getCode();
            sarresidDate = ((Elhaghiye)artifact).getTarikh_sodoor_elhaghie();
            nationalCode = ((Elhaghiye)artifact).getBimename().getPishnahadeFaal().getBimeGozar().getShakhs().getShenase();
            shomareGharardad = ((Elhaghiye)artifact).getBimename().getPishnahadeFaal().getGharardad().getShomare();
            isReal = isReal(((Elhaghiye)artifact).getBimename().getPishnahadeFaal());
        }

        if(artifact instanceof Khesarat)
        {
            description = "Loss";
            amount = String.valueOf(khesaratService.mablagheKhesarat((Khesarat) artifact));
            identifier = ((Khesarat)artifact).getShomare_parvande();
            uniqueCode = "ACC_LOSS_"+((Khesarat)artifact).getId();
            codeVahedeSodor = ((Khesarat)artifact).getBimename().getVahedeSodoor().getCode();
            codeNamayande = ((Khesarat)artifact).getVahed().getCode();
            sarresidDate = ((Khesarat)artifact).getTarikh_elam_be_mali();
            nationalCode = ((Khesarat)artifact).getBimename().getPishnahadeFaal().getBimeGozar().getShakhs().getShenase();
            shomareGharardad = ((Khesarat)artifact).getBimename().getPishnahadeFaal().getGharardad().getShomare();
            isReal = isReal(((Khesarat)artifact).getBimename().getPishnahadeFaal());
        }

        Map<String, String> sanam = new HashMap<>();
        sanam.put("amount", amount);
        sanam.put("description", description);
        sanam.put("rcptName", rcptName);
        sanam.put("sarresidDate", sarresidDate);
        sanam.put("subsystemName", subsystemName);
        sanam.put("identifier", identifier);
        sanam.put("codeNamayande", codeNamayande);
        sanam.put("codeVahedeSodor", codeVahedeSodor);
        sanam.put("uniqueCode", uniqueCode);
        sanam.put("mohlatSarResid", mohlatSarResid);
        sanam.put("nationalCode", nationalCode);
        sanam.put("shomareGharardad", shomareGharardad);
        sanam.put("isDolati", isDolati);
        sanam.put("isReal", isReal);
        sanam.put("field", field);

        return new JSONObject(sanam).toString();
    }

    private SanamLog tryToCallSanamService(String requestJson){

        String response = null;
        SanamLog sanamLog;
        String status;

        try {
            JSONObject jsonObject = new JSONObject(requestJson);
            long amount = Long.valueOf(jsonObject.get("amount").toString());
            requestJson = requestJsonWithAbsoluteAmount(jsonObject, amount);

            if(amount > 0)
                response = sanamService.createDebitJSON(requestJson);

            if(amount < 0)
                response = sanamService.createCreditJSON(requestJson);

             status = "SANAM_INVOKED_SUCCESSFULLY";

        }
        catch (Exception e)
        {
            e.printStackTrace();
            status = "EXCEPTION_IN_INVOKING_SANAM";
        }

        sanamLog = new SanamLog( status, requestJson, response);
        return sanamLog;

    }

    private String requestJsonWithAbsoluteAmount(JSONObject jsonObject, long amount) {
        jsonObject.put("amount", Math.abs(amount));
        return jsonObject.toString();
    }

    private String isReal(Pishnahad pishnahad)
    {
        return pishnahad.getNoeBimegozar().equals(NoeShakhs.HAGHIGHI) ? "1" : "0";
    }
}
