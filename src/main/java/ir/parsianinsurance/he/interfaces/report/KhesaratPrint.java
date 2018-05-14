package ir.parsianinsurance.he.interfaces.report;

import ir.parsianinsurance.he.domain.model.Khesarat;
import ir.parsianinsurance.he.domain.model.ShakhseHaghighi;
import net.sf.jasperreports.engine.JRDataSource;

/**
 * Created by 8119 on 8/21/2017.
 */
public class KhesaratPrint {
    private Khesarat khesarat;
    private ShakhseHaghighi bimegozarShakhsHaghighi;
    private JRDataSource mavared;

    public JRDataSource getMavared() {
        return mavared;
    }

    public void setMavared(JRDataSource mavared) {
        this.mavared = mavared;
    }

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
