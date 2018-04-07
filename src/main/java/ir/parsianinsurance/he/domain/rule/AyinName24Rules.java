package ir.parsianinsurance.he.domain.rule;

import javax.enterprise.context.ApplicationScoped;

/**
 * Created by Mohammad on 8/13/2017.
 */


@ApplicationScoped
public class AyinName24Rules implements IAyinName24Rules {

    @Override
    public double darsadeHagheBimeSalane(int moddat_rooz)
    {
        if(moddat_rooz <= 5)
            return 0.05;
        if ( 6 <= moddat_rooz && moddat_rooz <= 15)
            return 0.1;
        if ( 16 <= moddat_rooz && moddat_rooz <= 30)
            return 0.2;
        if ( 30 < moddat_rooz && moddat_rooz <= 60)
            return 0.3;
        if ( 60 < moddat_rooz && moddat_rooz <= 90)
            return 0.4;
        if ( 90 < moddat_rooz && moddat_rooz <= 120)
            return 0.5;
        if ( 120 < moddat_rooz && moddat_rooz <= 150)
            return 0.6;
        if ( 150 < moddat_rooz && moddat_rooz <= 180)
            return 0.7;
        if ( 180 < moddat_rooz && moddat_rooz <= 270)
            return 0.85;
        if ( 270 < moddat_rooz )
            return 1;

        return 0;
    }


}
