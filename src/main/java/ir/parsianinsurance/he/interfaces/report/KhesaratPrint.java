package ir.parsianinsurance.he.interfaces.report;

import ir.parsianinsurance.he.domain.model.Khesarat;
import ir.parsianinsurance.he.domain.model.ShakhseHaghighi;

/**
 * Created by 8119 on 8/21/2017.
 */
public class KhesaratPrint {
    private Khesarat khesarat;
    private ShakhseHaghighi bimegozarShakhsHaghighi;


    public Khesarat getKhesarat() {
        return khesarat;
    }

    public void setKhesarat(Khesarat khesarat) {
        this.khesarat = khesarat;
    }

    public ShakhseHaghighi getBimegozarShakhsHaghighi() {
        return bimegozarShakhsHaghighi;
    }

    public void setBimegozarShakhsHaghighi(ShakhseHaghighi bimegozarShakhsHaghighi) {
        this.bimegozarShakhsHaghighi = bimegozarShakhsHaghighi;
    }
}
