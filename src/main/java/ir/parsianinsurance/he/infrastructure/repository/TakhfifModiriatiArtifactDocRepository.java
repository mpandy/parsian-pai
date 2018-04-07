package ir.parsianinsurance.he.infrastructure.repository;

import ir.parsianinsurance.he.domain.model.ArtifactDoc;
import ir.parsianinsurance.he.domain.model.Bimename;
import ir.parsianinsurance.he.domain.model.TakhfifeModiriatiArtifactDoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.cdi.Eager;

import java.util.List;

/**
 * Created by 8119 on 11/29/2017.
 */

@Eager
public interface TakhfifModiriatiArtifactDocRepository extends
        JpaRepository<ArtifactDoc, Long> {
    List<TakhfifeModiriatiArtifactDoc> findByBimename (Bimename bimename);
}