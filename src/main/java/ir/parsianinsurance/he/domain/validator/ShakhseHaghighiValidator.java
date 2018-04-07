package ir.parsianinsurance.he.domain.validator;

import ir.parsianinsurance.he.domain.model.ShakhseHaghighi;
import ir.parsianinsurance.he.infrastructure.util.StringUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 8119 on 9/26/2017.
 */
public class ShakhseHaghighiValidator {

    ShakhseHaghighi shakhseHaghighi;
    String context;

    public ShakhseHaghighiValidator(ShakhseHaghighi shakhseHaghighi, String context) {
        this.shakhseHaghighi = shakhseHaghighi;
        this.context = context;
    }

    public List<String> validate() {
        List<String> errorMessages = new ArrayList<>();

            if(shakhseHaghighi.getName().equals(""))
                errorMessages.add(context+"NameNadarad");

            if(shakhseHaghighi.getName_khanevadegi().equals(""))
                errorMessages.add(context+"NameKhanevadegiNadarad");

            if(shakhseHaghighi.getTarikhe_tavalod().equals(""))
                errorMessages.add(context+"TarikheTavalodNadarad");

            if(shakhseHaghighi.getKode_meli().equals(""))
                errorMessages.add(context+"KodeMeliNadarad");

            if(!StringUtil.isValidIranianNationalCode(shakhseHaghighi.getKode_meli()))
                errorMessages.add(context+"KodeMeliMotabarNemibashad");

            if( shakhseHaghighi.getEttelaateTamas().getCode_posti().equals(""))
                errorMessages.add(context+"CodePostiNadarad");

            if( shakhseHaghighi.getEttelaateTamas().getTelefon().equals(""))
                errorMessages.add(context+"TelNadarad");

            if( shakhseHaghighi.getEttelaateTamas().getMobile().equals(""))
                errorMessages.add(context+"MobileNadarad");

            if( shakhseHaghighi.getEttelaateTamas().getAddress().equals(""))
                errorMessages.add(context+"AddressNadarad");

            return errorMessages;
        }
}
