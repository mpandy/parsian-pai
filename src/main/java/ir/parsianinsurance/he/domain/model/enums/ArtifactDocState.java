package ir.parsianinsurance.he.domain.model.enums;

/**
 * Created by 8119 on 11/9/2017.
 */
public enum ArtifactDocState {

    NIAZ,
    JADID,
    ELAME_NAGHS,
    RAFE_NAGHS,
    ADAMETAYID,
    TAYID;

    static {
        TAYID.isFinalState = true;
        ADAMETAYID.isFinalState = true;
        NIAZ.isStartState = true;
    }
    private boolean isFinalState;
    private boolean isStartState;

    public boolean isFinalState() {
        return isFinalState;
    }

    public boolean isStartState() {
        return isStartState;
    }

    public boolean isInternalState() {
        return !isStartState && !isFinalState;
    }
}
