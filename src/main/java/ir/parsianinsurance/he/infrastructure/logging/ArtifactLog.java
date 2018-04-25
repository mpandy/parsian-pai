package ir.parsianinsurance.he.infrastructure.logging;

import ir.parsianinsurance.he.infrastructure.util.DateUtil;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Mohammad on 10/28/2017.
 */

@Entity
@Table(name = "INFRA_ARTIFACT_LOG")
public class ArtifactLog {

    @Id
    @GeneratedValue
    private Long id;
    private String createdDate;
    private Boolean sanamDone;
    private Boolean bimeMarkaziDone;
    private String artifactType;
    private Long artifactId;
    private String creatorUsername;

    public ArtifactLog(String username, String artifactType, Long id) {
        this.creatorUsername = username;
        this.artifactType = artifactType;
        this.artifactId = id;
        this.createdDate = DateUtil.timeStamp();
        this.sanamDone = false;
        this.bimeMarkaziDone = false;
    }

    public ArtifactLog() {
    }

    public Long getId() {
        return id;
    }

    public String getArtifactType() {
        return artifactType;
    }

    public void setArtifactType(String artifactType) {
        this.artifactType = artifactType;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public Boolean getSanamDone() {
        return sanamDone;
    }

    public void setSanamDone(Boolean sanamDone) {
        this.sanamDone = sanamDone;
    }

    public Boolean getBimeMarkaziDone() {
        return bimeMarkaziDone;
    }

    public void setBimeMarkaziDone(Boolean bimeMarkaziDone) {
        this.bimeMarkaziDone = bimeMarkaziDone;
    }

    public Long getArtifactId() {
        return artifactId;
    }

    public void setArtifactId(Long artifactId) {
        this.artifactId = artifactId;
    }

    public String getCreatorUsername() {
        return creatorUsername;
    }

    public void setCreatorUsername(String creatorUsername) {
        this.creatorUsername = creatorUsername;
    }
}
