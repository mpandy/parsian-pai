package ir.parsianinsurance.he.infrastructure.repository;

import ir.parsianinsurance.he.domain.model.ArtifactDoc;
import ir.parsianinsurance.he.domain.model.Bimename;
import ir.parsianinsurance.he.domain.model.SaghfeSodoorArtifactDoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.cdi.Eager;

import java.util.List;

/**
 * Created by 8119 on 11/29/2017.
 */
@Eager
public interface SaghfeSodoorArtifactDocRepository extends
        JpaRepository<ArtifactDoc, Long>{
    List<SaghfeSodoorArtifactDoc> findByBimename (Bimename bimename);
}
