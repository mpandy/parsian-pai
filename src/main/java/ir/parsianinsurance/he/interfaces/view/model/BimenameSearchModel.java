package ir.parsianinsurance.he.interfaces.view.model;

import ir.parsianinsurance.he.domain.model.Vahed;
import ir.parsianinsurance.he.domain.model.enums.TabagheKhatar;
import ir.parsianinsurance.he.domain.model.enums.VaziateBimename;
import ir.parsianinsurance.he.infrastructure.security.User;

/**
 * Created by 8119 on 9/19/2017.
 */
public class BimenameSearchModel {

    private String shomareBimename;
    private String shomarePishnahad;
    private String bimegozarName;
    private String bimeshodeName;
    private Vahed namayandegi;
    private Vahed vahedeSodoor;
    private String codemeliBimeshode;
    private String codemeliBimegozar;
    private String shoghl;
    private TabagheKhatar tabagheKhatar;
    private String gharardadName;
    private String goroohName;
    private User bazaryab;
    private VaziateBimename vaziateBimename;
    private String nameSherkat;
    private String aztarikheSodoor;
    private String tatarikheSodoor;

    public String getShomareBimename() {
        return shomareBimename;
    }

    public void setShomareBimename(String shomareBimename) {
        this.shomareBimename = shomareBimename;
    }

    public String getShomarePishnahad() {
        return shomarePishnahad;
    }

    public void setShomarePishnahad(String shomarePishnahad) {
        this.shomarePishnahad = shomarePishnahad;
    }

    public String getCodemeliBimeshode() {
        return codemeliBimeshode;
    }

    public void setCodemeliBimeshode(String codemeliBimeshode) {
        this.codemeliBimeshode = codemeliBimeshode;
    }

    public String getCodemeliBimegozar() {
        return codemeliBimegozar;
    }

    public void setCodemeliBimegozar(String codemeliBimegozar) {
        this.codemeliBimegozar = codemeliBimegozar;
    }

    public VaziateBimename getVaziateBimename() {
        return vaziateBimename;
    }

    public void setVaziateBimename(VaziateBimename vaziateBimename) {
        this.vaziateBimename = vaziateBimename;
    }

    public String getNameSherkat() {
        return nameSherkat;
    }

    public void setNameSherkat(String nameSherkat) {
        this.nameSherkat = nameSherkat;
    }

    public String getAztarikheSodoor() {
        return aztarikheSodoor;
    }

    public void setAztarikheSodoor(String aztarikheSodoor) {
        this.aztarikheSodoor = aztarikheSodoor;
    }

    public String getBimegozarName() {
        return bimegozarName;
    }

    public void setBimegozarName(String bimegozarName) {
        this.bimegozarName = bimegozarName;
    }

    public String getBimeshodeName() {
        return bimeshodeName;
    }

    public void setBimeshodeName(String bimeshodeName) {
        this.bimeshodeName = bimeshodeName;
    }

    public Vahed getNamayandegi() {
        return namayandegi;
    }

    public void setNamayandegi(Vahed namayandegi) {
        this.namayandegi = namayandegi;
    }

    public Vahed getVahedeSodoor() {
        return vahedeSodoor;
    }

    public void setVahedeSodoor(Vahed vahedeSodoor) {
        this.vahedeSodoor = vahedeSodoor;
    }

    public String getGharardadName() {
        return gharardadName;
    }

    public void setGharardadName(String gharardadName) {
        this.gharardadName = gharardadName;
    }

    public String getGoroohName() {
        return goroohName;
    }

    public void setGoroohName(String goroohName) {
        this.goroohName = goroohName;
    }

    public User getBazaryab() {
        return bazaryab;
    }

    public void setBazaryab(User bazaryab) {
        this.bazaryab = bazaryab;
    }

    public String getShoghl() {
        return shoghl;
    }

    public void setShoghl(String shoghl) {
        this.shoghl = shoghl;
    }

    public TabagheKhatar getTabagheKhatar() {
        return tabagheKhatar;
    }

    public void setTabagheKhatar(TabagheKhatar tabagheKhatar) {
        this.tabagheKhatar = tabagheKhatar;
    }

    public String getTatarikheSodoor() {
        return tatarikheSodoor;
    }

    public void setTatarikheSodoor(String tatarikheSodoor) {
        this.tatarikheSodoor = tatarikheSodoor;
    }
}

