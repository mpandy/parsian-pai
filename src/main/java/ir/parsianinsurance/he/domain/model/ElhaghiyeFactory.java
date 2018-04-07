package ir.parsianinsurance.he.domain.model;

import ir.parsianinsurance.he.infrastructure.security.User;
import ir.parsianinsurance.he.infrastructure.util.DateUtil;

/**
 * Created by 8119 on 5/18/2017.
 */
public class ElhaghiyeFactory {

    public static Elhaghiye newElhaghiyeForSabt(){
        Elhaghiye elhaghiye = new Elhaghiye();
        elhaghiye.setEmzaKonande_aval(new User());
        elhaghiye.setEmzaKonande_dovom(new User());
        elhaghiye.setTarikh_sodoor_elhaghie(DateUtil.getJalaliCurrentDate());
        return elhaghiye;
    }

    public static Elhaghiye newBimenameForBordroElhaghiye() {
        Elhaghiye elhaghiye = new Elhaghiye();
        Bimename bimename = new Bimename();
        elhaghiye.setBimename(bimename);
        return elhaghiye;
    }


}
