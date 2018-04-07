package ir.parsianinsurance.he.domain.service;

import ir.parsianinsurance.he.domain.model.Shoghl;
import ir.parsianinsurance.he.infrastructure.repository.ShoghlRepository;

import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by 8119 on 11/20/2017.
 */

@Model
public class ShoghlService implements IShoghlService{


    @Inject
    ShoghlRepository shoghlRepository;

    @Override
    @Transactional
    public void saveShoghl(Shoghl shoghl) {
        shoghlRepository.save(shoghl);
    }

    @Override
    @Transactional
    public void removeShoghl(Shoghl shoghl) {
        shoghl.setDeleted(true);
        shoghlRepository.save(shoghl);
    }

    @Override
    public List<Shoghl> searchShoghl() {
        return shoghlRepository.findTop5ByOrderByIdDesc();
    }

    @Override
    public List<Shoghl> autocomplete(String name) {
        return shoghlRepository.findByNameContains(name);
    }
}
