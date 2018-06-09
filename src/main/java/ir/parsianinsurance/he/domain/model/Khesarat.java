package ir.parsianinsurance.he.domain.model;

import ir.parsianinsurance.he.domain.model.enums.NahveElameKhesarat;
import ir.parsianinsurance.he.domain.model.enums.VaziateParvandeKhesarat;
import ir.parsianinsurance.he.infrastructure.security.User;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by 8119 on 6/20/2017.
 */

@Entity
@Table(name = "DMN_KHESARAT")
public class Khesarat {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name="bimename_id")
    private Bimename bimename;

    @OneToOne
    private Vahed vahed;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "khesarat")
    private Set<KhesaratCase> khesaratCases;

    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinColumn(name="khesarat_id")
    private Set<HavaleKhesarat> havaleKhesarats;

    @Column(unique = true)
    private String shomare_parvande;
    private String tarikhe_hadese;
    private String tarikhe_tashkil_parvande;
    private String tarikh_naame;
    private String tarikh_elam_khesarat;
    private String tarikh_elam_be_mali;

    @OneToOne
    private User masool_parvande;

    @Column(unique = true)
    private String shomare_naame;

    private String shahr_mahale_hadese;
    private Long createdDate;

    @Enumerated(EnumType.STRING)
    private NahveElameKhesarat nahve_elam_khesarat;

    @Enumerated(EnumType.STRING)
    private VaziateParvandeKhesarat vaziateparvande;

    public Long getId() {
        return id;
    }

    public String getShomare_parvande() {
        return shomare_parvande;
    }

    public void setShomare_parvande(String shomare_parvande) {
        this.shomare_parvande = shomare_parvande;
    }

    public String getTarikhe_hadese() {
        return tarikhe_hadese;
    }

    public void setTarikhe_hadese(String tarikhe_hadese) {
        this.tarikhe_hadese = tarikhe_hadese;
    }

    public String getShahr_mahale_hadese() {
        return shahr_mahale_hadese;
    }

    public void setShahr_mahale_hadese(String shahr_mahale_hadese) {
        this.shahr_mahale_hadese = shahr_mahale_hadese;
    }

    public String getTarikhe_tashkil_parvande() {
        return tarikhe_tashkil_parvande;
    }

    public void setTarikhe_tashkil_parvande(String tarikhe_tashkil_parvande) {
        this.tarikhe_tashkil_parvande = tarikhe_tashkil_parvande;
    }

    public Bimename getBimename() {
        return bimename;
    }

    public void setBimename(Bimename bimename) {
        this.bimename = bimename;
    }

    public String getTarikh_elam_khesarat() {
        return tarikh_elam_khesarat;
    }

    public void setTarikh_elam_khesarat(String tarikh_elam_khesarat) {
        this.tarikh_elam_khesarat = tarikh_elam_khesarat;
    }

    public NahveElameKhesarat getNahve_elam_khesarat() {
        return nahve_elam_khesarat;
    }

    public void setNahve_elam_khesarat(NahveElameKhesarat nahve_elam_khesarat) {
        this.nahve_elam_khesarat = nahve_elam_khesarat;
    }

    public User getMasool_parvande() {
        return masool_parvande;
    }

    public void setMasool_parvande(User masool_parvande) {
        this.masool_parvande = masool_parvande;
    }

    public String getShomare_naame() {
        return shomare_naame;
    }

    public void setShomare_naame(String shomare_naame) {
        this.shomare_naame = shomare_naame;
    }

    public String getTarikh_naame() {
        return tarikh_naame;
    }

    public void setTarikh_naame(String tarikh_naame) {
        this.tarikh_naame = tarikh_naame;
    }

    public VaziateParvandeKhesarat getVaziateparvande() {
        return vaziateparvande;
    }

    public void setVaziateparvande(VaziateParvandeKhesarat vaziateparvande) {
        this.vaziateparvande = vaziateparvande;
    }

    public Set<KhesaratCase> getKhesaratCases() {
        return khesaratCases;
    }

    public Set<KhesaratCase> undeletedKhesaratCases() {
        return getKhesaratCases().stream().filter(kc -> kc.getDeleted()==null).collect(Collectors.toSet());
    }

    public void setKhesaratCases(Set<KhesaratCase> khesaratCases) {
        this.khesaratCases = khesaratCases;
    }

    public Long getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Long createdDate) {
        this.createdDate = createdDate;
    }

    public Set<HavaleKhesarat> getHavaleKhesarats() {
        return havaleKhesarats;
    }

    public Set<HavaleKhesarat> undeletedHavaleKhesarats() {
        return getHavaleKhesarats().stream().filter(hk -> hk.getDeleted()==null).collect(Collectors.toSet());
    }

    public void setHavaleKhesarats(Set<HavaleKhesarat> havaleKhesarats) {
        this.havaleKhesarats = havaleKhesarats;
    }

    public Vahed getVahed() {
        return vahed;
    }

    public void setVahed(Vahed vahed) {
        this.vahed = vahed;
    }

    public String getTarikh_elam_be_mali() {
        return tarikh_elam_be_mali;
    }

    public void setTarikh_elam_be_mali(String tarikh_elam_be_mali) {
        this.tarikh_elam_be_mali = tarikh_elam_be_mali;
    }

    public Khesarat vahed(Vahed vahed){
        setVahed(vahed);
        return this;
    }

    public Khesarat masool_parvande(User user){
        setMasool_parvande(user);
        return this;
    }

}
