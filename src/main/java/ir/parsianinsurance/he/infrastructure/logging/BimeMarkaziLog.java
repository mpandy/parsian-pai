package ir.parsianinsurance.he.infrastructure.logging;

import ir.parsianinsurance.he.infrastructure.util.DateUtil;
import ir.parsianinsurance.he.interfaces.webservice.client.bimemarkazi.ArrayOfKeyValueOfstringstring;
import ir.parsianinsurance.he.interfaces.webservice.client.bimemarkazi.WbsV4PlcyRes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.JAXBElement;

@Entity
@Table(name = "INFRA_BIMEMARKAZI_LOG")
public class BimeMarkaziLog {

    @Id
    @GeneratedValue
    private Long id;
    private String createdDate;
    private String webMethod;
    private Long artifactId;
    private Long PlcyUnqCod;
    private Long PlcyUnqMidId;
    private String errors;
    private String status;

    public Long getId() {
        return id;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getWebMethod() {
        return webMethod;
    }

    public void setWebMethod(String webMethod) {
        this.webMethod = webMethod;
    }

    public Long getArtifactId() {
        return artifactId;
    }

    public void setArtifactId(Long artifactId) {
        this.artifactId = artifactId;
    }

    public Long getPlcyUnqCod() {
        return PlcyUnqCod;
    }

    public void setPlcyUnqCod(Long plcyUnqCod) {
        PlcyUnqCod = plcyUnqCod;
    }

    public Long getPlcyUnqMidId() {
        return PlcyUnqMidId;
    }

    public void setPlcyUnqMidId(Long plcyUnqMidId) {
        PlcyUnqMidId = plcyUnqMidId;
    }

    public String getErrors() {
        return errors;
    }

    public void setErrors(String errors) {
        this.errors = errors;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BimeMarkaziLog(WbsV4PlcyRes wbsV4PlcyRes, Long artifactId)
    {
        this.createdDate = DateUtil.timeStamp();
        this.PlcyUnqCod = wbsV4PlcyRes.getPlcyUnqCod();
        this.PlcyUnqMidId = wbsV4PlcyRes.getPlcyMidId();
        this.status = (wbsV4PlcyRes.getErrors().getValue().getKeyValueOfstringstring().size()==0) ? "Success" : "Failure";
        this.errors = stringOf(wbsV4PlcyRes.getErrors());
        this.artifactId = artifactId;
        this.webMethod = "ciiRegChkPlcy";
    }

    private String stringOf(JAXBElement<ArrayOfKeyValueOfstringstring> errors){

        String output = "";
        for(ArrayOfKeyValueOfstringstring.KeyValueOfstringstring next : errors.getValue().getKeyValueOfstringstring())
            output+=(next.getKey()+":" + next.getValue()+"/");

        return output;
    }

    public BimeMarkaziLog() {
    }
}
