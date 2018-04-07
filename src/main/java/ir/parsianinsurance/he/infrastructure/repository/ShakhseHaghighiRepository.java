package ir.parsianinsurance.he.infrastructure.repository;

import ir.parsianinsurance.he.domain.model.ShakhseHaghighi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.cdi.Eager;

import java.util.List;

/**
 * Created by Mahan on 02/03/2017.
 */
@Eager
public interface ShakhseHaghighiRepository extends JpaRepository<ShakhseHaghighi, Long>, QueryDslPredicateExecutor<ShakhseHaghighi> {
        List<ShakhseHaghighi> findByName(String name);
}
