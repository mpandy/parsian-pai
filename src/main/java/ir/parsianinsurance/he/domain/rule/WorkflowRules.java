package ir.parsianinsurance.he.domain.rule;

import ir.parsianinsurance.he.domain.model.enums.ArtifactDocState;
import ir.parsianinsurance.he.domain.model.enums.VaziateParvandeKhesarat;

import javax.enterprise.context.ApplicationScoped;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by 8119 on 11/9/2017.
 */

@ApplicationScoped
public class WorkflowRules implements IWorkflowRules {

    @Override
    public List<VaziateParvandeKhesarat> nextVaziatKhesarat(VaziateParvandeKhesarat currentVaziat)
    {
        switch (currentVaziat)
        {
            case TASHKILE_PARVANDE_VA_KARSHENASI:
                return Arrays.asList(   VaziateParvandeKhesarat.GHEIR_GHABL_PADAKHT,
                        VaziateParvandeKhesarat.ENSERAFE_MOSHTARI,
                        VaziateParvandeKhesarat.ELAAM_BE_MAALI);

            case ELAAM_BE_MAALI:
                return Arrays.asList(VaziateParvandeKhesarat.TASVIE_PARDAKHT_SHODE);

            case TAYIDE_MOJAVEZ:
                return Arrays.asList(VaziateParvandeKhesarat.TASHKILE_PARVANDE_VA_KARSHENASI);

            default:
                return Collections.emptyList();

        }
    }

    @Override
    public List<ArtifactDocState> nextArtifactDocStates(ArtifactDocState currentArtifactDocState)
    {
        switch (currentArtifactDocState)
        {
            case NIAZ:
                return Arrays.asList(   ArtifactDocState.JADID);

            case JADID:
                return Arrays.asList(   ArtifactDocState.ELAME_NAGHS, ArtifactDocState.ADAMETAYID, ArtifactDocState.TAYID);

            case ELAME_NAGHS:
                return Arrays.asList(   ArtifactDocState.RAFE_NAGHS);

            case RAFE_NAGHS:
                return Arrays.asList(   ArtifactDocState.ELAME_NAGHS, ArtifactDocState.ADAMETAYID, ArtifactDocState.TAYID);

            default:
                return Collections.emptyList();

        }
    }

}
