package ir.parsianinsurance.he.domain.rule;

import ir.parsianinsurance.he.domain.model.enums.NoeKhatarEzafi;
import ir.parsianinsurance.he.domain.model.enums.TabagheKhatar;

import javax.enterprise.context.ApplicationScoped;
import java.util.HashMap;

/**
 * Created by Mohammad on 6/20/2017.
 */

@ApplicationScoped
public class PropertyRules implements IPropertyRules {

    HashMap<TabagheKhatar, Double> nerkheTaahodFotNaghs;
    HashMap<TabagheKhatar, Double> nerkheTaahodGharameteOmoomi;
    HashMap<TabagheKhatar, Double> nerkheTaahodGharameteBastari;
    HashMap<TabagheKhatar, Double> nerkheTaahodHazinePezeshki;
    HashMap<NoeKhatarEzafi, Double> nerkheKhatareEzafi;
    HashMap<String, Double> takhfifgoroohi;
    HashMap<String, Double> singlesDouble;
    HashMap<String, String> singlesString;

    @Override
    public void setNerkheTaahodFotNaghs(HashMap<TabagheKhatar, Double> nerkheTaahodFotNaghs) {
        this.nerkheTaahodFotNaghs = nerkheTaahodFotNaghs;
    }

    @Override
    public void setNerkheTaahodGharameteOmoomi(HashMap<TabagheKhatar, Double> nerkheTaahodGharameteOmoomi) {
        this.nerkheTaahodGharameteOmoomi = nerkheTaahodGharameteOmoomi;
    }

    @Override
    public void setNerkheTaahodGharameteBastari(HashMap<TabagheKhatar, Double> nerkheTaahodGharameteBastari) {
        this.nerkheTaahodGharameteBastari = nerkheTaahodGharameteBastari;
    }

    @Override
    public void setNerkheTaahodHazinePezeshki(HashMap<TabagheKhatar, Double> nerkheTaahodHazinePezeshki) {
        this.nerkheTaahodHazinePezeshki = nerkheTaahodHazinePezeshki;
    }

    @Override
    public void setNerkheKhatareEzafi(HashMap<NoeKhatarEzafi, Double> nerkheKhatareEzafi) {
        this.nerkheKhatareEzafi = nerkheKhatareEzafi;
    }

    @Override
    public double nerkheTaahodFotNaghs(TabagheKhatar tabagheKhatar){
        return nerkheTaahodFotNaghs.get(tabagheKhatar);
    }

    @Override
    public void setTakhfifgoroohi(HashMap<String, Double> takhfifgoroohi) {
        this.takhfifgoroohi = takhfifgoroohi;
    }

    @Override
    public void setSinglesDouble(HashMap<String, Double> singles) {
        this.singlesDouble = singles;
    }

    @Override
    public void setSinglesString(HashMap<String, String> singles) {
        this.singlesString = singles;
    }

    @Override
    public double nerkheTaahodGharameteBastari(TabagheKhatar tabagheKhatar){
        return nerkheTaahodGharameteBastari.get(tabagheKhatar);
    }

    @Override
    public double nerkheTaahodHazinePezeshki(TabagheKhatar tabagheKhatar){
        return nerkheTaahodHazinePezeshki.get(tabagheKhatar);
    }

    @Override
    public double nerkheKhatareEzafi(NoeKhatarEzafi noeKhatarEzafi){
        return nerkheKhatareEzafi.get(noeKhatarEzafi);
    }

    @Override
    public double takhfifgoroohi(String gorooh) {
        return takhfifgoroohi.get(gorooh);
    }

    @Override
    public HashMap<String, Double> getTakhfifgoroohi() {
        return takhfifgoroohi;
    }

    @Override
    public Double getSinglesDoubleParam(String param){
        return singlesDouble.get(param);
    }

    @Override
    public String getSinglesStringParam(String param) {
        return singlesString.get(param);
    }

}
