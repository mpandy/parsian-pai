package ir.parsianinsurance.he.domain.service;

import ir.parsianinsurance.he.domain.model.*;
import ir.parsianinsurance.he.infrastructure.io.Zamime;
import ir.parsianinsurance.he.interfaces.view.model.ArtifactSearchModel;

import java.util.List;
import java.util.Set;

/**
 * Created by 8119 on 11/11/2017.
 */
public interface IArtifactDocService {

    void addSaghfeSodoorArtifactDoc(Bimename bimename);

    boolean alreadyHasTayidShodeArfictDocOfKhesaratNaghseOzv(KhesaratCase khesaratCase);

    boolean alreadyHasTayidShodeArfictDocOfKhesaratHazPez(KhesaratCase khesaratCase);

    void addTakhfifeModiriatiArtifactDoc(Bimename bimename);
    void addFaskhArtifactDoc(Elhaghiye elhaghiye);
    void addEbtalArtifactDoc(Elhaghiye elhaghiye);
    void addKhesaratFotArtifactDoc(KhesaratCase khesaratCase);

    boolean alreadyHasTayidShodeArfictDocOfSaghfeSodoor(Bimename bimename);
    boolean alreadyHasTayidShodeArfictDocOfTakhfifeModiriati(Bimename bimename);
    boolean alreadyHasTayidShodeArfictDocOfFaskh(Elhaghiye elhaghiye);
    boolean alreadyHasTayidShodeArfictDocOfEbtal(Elhaghiye elhaghiye);
    boolean alreadyHasTayidShodeArfictDocOfKhesaratFot(KhesaratCase elhaghiye);

    void addKhesaratNaghsOzvArtifactDoc(KhesaratCase khesaratCase);
    void addKhesaratHazPezArtifactDoc(KhesaratCase khesaratCase);

    List<ArtifactDoc> searchArtifact(ArtifactSearchModel searchedArtifact, int rowLimit);
    Set<Zamime> loadZamaem(ArtifactDoc artifactDoc);
    boolean currentUserIsEligibleToPermit(ArtifactDoc artifactDoc);
    Vahed originalArtifactDoc(ArtifactDoc artifactDoc);
    void saveArtifactDoc(ArtifactDoc artifactDoc);

}
