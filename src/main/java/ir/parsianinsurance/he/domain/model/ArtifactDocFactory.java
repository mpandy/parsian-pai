package ir.parsianinsurance.he.domain.model;

import ir.parsianinsurance.he.domain.model.enums.ArtifactDocState;
import ir.parsianinsurance.he.infrastructure.security.User;
import ir.parsianinsurance.he.infrastructure.util.DateUtil;

/**
 * Created by 8119 on 11/11/2017.
 */
public class ArtifactDocFactory {

    public static SaghfeKhesaratFotArtifactDoc newSaghfeKhesaratFotArtifactDoc(User user){
        ArtifactDoc artifactDoc = new SaghfeKhesaratFotArtifactDoc();
        return (SaghfeKhesaratFotArtifactDoc)newArtifactDoc(artifactDoc, user);
    }

    public static SaghfeKhesaratNaghseOzvArtifactDoc newSaghfeKhesaratNaghseOzvArtifactDoc(User user){
        ArtifactDoc artifactDoc = new SaghfeKhesaratNaghseOzvArtifactDoc();
        return (SaghfeKhesaratNaghseOzvArtifactDoc) newArtifactDoc(artifactDoc, user);
    }
    public static SaghfeKhesaratHazPezArtifactDoc newSaghfeKhesaratHazPezArtifactDoc(User user){
        ArtifactDoc artifactDoc = new SaghfeKhesaratHazPezArtifactDoc();
        return (SaghfeKhesaratHazPezArtifactDoc) newArtifactDoc(artifactDoc, user);
    }

    public static SaghfeSodoorArtifactDoc newSaghfeSodoorArtifactDoc(User user){
        ArtifactDoc artifactDoc = new SaghfeSodoorArtifactDoc();
        return (SaghfeSodoorArtifactDoc)newArtifactDoc(artifactDoc, user);
    }

    public static TakhfifeModiriatiArtifactDoc newTakhfifModiriatiArtifactDoc(User user){
        ArtifactDoc artifactDoc = new TakhfifeModiriatiArtifactDoc();
        return (TakhfifeModiriatiArtifactDoc) newArtifactDoc(artifactDoc, user);
    }

    public static FaskhArtifactDoc newFaskhArtifactDoc(User currentUser) {
        ArtifactDoc artifactDoc = new FaskhArtifactDoc();
        return (FaskhArtifactDoc)newArtifactDoc(artifactDoc, currentUser);
    }

    public static EbtalArtifactDoc newEbtalArtifactDoc(User currentUser) {
        ArtifactDoc artifactDoc = new EbtalArtifactDoc();
        return (EbtalArtifactDoc)newArtifactDoc(artifactDoc, currentUser);
    }

    public static ElhaghiyeSaghfeSodoorArtifactDoc newElhaghiyeSaghfArtifactDoc(User currentUser) {
        ArtifactDoc artifactDoc = new ElhaghiyeSaghfeSodoorArtifactDoc();
        return (ElhaghiyeSaghfeSodoorArtifactDoc)newArtifactDoc(artifactDoc, currentUser);
    }

    private static ArtifactDoc newArtifactDoc(ArtifactDoc artifactDoc, User user){
        artifactDoc.setAz(user.getVahed());
        artifactDoc.setBe(user.getVahed());
        artifactDoc.setTarikheSabteArtifactDoc(DateUtil.getJalaliCurrentDate());
        artifactDoc.setCreatedDate(DateUtil.now());
        artifactDoc.setCreator(user);
        artifactDoc.setJavabDadeShode(false);
        artifactDoc.setArtifactDocState(ArtifactDocState.NIAZ);

        return artifactDoc;
    }


}
