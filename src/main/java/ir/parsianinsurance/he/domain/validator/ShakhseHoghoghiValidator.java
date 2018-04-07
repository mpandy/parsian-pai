package ir.parsianinsurance.he.domain.validator;

import ir.parsianinsurance.he.domain.model.ShakhseHoghooghi;
import ir.parsianinsurance.he.infrastructure.util.StringUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 8119 on 9/26/2017.
 */
public class ShakhseHoghoghiValidator {

    ShakhseHoghooghi shakhseHoghoghi;

    public ShakhseHoghoghiValidator(ShakhseHoghooghi shakhseHoghoghi) {
        this.shakhseHoghoghi = shakhseHoghoghi;
    }

    public List<String> validate() {
        List<String> errorMessages = new ArrayList<>();

        if(StringUtil.isEmpty(shakhseHoghoghi.getPishvand()))
            errorMessages.add("bimegozarhoghoghiPishvandNadarad");

        if(shakhseHoghoghi.getName().equals(""))
            errorMessages.add("bimegozarhoghoghinameNadarad");

        if(shakhseHoghoghi.getCode_eghtesadi().equals(""))
            errorMessages.add("bimegozarhoghoghiCodeEghtesadiNadarad");

        if(shakhseHoghoghi.getEttelaateTamas().getAddress().equals(""))
            errorMessages.add("bimegozarhoghoghiAddressNadarad");

        if(shakhseHoghoghi.getEttelaateTamas().getTelefon().equals(""))
            errorMessages.add("bimegozarhoghoghiTelefonNadarad");

        if(shakhseHoghoghi.getEttelaateTamas().getCode_posti().equals(""))
            errorMessages.add("bimegozarhoghoghiCodePostiNadarad");

        return errorMessages;
    }
}
