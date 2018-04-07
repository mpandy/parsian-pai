package ir.parsianinsurance.he.domain.service;

import ir.parsianinsurance.he.domain.model.Vahed;

import java.util.List;

/**
 * Created by 8119 on 11/15/2017.
 */
public interface IVahedService {
    Vahed setad();
    void saveVahed(Vahed vahed);
    void removeVahed(Vahed vahed);
    List<Vahed> searchVahed();
    List<Vahed> zirmajmooe(Vahed vahed);
}
