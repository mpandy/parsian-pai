package ir.parsianinsurance.he.infrastructure.service;

import ir.parsianinsurance.he.domain.model.*;
import ir.parsianinsurance.he.domain.model.enums.Jensiat;
import ir.parsianinsurance.he.domain.model.enums.NoeShakhs;
import ir.parsianinsurance.he.domain.model.enums.NoeTaahod;
import ir.parsianinsurance.he.domain.rule.IPropertyRules;
import ir.parsianinsurance.he.interfaces.webservice.client.bimemarkazi.*;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mohammad on 1/27/2018.
 */

@ApplicationScoped
public class BimeMarkaziService implements IBimeMarkaziService {

    IWbsPlcyV4 bimeMarkaziService;

    @Inject
    IPropertyRules propertyRules;

    @PostConstruct
    public void init(){
        bimeMarkaziService = new WbsPlcyV4().getMyBasicHttpBindingIWbsPlcyV4();
    }

    @Override
    public WbsV4PlcyRes sodoorBimename(Bimename bimename) {

        String username = propertyRules.getSinglesStringParam("bimemarkaziwsuser");
        String password = propertyRules.getSinglesStringParam("bimemarkaziwspassword");

        ObjectFactory factory = new ObjectFactory();
        WbsV4PlcyReq request = new WbsV4PlcyReq();

        request.setPrntCmpDocNo(factory.createWbsV4PlcyReqPrntCmpDocNo(bimename.getShomare()));
        request.setCmpDocNo(factory.createWbsV4PlcyReqCmpDocNo(bimename.getShomare()));
        request.setMapFldDtlCod(factory.createWbsV4PlcyReqMapFldDtlCod("2610"));
        request.setMapBrnhCod(factory.createWbsV4PlcyReqMapBrnhCod(bimename.getPishnahadeFaal().getVahed().getCode()));
        request.setMapAgncCod(factory.createWbsV4PlcyReqMapAgncCod(bimename.getPishnahadeFaal().getVahed().getCode()));
        request.setMapBrkrCod(factory.createWbsV4PlcyReqMapBrkrCod(bimename.getPishnahadeFaal().getVahed().getCode()));
        String mapPrsnTypCod = mapPrsnTypCod(bimename.getPishnahadeFaal());
        request.setMapPrsnTypCod(factory.createWbsV4PlcyReqMapPrsnTypCod(mapPrsnTypCod));
        request.setMapCorTypCod(factory.createWbsV4PlcyReqMapCorTypCod("100"));
        request.setInsNam(factory.createWbsV4PlcyReqInsNam(bimename.getPishnahadeFaal().getBimeGozar().getShakhs().toString()));
        request.setNtnlId(factory.createWbsV4PlcyReqNtnlId(bimename.getPishnahadeFaal().getBimeShode().getShakhseHaghighi().getKode_meli()));
        request.setTel(factory.createWbsV4PlcyReqTel(bimename.getPishnahadeFaal().getBimeGozar().getShakhs().getEttelaateTamas().getTelefon()));
        request.setMbl(factory.createWbsV4PlcyReqMbl(bimename.getPishnahadeFaal().getBimeGozar().getShakhs().getEttelaateTamas().getMobile()));
        request.setZipCod(factory.createWbsV4PlcyReqZipCod(bimename.getPishnahadeFaal().getBimeGozar().getShakhs().getEttelaateTamas().getCode_posti()));
        request.setIsuDte(factory.createWbsV4PlcyReqIsuDte(bimename.getTarikhesodoor()));
        request.setBgnDte(factory.createWbsV4PlcyReqBgnDte(bimename.getPishnahadeFaal().getAztarikh()));
        request.setEndDte(factory.createWbsV4PlcyReqEndDte(bimename.getPishnahadeFaal().getTatarikh()));
        request.setMapCurCod(factory.createWbsV4PlcyReqMapCurCod("1"));
//        request.setMapIntrCod(factory.createWbsV4PlcyReqMapIntrCod(bimename.getTarikhesodoor()));
//        request.setPrm(new BigDecimal(bimename.getPishnahadeFaal().getHagheBime().getHaghe_bime_khales()));
        request.setTax(new BigDecimal(bimename.getPishnahadeFaal().getHagheBime().getMaliat() * (1/3) ));
        request.setTol(new BigDecimal(bimename.getPishnahadeFaal().getHagheBime().getMaliat() * (2/3) ));
        request.setCptl(new BigDecimal(bimename.getPishnahadeFaal().getSarmayePooshesh(NoeTaahod.FOT)));
        request.setIsu(new BigDecimal(bimename.getPishnahadeFaal().getHagheBime().getKarmozd() * (100/28) * (0.05)));
        request.setWag(new BigDecimal(bimename.getPishnahadeFaal().getHagheBime().getKarmozd()));
        request.setRct(new BigDecimal(0));
//        request.setMapIntrCod(factory.createWbsV4PlcyReqMapIntrCod(bimename.getPishnahadeFaal().getVahed().getCode()));

        WbsV4PlcyRes response = bimeMarkaziService.ciiRegChkPlcy(request, username, password);

        return response;
    }

