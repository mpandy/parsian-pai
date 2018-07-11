package ir.parsianinsurance.he.interfaces.view.model;

import ir.parsianinsurance.he.domain.model.Vahed;
import ir.parsianinsurance.he.domain.model.enums.VaziateParvandeKhesarat;

public class HavaleKhesaratSearchModel {

    private VaziateParvandeKhesarat vaziateParvandeKhesarat;
    private Vahed namayandegi;
    private String azTarikhSodoorHavale;
    private String taTarikhSodoorHavale;

    public VaziateParvandeKhesarat getVaziateParvandeKhesarat() {
        return vaziateParvandeKhesarat;
    }

    public void setVaziateParvandeKhesarat(VaziateParvandeKhesarat vaziateParvandeKhesarat) {
        this.vaziateParvandeKhesarat = vaziateParvandeKhesarat;
    }

    public Vahed getNamayandegi() {
        return namayandegi;
    }

    public void setNamayandegi(Vahed namayandegi) {
        this.namayandegi = namayandegi;
    }

    public String getAzTarikhSodoorHavale() {
        return azTarikhSodoorHavale;
    }

    public void setAzTarikhSodoorHavale(String azTarikhSodoorHavale) {
        this.azTarikhSodoorHavale = azTarikhSodoorHavale;
    }

    public String getTaTarikhSodoorHavale() {
        return taTarikhSodoorHavale;
    }

    public void setTaTarikhSodoorHavale(String taTarikhSodoorHavale) {
        this.taTarikhSodoorHavale = taTarikhSodoorHavale;
    }
}
