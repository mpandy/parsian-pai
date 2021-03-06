package ir.parsianinsurance.he.domain.model;

import ir.parsianinsurance.he.domain.model.enums.VaziateBimename;
import ir.parsianinsurance.he.domain.model.enums.VaziateKhesaratCase;
import ir.parsianinsurance.he.infrastructure.security.User;
import ir.parsianinsurance.he.infrastructure.util.DateUtil;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.util.HashSet;

/**
 * Created by 8119 on 11/28/2017.
 */

@Entity
public class FaskhArtifactDoc extends ArtifactDoc  {

    @OneToOne
    private Elhaghiye elhaghiye;

    public Elhaghiye getElhaghiye() {
        return elhaghiye;
    }

    public void setElhaghiye(Elhaghiye elhaghiye) {
        this.elhaghiye = elhaghiye;
    }

    @Override
    public ArtifactDocAttachable getArtifactDocAttachable() {
        return getElhaghiye();
    }

    @Override
    public ArtifactDoc giveForTaghirVaziat(User user) {
        FaskhArtifactDoc artifactDoc = new FaskhArtifactDoc();
        artifactDoc.setElhaghiye((Elhaghiye) getArtifactDocAttachable());
        artifactDoc.setZamaem(new HashSet<>());
        artifactDoc.setTozihat("");
        artifactDoc.setAz(user.getVahed());
        artifactDoc.setCreatedDate(DateUtil.now());
        artifactDoc.setTarikheSabteArtifactDoc(DateUtil.getJalaliCurrentDate());
        artifactDoc.setCreator(user);
        artifactDoc.setDarEdameye(this);
        artifactDoc.setJavabDadeShode(false);

        return artifactDoc;
    }

    @Override
    public void tayidArtifactDocAttachable() {
        getElhaghiye().beVaziate(VaziateElhaghiye.TAYIDE_MOJAVEZ);
    }

    @Override
    public void elameNaghsArtifactDocAttachable() {
        getElhaghiye().beVaziate(VaziateElhaghiye.DARAYE_NAGHS);
    }

    @Override
    public void adameTayidArtifactDocAttachable() {
        getElhaghiye().beVaziate(VaziateElhaghiye.ADAME_TAYIDE_MOJAVEZ);
        getElhaghiye().getBimename().setVaziateBimename(VaziateBimename.DAEM);
    }
}
