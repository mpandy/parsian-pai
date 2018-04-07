package ir.parsianinsurance.he.domain.service;

import ir.parsianinsurance.he.domain.model.Bimename;
import ir.parsianinsurance.he.infrastructure.Warning;
import ir.parsianinsurance.he.infrastructure.security.User;
import ir.parsianinsurance.he.interfaces.view.model.BimenameSearchModel;

import java.util.List;
import java.util.Optional;

/**
 * Created by Mohammad on 9/5/2017.
 */
public interface IBimenameService {
    List<Bimename> searchBimename(BimenameSearchModel searchedBimename, int rowLimit);
    boolean isEbtalable(Bimename bimename);
    String tarikhSodoorFaskh(Bimename bimename);
    Optional<Warning> addPossibleBimenameSaghfeSodoorArtifactDocs(Bimename bimename, User user);
    Optional<Warning> addPossibleBimenameTakhfifModiriatiArtifactDocs(Bimename bimename, User user);
}
