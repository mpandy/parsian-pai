package ir.parsianinsurance.he.infrastructure.repository;

import ir.parsianinsurance.he.domain.model.BimeGozar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.cdi.Eager;

/**
 * Created by 8119 on 2/25/2017.
 */
@Eager
public interface BimegozarRepository extends JpaRepository<BimeGozar, Long>, QueryDslPredicateExecutor<BimeGozar> {

//    @Query("select distinct pish.bimeGozar from Bimename bim inner join bim.pishnahadeFaal pish where pish.noeBimegozar = ir.parsianinsurance.he.domain.model.enums.NoeShakhs.HAGHIGHI")
//    List<BimeGozar> faalHaghighiBimesgozars();
//
//
//    @Query("select distinct pish.bimeGozar from Bimename bim inner join bim.pishnahadeFaal pish where pish.noeBimegozar = ir.parsianinsurance.he.domain.model.enums.NoeShakhs.HOGHOOGHI")
//    List<BimeGozar> faalHoghooghiBimesgozars();
}
