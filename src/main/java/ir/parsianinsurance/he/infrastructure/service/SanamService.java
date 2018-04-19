package ir.parsianinsurance.he.infrastructure.service;

import ir.parsianinsurance.he.interfaces.webservice.client.sanam.BitartsWebService;
import ir.parsianinsurance.he.interfaces.webservice.client.sanam.BitartsWebService_Service;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;

/**
 * Created by Mohammad on 8/19/2017.
 */

@ApplicationScoped
public class SanamService implements ISanamService {

    BitartsWebService service;

    @PostConstruct
    public void init(){
        service = new BitartsWebService_Service().getBitartsWebServicePort();
    }

    @Override
    public String createDebitJSON(String json) {
        return service.createDebitJSON(json);
    }

    @Override
    public String createCreditJSON(String json) {
        return service.createCreditJSON(json);
    }

    @Override
    public String createHavaleKhesarat(String json) {
        return service.createHavaleKhesarat(json);
    }

}
