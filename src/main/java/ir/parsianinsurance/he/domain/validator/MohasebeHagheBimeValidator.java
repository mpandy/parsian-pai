package ir.parsianinsurance.he.domain.validator;

import ir.parsianinsurance.he.domain.model.Pishnahad;
import ir.parsianinsurance.he.domain.model.enums.TabagheKhatar;
import ir.parsianinsurance.he.infrastructure.HeException;
import ir.parsianinsurance.he.infrastructure.util.DateUtil;
import ir.parsianinsurance.he.interfaces.view.bean.view.BimenameBean;

import javax.interceptor.InvocationContext;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by 8119 on 9/26/2017.
 */
public class MohasebeHagheBimeValidator extends HEValidator{

    @Override
    public void validate(InvocationContext context) throws Exception {
        List<String> errorMessages = new ArrayList<>();

        BimenameBean targetContext = (BimenameBean) context.getTarget();
        Pishnahad pishnahad = targetContext.getBimename().getPishnahadeFaal();


        if (    pishnahad.modatBimename() < 1 ||
                DateUtil.diffIsMoreThanOneYear(pishnahad.getAztarikh(), pishnahad.getTatarikh()))
                    throw new HeException("faseleBeynTarikheshoroVaPayan");

            switch (pishnahad.getNahveMohasebe()){
                case SALANE:
                    if (!DateUtil.diffIsExactlyOneYear(pishnahad.getAztarikh(), pishnahad.getTatarikh()))
                        throw new HeException("faseleBeynTarikheshoroVaPayanSalaneAst");
                    break;
                case KOOTAHMODAT:
                    if (DateUtil.diffIsExactlyOneYear(pishnahad.getAztarikh(), pishnahad.getTatarikh()))
                        throw new HeException("faseleBeynTarikheshoroVaPayankootahmodatAst");

                    break;
            }

        if(pishnahad.getEzafeKasr().getTakhfife_goroohi() == null)
            errorMessages.add("TakhfifeGoroohiRaVaredNamaeed");

        if(pishnahad.getEzafeKasr().getEzafe_nerkh_pezeshki() == null)
            errorMessages.add("EzafeNerkhePezeshkiRaVaredNamaeed");

        if(pishnahad.getEzafeKasr().getTakhfife_modiriati() == null)
            errorMessages.add("TakhfifeModiriatiRaVaredNamaeed");

        if (pishnahad.getBimeShode().getShoghl().getDefaultTabagheKhatar().equals(TabagheKhatar.EMPTY))
            errorMessages.add("TabaghekhatarRaVaredNamaeed");

        if(!errorMessages.isEmpty())
            throw new HeException(errorMessages);
    }
}
