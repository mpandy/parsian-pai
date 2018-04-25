package ir.parsianinsurance.he.domain.service;

import ir.parsianinsurance.he.domain.model.*;
import ir.parsianinsurance.he.infrastructure.Warning;
import ir.parsianinsurance.he.infrastructure.security.User;
import ir.parsianinsurance.he.interfaces.view.model.ElhaghiyeSearchModel;

import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * Created by Mohammad on 7/26/2017.
 */
public interface IElhaghiyeService {

    Set<ElhaghiyeDiff> elhaghiyeDiffs(Pishnahad oldPishnahad, Pishnahad newPishnahad);
    List<ElhaghiyeDiff> elhaghiyeableCollectionElhaghiyeDiff(Set<? extends ElhaghiyeableCollection> oldSet,
                                                             Set<? extends ElhaghiyeableCollection> newSet);
    Elhaghiye buildElhaghiyeToPersist(Elhaghiye elhaghiye);
    String generateShomareElhaghiye(Bimename bimename);
    List<Elhaghiye> searchElhaghiye(ElhaghiyeSearchModel searchElhaghiye, int rowLimit);
    void deprecateOldPishnahad(Pishnahad oldPishnahad);

    void taeedeSodooreElhaghiyeyeMojavezDaar(Elhaghiye elhaghiye);
    Optional<Warning> addPossibleElhaghiyeFaskhArtifactDocs(Elhaghiye elhaghiye, User user);
    Optional<Warning> addPossibleElhaghiyeEbtalArtifactDocs(Elhaghiye elhaghiye, User user);
    Optional<Warning> addPossibleElhaghiyeTaghirSaghfeSodoorArtifactDocs(Elhaghiye elhaghiye, User user);
}