    private String mapPrsnTypCod(Pishnahad pishnahad) {

        NoeShakhs noeShakhs = pishnahad.getNoeBimegozar();

        switch (noeShakhs){

            case HOGHOOGHI:
                return "2";

            case HAGHIGHI:
                Jensiat jensiat = ((ShakhseHaghighi)pishnahad.getBimeGozar().getShakhs()).getJensiat();
                if(jensiat.equals(Jensiat.MARD))
                    return "4";
                if(jensiat.equals(Jensiat.ZAN))
                    return "5";
                break;

        }
        return "";

    }

    @Override
    public WbsV4EdrsRes sabteElhaghiye(Elhaghiye elhaghiye) {
        String username = propertyRules.getSinglesStringParam("bimemarkaziwsuser");
        String password = propertyRules.getSinglesStringParam("bimemarkaziwspassword");

        ObjectFactory factory = new ObjectFactory();
        WbsV4EdrsReq request = new WbsV4EdrsReq();

        request.setCmpDocNo(factory.createWbsV4EdrsReqCmpDocNo(elhaghiye.getShomareElhaghiye()));
        request.setMapFldDtlCod(factory.createWbsV4EdrsReqMapFldDtlCod("2610"));
//        request.setPlcyUnqCod();
        request.setMapBrnhCod(factory.createWbsV4EdrsReqMapBrnhCod(elhaghiye.getVahed().getCode()));
        request.setMapAgncCod(factory.createWbsV4EdrsReqMapAgncCod(elhaghiye.getVahed().getCode()));
        request.setMapBrkrCod(factory.createWbsV4EdrsReqMapBrkrCod(elhaghiye.getVahed().getCode()));
        String mapCorTypCoe = mapCorTypCoe(elhaghiye);
        request.setMapCorTypCod(factory.createWbsV4EdrsReqMapCorTypCod(mapCorTypCoe));
        request.setDscr(factory.createWbsV4EdrsReqDscr(elhaghiye.getMatn_elhaghie()));

        Long mablagh = elhaghiye.getMablagheElhaghiye();

        if(mablagh > 0)
        {
            request.setExsPrm(new BigDecimal(mablagh));
            request.setRtnPrm(new BigDecimal(0));
        }
        if(mablagh == 0)
        {
            request.setExsPrm(new BigDecimal(0));
            request.setRtnPrm(new BigDecimal(0));
        }
        if(mablagh < 0)
        {
            request.setExsPrm(new BigDecimal(0));
            request.setRtnPrm(new BigDecimal(Math.abs(mablagh)));
        }

        request.setPrm(new BigDecimal(elhaghiye.getPishnahad_new().getHagheBime().getHaghe_bime_khales()));
        request.setCptl(new BigDecimal(elhaghiye.getPishnahad_new().getSarmayePooshesh(NoeTaahod.FOT)));
        String mapPrsnTypCod = mapPrsnTypCod(elhaghiye.getPishnahad_new());
        request.setMapPrsnTypCod(factory.createWbsV4EdrsReqMapPrsnTypCod(mapPrsnTypCod));
        request.setInsNam(factory.createWbsV4EdrsReqInsNam(elhaghiye.getBimename().getPishnahadeFaal().getBimeGozar().getShakhs().toString()));
        request.setNtnlId(factory.createWbsV4EdrsReqNtnlId(elhaghiye.getBimename().getPishnahadeFaal().getBimeShode().getShakhseHaghighi().getKode_meli()));
        request.setTel(factory.createWbsV4EdrsReqTel(elhaghiye.getBimename().getPishnahadeFaal().getBimeGozar().getShakhs().getEttelaateTamas().getTelefon()));
        request.setMbl(factory.createWbsV4EdrsReqMbl(elhaghiye.getBimename().getPishnahadeFaal().getBimeGozar().getShakhs().getEttelaateTamas().getMobile()));
        request.setZipCod(factory.createWbsV4EdrsReqZipCod(elhaghiye.getBimename().getPishnahadeFaal().getBimeGozar().getShakhs().getEttelaateTamas().getCode_posti()));
        request.setTax(new BigDecimal(elhaghiye.getPishnahad_new().getHagheBime().getMaliat() - elhaghiye.getPishnahad_old().getHagheBime().getMaliat()));
        request.setTol(new BigDecimal(0)); // ????
        request.setIsuDte(factory.createWbsV4EdrsReqIsuDte(elhaghiye.getTarikh_sodoor_elhaghie()));
        request.setBgnDte(factory.createWbsV4EdrsReqBgnDte(elhaghiye.getTarikh_asar_elhaghie()));
        request.setEndDte(factory.createWbsV4EdrsReqEndDte(elhaghiye.getPishnahad_new().getTatarikh()));
        request.setMapCurCod(factory.createWbsV4EdrsReqMapCurCod("1"));

        WbsV4EdrsRes response = bimeMarkaziService.ciiRegEdrs(request, username, password);

        return response;
    }

