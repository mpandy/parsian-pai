package ir.parsianinsurance.he.domain.model;

import ir.parsianinsurance.he.domain.model.enums.ArtifactDocState;
import ir.parsianinsurance.he.infrastructure.io.Zamime;
import ir.parsianinsurance.he.infrastructure.security.User;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by 8119 on 11/9/2017.
 */

@Entity
@Table(name = "DMN_ARTIFACT_DOC")
@DiscriminatorColumn (name="ARTIFACTDOC_TYPE", discriminatorType = DiscriminatorType.STRING, length = 255)
public abstract class ArtifactDoc {

    @Id
    @GeneratedValue
    private Long id;

    @Enumerated(EnumType.STRING)
    private ArtifactDocState artifactDocState;

    @OneToOne
    private User creator;

    @OneToOne
    private Vahed az;

    @OneToOne
    private Vahed be;

    private String tozihat;
    private String tarikheSabteArtifactDoc;
    private Long createdDate;
    private Boolean javabDadeShode;

    @OneToOne(fetch = FetchType.LAZY)
    private ArtifactDoc darEdameye;

    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "artifact_doc_id")
    private Set<Zamime> zamaem;

    public ArtifactDocState getArtifactDocState() {
        return artifactDocState;
    }

    public void setArtifactDocState(ArtifactDocState artifactDocState) {
        this.artifactDocState = artifactDocState;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public Vahed getAz() {
        return az;
    }

    public void setAz(Vahed az) {
        this.az = az;
    }

    public Vahed getBe() {
        return be;
    }

    public void setBe(Vahed be) {
        this.be = be;
    }

    public String getTozihat() {
        return tozihat;
    }

    public void setTozihat(String tozihat) {
        this.tozihat = tozihat;
    }

    public String getTarikheSabteArtifactDoc() {
        return tarikheSabteArtifactDoc;
    }

    public void setTarikheSabteArtifactDoc(String tarikheDarkhast) {
        this.tarikheSabteArtifactDoc = tarikheDarkhast;
    }

    public Set<Zamime> getZamaem() {
        return zamaem;
    }

    public void setZamaem(Set<Zamime> zamaem) {
        this.zamaem = zamaem;
    }

    public Long getId() {
        return id;
    }

    public Long getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Long createdDate) {
        this.createdDate = createdDate;
    }

    public ArtifactDoc getDarEdameye() {
        return darEdameye;
    }

    public void setDarEdameye(ArtifactDoc darEdameye) {
        this.darEdameye = darEdameye;
    }

    public abstract ArtifactDocAttachable getArtifactDocAttachable();

    public abstract ArtifactDoc giveForTaghirVaziat(User user);

    public abstract void tayidArtifactDocAttachable();

    public abstract void adameTayidArtifactDocAttachable();

    public Boolean getJavabDadeShode() {
        return javabDadeShode;
    }

    public void setJavabDadeShode(Boolean javabDadeShode) {
        this.javabDadeShode = javabDadeShode;
    }

}
