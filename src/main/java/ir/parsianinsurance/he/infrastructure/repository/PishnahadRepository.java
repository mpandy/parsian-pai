package ir.parsianinsurance.he.infrastructure.repository;

import ir.parsianinsurance.he.domain.model.Pishnahad;
import ir.parsianinsurance.he.domain.model.Vahed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.cdi.Eager;

import java.util.List;

/**
 * Created by 8119 on 2/25/2017.
 */
@Eager
public interface PishnahadRepository extends JpaRepository<Pishnahad, Long>, QueryDslPredicateExecutor<Pishnahad> {

    List<Pishnahad> findByVahed(Vahed vahed);

}
