package ir.parsianinsurance.he.domain.model;

import ir.parsianinsurance.he.domain.model.enums.VahedType;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by 8119 on 2/15/2017.
 */

@Entity
@Table(name = "DMN_VAHED")
public class Vahed implements Serializable{

    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    private String code;

    @Enumerated(EnumType.STRING)
    private VahedType vahedType;

    private Boolean deleted;

    @OneToOne
    private Vahed sarparast;

    @OneToOne
    private Vahed vahedeSodoor;

    private Long saghfe_sodoor;
    private Long saghfe_khesarat_fot;
    private Long saghfe_khesarat_naghsOzv;
    private Long saghfe_khesarat_hazinePezeshki;
    private Double saghfe_takhfif_modiriati;

    private String name;

    private String address;

    @Embedded
    private VahedSequence vahedSequence;

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public String getName() {
        return name;
    }

    public void setName(String nameVahed) {
        this.name = nameVahed;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String codeNamayandegi) {
        this.code = codeNamayandegi;
    }

    public Double getSaghfe_takhfif_modiriati() {
        return saghfe_takhfif_modiriati;
    }

    public void setSaghfe_takhfif_modiriati(Double saghfe_takhfif_modiriati) {
        this.saghfe_takhfif_modiriati = saghfe_takhfif_modiriati;
    }

    @Override
    public String toString() {
        return getCode()+"-"+ getName();
    }

    @Override
    public boolean equals(Object other) {
        return (other != null && getClass() == other.getClass() && id != null)
                ? id.equals(((Vahed) other).id)
                : (other == this);
    }

    @Override
    public int hashCode() {
        return (id != null)
                ? (getClass().hashCode() + id.hashCode())
                : super.hashCode();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<ElhaghiyeDiff> elhagiyeDiffs(Vahed otherVahed) {
        if(this.getId()!= otherVahed.getId())
            return Arrays.asList(
                    new ElhaghiyeDiff(
                            this.getClass().getSimpleName().toLowerCase(),
                            this.toString(),
                            otherVahed.toString()));
        else
            return Collections.emptyList();

    }

    public VahedType getVahedType() {
        return vahedType;
    }

    public void setVahedType(VahedType vahedType) {
        this.vahedType = vahedType;
    }

    public Vahed getSarparast() {
        return sarparast;
    }

    public void setSarparast(Vahed vahedeSodoor) {
        this.sarparast = vahedeSodoor;
    }

    public Long getSaghfe_sodoor() {
        return saghfe_sodoor;
    }

    public void setSaghfe_sodoor(Long saghfe_sodoor) {
        this.saghfe_sodoor = saghfe_sodoor;
    }

    public VahedSequence getVahedSequence() {
        return vahedSequence;
    }

    public void setVahedSequence(VahedSequence vahedSequence) {
        this.vahedSequence = vahedSequence;
    }

    public Vahed getVahedeSodoor() {
        return vahedeSodoor;
    }

    public void setVahedeSodoor(Vahed vahedeSodoor) {
        this.vahedeSodoor = vahedeSodoor;
    }

    public Long getSaghfe_khesarat_fot() {
        return saghfe_khesarat_fot;
    }

    public void setSaghfe_khesarat_fot(Long saghfe_khesarat_Fot) {
        this.saghfe_khesarat_fot = saghfe_khesarat_Fot;
    }

    public Long getSaghfe_khesarat_naghsOzv() {
        return saghfe_khesarat_naghsOzv;
    }

    public void setSaghfe_khesarat_naghsOzv(Long saghfe_khesarat_NaghsOzv) {
        this.saghfe_khesarat_naghsOzv = saghfe_khesarat_NaghsOzv;
    }

    public Long getSaghfe_khesarat_hazinePezeshki() {
        return saghfe_khesarat_hazinePezeshki;
    }

    public void setSaghfe_khesarat_hazinePezeshki(Long saghfe_khesarat_HazinePezeshki) {
        this.saghfe_khesarat_hazinePezeshki = saghfe_khesarat_HazinePezeshki;
    }

}
