package ir.parsianinsurance.he.domain.model;

import ir.parsianinsurance.he.domain.model.enums.VaziateParvandeKhesarat;
import ir.parsianinsurance.he.infrastructure.util.DateUtil;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by 8119 on 6/29/2017.
 */
public class KhesaratFactory {

    public static Khesarat newKhesaratForSodoor(){

        Khesarat khesarat = new Khesarat();
        Set<KhesaratCase> khesaratCases = new HashSet<>();
        Set<HavaleKhesarat> havaleKhesarats = new HashSet<>();
        khesarat.setTarikhe_tashkil_parvande(DateUtil.getJalaliCurrentDate());
        khesarat.setKhesaratCases(khesaratCases);
        khesarat.setHavaleKhesarats(havaleKhesarats);
        khesarat.setCreatedDate(DateUtil.now());
        khesarat.setVaziateparvande(VaziateParvandeKhesarat.EMPTY);
        return khesarat;
    }
}
