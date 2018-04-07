package ir.parsianinsurance.he.domain.model;

import ir.parsianinsurance.he.domain.model.enums.VaziateBimename;
import ir.parsianinsurance.he.infrastructure.security.User;
import ir.parsianinsurance.he.infrastructure.util.DateUtil;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.util.HashSet;

/**
 * Created by 8119 on 11/15/2017.
 */

@Entity
public class SaghfeSodoorArtifactDoc extends ArtifactDoc {

    @OneToOne
    private Bimename bimename;

    private Long sarmayeTaahod;

    public Long getSarmayeTaahod() {
        return sarmayeTaahod;
    }

    public void setSarmayeTaahod(Long sarmayeTaahod) {
        this.sarmayeTaahod = sarmayeTaahod;
    }

    public Bimename getBimename() {
        return bimename;
    }

    public void setBimename(Bimename bimename) {
        this.bimename = bimename;
    }

    @Override
    public ArtifactDocAttachable getArtifactDocAttachable() {
        return getBimename();
    }

    @Override
    public ArtifactDoc giveForTaghirVaziat(User user) {
        SaghfeSodoorArtifactDoc artifactDoc = new SaghfeSodoorArtifactDoc();
        artifactDoc.setBimename((Bimename) getArtifactDocAttachable());
        artifactDoc.setZamaem(new HashSet<>());
        artifactDoc.setTozihat("");
        artifactDoc.setAz(user.getVahed());
        artifactDoc.setCreatedDate(DateUtil.now());
        artifactDoc.setTarikheSabteArtifactDoc(DateUtil.getJalaliCurrentDate());
        artifactDoc.setCreator(user);
        artifactDoc.setSarmayeTaahod(getSarmayeTaahod());
        artifactDoc.setDarEdameye(this);
        artifactDoc.setJavabDadeShode(false);
        return artifactDoc;
    }

    @Override
    public void tayidArtifactDocAttachable() {
        getBimename().setVaziateBimename(VaziateBimename.TAYIDE_MOJAVEZ);
    }

    @Override
    public void adameTayidArtifactDocAttachable() {
        getBimename().setVaziateBimename(VaziateBimename.ADAME_TAYIDE_MOJAVEZ);
    }
}
