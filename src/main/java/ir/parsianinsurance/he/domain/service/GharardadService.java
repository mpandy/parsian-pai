package ir.parsianinsurance.he.domain.service;

import ir.parsianinsurance.he.domain.model.Gharardad;
import ir.parsianinsurance.he.domain.rule.IPropertyRules;
import ir.parsianinsurance.he.infrastructure.repository.GharardadRepository;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Created by 8119 on 11/20/2017.
 */

@RequestScoped
public class GharardadService implements IGharardadService{

    @Inject
    GharardadRepository gharardadRepository;

    @Inject
    IPropertyRules propertyRules;

    @Override
    @Transactional
    public void saveGharardad(Gharardad gharardad) {
        gharardadRepository.save(gharardad);
    }

    @Override
    @Transactional
    public void removeGharardad(Gharardad gharardad) {
        gharardad.setDeleted(true);
        gharardadRepository.save(gharardad);
    }

    @Override
    public List<Gharardad> searchGharardad() {
        return gharardadRepository.findTop5ByOrderByIdDesc();
    }

    @Override
    public Gharardad gharardadeOmoomiBimeMarkazi() {
        return gharardadRepository.findByShomare(propertyRules.getSinglesStringParam("shomaregharardadeomoomiebimemarkazi"));
    }

    @Override
    public List<String> shomareGharardadIsValid(String shomareGharardad) {
        List<String> returnedErrorMessages = new ArrayList<>();

            if (shomareGharardad == null ||
                !Pattern.matches("\\d\\d[/]\\d\\d\\d\\d\\d\\d[/]\\d\\d[/]\\d\\d\\d\\d", shomareGharardad)) {
                    returnedErrorMessages.add("shomaregharardadbadformat");

            }

            if(gharardadRepository.findByShomare(shomareGharardad) != null)
                returnedErrorMessages.add("repeatedshomaregharardad");


        return returnedErrorMessages;
    }

}
