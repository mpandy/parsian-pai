package ir.parsianinsurance.he.domain.service;

import ir.parsianinsurance.he.domain.model.Shoghl;

import java.util.List;

/**
 * Created by 8119 on 11/20/2017.
 */
public interface IShoghlService {

    void saveShoghl(Shoghl shoghl);
    void removeShoghl(Shoghl shoghl);
    List<Shoghl> searchShoghl(String name);
    List<Shoghl> autocomplete(String name);
}
