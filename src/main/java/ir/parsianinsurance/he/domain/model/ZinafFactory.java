package ir.parsianinsurance.he.domain.model;

import ir.parsianinsurance.he.domain.model.enums.NesbatBaBimeshode;
import ir.parsianinsurance.he.domain.model.enums.OlaviateKhesarat;
import ir.parsianinsurance.he.infrastructure.util.DateUtil;

/**
 * Created by 8119 on 6/11/2017.
 */
public class ZinafFactory {

    public static Zinaf newZinaf(){
        Zinaf zinaf = new Zinaf();
        zinaf.setNesbat_ba_bimeshode(NesbatBaBimeshode.EMPTY);
        zinaf.setOlaviat_khesarat(OlaviateKhesarat.EMPTY);
        zinaf.setZarib_sahm(0);
        zinaf.setCreatedDate(DateUtil.now());
        return zinaf;
    }

    public static Zinaf copyZinafForElhaghiye(Zinaf originalZinaf) {
        Zinaf zinaf = new Zinaf();

        zinaf.setName(originalZinaf.getName());
        zinaf.setName_khanevadegi(originalZinaf.getName_khanevadegi());
        zinaf.setName_pedar(originalZinaf.getName_pedar());
        zinaf.setShomare_shenasname(originalZinaf.getShomare_shenasname());
        zinaf.setKode_meli(originalZinaf.getKode_meli());
        zinaf.setNesbat_ba_bimeshode(originalZinaf.getNesbat_ba_bimeshode());
        zinaf.setOlaviat_khesarat(originalZinaf.getOlaviat_khesarat());
        zinaf.setZarib_sahm(originalZinaf.getZarib_sahm());
        zinaf.setTozih(originalZinaf.getTozih());
        zinaf.setCreatedDate(originalZinaf.getCreatedDate());
        return zinaf;
    }
}
