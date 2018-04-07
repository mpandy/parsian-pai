package ir.parsianinsurance.he.domain.model;

import ir.parsianinsurance.he.domain.model.enums.VaziateKhesaratCase;
import ir.parsianinsurance.he.domain.model.enums.VaziateParvandeKhesarat;
import ir.parsianinsurance.he.infrastructure.security.User;
import ir.parsianinsurance.he.infrastructure.util.DateUtil;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.util.HashSet;

/**
 * Created by 8119 on 12/23/2017.
 */

@Entity
public class SaghfeKhesaratHazPezArtifactDoc extends ArtifactDoc {

    @OneToOne
    KhesaratCase khesaratCase;

    private Long khesarateGhabelePardakhtHazPez;

    public KhesaratCase getKhesaratCase() {
        return khesaratCase;
    }

    public void setKhesaratCase(KhesaratCase khesaratCase) {
        this.khesaratCase = khesaratCase;
    }

    public Long getKhesarateGhabelePardakhtHazPez() {
        return khesarateGhabelePardakhtHazPez;
    }

    public void setKhesarateGhabelePardakhtHazPez(Long khesarateGhabelePardakhtHazPez) {
        this.khesarateGhabelePardakhtHazPez = khesarateGhabelePardakhtHazPez;
    }

    @Override
    public ArtifactDocAttachable getArtifactDocAttachable() {
        return getKhesaratCase();
    }

    @Override
    public ArtifactDoc giveForTaghirVaziat(User user) {

        SaghfeKhesaratHazPezArtifactDoc artifactDoc = new SaghfeKhesaratHazPezArtifactDoc();
        artifactDoc.setKhesaratCase((KhesaratCase) getArtifactDocAttachable());
        artifactDoc.setZamaem(new HashSet<>());
        artifactDoc.setTozihat("");
        artifactDoc.setAz(user.getVahed());
        artifactDoc.setCreatedDate(DateUtil.now());
        artifactDoc.setTarikheSabteArtifactDoc(DateUtil.getJalaliCurrentDate());
        artifactDoc.setCreator(user);
        artifactDoc.setKhesarateGhabelePardakhtHazPez(getKhesarateGhabelePardakhtHazPez());
        artifactDoc.setDarEdameye(this);
        artifactDoc.setJavabDadeShode(false);

        return artifactDoc;
    }

    @Override
    public void tayidArtifactDocAttachable() {
        getKhesaratCase().setVaziat(VaziateKhesaratCase.TAYIDE_MOJAVEZ);
    }

    @Override
    public void adameTayidArtifactDocAttachable() {
        getKhesaratCase().setVaziat(VaziateKhesaratCase.ADAME_TAYIDE_MOJAVEZ);
        getKhesaratCase().getKhesarat().setVaziateparvande(VaziateParvandeKhesarat.ADAME_TAYIDE_MOJAVEZ);
    }
}
