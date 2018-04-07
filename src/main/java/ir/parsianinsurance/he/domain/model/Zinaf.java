package ir.parsianinsurance.he.domain.model;

import ir.parsianinsurance.he.domain.model.enums.NesbatBaBimeshode;
import ir.parsianinsurance.he.domain.model.enums.OlaviateKhesarat;
import ir.parsianinsurance.he.infrastructure.util.StringUtil;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 8119 on 2/16/2017.
 */
@Entity
@Table(name = "DMN_ZINAF")
public class Zinaf extends ElhaghiyeableCollection {


    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String name_khanevadegi;
    private String name_pedar;
    private String shomare_shenasname;
    private String kode_meli;

    @Enumerated(EnumType.STRING)
    private NesbatBaBimeshode nesbat_ba_bimeshode;

    @Enumerated(EnumType.STRING)
    private OlaviateKhesarat olaviat_khesarat;

    private Integer zarib_sahm;
    private String tozih;
    private Long createdDate;


    private boolean deprecatedByElhaghiye;


    public OlaviateKhesarat getOlaviat_khesarat() {
        return olaviat_khesarat;
    }

    public void setOlaviat_khesarat(OlaviateKhesarat olaviat_khesarat) {
        this.olaviat_khesarat = olaviat_khesarat;
    }

    public Integer getZarib_sahm() {
        return zarib_sahm;
    }

    public void setZarib_sahm(Integer zarib_sahm) {
        this.zarib_sahm = zarib_sahm;
    }

    public String getTozih() {
        return tozih;
    }

    public void setTozih(String tozih) {
        this.tozih = tozih;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isDeprecatedByElhaghiye() {
        return deprecatedByElhaghiye;
    }

    public void setDeprecatedByElhaghiye(boolean deprecatedByElhaghiye) {
        this.deprecatedByElhaghiye = deprecatedByElhaghiye;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName_khanevadegi() {
        return name_khanevadegi;
    }

    public void setName_khanevadegi(String name_khanevadegi) {
        this.name_khanevadegi = name_khanevadegi;
    }

    public String getName_pedar() {
        return name_pedar;
    }

    public void setName_pedar(String name_pedar) {
        this.name_pedar = name_pedar;
    }

    public String getShomare_shenasname() {
        return shomare_shenasname;
    }

    public void setShomare_shenasname(String shomare_shenasname) {
        this.shomare_shenasname = shomare_shenasname;
    }

    public String getKode_meli() {
        return kode_meli;
    }

    public void setKode_meli(String kode_meli) {
        this.kode_meli = kode_meli;
    }

    public NesbatBaBimeshode getNesbat_ba_bimeshode() {
        return nesbat_ba_bimeshode;
    }

    public void setNesbat_ba_bimeshode(NesbatBaBimeshode nesbat_ba_bimeshode) {
        this.nesbat_ba_bimeshode = nesbat_ba_bimeshode;
    }

    public void setCreatedDate(Long createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public List<ElhaghiyeDiff> elhagiyeDiffs(ElhaghiyeableCollection theOther) {

        Zinaf otherZinaf = theOther == null ? ZinafFactory.newZinaf() : (Zinaf) theOther;
        List<ElhaghiyeDiff> returnList = new ArrayList<>();

        if(!StringUtil.equals(this.getNesbat_ba_bimeshode().name(), otherZinaf.getNesbat_ba_bimeshode().name()))
            returnList.add(new ElhaghiyeDiff(   "nesbatbabimeshode",
                                                this.getNesbat_ba_bimeshode().name(),
                                                otherZinaf.getNesbat_ba_bimeshode().name()));

        if(!StringUtil.equals(this.getOlaviat_khesarat().name(), otherZinaf.getOlaviat_khesarat().name()))
            returnList.add(new ElhaghiyeDiff(   "olaviatekhesarat",
                                                this.getOlaviat_khesarat().name(),
                                                otherZinaf.getOlaviat_khesarat().name()));

        if(this.getZarib_sahm().intValue() != otherZinaf.getZarib_sahm().intValue())
            returnList.add(new ElhaghiyeDiff(   "zaribesahm",
                                                this.getZarib_sahm().toString(),
                                                otherZinaf.getZarib_sahm().toString()));

        if(this.getName() != otherZinaf.getName())
            returnList.add(new ElhaghiyeDiff("namezinaf", this.getName(), otherZinaf.getName()));

        if(this.getName_khanevadegi() != otherZinaf.getName_khanevadegi())
            returnList.add(new ElhaghiyeDiff("namekhanevadegizinaf", this.getName_khanevadegi(), otherZinaf.getName_khanevadegi()));

        if(this.getName_pedar() != otherZinaf.getName_pedar())
            returnList.add(new ElhaghiyeDiff("namepedarzinaf", this.getName_pedar(), otherZinaf.getName_pedar()));

        if(this.getShomare_shenasname() != otherZinaf.getShomare_shenasname())
            returnList.add(new ElhaghiyeDiff("shomareshenasnamezinaf", this.getShomare_shenasname(), otherZinaf.getShomare_shenasname()));


        if(this.getKode_meli() != otherZinaf.getKode_meli())
            returnList.add(new ElhaghiyeDiff("kodemelizinaf", this.getKode_meli(), otherZinaf.getKode_meli()));

        return returnList;
    }

    @Override
    public Long getCreatedDate() {
        return this.createdDate;
    }

    public String shakhsInfo(){
        return (getName()+" "+getName_khanevadegi()).replaceAll("null", "");
    }

}
