package ir.parsianinsurance.he.infrastructure.repository;

import ir.parsianinsurance.he.domain.model.Shoghl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.cdi.Eager;

import java.util.List;

/**
 * Created by 8119 on 2/25/2017.
 */
@Eager
public interface ShoghlRepository extends JpaRepository<Shoghl, Long>, QueryDslPredicateExecutor<Shoghl> {
    List<Shoghl> findTop5ByOrderByIdDesc();
    List<Shoghl> findAllByOrderByName();
    List<Shoghl> findByNameContains(String name);
    Shoghl findByName(String name);

}
