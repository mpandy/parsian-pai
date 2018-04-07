package ir.parsianinsurance.he.domain.model;

import ir.parsianinsurance.he.domain.model.enums.NesbatBaBimeshode;
import ir.parsianinsurance.he.domain.model.enums.NoeHavale;
import ir.parsianinsurance.he.infrastructure.util.StringUtil;

import javax.persistence.*;

/**
 * Created by 8119 on 8/22/2017.
 */
@Entity
@Table(name = "DMN_HAVALEKHESARAT")
public class HavaleKhesarat implements Comparable{

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="khesarat_id")
    private Khesarat khesarat;

    @Column(unique = true)
    private String shomareHavale;

    private String tarikhSodoorHavale;
    private String ettelaateShaba;
    private Long mablaghHavale;
    private String mablaghHavaleHoroof;
    private String darVajh;
    private Long createdDate;
    private String noe_daryaft_konande;
    private String name_daryaft_konande;
    private String shomare_shaba_daryaftkonande;
    private String elate_bargashti;
    private String tozihat;
    private String taeedkonandenahaei;
    private NoeHavale noeHavale;
    private NesbatBaBimeshode nesbatBaBimeshode;
    private Boolean deleted;



    public String getShomareHavale() {
        return shomareHavale;
    }

    public void setShomareHavale(String shomareHavale) {
        this.shomareHavale = shomareHavale;
    }

    public String getTarikhSodoorHavale() {
        return tarikhSodoorHavale;
    }

    public void setTarikhSodoorHavale(String tarikhSodoorHavale) {
        this.tarikhSodoorHavale = tarikhSodoorHavale;
    }

    public String getEttelaateShaba() {
        return ettelaateShaba;
    }

    public void setEttelaateShaba(String shomareShaba) {
        this.ettelaateShaba = shomareShaba;
    }

    public Long getMablaghHavale() {
        return mablaghHavale;
    }

    public void setMablaghHavale(Long mablaghHavale) {
        this.mablaghHavale = mablaghHavale;
        if (mablaghHavale != null)
            this.mablaghHavaleHoroof = StringUtil.convertMeghdareAdadiBeHorofi(mablaghHavale+"");
    }

    public String getDarVajh() {
        return darVajh;
    }

    public void setDarVajh(String darVajh) {
        this.darVajh = darVajh;
    }

    public String getMablaghHavaleHoroof() {
        return mablaghHavaleHoroof;
    }

    public void setMablaghHavaleHoroof(String mablaghHavaleHoroof) {
        this.mablaghHavaleHoroof = mablaghHavaleHoroof;
    }

    public Long getId() {
        return id;
    }

    public Khesarat getKhesarat() {
        return khesarat;
    }

    public void setKhesarat(Khesarat khesarat) {
        this.khesarat = khesarat;
    }

    public Long getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Long createdDate) {
        this.createdDate = createdDate;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public String getNoe_daryaft_konande() {
        return noe_daryaft_konande;
    }

    public void setNoe_daryaft_konande(String noe_daryaft_konande) {
        this.noe_daryaft_konande = noe_daryaft_konande;
    }

    public String getName_daryaft_konande() {
        return name_daryaft_konande;
    }

    public void setName_daryaft_konande(String name_daryaft_konande) {
        this.name_daryaft_konande = name_daryaft_konande;
    }

    public String getShomare_shaba_daryaftkonande() {
        return shomare_shaba_daryaftkonande;
    }

    public void setShomare_shaba_daryaftkonande(String shomare_shaba_daryaftkonande) {
        this.shomare_shaba_daryaftkonande = shomare_shaba_daryaftkonande;
    }

    public String getElate_bargashti() {
        return elate_bargashti;
    }

    public void setElate_bargashti(String elate_bargashti) {
        this.elate_bargashti = elate_bargashti;
    }

    public String getTozihat() {
        return tozihat;
    }

    public void setTozihat(String tozihat) {
        this.tozihat = tozihat;
    }

    public String getTaeedkonandenahaei() {
        return taeedkonandenahaei;
    }

    public void setTaeedkonandenahaei(String taeedkonandenahaei) {
        this.taeedkonandenahaei = taeedkonandenahaei;
    }

    public NoeHavale getNoeHavale() {
        return noeHavale;
    }

    public void setNoeHavale(NoeHavale noeHavale) {
        this.noeHavale = noeHavale;
    }

    public NesbatBaBimeshode getNesbatBaBimeshode() {
        return nesbatBaBimeshode;
    }

    public void setNesbatBaBimeshode(NesbatBaBimeshode nesbatBaBimeshode) {
        this.nesbatBaBimeshode = nesbatBaBimeshode;
    }

    @Override
    public int compareTo(Object o) {
        return getCreatedDate().compareTo(((HavaleKhesarat)o).getCreatedDate());
    }
}
