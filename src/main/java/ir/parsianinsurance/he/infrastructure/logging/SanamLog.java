package ir.parsianinsurance.he.infrastructure.logging;

import ir.parsianinsurance.he.infrastructure.util.DateUtil;

import javax.persistence.*;

/**
 * Created by Mohammad on 8/21/2017.
 */
@Entity
@Table(name = "INFRA_SANAM_LOG")
public class SanamLog{

    @Id
    @GeneratedValue
    private Long id;
    private String createdDate;
    private String status;

    @Column(length = 500)
    private String request;
    private String response;

    public SanamLog(String status, String request, String response) {
        this.status = status;
        this.request = request;
        this.response = response;
        this.createdDate = DateUtil.timeStamp();
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

}
