package ir.parsianinsurance.he.domain.validator;

import ir.parsianinsurance.he.domain.model.Khesarat;
import ir.parsianinsurance.he.domain.model.KhesaratCase;
import ir.parsianinsurance.he.domain.model.Pishnahad;
import ir.parsianinsurance.he.domain.model.enums.VaziateKhesaratCase;
import ir.parsianinsurance.he.domain.model.enums.VaziateParvandeKhesarat;
import ir.parsianinsurance.he.infrastructure.HeException;
import ir.parsianinsurance.he.infrastructure.util.DateUtil;
import ir.parsianinsurance.he.infrastructure.util.StringUtil;
import ir.parsianinsurance.he.interfaces.view.bean.view.KhesaratBean;

import javax.interceptor.InvocationContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by 8119 on 9/27/2017.
 */
public class SabteKhesaratValidator extends HEValidator{

    @Override
    public void validate(InvocationContext context) throws Exception {
        List<String> errorMessages = new ArrayList<>();

        Khesarat khesarat = ((KhesaratBean)context.getTarget()).getKhesarat();
        Pishnahad pishnahad = khesarat.getBimename().getPishnahadeFaal();

        if(StringUtil.isEmpty(khesarat.getTarikh_elam_khesarat()))
            errorMessages.add("TarikhElameKhesaratRaVaredNamaeed");

        if(StringUtil.isEmpty(khesarat.getTarikhe_hadese()))
            errorMessages.add("TarikheHadeseRaVaredNamaeed");

        String tarikhhadese = khesarat.getTarikhe_hadese();
        String tarikhShoroo = pishnahad.getAztarikh();
        String tarikhName = khesarat.getTarikh_naame();
        String tarikhElameKhesarat = khesarat.getTarikh_elam_khesarat();
        String tarikhRooz = DateUtil.getJalaliCurrentDate();

        if (tarikhRooz.compareTo(tarikhhadese) == -1)
            errorMessages.add("tarikhhadeseghablaztarikherooz");

        if (tarikhhadese.compareTo(tarikhShoroo) == -1)
            errorMessages.add("tarikhehadeseGhablAzShoroo");

        if (tarikhName.compareTo(tarikhhadese) == -1)
            errorMessages.add("tarikheNameGhablAzHadese");

        if (tarikhElameKhesarat.compareTo(tarikhhadese) == -1)
            errorMessages.add("tarikheelamekhesaratGhablAzHadese");

        if(khesarat.getVaziateparvande().equals(VaziateParvandeKhesarat.ELAAM_BE_MAALI))
            validateKhesaratCasesForElamBeMali(errorMessages, khesarat.getKhesaratCases());

        validateKhesaratCasesSize(errorMessages, khesarat.getKhesaratCases());

        if(!errorMessages.isEmpty())
            throw new HeException(errorMessages);
    }

    private void validateKhesaratCasesSize(List<String> errorMessages, Set<KhesaratCase> khesaratCases) {
        if (khesaratCases.size() == 0)
            errorMessages.add("mavaredravaredNamaeed");
    }
    private void validateKhesaratCasesForElamBeMali(List<String> errorMessages, Set<KhesaratCase> khesaratCases) {
        for(KhesaratCase khesaratCase : khesaratCases)
            if(!khesaratCase.getVaziat().equals(VaziateKhesaratCase.DAEM))
                errorMessages.add("moredeKhesarateGHeyreDaemVojoodDarad");
    }

}
