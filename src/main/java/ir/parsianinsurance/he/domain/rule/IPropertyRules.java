package ir.parsianinsurance.he.domain.rule;

import ir.parsianinsurance.he.domain.model.enums.NoeKhatarEzafi;
import ir.parsianinsurance.he.domain.model.enums.TabagheKhatar;

import java.util.HashMap;

/**
 * Created by 8119 on 11/9/2017.
 */
public interface IPropertyRules {
    void setNerkheTaahodFotNaghs(HashMap<TabagheKhatar, Double> nerkheTaahodFotNaghs);

    void setNerkheTaahodGharameteOmoomi(HashMap<TabagheKhatar, Double> nerkheTaahodGharameteOmoomi);

    void setNerkheTaahodGharameteBastari(HashMap<TabagheKhatar, Double> nerkheTaahodGharameteBastari);

    void setNerkheTaahodHazinePezeshki(HashMap<TabagheKhatar, Double> nerkheTaahodHazinePezeshki);

    void setNerkheKhatareEzafi(HashMap<NoeKhatarEzafi, Double> nerkheKhatareEzafi);

    double nerkheTaahodFotNaghs(TabagheKhatar tabagheKhatar);

    void setTakhfifgoroohi(HashMap<String, Double> takhfifgoroohi);

    void setSinglesDouble(HashMap<String, Double> singles);

    void setSinglesString(HashMap<String, String> singles);

    double nerkheTaahodGharameteBastari(TabagheKhatar tabagheKhatar);

    double nerkheTaahodHazinePezeshki(TabagheKhatar tabagheKhatar);

    double nerkheKhatareEzafi(NoeKhatarEzafi noeKhatarEzafi);

    double takhfifgoroohi(String gorooh);

    HashMap<String, Double> getTakhfifgoroohi();

    Double getSinglesDoubleParam(String param);

    String getSinglesStringParam(String param);
}
