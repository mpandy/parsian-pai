package ir.parsianinsurance.he.domain.service;

import ir.parsianinsurance.he.domain.model.Vahed;
import ir.parsianinsurance.he.domain.rule.IPropertyRules;
import ir.parsianinsurance.he.infrastructure.repository.VahedRepository;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by 8119 on 11/15/2017.
 */

@RequestScoped
public class VahedService implements IVahedService {

    @Inject
    VahedRepository vahedRepository;

    @Inject
    IPropertyRules propertyRules;

    @Override
    public Vahed setad() {
        return vahedRepository.findByCode(
                propertyRules.getSinglesStringParam("codesetad"));
    }

    @Override
    @Transactional
    public void saveVahed(Vahed vahed) {
        vahedRepository.save(vahed);
    }

    @Override
    @Transactional
    public void removeVahed(Vahed vahed) {
        vahed.setDeleted(true);
        vahedRepository.save(vahed);
    }

    @Override
    public List<Vahed> searchVahed(Vahed vahed) {
        if(vahed.getName()==null || vahed.getName().trim().equals(""))
            return vahedRepository.findTop5ByOrderByIdDesc();
        else
            return vahedRepository.findByNameContains(vahed.getName());
    }

    @Override
    public List<Vahed> zirmajmooe(Vahed vahed) {
        List<Vahed> vaheds = vahedRepository.findBySarparast(vahed);
        vaheds.add(vahed);
        return vaheds;
    }

}