    private String mapCorTypCoe(Elhaghiye elhaghiye) {

        switch (elhaghiye.getNoe_elhaghie())
        {
            case TAGHIR:
                long mablagh = elhaghiye.getMablagheElhaghiye();
                if(mablagh == 0)
                    return "105";
                else {
                    if(mablagh > 0)
                        return "103";
                    else
                        return "104";
                }

            case FASKHAZTARAFEBIMEGAR:
                return "106";

            case FASKHAZTARAFEBIMEGOZAR:
                return "107";

        }
        return "";

    }

    @Override
    public WbsV4DocLosRes sabteParvandeKhesarat(Khesarat khesarat) {

        String username = propertyRules.getSinglesStringParam("bimemarkaziwsuser");
        String password = propertyRules.getSinglesStringParam("bimemarkaziwspassword");

        ObjectFactory factory = new ObjectFactory();
        WbsV4DocLosReq request = new WbsV4DocLosReq();

        request.setCmpDocNo(factory.createWbsV4DocLosReqCmpDocNo(khesarat.getShomare_parvande()));
        request.setMapFldDtlCod(factory.createWbsV4DocLosReqMapFldDtlCod("2611"));
//        request.setPlcyUnqCod();
//        request.setEdrsUnqCod();
        request.setMapBrnhCod(factory.createWbsV4DocLosReqMapBrnhCod(khesarat.getVahed().getCode()));
        request.setMapAgncCod(factory.createWbsV4DocLosReqMapAgncCod(khesarat.getVahed().getCode()));
        request.setMapCorTypCod(factory.createWbsV4DocLosReqMapCorTypCod("108"));
        request.setFleDte(factory.createWbsV4DocLosReqFleDte(khesarat.getTarikhe_tashkil_parvande()));
        request.setOcrDte(factory.createWbsV4DocLosReqOcrDte(khesarat.getTarikhe_hadese()));
        request.setAncDte(factory.createWbsV4DocLosReqAncDte(khesarat.getTarikh_elam_khesarat()));
        request.setLosEvl(factory.createWbsV4DocLosReqLosEvl(khesarat.getMasool_parvande().getRealName()));
        request.setLosEvlNtnlId(factory.createWbsV4DocLosReqLosEvlNtnlId("000")); //?

        WbsV4DocLosRes response = bimeMarkaziService.ciiRegDocLos(request, username, password);

        return response;

    }

