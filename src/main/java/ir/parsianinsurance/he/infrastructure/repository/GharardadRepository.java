package ir.parsianinsurance.he.infrastructure.repository;

import ir.parsianinsurance.he.domain.model.Gharardad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.cdi.Eager;

import java.util.List;

/**
 * Created by 8119 on 2/23/2017.
 */

@Eager
public interface GharardadRepository  extends JpaRepository<Gharardad, Long>, QueryDslPredicateExecutor<Gharardad> {
    List<Gharardad> findByNameContains(String name);
    List<Gharardad> findTop5ByOrderByIdDesc();
    Gharardad findByShomare(String shomare);
}
