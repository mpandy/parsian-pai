package ir.parsianinsurance.he.infrastructure.repository;

import com.querydsl.core.types.Predicate;
import ir.parsianinsurance.he.domain.model.Bimename;
import ir.parsianinsurance.he.domain.model.enums.VaziateBimename;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.cdi.Eager;

import java.util.List;

/**
 * Created by 8119 on 2/23/2017.
 */

@Eager
public interface BimenameRepository extends JpaRepository<Bimename, Long>, QueryDslPredicateExecutor<Bimename> {

    Bimename findByShomare(String shomare);
    List<Bimename> findByShomareContains(String shomare);
    List<Bimename> findByVaziateBimenameContains (VaziateBimename vaziat);
    List<Bimename> findTop10ByOrderByIdDesc(Predicate predicate);

}
