package ir.parsianinsurance.he.domain.model;

import ir.parsianinsurance.he.domain.model.enums.Jensiat;
import ir.parsianinsurance.he.domain.model.enums.Melliat;
import ir.parsianinsurance.he.infrastructure.util.StringUtil;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 8119 on 2/15/2017.
 */

@Entity
@DiscriminatorValue("Haghighi")
public class ShakhseHaghighi extends Shakhs {

    private String name_pedar;

    @Enumerated(EnumType.STRING)
    private Jensiat jensiat;

    @Enumerated(EnumType.STRING)
    private Melliat melliat;
    private String shomare_shenasname;
    private String kode_meli;
    private String tarikhe_tavalod;
    private String mahale_tavalod;
    private String shahre_mahale_sodoor;
    private String name_khanevadegi;

    public ShakhseHaghighi() {
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

    public Jensiat getJensiat() {
        return jensiat;
    }

    public void setJensiat(Jensiat jensiat) {
        this.jensiat = jensiat;
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

    public String getTarikhe_tavalod() {
        return tarikhe_tavalod;
    }

    public void setTarikhe_tavalod(String tarikhe_tavalod) {
        this.tarikhe_tavalod = tarikhe_tavalod;
    }

    public String getMahale_tavalod() {
        return mahale_tavalod;
    }

    public void setMahale_tavalod(String mahale_tavalod) {
        this.mahale_tavalod = mahale_tavalod;
    }

    public String getShahre_mahale_sodoor() {
        return shahre_mahale_sodoor;
    }

    public void setShahre_mahale_sodoor(String shahre_mahale_sodoor) {
        this.shahre_mahale_sodoor = shahre_mahale_sodoor;
    }

    public Melliat getMelliat() {
        return melliat;
    }

    public void setMelliat(Melliat melliat) {
        this.melliat = melliat;
    }

    @Override
    public String toString() {
        String pishvand = (super.getPishvand() == null) ? "" : super.getPishvand();
        String name = (super.getName() == null) ? "" : super.getName();
        String nameKhanevadegi = (getName_khanevadegi() == null) ? "" : getName_khanevadegi();
        String codeMelli = (getKode_meli() == null) ? "" : getKode_meli();

        return pishvand+" "+name+" "+nameKhanevadegi+" "+codeMelli;
    }

    public List<ElhaghiyeDiff> elhagiyeDiffs(String caller, Object theOther) {

        ShakhseHaghighi otherShakhsHaghighi = (ShakhseHaghighi) theOther;
        List<ElhaghiyeDiff> returnList = new ArrayList<>();
        returnList.addAll(super.elhagiyeDiffs(caller, theOther));

        if(!StringUtil.equals(this.getName_khanevadegi(), otherShakhsHaghighi.getName_khanevadegi()))
            returnList.add( new ElhaghiyeDiff("name_khanevadegibimegozar",
                    this.getName_khanevadegi(),
                    otherShakhsHaghighi.getName_khanevadegi()));

        if(!StringUtil.equals(this.getName_pedar(), otherShakhsHaghighi.getName_pedar()))
            returnList.add( new ElhaghiyeDiff("namepedarbimegozar",
                    this.getName_pedar(),
                    otherShakhsHaghighi.getName_pedar()));

        if(!StringUtil.equals(this.getShomare_shenasname(), otherShakhsHaghighi.getShomare_shenasname()))
            returnList.add( new ElhaghiyeDiff("shomareshenasnamebimegozar",
                    this.getShomare_shenasname(),
                    otherShakhsHaghighi.getShomare_shenasname()));

        if(!StringUtil.equals(this.getShahre_mahale_sodoor(), otherShakhsHaghighi.getShahre_mahale_sodoor()))
            returnList.add( new ElhaghiyeDiff("mahalesodooreshenasnamebimegozar",
                    this.getShahre_mahale_sodoor(),
                    otherShakhsHaghighi.getShahre_mahale_sodoor()));

        if(!StringUtil.equals(this.getMahale_tavalod(), otherShakhsHaghighi.getMahale_tavalod()))
            returnList.add( new ElhaghiyeDiff("shahremahaletavalodbimegozar",
                    this.getMahale_tavalod(),
                    otherShakhsHaghighi.getMahale_tavalod()));

        if(!StringUtil.equals(this.getTarikhe_tavalod(), otherShakhsHaghighi.getTarikhe_tavalod()))
            returnList.add( new ElhaghiyeDiff("tarikhetavalodbimegozar",
                    this.getTarikhe_tavalod(),
                    otherShakhsHaghighi.getTarikhe_tavalod()));

        if(!StringUtil.equals(this.getKode_meli(), otherShakhsHaghighi.getKode_meli()))
            returnList.add( new ElhaghiyeDiff("codemelibimegozar",
                    this.getKode_meli(),
                    otherShakhsHaghighi.getKode_meli()));

        if(!StringUtil.equals(this.getJensiat().name(), otherShakhsHaghighi.getJensiat().name()))
            returnList.add( new ElhaghiyeDiff("jensiatbimegozar",
                    this.getJensiat().name(),
                    otherShakhsHaghighi.getJensiat().name()));

        if(!StringUtil.equals(this.getMelliat().name(), otherShakhsHaghighi.getMelliat().name()))
            returnList.add( new ElhaghiyeDiff("melliatebimegozar",
                    this.getMelliat().name(),
                    otherShakhsHaghighi.getMelliat().name()));

        return returnList;
    }

    @Override
    public String getShenase() {
        return getKode_meli();
    }
}
