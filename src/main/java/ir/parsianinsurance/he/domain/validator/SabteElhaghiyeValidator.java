package ir.parsianinsurance.he.domain.validator;

import ir.parsianinsurance.he.domain.model.Elhaghiye;
import ir.parsianinsurance.he.domain.model.ElhaghiyeDiff;
import ir.parsianinsurance.he.domain.model.enums.NoeElhaghiye;
import ir.parsianinsurance.he.infrastructure.HeException;
import ir.parsianinsurance.he.infrastructure.util.DateUtil;
import ir.parsianinsurance.he.interfaces.view.bean.view.ElhaghiyeBean;

import javax.interceptor.InvocationContext;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 8119 on 10/4/2017.
 */
public class SabteElhaghiyeValidator extends HEValidator{

    @Override
    public void validate(InvocationContext context) throws Exception {
        List<String> errorMessages = new ArrayList<>();

        Elhaghiye elhaghiye = ((ElhaghiyeBean)context.getTarget()).getElhaghiye();

        if (elhaghiye.getTarikh_asar_elhaghie().equals(""))
            throw new HeException("TarikhAsarelhaghiyeRaVaredNamaeed");

        if (elhaghiye.getNoe_elhaghie().equals(NoeElhaghiye.EMPTY))
            throw new HeException("NoeElhaghiyeRaVaredNamaeed");

        if (elhaghiye.getEmzaKonande_aval() == null)
            errorMessages.add("EmzaKonandeAvalRaVaredNamaeed");

        if (elhaghiye.getEmzaKonande_dovom() == null)
            errorMessages.add("EmzaKonandeDovomRaVaredNamaeed");

        if (elhaghiye.getNoe_elhaghie().equals(NoeElhaghiye.TAGHIRECODENAMAYANDEGI))
            errorMessages.add("elhaghiyetaghircodeniazbemojavezdarad");

        if(elhaghiye.getTarikh_asar_elhaghie().compareTo(elhaghiye.getBimename().getTarikhesodoor()) == -1)
            errorMessages.add("tarikhAsareElhaghiyeGhablAzTarikhSodoor");

        if(elhaghiye.getTarikh_sodoor_elhaghie().compareTo(elhaghiye.getBimename().getTarikhesodoor()) == -1)
            errorMessages.add("tarikhSodoorElhaghiyeGhablAzTarikhSodoorBimename");

        if (elhaghiye.getNoe_elhaghie().equals(NoeElhaghiye.TAGHIR)) {
            if (elhaghiye.getDiffsList().size() == 0)
                errorMessages.add("elhagiyedifflistIsEmpty");

            for (ElhaghiyeDiff elhaghiyeDiff : elhaghiye.getDiffsList())
                if (elhaghiyeDiff.getTitle().equals("haghebimeghabelpardakht")) {
                    String tarikheSodoor = elhaghiye.getBimename().getTarikhesodoor();
                    String tarikheElhagiye = elhaghiye.getTarikh_sodoor_elhaghie();

                    int diffDays = DateUtil.getTimeDifferenceByDayCount(tarikheSodoor, tarikheElhagiye);
                    if (diffDays > 3)
                        errorMessages.add("hadeaksar3Rooz");
                }
        }

        if(!errorMessages.isEmpty())
            throw new HeException(errorMessages);
    }
}
