package ir.parsianinsurance.he.domain.model;

/**
 * Created by 8119 on 7/30/2017.
 */
public class EzafeKasrFactory {

    public static EzafeKasr init() {

        EzafeKasr ezafeKasr = new EzafeKasr();
        ezafeKasr.setEzafe_nerkh_pezeshki(0.0);
        ezafeKasr.setTakhfife_goroohi(0.0);
        ezafeKasr.setTakhfife_modiriati(0.0);

        return ezafeKasr;
    }

    public static EzafeKasr copyEzafeKasrForElhaghiye(EzafeKasr original) {
        EzafeKasr ezafeKasr = new EzafeKasr();
        ezafeKasr.setEzafe_nerkh_pezeshki(original.getEzafe_nerkh_pezeshki());
        ezafeKasr.setTakhfife_goroohi(original.getTakhfife_goroohi());
        ezafeKasr.setTakhfife_modiriati(original.getTakhfife_modiriati());
        return ezafeKasr;
    }
}
