package ir.parsianinsurance.he.interfaces.webservice.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Mohammad on 8/15/2017.
 */

@XmlRootElement
public class AgencyWebserviceResponse {

    private String status;
    private String message;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public AgencyWebserviceResponse(String status, String message) {
        this.status = status;
        this.message = message;
    }
}
