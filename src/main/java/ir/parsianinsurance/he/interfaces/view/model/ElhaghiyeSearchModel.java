package ir.parsianinsurance.he.interfaces.view.model;

import ir.parsianinsurance.he.domain.model.Vahed;
import ir.parsianinsurance.he.domain.model.VaziateElhaghiye;

/**
 * Created by 8119 on 9/19/2017.
 */
public class ElhaghiyeSearchModel {

    private Vahed namayandegi;
    private Vahed vahedeSodoor;
    private String aztarikheSodoor;
    private String tatarikheSodoor;
    private String aztarikheSodoorBimename;
    private String tatarikheSodoorBimename;
    private String shomareBimename;
    private String shomareElhaghiye;
    private VaziateElhaghiye vaziateElhaghiye;

    public Vahed getVahedeSodoor() {
        return vahedeSodoor;
    }

    public void setVahedeSodoor(Vahed vahedeSodoor) {
        this.vahedeSodoor = vahedeSodoor;
    }

    public String getAztarikheSodoor() {
        return aztarikheSodoor;
    }

    public void setAztarikheSodoor(String aztarikheSodoor) {
        this.aztarikheSodoor = aztarikheSodoor;
    }

    public String getTatarikheSodoor() {
        return tatarikheSodoor;
    }

    public void setTatarikheSodoor(String tatarikheSodoor) {
        this.tatarikheSodoor = tatarikheSodoor;
    }

    public String getAztarikheSodoorBimename() {
        return aztarikheSodoorBimename;
    }

    public void setAztarikheSodoorBimename(String aztarikheSodoorBimename) {
        this.aztarikheSodoorBimename = aztarikheSodoorBimename;
    }

    public String getTatarikheSodoorBimename() {
        return tatarikheSodoorBimename;
    }

    public void setTatarikheSodoorBimename(String tatarikheSodoorBimename) {
        this.tatarikheSodoorBimename = tatarikheSodoorBimename;
    }

    public String getShomareBimename() {
        return shomareBimename;
    }

    public void setShomareBimename(String shomareBimename) {
        this.shomareBimename = shomareBimename;
    }

    public String getShomareElhaghiye() {
        return shomareElhaghiye;
    }

    public void setShomareElhaghiye(String shomareElhaghiye) {
        this.shomareElhaghiye = shomareElhaghiye;
    }

    public VaziateElhaghiye getVaziateElhaghiye() {
        return vaziateElhaghiye;
    }

    public void setVaziateElhaghiye(VaziateElhaghiye vaziateElhaghiye) {
        this.vaziateElhaghiye = vaziateElhaghiye;
    }
}
