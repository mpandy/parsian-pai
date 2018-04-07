package ir.parsianinsurance.he.infrastructure.repository;

import ir.parsianinsurance.he.domain.model.HavaleKhesarat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.cdi.Eager;

/**
 * Created by 8119 on 9/14/2017.
 */
@Eager
public interface HavaleKhesaratRepository extends JpaRepository<HavaleKhesarat, Long>, QueryDslPredicateExecutor<HavaleKhesarat> {
}
