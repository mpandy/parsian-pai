package ir.parsianinsurance.he.interfaces.webservice.model;

import ir.parsianinsurance.he.infrastructure.util.DateUtil;

import javax.persistence.Embeddable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Mohammad on 8/13/2017.
 */

@XmlRootElement
@Embeddable
public class AgencyBimenameInfo {

    private String name;
    private String namekhanavadegi;
    private String codemelli;
    private String tarikhtavalod;
    private String shomareshenasname;
    private String namepedar;
    private String mobile;
    private String shahr;
    private String azTarikh;
    private String taTarikh;


    public AgencyBimenameInfo(String name, String namekhanavadegi, String codemelli, String tarikhtavalod, String shomareshenasname, String namepedar, String mobile, String shahr, String azTarikh, String taTarikh) {
        this.name = name;
        this.namekhanavadegi = namekhanavadegi;
        this.codemelli = codemelli;
        this.tarikhtavalod = tarikhtavalod;
        this.shomareshenasname = shomareshenasname;
        this.namepedar = namepedar;
        this.mobile = mobile;
        this.shahr = shahr;
        this.azTarikh = azTarikh;
        this.taTarikh = taTarikh;
    }

    public AgencyBimenameInfo() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamekhanavadegi() {
        return namekhanavadegi;
    }

    public void setNamekhanavadegi(String namekhanavadegi) {
        this.namekhanavadegi = namekhanavadegi;
    }

    public String getCodemelli() {
        return codemelli;
    }

    public void setCodemelli(String codemelli) {
        this.codemelli = codemelli;
    }

    public String getTarikhtavalod() {
        return tarikhtavalod;
    }

    public void setTarikhtavalod(String tarikhtavalod) {
        this.tarikhtavalod = tarikhtavalod;
    }

    public String getShomareshenasname() {
        return shomareshenasname;
    }

    public void setShomareshenasname(String shomareshenasname) {
        this.shomareshenasname = shomareshenasname;
    }

    public String getNamepedar() {
        return namepedar;
    }

    public void setNamepedar(String namepedar) {
        this.namepedar = namepedar;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getShahr() {
        return shahr;
    }

    public void setShahr(String shahr) {
        this.shahr = shahr;
    }

    public String getAzTarikh() {
        return azTarikh;
    }

    public void setAzTarikh(String azTarikh) {
        this.azTarikh = azTarikh;
    }

    public String getTaTarikh() {
        return taTarikh;
    }

    public void setTaTarikh(String taTarikh) {
        this.taTarikh = taTarikh;
    }

    public int modat(){
        return DateUtil.getTimeDifferenceByDayCount(getAzTarikh(), getTaTarikh());
    }



}
