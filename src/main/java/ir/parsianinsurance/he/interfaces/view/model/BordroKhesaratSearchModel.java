package ir.parsianinsurance.he.interfaces.view.model;

import ir.parsianinsurance.he.domain.model.BimeGozar;
import ir.parsianinsurance.he.domain.model.Vahed;

public class BordroKhesaratSearchModel {

    private String shomareBimename;
    private BimeGozar bimeGozar;
    private Vahed namayandegi;
    private String azTarikh;
    private String taTarikh;

    public String getShomareBimename() {
        return shomareBimename;
    }

    public void setShomareBimename(String shomareBimename) {
        this.shomareBimename = shomareBimename;
    }

    public BimeGozar getBimeGozar() {
        return bimeGozar;
    }

    public void setBimeGozar(BimeGozar bimeGozar) {
        this.bimeGozar = bimeGozar;
    }

    public Vahed getNamayandegi() {
        return namayandegi;
    }

    public void setNamayandegi(Vahed namayandegi) {
        this.namayandegi = namayandegi;
    }

    public String getAzTarikh() {
        return azTarikh;
    }

    public void setAzTarikh(String azTarikh) {
        this.azTarikh = azTarikh;
    }

    public String getTaTarikh() {
        return taTarikh;
    }

    public void setTaTarikh(String taTarikh) {
        this.taTarikh = taTarikh;
    }
}
