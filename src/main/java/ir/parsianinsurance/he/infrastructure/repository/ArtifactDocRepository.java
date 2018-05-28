package ir.parsianinsurance.he.infrastructure.repository;

import ir.parsianinsurance.he.domain.model.ArtifactDoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.cdi.Eager;

import java.util.List;

/**
 * Created by 8119 on 11/11/2017.
 */
@Eager
public interface ArtifactDocRepository extends JpaRepository<ArtifactDoc, Long>, QueryDslPredicateExecutor<ArtifactDoc> {
}
