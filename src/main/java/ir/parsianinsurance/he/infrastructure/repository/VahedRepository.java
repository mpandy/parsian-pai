package ir.parsianinsurance.he.infrastructure.repository;

import ir.parsianinsurance.he.domain.model.Vahed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.cdi.Eager;

import java.util.List;

/**
 * Created by 8119 on 2/23/2017.
 */

@Eager
public interface VahedRepository extends JpaRepository<Vahed, Long>, QueryDslPredicateExecutor<Vahed> {
    List<Vahed> findTop5ByOrderByIdDesc();
    List<Vahed> findByNameContains(String name);
    List<Vahed> findBySarparast(Vahed vahed);
    Vahed findByCode(String code);

    @Modifying
    @Query("update Vahed n set  n.vahedSequence.bimename_count = 1, " +
            "                   n.vahedSequence.pishnahad_count = 1, " +
            "                   n.vahedSequence.khesarat_count = 1")
    void resetAllNamayandesSequences();
}