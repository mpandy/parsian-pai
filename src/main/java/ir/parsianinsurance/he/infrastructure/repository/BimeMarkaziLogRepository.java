package ir.parsianinsurance.he.infrastructure.repository;

import ir.parsianinsurance.he.infrastructure.logging.BimeMarkaziLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.cdi.Eager;

import java.util.List;

@Eager
public interface BimeMarkaziLogRepository extends JpaRepository<BimeMarkaziLog, Long> {

    List<BimeMarkaziLog> findBimeMarkaziLogByWebMethodAndArtifactId(String webMethod, Long artifactId);
}
