package ir.parsianinsurance.he.domain.validator;

import ir.parsianinsurance.he.domain.model.Bimename;
import ir.parsianinsurance.he.domain.model.Pishnahad;
import ir.parsianinsurance.he.infrastructure.HeException;
import ir.parsianinsurance.he.infrastructure.util.DateUtil;
import ir.parsianinsurance.he.interfaces.view.bean.view.BimenameBean;

import javax.interceptor.InvocationContext;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 8119 on 10/5/2017.
 */
public class SodoorBimenameValidator extends HEValidator{

    @Override
    public void validate(InvocationContext context) throws Exception {
        List<String> errorMessages = new ArrayList<>();

        Bimename bimename = ((BimenameBean) context.getTarget()).getBimename();
        Pishnahad pishnahad = bimename.getPishnahadeFaal();

        String tarikhShoroo = pishnahad.getAztarikh();
        String tarikhSodoor = DateUtil.getJalaliCurrentDate();

        if (tarikhShoroo.compareTo(tarikhSodoor) == -1)
            errorMessages.add("tarikheSodoorGhablAzShoroo");

        if (pishnahad.getZamimePishnahad() == null)
            errorMessages.add("zamimepishnahadravaredkonid");

        if(!errorMessages.isEmpty())
            throw new HeException(errorMessages);
    }


}
