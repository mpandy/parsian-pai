package ir.parsianinsurance.he.domain.service;

import ir.parsianinsurance.he.domain.model.TaahodBimegar;
import ir.parsianinsurance.he.domain.model.enums.TabagheKhatar;
import ir.parsianinsurance.he.domain.rule.IPropertyRules;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 * Created by 8119 on 9/18/2017.
 */
@RequestScoped
public class TaahodeBimegarService implements ITaahodeBimegarService {


    @Inject
    IPropertyRules propertyRules;

    @Override
    public void setNerkheTaahod(TaahodBimegar taahodBimegar, TabagheKhatar tabagheKhatar) {
        switch (taahodBimegar.getNoetaahod()) {
            case HAZINE_PEZESHKI:
                taahodBimegar.setNerkh_taahod(propertyRules.nerkheTaahodHazinePezeshki(tabagheKhatar));
                taahodBimegar.setNerkh_paye(propertyRules.getSinglesDoubleParam("nerkhePayeHazinePezeshki"));
                break;

//            case GHERAMAT_ROOZANE_BASTARI:
//                taahodBimegar.setNerkh_taahod(propertyRules.nerkheTaahodGharameteBastari(tabagheKhatar));
//                taahodBimegar.setNerkh_paye(propertyRules.getSinglesDoubleParam("nerkhePayeGheramateRoozaneBastari"));
//                break;

            case FOT:
                taahodBimegar.setNerkh_taahod(propertyRules.nerkheTaahodFotNaghs(tabagheKhatar));
                taahodBimegar.setNerkh_paye(propertyRules.getSinglesDoubleParam("nerkhePayeFotVaNaghseOzv"));
                break;

            case NAGHSOZV_AZKAROFTADEGI:
                taahodBimegar.setNerkh_taahod(propertyRules.nerkheTaahodFotNaghs(tabagheKhatar));
                taahodBimegar.setNerkh_paye(propertyRules.getSinglesDoubleParam("nerkhePayeFotVaNaghseOzv"));
                break;

        }
    }
}
