package ir.parsianinsurance.he.infrastructure.repository;

import ir.parsianinsurance.he.domain.model.ArtifactDoc;
import ir.parsianinsurance.he.domain.model.KhesaratCase;
import ir.parsianinsurance.he.domain.model.SaghfeKhesaratNaghseOzvArtifactDoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.cdi.Eager;

import java.util.List;

/**
 * Created by 8119 on 12/23/2017.
 */
@Eager
public interface KhesaratNaghseOzvArtifactDocRepository extends
        JpaRepository<ArtifactDoc, Long> {
        List<SaghfeKhesaratNaghseOzvArtifactDoc> findByKhesaratCase(KhesaratCase khesaratCase);
        }

