package ir.parsianinsurance.he.infrastructure.service;

public interface ISMSService {
    void sendSMS(String number, String body);
}
