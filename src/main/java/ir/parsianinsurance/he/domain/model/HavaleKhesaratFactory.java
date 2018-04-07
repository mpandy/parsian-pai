package ir.parsianinsurance.he.domain.model;

import ir.parsianinsurance.he.infrastructure.util.DateUtil;

/**
 * Created by 8119 on 9/14/2017.
 */
public class HavaleKhesaratFactory {
    public static HavaleKhesarat newHavaleKhesaratForAddToKhesarat() {

        HavaleKhesarat havaleKhesarat = new HavaleKhesarat();
        havaleKhesarat.setTarikhSodoorHavale(DateUtil.getJalaliCurrentDate());
        havaleKhesarat.setCreatedDate(DateUtil.now());
        return havaleKhesarat;

    }

    }
