package ir.parsianinsurance.he.infrastructure.service;

import ir.parsianinsurance.he.domain.rule.IPropertyRules;
import ir.parsianinsurance.he.interfaces.webservice.client.ashkhasehoghooghi_v3.ILegalInq;
import ir.parsianinsurance.he.interfaces.webservice.client.ashkhasehoghooghi_v3.LegalInq;
import ir.parsianinsurance.he.interfaces.webservice.client.ashkhasehoghooghi_v3.LegalInqRes;
import ir.parsianinsurance.he.interfaces.webservice.client.ashkhasehoghooghi_v3.Result;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class AshkhaseHoghooghiService implements IAshkhaseHoghooghiService{

    ILegalInq legalService;

    @Inject
    IPropertyRules propertyRules;

    @PostConstruct
    public void init() {
        legalService = new LegalInq().getMyBasicHttpBindingILegalInq();
    }


    @Override
    public LegalEntity estelam(String nationalId) {
        String username = propertyRules.getSinglesStringParam("legalserviceuser");
        String password = propertyRules.getSinglesStringParam("legalservicepassword");

        LegalInqRes response = legalService.submitNationalIdInq(nationalId, username, password);
        Result result = response.getLegalEntity().getValue();
        LegalEntity legalEntity = new LegalEntity(  result.getName().getValue(),
                                                    result.getAddress().getValue(),
                                                    result.getPostCode().getValue());
        return legalEntity;
    }
}
