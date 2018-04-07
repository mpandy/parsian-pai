package ir.parsianinsurance.he.domain.model;

import ir.parsianinsurance.he.domain.model.enums.NahvePardakht;

/**
 * Created by Mohammad on 7/26/2017.
 */
public class HagheBimeFactory {

    public static HagheBime newHagheBimeForSodoor(){
        HagheBime hagheBime = new HagheBime();
        hagheBime.setNahvePardakht(NahvePardakht.PARDAKHT_NAGHDI_HAMZAMAN_BA_SODOOR);
        return hagheBime;
    }
    public static HagheBime copyHagheBimeForElhaghiye(HagheBime originalHagheBime) {
        HagheBime hagheBime = new HagheBime();
        hagheBime.setHaghe_bime_ghabelepardakht(originalHagheBime.getHaghe_bime_ghabelepardakht());
        hagheBime.setKarmozd(originalHagheBime.getKarmozd());
        hagheBime.setNahvePardakht(originalHagheBime.getNahvePardakht());
        hagheBime.setJame_khatarate_asli(originalHagheBime.getJame_khatarate_asli());
        hagheBime.setJame_khatarate_ezafi(originalHagheBime.getJame_khatarate_ezafi());
        hagheBime.setKasr_hezar_rial(originalHagheBime.getKasr_hezar_rial());
        return hagheBime;
    }

    public static HagheBime hagheBimeForAgency(int modat){

        HagheBime hagheBime = new HagheBime();
        hagheBime.setNahvePardakht(NahvePardakht.PARDAKHT_ETEBARI);

        if(modat == 5){
            hagheBime.setHaghe_bime_ghabelepardakht(10000L);
        }
        if(6 <= modat && modat <= 15){
            hagheBime.setHaghe_bime_ghabelepardakht(17450L);
        }
        if(16 <= modat && modat <= 21){
            hagheBime.setHaghe_bime_ghabelepardakht(34900L);
        }

        return hagheBime;
    }
}
