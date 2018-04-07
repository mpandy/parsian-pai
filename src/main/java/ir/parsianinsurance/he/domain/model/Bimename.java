package ir.parsianinsurance.he.domain.model;


import ir.parsianinsurance.he.domain.model.enums.VaziateBimename;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by 8119 on 2/15/2017.
 */

@Entity
@Table(name = "DMN_BIMENAME")
public class Bimename implements Artifact, ArtifactDocAttachable {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(mappedBy = "bimename", cascade = CascadeType.PERSIST)
    private Set<Elhaghiye> elhaghiyes;

    @OneToMany(mappedBy = "bimename", cascade = CascadeType.PERSIST)
    private Set<Khesarat> khesarats;

    @OneToOne(cascade = {CascadeType.PERSIST})
    private Pishnahad pishnahadeFaal;

    @Column(unique = true)
    private String shomare;

    @OneToOne
    private Vahed vahedeSodoor;

    private String tarikhesodoor;

    @Enumerated(EnumType.STRING)
    private VaziateBimename vaziateBimename;

    private String bimegare_ghabli;
    private Long createdDate;

    public Long getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Long createdDate) {
        this.createdDate = createdDate;
    }

    public String getBimegare_ghabli() {
        return bimegare_ghabli;
    }

    public void setBimegare_ghabli(String bimegare_ghabli) {
        this.bimegare_ghabli = bimegare_ghabli;
    }

    public String getTarikhesodoor() {
        return tarikhesodoor;
    }

    private void setTarikhesodoor(String tarikhesodoor) {
        this.tarikhesodoor = tarikhesodoor;
    }

    public String getShomare() {
        return shomare;
    }

    public void setShomare(String shomare) {
        this.shomare = shomare;
    }

    public Set<Elhaghiye> getElhaghiyes() {
        return elhaghiyes;
    }

    public void setElhaghiyes(Set<Elhaghiye> elhaghiyes) {
        this.elhaghiyes = elhaghiyes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public VaziateBimename getVaziateBimename() {
        return vaziateBimename;
    }

    public void setVaziateBimename(VaziateBimename vaziateBimename) {
        this.vaziateBimename = vaziateBimename;
    }

    public Pishnahad getPishnahadeFaal() {
        return pishnahadeFaal;
    }

    public void setPishnahadeFaal(Pishnahad pishnahadeFaal) {
        this.pishnahadeFaal = pishnahadeFaal;
    }

    public Bimename pishnahad(Pishnahad pishnahad){
        setPishnahadeFaal(pishnahad);
        return this;
    }

    public Bimename tarikhsodoor(String tarikhsodoor){
        setTarikhesodoor(tarikhsodoor);
        return this;
    }

    public Bimename vaziat(VaziateBimename vaziateBimename){
        setVaziateBimename(vaziateBimename);
        return this;
    }

    public Bimename shomare(String shomare){
        setShomare(shomare);
        return this;
    }

    public Bimename vahedeSodoor(Vahed vahedeSodoor){
        this.setVahedeSodoor(vahedeSodoor);
        return this;
    }

    public Set<Khesarat> getKhesarats() {
        return khesarats;
    }

    public void setKhesarats(Set<Khesarat> khesarats) {
        this.khesarats = khesarats;
    }

    public Vahed getVahedeSodoor() {
        return vahedeSodoor;
    }

    public void setVahedeSodoor(Vahed vahedeSodoor) {
        this.vahedeSodoor = vahedeSodoor;
    }

}
