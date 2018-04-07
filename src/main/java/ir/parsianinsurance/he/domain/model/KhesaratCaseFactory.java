package ir.parsianinsurance.he.domain.model;

import ir.parsianinsurance.he.infrastructure.util.DateUtil;

/**
 * Created by 8119 on 9/14/2017.
 */
public class KhesaratCaseFactory {
    public static KhesaratCase newKhesaratCaseForAddToKhesarat() {

        KhesaratCase khesaratCase = new KhesaratCase();
        khesaratCase.setCreatedDate(DateUtil.now());
        return khesaratCase;

        }

    }
