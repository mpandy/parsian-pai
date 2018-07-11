package ir.parsianinsurance.he.infrastructure.service;

import ir.parsianinsurance.he.infrastructure.security.User;

public interface ISMSService {
    void sendSMS(User user, String number, String body);
}
