package ir.parsianinsurance.he.infrastructure.repository;

import ir.parsianinsurance.he.domain.model.Elhaghiye;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.cdi.Eager;

/**
 * Created by 8119 on 2/25/2017.
 */
@Eager
public interface ElhaghiyeRepository extends JpaRepository<Elhaghiye, Long>, QueryDslPredicateExecutor<Elhaghiye> {

}
