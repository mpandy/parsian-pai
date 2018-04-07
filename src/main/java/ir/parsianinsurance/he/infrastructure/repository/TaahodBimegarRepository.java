package ir.parsianinsurance.he.infrastructure.repository;

import ir.parsianinsurance.he.domain.model.TaahodBimegar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.cdi.Eager;

/**
 * Created by 8119 on 2/25/2017.
 */
@Eager
public interface TaahodBimegarRepository extends JpaRepository<TaahodBimegar, Long>, QueryDslPredicateExecutor<TaahodBimegar> {
//    public List<TaahodBimegar> findByPishnahad(Pishnahad pishnahad);

}
