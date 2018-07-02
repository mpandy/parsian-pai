
package ir.parsianinsurance.he.interfaces.webservice.client.sms;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ServiceSoap", targetNamespace = "http://www.SMS.parsianInsurance.ir/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServiceSoap {


    /**
     * 
     * @param firstName
     * @param lastName
     * @param passwrd
     * @param policyID
     * @param appName
     * @param description
     * @param userName
     * @param cellPhone
     * @param smsText
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "InsertSMS", action = "http://www.SMS.parsianInsurance.ir/InsertSMS")
    @WebResult(name = "InsertSMSResult", targetNamespace = "http://www.SMS.parsianInsurance.ir/")
    @RequestWrapper(localName = "InsertSMS", targetNamespace = "http://www.SMS.parsianInsurance.ir/", className = "ir.parsianinsurance.he.interfaces.webservice.client.sms.InsertSMS")
    @ResponseWrapper(localName = "InsertSMSResponse", targetNamespace = "http://www.SMS.parsianInsurance.ir/", className = "ir.parsianinsurance.he.interfaces.webservice.client.sms.InsertSMSResponse")
    public String insertSMS(
        @WebParam(name = "UserName", targetNamespace = "http://www.SMS.parsianInsurance.ir/")
        String userName,
        @WebParam(name = "Passwrd", targetNamespace = "http://www.SMS.parsianInsurance.ir/")
        String passwrd,
        @WebParam(name = "FirstName", targetNamespace = "http://www.SMS.parsianInsurance.ir/")
        String firstName,
        @WebParam(name = "LastName", targetNamespace = "http://www.SMS.parsianInsurance.ir/")
        String lastName,
        @WebParam(name = "CellPhone", targetNamespace = "http://www.SMS.parsianInsurance.ir/")
        String cellPhone,
        @WebParam(name = "SMSText", targetNamespace = "http://www.SMS.parsianInsurance.ir/")
        String smsText,
        @WebParam(name = "Description", targetNamespace = "http://www.SMS.parsianInsurance.ir/")
        String description,
        @WebParam(name = "PolicyID", targetNamespace = "http://www.SMS.parsianInsurance.ir/")
        String policyID,
        @WebParam(name = "AppName", targetNamespace = "http://www.SMS.parsianInsurance.ir/")
        int appName);

    /**
     * 
     * @param firstName
     * @param lastName
     * @param passwrd
     * @param policyID
     * @param appName
     * @param description
     * @param userName
     * @param reservedField3
     * @param cellPhone
     * @param smsText
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Insert_Saiboon", action = "http://www.SMS.parsianInsurance.ir/Insert_Saiboon")
    @WebResult(name = "Insert_SaiboonResult", targetNamespace = "http://www.SMS.parsianInsurance.ir/")
    @RequestWrapper(localName = "Insert_Saiboon", targetNamespace = "http://www.SMS.parsianInsurance.ir/", className = "ir.parsianinsurance.he.interfaces.webservice.client.sms.InsertSaiboon")
    @ResponseWrapper(localName = "Insert_SaiboonResponse", targetNamespace = "http://www.SMS.parsianInsurance.ir/", className = "ir.parsianinsurance.he.interfaces.webservice.client.sms.InsertSaiboonResponse")
    public String insertSaiboon(
        @WebParam(name = "UserName", targetNamespace = "http://www.SMS.parsianInsurance.ir/")
        String userName,
        @WebParam(name = "Passwrd", targetNamespace = "http://www.SMS.parsianInsurance.ir/")
        String passwrd,
        @WebParam(name = "FirstName", targetNamespace = "http://www.SMS.parsianInsurance.ir/")
        String firstName,
        @WebParam(name = "LastName", targetNamespace = "http://www.SMS.parsianInsurance.ir/")
        String lastName,
        @WebParam(name = "CellPhone", targetNamespace = "http://www.SMS.parsianInsurance.ir/")
        String cellPhone,
        @WebParam(name = "SMSText", targetNamespace = "http://www.SMS.parsianInsurance.ir/")
        String smsText,
        @WebParam(name = "Description", targetNamespace = "http://www.SMS.parsianInsurance.ir/")
        String description,
        @WebParam(name = "PolicyID", targetNamespace = "http://www.SMS.parsianInsurance.ir/")
        String policyID,
        @WebParam(name = "AppName", targetNamespace = "http://www.SMS.parsianInsurance.ir/")
        int appName,
        @WebParam(name = "ReservedField3", targetNamespace = "http://www.SMS.parsianInsurance.ir/")
        String reservedField3);

}
