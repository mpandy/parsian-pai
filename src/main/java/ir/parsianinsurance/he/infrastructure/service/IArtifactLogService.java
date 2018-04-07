package ir.parsianinsurance.he.infrastructure.service;

import ir.parsianinsurance.he.domain.model.Artifact;
import ir.parsianinsurance.he.infrastructure.logging.ArtifactLog;

public interface IArtifactLogService {

    Artifact getArtifact(ArtifactLog artifactLog);
}
