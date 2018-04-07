package ir.parsianinsurance.he.infrastructure.repository;

import ir.parsianinsurance.he.domain.model.BimeShode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.cdi.Eager;

import java.util.List;

/**
 * Created by 8119 on 2/25/2017.
 */
@Eager
public interface BimeshodeRepository extends JpaRepository<BimeShode, Long>, QueryDslPredicateExecutor<BimeShode> {

    @Query("select distinct pish.bimeShode from Bimename bim inner join bim.pishnahadeFaal pish")
    public List<BimeShode> faalBimeshodes();
}



