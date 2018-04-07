package ir.parsianinsurance.he.infrastructure.repository;

import ir.parsianinsurance.he.domain.model.Khesarat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.cdi.Eager;

import java.util.List;

/**
 * Created by 8119 on 7/11/2017.
 */
@Eager
public interface KhesaratRepository extends JpaRepository<Khesarat, Long>, QueryDslPredicateExecutor<Khesarat> {
    List<Khesarat> findTop10ByOrderByIdDesc();
    List<Khesarat> findByBimename_ShomareContains(String shomare);
}
