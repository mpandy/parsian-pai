package ir.parsianinsurance.he.domain.model.enums;

/**
 * Created by 8119 on 6/20/2017.
 */
public enum NoeHadese {

    EMPTY,
    FOT,
    NAGHSOZV_AZKAROFTADEGI,
    HAZINE_PEZESHKI;

    private NoeTaahod taahod;

    static {
        FOT.taahod = NoeTaahod.FOT;
        HAZINE_PEZESHKI.taahod = NoeTaahod.HAZINE_PEZESHKI;
        NAGHSOZV_AZKAROFTADEGI.taahod = NoeTaahod.NAGHSOZV_AZKAROFTADEGI;
    }

    public NoeTaahod getTaahod(){
        return taahod;
    }
}
