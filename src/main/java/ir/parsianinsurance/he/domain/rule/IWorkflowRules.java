package ir.parsianinsurance.he.domain.rule;

import ir.parsianinsurance.he.domain.model.enums.ArtifactDocState;
import ir.parsianinsurance.he.domain.model.enums.VaziateParvandeKhesarat;

import java.util.List;

/**
 * Created by 8119 on 11/9/2017.
 */
public interface IWorkflowRules {
    List<VaziateParvandeKhesarat> nextVaziatKhesarat(VaziateParvandeKhesarat currentVaziat);
    List<ArtifactDocState> nextArtifactDocStates(ArtifactDocState currentArtifactDocState);
}
