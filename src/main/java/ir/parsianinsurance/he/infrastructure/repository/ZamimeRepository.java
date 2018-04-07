package ir.parsianinsurance.he.infrastructure.repository;

import ir.parsianinsurance.he.infrastructure.io.Zamime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.cdi.Eager;

/**
 * Created by Mohammad on 11/7/2017.
 */
@Eager
public interface ZamimeRepository extends JpaRepository<Zamime, Long>, QueryDslPredicateExecutor<Zamime> {
}
