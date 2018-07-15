package ir.parsianinsurance.he.infrastructure.service;

import ir.parsianinsurance.he.infrastructure.security.User;
import ir.parsianinsurance.he.interfaces.webservice.client.sanam.BitartsWebService_Service;
import ir.parsianinsurance.he.interfaces.webservice.client.sms.Service;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SMSService implements ISMSService {

    Service smsService;

    private static final String SMS_WEBSERVICE_USERNAME = "lifeapp";
    private static final String SMS_WEBSERVICE_PASSWORD = "Lifeapp";

    @PostConstruct
    public void init(){
        smsService = new Service();
    }

    @Override
    public void sendSMS(User user, String number, String body) {
        smsService.getServiceSoap12().insertSMS(SMS_WEBSERVICE_USERNAME,
                                                SMS_WEBSERVICE_PASSWORD,
                                                user.getRealName(),"",
                                                number,
                                                body,"",
                                                user.getUsername(), 8);
    }
}
