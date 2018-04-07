package ir.parsianinsurance.he.infrastructure.repository;

import ir.parsianinsurance.he.domain.model.KhesaratCase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.cdi.Eager;

/**
 * Created by 8119 on 12/19/2017.
 */

@Eager
public interface KhesaratCaseRepository extends JpaRepository<KhesaratCase, Long> {
}
