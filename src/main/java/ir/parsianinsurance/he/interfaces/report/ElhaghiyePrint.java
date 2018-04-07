package ir.parsianinsurance.he.interfaces.report;

import ir.parsianinsurance.he.domain.model.Elhaghiye;
import ir.parsianinsurance.he.domain.model.ShakhseHaghighi;
import ir.parsianinsurance.he.domain.model.ShakhseHoghooghi;

/**
 * Created by 8119 on 8/22/2017.
 */
public class ElhaghiyePrint {
    private Elhaghiye elhaghiye;
    private ShakhseHaghighi bimegozarShakhsHaghighi;
    private ShakhseHoghooghi bimegozarShakhsHoghooghi;



    public Elhaghiye getElhaghiye() {
        return elhaghiye;
    }

    public void setElhaghiye(Elhaghiye elhaghiye) {
        this.elhaghiye = elhaghiye;
    }

    public ShakhseHaghighi getBimegozarShakhsHaghighi() {
        return bimegozarShakhsHaghighi;
    }

    public void setBimegozarShakhsHaghighi(ShakhseHaghighi bimegozarShakhsHaghighi) {
        this.bimegozarShakhsHaghighi = bimegozarShakhsHaghighi;
    }

    public ShakhseHoghooghi getBimegozarShakhsHoghooghi() {
        return bimegozarShakhsHoghooghi;
    }

    public void setBimegozarShakhsHoghooghi(ShakhseHoghooghi bimegozarShakhsHoghooghi) {
        this.bimegozarShakhsHoghooghi = bimegozarShakhsHoghooghi;
    }
}
