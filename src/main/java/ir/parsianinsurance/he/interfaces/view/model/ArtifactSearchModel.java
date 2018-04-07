package ir.parsianinsurance.he.interfaces.view.model;

/**
 * Created by 8119 on 11/12/2017.
 */
public class ArtifactSearchModel {

    private ArtifactDaryaftiErsali ersali_or_daryafti;
    private String shomarePishnahad;

    public ArtifactDaryaftiErsali getErsali_or_daryafti() {
        return ersali_or_daryafti;
    }

    public void setErsali_or_daryafti(ArtifactDaryaftiErsali ersali_or_daryafti) {
        this.ersali_or_daryafti = ersali_or_daryafti;
    }

    public String getShomarePishnahad() {
        return shomarePishnahad;
    }

    public void setShomarePishnahad(String shomarePishnahad) {
        this.shomarePishnahad = shomarePishnahad;
    }
}
