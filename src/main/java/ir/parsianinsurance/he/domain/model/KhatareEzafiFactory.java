package ir.parsianinsurance.he.domain.model;

import ir.parsianinsurance.he.domain.model.enums.NoeKhatarEzafi;

/**
 * Created by Mohammad on 6/10/2017.
 */
public class KhatareEzafiFactory {

    public static KhatarEzafi newKhatareEzafi(){
        KhatarEzafi khatarEzafi = new KhatarEzafi();
        khatarEzafi.setNerkh(Double.valueOf(0));
        khatarEzafi.setNoekhatarezafi(NoeKhatarEzafi.EMPTY_KHATAR);
        khatarEzafi.setTozih("");
        return khatarEzafi;
    }


    public static KhatarEzafi copyKhatarEzafiForElhaghiye(KhatarEzafi originalKhatarEzafi) {
        KhatarEzafi khatarEzafi = new KhatarEzafi();
        khatarEzafi.setNoekhatarezafi(originalKhatarEzafi.getNoekhatarezafi());
        khatarEzafi.setTozih(originalKhatarEzafi.getTozih());
        khatarEzafi.setNerkh(originalKhatarEzafi.getNerkh());
        khatarEzafi.setCreatedDate(originalKhatarEzafi.getCreatedDate());
        return khatarEzafi;
    }
}
