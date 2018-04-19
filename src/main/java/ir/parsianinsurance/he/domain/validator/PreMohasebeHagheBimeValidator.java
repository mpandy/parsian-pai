package ir.parsianinsurance.he.domain.validator;

import ir.parsianinsurance.he.domain.model.Pishnahad;
import ir.parsianinsurance.he.domain.model.TaahodBimegar;
import ir.parsianinsurance.he.domain.model.enums.NahveMohasebe;
import ir.parsianinsurance.he.domain.model.enums.NoeTaahod;
import ir.parsianinsurance.he.infrastructure.HeException;
import ir.parsianinsurance.he.interfaces.view.bean.view.BimenameBean;

import javax.interceptor.InvocationContext;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * Created by Mohammad on 9/27/2017.
 */
public class PreMohasebeHagheBimeValidator extends HEValidator {

    @Override
    public void validate(InvocationContext context) throws Exception {
        List<String> errorMessages = new ArrayList<>();

        Pishnahad pishnahad = ((BimenameBean)context.getTarget()).getBimename().getPishnahadeFaal();

        if (pishnahad.getGoroohbimename() == null)
            errorMessages.add("goroohravarednamaeed");

        if (pishnahad.getBimeShode().getShoghl() == null || pishnahad.getBimeShode().getShoghl().getName() == null)
            throw new HeException("ShoghlBimeshodeRaVaredNamaeed");

        vlidateTaahods(errorMessages, pishnahad.getTaahodBimegars());

        if(!errorMessages.isEmpty())
            throw new HeException(errorMessages);
    }

    private void vlidateTaahods(List<String> errorMessages, Set<TaahodBimegar> taahodBimegars) throws HeException {

        if (taahodBimegars.size() == 0)
            errorMessages.add("TaahodRaVaredNamaeed");

        validateEachTaahod(errorMessages, taahodBimegars);
        validateNoeTaahods(errorMessages, taahodBimegars);
        validateSarmayeTaahods(errorMessages, taahodBimegars);

    }

    private void validateEachTaahod(List<String> errorMessages, Set<TaahodBimegar> taahodBimegars) throws HeException {
        for (TaahodBimegar taahodBimegar : taahodBimegars) {

            List<String> nextTaahodErrorMessage = new TaahodBimegarValidator(taahodBimegar).validate();
            errorMessages.addAll(nextTaahodErrorMessage);
        }

        if(!errorMessages.isEmpty())
            throw new HeException(errorMessages);
    }

    private void validateNoeTaahods(List<String> errorMessages, Set<TaahodBimegar> taahodBimegars) throws HeException {
        Set<NoeTaahod> noeTaahods = new HashSet<>();
        for (TaahodBimegar taahodBimegar: taahodBimegars) {
            if(noeTaahods.contains(taahodBimegar.getNoetaahod()))
                errorMessages.add("noetaahodetekrariast");
            else
                noeTaahods.add(taahodBimegar.getNoetaahod());
        }
        if(!noeTaahods.contains(NoeTaahod.FOT))
            errorMessages.add("noetaahodefotejbarist");

        if(!errorMessages.isEmpty())
            throw new HeException(errorMessages);
    }

    private void validateSarmayeTaahods(List<String> errorMessages, Set<TaahodBimegar> taahodBimegars) throws HeException {

        long sarmayeNaghsOzv = 0;
        long sarmayeFot = 0;
        long sarmayeHazinePezeshki = 0;

        for (TaahodBimegar taahodBimegar : taahodBimegars){

            if (taahodBimegar.getNoetaahod().equals(NoeTaahod.FOT))
                sarmayeFot = taahodBimegar.getSarmaye_taahod();

            if (taahodBimegar.getNoetaahod().equals(NoeTaahod.NAGHSOZV_AZKAROFTADEGI))
                sarmayeNaghsOzv = taahodBimegar.getSarmaye_taahod();

            if (taahodBimegar.getNoetaahod().equals(NoeTaahod.HAZINE_PEZESHKI))
                sarmayeHazinePezeshki = taahodBimegar.getSarmaye_taahod();
        }

        if (sarmayeNaghsOzv > sarmayeFot)
            errorMessages.add("SarmayeNaghsOzvAzFotNemitavanadBishtarBashad");

        if (sarmayeHazinePezeshki > 0.2 * sarmayeFot)
            errorMessages.add("SarmayeHazinePezeshkiBayadHadeaksar20darsad");

        if(!errorMessages.isEmpty())
            throw new HeException(errorMessages);
    }
}
