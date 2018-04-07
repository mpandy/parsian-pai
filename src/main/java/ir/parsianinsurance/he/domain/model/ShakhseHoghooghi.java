package ir.parsianinsurance.he.domain.model;

import ir.parsianinsurance.he.infrastructure.util.StringUtil;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 8119 on 2/15/2017.
 */

@Entity
@DiscriminatorValue("Hoghooghi")
public class ShakhseHoghooghi extends Shakhs {

    private  String code_eghtesadi;
    private  String shenase_meli;

    public String getCode_eghtesadi() {
        return code_eghtesadi;
    }

    public void setCode_eghtesadi(String code_eghtesadi) {
        this.code_eghtesadi = code_eghtesadi;
    }

    public String getShenase_meli() {
        return shenase_meli;
    }

    public void setShenase_meli(String shenase_meli) {
        this.shenase_meli = shenase_meli;
    }


    @Override
    public String toString() {
        String pishvand = (super.getPishvand() == null) ? "" : super.getPishvand();
        String name = (super.getName() == null) ? "" : super.getName();

        return pishvand+" "+name;
    }

    public List<ElhaghiyeDiff> elhagiyeDiffs(String caller, Object theOther) {

        ShakhseHoghooghi otherShakhsHoghooghi = (ShakhseHoghooghi) theOther;

        List<ElhaghiyeDiff> returnList = new ArrayList<>();
        returnList.addAll(super.elhagiyeDiffs(caller, theOther));

        if(!StringUtil.equals(this.getCode_eghtesadi(), otherShakhsHoghooghi.getCode_eghtesadi()))
            returnList.add( new ElhaghiyeDiff("codeeghtesadi",
                    this.getCode_eghtesadi(),
                    otherShakhsHoghooghi.getCode_eghtesadi()));

        if(!StringUtil.equals(this.getShenase_meli(), otherShakhsHoghooghi.getShenase_meli()))
            returnList.add( new ElhaghiyeDiff("shenasemeli",
                    this.getShenase_meli(),
                    otherShakhsHoghooghi.getShenase_meli()));

        return returnList;
    }

    @Override
    public String getShenase() {
        return getShenase_meli();
    }
}

