package ir.parsianinsurance.he.interfaces.view.model;

import ir.parsianinsurance.he.domain.model.enums.ArtifactDocState;

/**
 * Created by 8119 on 11/12/2017.
 */
public class ArtifactSearchModel {

    private ArtifactDocState artifactDocState;

    public ArtifactDocState getArtifactDocState() {
        return artifactDocState;
    }

    public void setArtifactDocState(ArtifactDocState artifactDocState) {
        this.artifactDocState = artifactDocState;
    }
}