    @Override
    public WbsV4LosRes sabteHavaleKhesarat(HavaleKhesarat havaleKhesarat) {

        String username = propertyRules.getSinglesStringParam("bimemarkaziwsuser");
        String password = propertyRules.getSinglesStringParam("bimemarkaziwspassword");

        ObjectFactory factory = new ObjectFactory();
        WbsV4LosReq request = new WbsV4LosReq();

        request.setMapFldDtlCod(factory.createWbsV4LosReqMapFldDtlCod("2611"));
        request.setCmpDocNo(factory.createWbsV4LosReqCmpDocNo(havaleKhesarat.getKhesarat().getShomare_parvande()));
        request.setDocLosUnqCod(123L);
        request.setMapBrnhCod(factory.createWbsV4LosReqMapBrnhCod(havaleKhesarat.getKhesarat().getVahed().getCode()));
        request.setMapAgncCod(factory.createWbsV4LosReqMapAgncCod(havaleKhesarat.getKhesarat().getVahed().getCode()));
        request.setMapCorTypCod(factory.createWbsV4LosReqMapCorTypCod("108"));//???
        request.setMapCurCod(factory.createWbsV4LosReqMapCurCod("1"));
        request.setPayDte(factory.createWbsV4LosReqPayDte(havaleKhesarat.getTarikhSodoorHavale()));
        request.setAmnt(new BigDecimal(havaleKhesarat.getMablaghHavale()));
        // ??? request.setPayAmnt(new BigDecimal(havaleKhesarat.getKhesarat().));

        switch(havaleKhesarat.getNoeHavale()){

            case HAVALE_PARDAKHTI:
                request.setPayAmnt(new BigDecimal(havaleKhesarat.getMablaghHavale()));
                request.setRtn(new BigDecimal(0));
                break;

            case HAVALE_BARGASHTI:
                request.setRtn(new BigDecimal(havaleKhesarat.getMablaghHavale()));
                request.setPayAmnt(new BigDecimal(0));
                break;
        }

//   ???     request.setRtnRcy(new BigDecimal());
//   ???     request.setRcy(new BigDecimal());
//   ???     request.setExp(new BigDecimal(havaleKhesarat.geth));
//   ???     request.setRtnExp(new BigDecimal());
        request.setLosRcv(factory.createWbsV4LosReqLosRcv(havaleKhesarat.getName_daryaft_konande()));
        request.setLosRcvNtnlId(factory.createWbsV4LosReqLosRcvNtnlId("N/A"));

        WbsV4LosRes response = bimeMarkaziService.ciiRegLos(request, username, password);

        return response;
    }

    @Override
    public List<WbsV4PlcyCvrRes> sabtePoosheshForSodoor(Bimename bimename) {

        String username = propertyRules.getSinglesStringParam("bimemarkaziwsuser");
        String password = propertyRules.getSinglesStringParam("bimemarkaziwspassword");
        ObjectFactory factory = new ObjectFactory();
        List<WbsV4PlcyCvrRes> responses = new ArrayList<>();
        int counter = 1;
        for(TaahodBimegar taahodBimegar : bimename.getPishnahadeFaal().getTaahodBimegars())
        {
            WbsV4PlcyCvrReq request = new WbsV4PlcyCvrReq();
            request.setCmpDocNo(factory.createWbsV4PlcyCvrReqCmpDocNo(counter+""));
//            request.setPlcyUnqCod();
            request.setMapFldDtlCod(factory.createWbsV4PlcyCvrReqMapFldDtlCod("2610"));
            request.setMapCurCod(factory.createWbsV4PlcyCvrReqMapCurCod("1"));
            request.setIsuDte(factory.createWbsV4PlcyCvrReqIsuDte(bimename.getTarikhesodoor()));
            request.setPrm(factory.createWbsV4PlcyCvrReqPrm(new BigDecimal(taahodBimegar.getHagh_bime_taahod())));
            request.setCptl(factory.createWbsV4PlcyCvrReqCptl(new BigDecimal(taahodBimegar.getSarmaye_taahod())));
//            request.setCvr(factory.createWbsV4PlcyCvrReqCvr(new BigDecimal(taahodBimegar.getSarmaye_taahod())));
            WbsV4PlcyCvrRes response = bimeMarkaziService.ciiRegPlcyCvr(request, username, password);
            responses.add(response);
            counter++;
        }

        return responses;

    }

