package ir.parsianinsurance.he.domain.model;

import ir.parsianinsurance.he.domain.model.enums.NoeElhaghiye;
import ir.parsianinsurance.he.domain.model.enums.NoeKhaseElhaghiye;
import ir.parsianinsurance.he.infrastructure.security.User;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by 8119 on 5/15/2017.
 */
@Entity
@Table(name = "DMN_ELHAGHIYE")
public class Elhaghiye implements Artifact, ArtifactDocAttachable {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name="bimename_id")
    private Bimename bimename;

    @OneToOne
    private Vahed vahed;

    private String mozoo_elhaghie;
    private String matn_elhaghie;

    @Column(unique = true)
    private String shomareElhaghiye;
    private String tarikh_sodoor_elhaghie;
    private String tarikh_asar_elhaghie;
    private Long mablagheElhaghiye;

    @Enumerated(EnumType.STRING)
    private NoeElhaghiye noe_elhaghie;

    @Enumerated(EnumType.STRING)
    private VaziateElhaghiye vaziateElhaghiye;

    @Enumerated(EnumType.STRING)
    private NoeKhaseElhaghiye noe_khas_elhaghie;

    @OneToOne(cascade = CascadeType.PERSIST)
    private User emzaKonande_aval;

    @OneToOne(cascade = CascadeType.PERSIST)
    private User emzaKonande_dovom;

    @OneToOne(cascade = CascadeType.PERSIST)
    private Pishnahad pishnahad_old;

    @OneToOne(cascade = CascadeType.PERSIST)
    private Pishnahad pishnahad_new;

    @OneToMany(mappedBy = "elhaghiye", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private Set<ElhaghiyeDiff> diffsList;

    private Long createdDate;

    public Long getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Long createdDate) {
        this.createdDate = createdDate;
    }

    public Long getId() {
        return id;
    }

    public String getMozoo_elhaghie() {
        return mozoo_elhaghie;
    }

    public void setMozoo_elhaghie(String mozoo_elhaghie) {
        this.mozoo_elhaghie = mozoo_elhaghie;
    }

    public String getMatn_elhaghie() {
        return matn_elhaghie;
    }

    public void setMatn_elhaghie(String matn_elhaghie) {
        this.matn_elhaghie = matn_elhaghie;
    }

    public String getShomareElhaghiye() {
        return shomareElhaghiye;
    }

    public void setShomareElhaghiye(String shomareElhaghiye) {
        this.shomareElhaghiye = shomareElhaghiye;
    }

    public String getTarikh_sodoor_elhaghie() {
        return tarikh_sodoor_elhaghie;
    }

    public void setTarikh_sodoor_elhaghie(String tarikh_sodoor_elhaghie) {
        this.tarikh_sodoor_elhaghie = tarikh_sodoor_elhaghie;
    }

    public String getTarikh_asar_elhaghie() {
        return tarikh_asar_elhaghie;
    }

    public void setTarikh_asar_elhaghie(String tarikh_asar_elhaghie) {
        this.tarikh_asar_elhaghie = tarikh_asar_elhaghie;
    }

    public NoeElhaghiye getNoe_elhaghie() {
        return noe_elhaghie;
    }

    public void setNoe_elhaghie(NoeElhaghiye noe_elhaghie) {
        this.noe_elhaghie = noe_elhaghie;
    }

    public NoeKhaseElhaghiye getNoe_khas_elhaghie() {
        return noe_khas_elhaghie;
    }

    public void setNoe_khas_elhaghie(NoeKhaseElhaghiye noe_khas_elhaghie) {
        this.noe_khas_elhaghie = noe_khas_elhaghie;
    }

    public User getEmzaKonande_aval() {
        return emzaKonande_aval;
    }

    public void setEmzaKonande_aval(User emzaKonande_aval) {
        this.emzaKonande_aval = emzaKonande_aval;
    }

    public User getEmzaKonande_dovom() {
        return emzaKonande_dovom;
    }

    public void setEmzaKonande_dovom(User emzaKonande_dovom) {
        this.emzaKonande_dovom = emzaKonande_dovom;
    }

    public Pishnahad getPishnahad_old() {
        return pishnahad_old;
    }

    public void setPishnahad_old(Pishnahad pishnahad_old) {
        this.pishnahad_old = pishnahad_old;
    }

    public Pishnahad getPishnahad_new() {
        return pishnahad_new;
    }

    public void setPishnahad_new(Pishnahad pishnahad_new) {
        this.pishnahad_new = pishnahad_new;
    }

    public Set<ElhaghiyeDiff> getDiffsList() {
        return diffsList;
    }

    public void setDiffsList(Set<ElhaghiyeDiff> diffsList) {
        this.diffsList = diffsList;
    }

    protected Elhaghiye() {
    }

    public Bimename getBimename() {
        return bimename;
    }

    public void setBimename(Bimename bimename) {
        this.bimename = bimename;
    }

    public Elhaghiye bimename(Bimename bimename){
        setBimename(bimename);
        return this;
    }

    public Elhaghiye vahed(Vahed vahed){
        setVahed(vahed);
        return this;
    }

    public Long getMablagheElhaghiye() {
        return mablagheElhaghiye;
    }

    public void setMablagheElhaghiye(Long mablagheElhaghiye) {
        this.mablagheElhaghiye = mablagheElhaghiye;
    }

    public Elhaghiye az(Pishnahad pishnahad){
        setPishnahad_old(pishnahad);
        return this;
    }

    public Elhaghiye be(Pishnahad pishnahad){
        setPishnahad_new(pishnahad);
        return this;
    }

    public Elhaghiye beVaziate(VaziateElhaghiye vaziateElhaghiye){
        this.vaziateElhaghiye = vaziateElhaghiye;
        return this;
    }

    public Vahed getVahed() {
        return vahed;
    }

    public void setVahed(Vahed vahed) {
        this.vahed = vahed;
    }

    public VaziateElhaghiye getVaziateElhaghiye() {
        return vaziateElhaghiye;
    }

    public Set<TaahodBimegar> getTaahodChanges() {
        return null;
    }
}
