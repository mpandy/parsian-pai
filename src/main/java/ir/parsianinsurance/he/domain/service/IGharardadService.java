package ir.parsianinsurance.he.domain.service;

import ir.parsianinsurance.he.domain.model.Gharardad;

import java.util.List;

/**
 * Created by 8119 on 11/20/2017.
 */
public interface IGharardadService {

    void saveGharardad(Gharardad gharardad);
    void removeGharardad(Gharardad gharardad);
    List<Gharardad> searchGharardad();
    Gharardad gharardadeOmoomiBimeMarkazi();
    List<String> shomareGharardadIsValid(String shomareGharardad);
}