    @Override
    public List<WbsV4PlcyCvrRes> sabtePoosheshForElhaghiye(Elhaghiye elhaghiye) {

        String username = propertyRules.getSinglesStringParam("bimemarkaziwsuser");
        String password = propertyRules.getSinglesStringParam("bimemarkaziwspassword");
        ObjectFactory factory = new ObjectFactory();
        List<WbsV4PlcyCvrRes> responses = new ArrayList<>();
        int counter = 1;
        for(TaahodBimegar taahodBimegar : elhaghiye.getTaahodChanges())
        {
            WbsV4PlcyCvrReq request = new WbsV4PlcyCvrReq();
            request.setCmpDocNo(factory.createWbsV4PlcyCvrReqCmpDocNo(counter+""));
//            request.setEdrsUnqCod();
            request.setMapFldDtlCod(factory.createWbsV4PlcyCvrReqMapFldDtlCod("2610"));
            request.setMapCurCod(factory.createWbsV4PlcyCvrReqMapCurCod("1"));
            request.setIsuDte(factory.createWbsV4PlcyCvrReqIsuDte(elhaghiye.getTarikh_sodoor_elhaghie()));
            request.setPrm(factory.createWbsV4PlcyCvrReqPrm(new BigDecimal(taahodBimegar.getHagh_bime_taahod())));
            request.setCptl(factory.createWbsV4PlcyCvrReqCptl(new BigDecimal(taahodBimegar.getSarmaye_taahod())));
//            request.setCvr(factory.createWbsV4PlcyCvrReqCvr(new BigDecimal(taahodBimegar.getSarmaye_taahod())));
            WbsV4PlcyCvrRes response = bimeMarkaziService.ciiRegPlcyCvr(request, username, password);
            responses.add(response);
            counter++;
        }

        return responses;
    }

    @Override
    public WbsV4AgncRes sabteAgency(Vahed vahed) {
        String username = propertyRules.getSinglesStringParam("bimemarkaziwsuser");
        String password = propertyRules.getSinglesStringParam("bimemarkaziwspassword");

        ObjectFactory factory = new ObjectFactory();
        WbsV4AgncReq request = new WbsV4AgncReq();

        request.setMapAgncCod(factory.createWbsV4AgncReqMapAgncCod("2222"));
        request.setMapBrnhCod(factory.createWbsV4AgncReqMapBrnhCod("11111"));
        request.setFrstNam(factory.createWbsV4AgncReqFrstNam("Ali"));
        request.setLstNam(factory.createWbsV4AgncReqLstNam("Gholizade"));
        request.setMngNam(factory.createWbsV4AgncReqMngNam("Mad"));
        request.setNtnlId(factory.createWbsV4AgncReqNtnlId("0070200213"));
        request.setSttDte(factory.createWbsV4AgncReqSttDte("1389/01/01"));
        request.setAdrs(factory.createWbsV4AgncReqAdrs("Vanak"));
        request.setTel(factory.createWbsV4AgncReqTel("88888888"));
        request.setMbl(factory.createWbsV4AgncReqMbl("09123971516"));

        WbsV4AgncRes response = bimeMarkaziService.ciiRegAgency(request, username, password);
        return response;
    }

    @Override
    public WbsV4BranchRes sabteBranch(Vahed vahed) {
        String username = propertyRules.getSinglesStringParam("bimemarkaziwsuser");
        String password = propertyRules.getSinglesStringParam("bimemarkaziwspassword");

        ObjectFactory factory = new ObjectFactory();
        WbsV4BranchReq request = new WbsV4BranchReq();

        request.setMapBrnhCod(factory.createWbsV4BranchReqMapBrnhCod("11111"));  // CmpBrnhCod code unique sabte shobe : 8854
        request.setBrnhNam(factory.createWbsV4BranchReqBrnhNam("Shobe_Testi_HE"));
        request.setFrstNam(factory.createWbsV4BranchReqFrstNam("Mohammad"));
        request.setLstNam(factory.createWbsV4BranchReqLstNam("Hassani"));
        request.setMngNam(factory.createWbsV4BranchReqMngNam("Pand"));
        request.setNtnlId(factory.createWbsV4BranchReqNtnlId("0070200213"));
        request.setSttDte(factory.createWbsV4BranchReqSttDte("1389/01/01"));
        request.setAdrs(factory.createWbsV4BranchReqAdrs("Vanak"));
        request.setTel(factory.createWbsV4BranchReqTel("88888888"));
        request.setMbl(factory.createWbsV4BranchReqMbl("09123971516"));

        WbsV4BranchRes response = bimeMarkaziService.ciiRegBranch(request, username, password);
        return response;

    }

}
