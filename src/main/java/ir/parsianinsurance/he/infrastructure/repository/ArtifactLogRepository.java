package ir.parsianinsurance.he.infrastructure.repository;

import ir.parsianinsurance.he.infrastructure.logging.ArtifactLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.cdi.Eager;

import java.util.List;

@Eager
public interface ArtifactLogRepository extends JpaRepository<ArtifactLog, Long>{

    List<ArtifactLog> findArtifactLogBySanamDoneIsFalse();
    List<ArtifactLog> findArtifactLogBySanamDoneIsTrueAndBimeMarkaziDoneIsFalse();
}

