package ir.parsianinsurance.he.infrastructure.repository;

import ir.parsianinsurance.he.domain.model.KhatarEzafi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.cdi.Eager;

/**
 * Created by 8119 on 2/25/2017.
 */
@Eager
public interface KhatarEzafiRepository extends JpaRepository<KhatarEzafi, Long>, QueryDslPredicateExecutor<KhatarEzafi> {
//    public List<KhatarEzafi> findByPishnahad(Pishnahad pishnahad);
}
