package ir.parsianinsurance.he.domain.model;

import com.google.common.collect.ImmutableSet;
import ir.parsianinsurance.he.domain.model.enums.NoeTaahod;
import ir.parsianinsurance.he.infrastructure.util.DateUtil;

import java.util.Set;

/**
 * Created by 8119 on 6/11/2017.
 */
public class TaahodFactory {

    public static TaahodBimegar newTaahodeBimegar(){
        TaahodBimegar taahodbimegar = new TaahodBimegar();
        taahodbimegar.setSarmaye_taahod(Long.valueOf(0));
        taahodbimegar.setNerkh_paye(Double.valueOf(0));
        taahodbimegar.setNerkh_taahod(Double.valueOf(0));
        taahodbimegar.setHagh_bime_taahod(Long.valueOf(0));
        taahodbimegar.setHagh_bime_khataratezafi(Long.valueOf(0));
        taahodbimegar.setHagh_bime_zelzelevamotor(Long.valueOf(0));
        taahodbimegar.setNoetaahod(NoeTaahod.EMPTY);
        taahodbimegar.setCreatedDate(DateUtil.now());
        return taahodbimegar;
    }

    public static TaahodBimegar copyTaahodeBimegarForElhaghiye(TaahodBimegar originalTaahodBimegar) {
        TaahodBimegar taahodBimegar = new TaahodBimegar();
        taahodBimegar.setSarmaye_taahod(originalTaahodBimegar.getSarmaye_taahod());
        taahodBimegar.setNoetaahod(originalTaahodBimegar.getNoetaahod());
        taahodBimegar.setNerkh_taahod(originalTaahodBimegar.getNerkh_taahod());
        taahodBimegar.setNerkh_paye(originalTaahodBimegar.getNerkh_paye());
        taahodBimegar.setHagh_bime_taahod(originalTaahodBimegar.getHagh_bime_taahod());
        taahodBimegar.setHagh_bime_khataratezafi(originalTaahodBimegar.getHagh_bime_khataratezafi());
        taahodBimegar.setHagh_bime_zelzelevamotor(originalTaahodBimegar.getHagh_bime_zelzelevamotor());
        taahodBimegar.setCreatedDate(originalTaahodBimegar.getCreatedDate());
    return taahodBimegar;
    }


    public static Set<TaahodBimegar> taahodatForAgency(){

        TaahodBimegar fotTaahod = new TaahodBimegar();
        fotTaahod.setNoetaahod(NoeTaahod.FOT);
        fotTaahod.setSarmaye_taahod(40000000L);

        TaahodBimegar naghseOzvTaahod = new TaahodBimegar();
        naghseOzvTaahod.setNoetaahod(NoeTaahod.NAGHSOZV_AZKAROFTADEGI);
        naghseOzvTaahod.setSarmaye_taahod(40000000L);

        TaahodBimegar pezeshkiTaahod = new TaahodBimegar();
        pezeshkiTaahod.setNoetaahod(NoeTaahod.HAZINE_PEZESHKI);
        pezeshkiTaahod.setSarmaye_taahod(4000000L);

        return ImmutableSet.of(fotTaahod, naghseOzvTaahod, pezeshkiTaahod);
    }
}
