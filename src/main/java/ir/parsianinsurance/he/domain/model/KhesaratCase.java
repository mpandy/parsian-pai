package ir.parsianinsurance.he.domain.model;

import ir.parsianinsurance.he.domain.model.enums.ElateHadese;
import ir.parsianinsurance.he.domain.model.enums.NoeHadese;
import ir.parsianinsurance.he.domain.model.enums.NoeKhesarat;
import ir.parsianinsurance.he.domain.model.enums.VaziateKhesaratCase;
import ir.parsianinsurance.he.infrastructure.security.User;

import javax.persistence.*;

/**
 * Created by 8119 on 7/12/2017.
 */
@Entity
@Table(name = "DMN_KHESARATCASE")
public class KhesaratCase implements Comparable, ArtifactDocAttachable {

    @Id
    @GeneratedValue
    private Long id;

    private String shomare;

    @Enumerated(EnumType.STRING)
    private ElateHadese elatehadese;

    @Enumerated(EnumType.STRING)
    private NoeKhesarat noe_khesarat;

    @Enumerated(EnumType.STRING)
    private NoeHadese noehadese;

    @Enumerated(EnumType.STRING)
    private VaziateKhesaratCase vaziat;

    private Boolean deleted;
    private Long mablagh_khesarate_taeedshode;
    private Long mablagh_khesarate_elamshode;
    private Long khesarat_ghabl_pardakht;
    private Long saghfe_poosheshe_bimeshode;
    private Long mablagh_mazad_bar_saghf;
    private Long mablagh_kharej_az_taahoh;
    private Long mablagh_bazyafti;
    private String name_khesarat_dide;
    private String sharhe_elat;

    @Transient
    private String noeHadeseFarsi;

    @Transient
    private String vaziatFarsi;

    @OneToOne
    private User karshenase_khesarat;

    private String sharhe_khesarat;
    private Double darsad_naghse_ozv;
    private Long createdDate;

    @ManyToOne
    @JoinColumn(name = "khesarat_id")
    private Khesarat khesarat;

    public Long getId() {
        return id;
    }

    public String getVaziatFarsi() {
        return vaziatFarsi;
    }

    public String getNoeHadeseFarsi() {
        return noeHadeseFarsi;
    }

    public void setNoeHadeseFarsi(String noeHadeseFarsi) {
        this.noeHadeseFarsi = noeHadeseFarsi;
    }

    public void setVaziatFarsi(String vaziatFarsi) {
        this.vaziatFarsi = vaziatFarsi;
    }

    public ElateHadese getElatehadese() {
        return elatehadese;
    }

    public void setElatehadese(ElateHadese elatehadese) {
        this.elatehadese = elatehadese;
    }

    public NoeKhesarat getNoe_khesarat() {
        return noe_khesarat;
    }

    public void setNoe_khesarat(NoeKhesarat noe_khesarat) {
        this.noe_khesarat = noe_khesarat;
    }

    public NoeHadese getNoehadese() {
        return noehadese;
    }

    public void setNoehadese(NoeHadese noehadese) {
        this.noehadese = noehadese;
    }

    public VaziateKhesaratCase getVaziat() {
        return vaziat;
    }

    public void setVaziat(VaziateKhesaratCase vaziatekhesarat) {
        this.vaziat = vaziatekhesarat;
    }

    public String getName_khesarat_dide() {
        return name_khesarat_dide;
    }

    public void setName_khesarat_dide(String name_khesarat_dide) {
        this.name_khesarat_dide = name_khesarat_dide;
    }

    public String getSharhe_elat() {
        return sharhe_elat;
    }

    public void setSharhe_elat(String sharhe_elat) {
        this.sharhe_elat = sharhe_elat;
    }

    public Double getDarsad_naghse_ozv() {
        return darsad_naghse_ozv;
    }

    public void setDarsad_naghse_ozv(Double darsad_naghse_ozv) {
        this.darsad_naghse_ozv = darsad_naghse_ozv;
    }

    public Long getMablagh_khesarate_taeedshode() {
        return mablagh_khesarate_taeedshode;
    }

    public Khesarat getKhesarat() {
        return khesarat;
    }

    public void setKhesarat(Khesarat khesarat) {
        this.khesarat = khesarat;
    }

    public void setMablagh_khesarate_taeedshode(Long mablagh_khesarate_taeedshode) {
        this.mablagh_khesarate_taeedshode = mablagh_khesarate_taeedshode;
    }

    public Long getMablagh_khesarate_elamshode() {
        return mablagh_khesarate_elamshode;
    }

    public void setMablagh_khesarate_elamshode(Long mablagh_khesarate_elamshode) {
        this.mablagh_khesarate_elamshode = mablagh_khesarate_elamshode;
    }

    public Long getMablagh_mazad_bar_saghf() {
        return mablagh_mazad_bar_saghf;
    }

    public void setMablagh_mazad_bar_saghf(Long mablagh_mazad_bar_saghf) {
        this.mablagh_mazad_bar_saghf = mablagh_mazad_bar_saghf;
    }

    public Long getMablagh_kharej_az_taahoh() {
        return mablagh_kharej_az_taahoh;
    }

    public void setMablagh_kharej_az_taahoh(Long mablagh_kharej_az_taahoh) {
        this.mablagh_kharej_az_taahoh = mablagh_kharej_az_taahoh;
    }

    public Long getMablagh_bazyafti() {
        return mablagh_bazyafti;
    }

    public void setMablagh_bazyafti(Long mablagh_bazyafti) {
        this.mablagh_bazyafti = mablagh_bazyafti;
    }

    public Long getKhesarat_ghabl_pardakht() {
        return khesarat_ghabl_pardakht;
    }

    public void setKhesarat_ghabl_pardakht(Long khesarat_ghabl_pardakht) {
        this.khesarat_ghabl_pardakht = khesarat_ghabl_pardakht;
    }

    public Long getSaghfe_poosheshe_bimeshode() {
        return saghfe_poosheshe_bimeshode;
    }

    public void setSaghfe_poosheshe_bimeshode(Long saghfe_poosheshe_bimeshode) {
        this.saghfe_poosheshe_bimeshode = saghfe_poosheshe_bimeshode;
    }

    public Long getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Long createdDate) {
        this.createdDate = createdDate;
    }

    public User getKarshenase_khesarat() {
        return karshenase_khesarat;
    }

    public void setKarshenase_khesarat(User karshenase_khesarat) {
        this.karshenase_khesarat = karshenase_khesarat;
    }

    public String getSharhe_khesarat() {
        return sharhe_khesarat;
    }

    public void setSharhe_khesarat(String sharhe_khesarat) {
        this.sharhe_khesarat = sharhe_khesarat;
    }

    public String getShomare() {
        return shomare;
    }

    public void setShomare(String shomare) {
        this.shomare = shomare;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public int compareTo(Object o) {
        return getCreatedDate().compareTo(((KhesaratCase)o).getCreatedDate());
    }
}
