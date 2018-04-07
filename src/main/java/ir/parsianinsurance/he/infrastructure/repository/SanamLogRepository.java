package ir.parsianinsurance.he.infrastructure.repository;

import ir.parsianinsurance.he.infrastructure.logging.SanamLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.cdi.Eager;

@Eager
public interface SanamLogRepository extends JpaRepository<SanamLog, Long> {
}