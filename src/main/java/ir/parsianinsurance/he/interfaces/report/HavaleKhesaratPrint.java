package ir.parsianinsurance.he.interfaces.report;

import ir.parsianinsurance.he.domain.model.HavaleKhesarat;
import ir.parsianinsurance.he.domain.model.ShakhseHaghighi;

/**
 * Created by 8119 on 11/6/2017.
 */
public class HavaleKhesaratPrint {

    private HavaleKhesarat havaleKhesarat;
    private ShakhseHaghighi bimegozarShakhsHaghighi;

    public HavaleKhesarat getHavaleKhesarat() {
        return havaleKhesarat;
    }

    public void setHavaleKhesarat(HavaleKhesarat havaleKhesarat) {
        this.havaleKhesarat = havaleKhesarat;
    }

    public ShakhseHaghighi getBimegozarShakhsHaghighi() {
        return bimegozarShakhsHaghighi;
    }

    public void setBimegozarShakhsHaghighi(ShakhseHaghighi bimegozarShakhsHaghighi) {
        this.bimegozarShakhsHaghighi = bimegozarShakhsHaghighi;
    }
}
