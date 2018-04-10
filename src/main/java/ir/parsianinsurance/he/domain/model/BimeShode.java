package ir.parsianinsurance.he.domain.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 8119 on 2/16/2017.
 */

@Entity
@Table(name = "DMN_BIMESHODE")
public class BimeShode {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    private Shoghl shoghl;

    @OneToOne(cascade = {CascadeType.PERSIST})
    private ShakhseHaghighi shakhseHaghighi;

    private boolean deprecatedByElhaghiye;

    public ShakhseHaghighi getShakhseHaghighi() {
        return shakhseHaghighi;
    }

    public void setShakhseHaghighi(ShakhseHaghighi shakhseHaghighi) {
        this.shakhseHaghighi = shakhseHaghighi;
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

    public Shoghl getShoghl() {
        return shoghl;
    }

    public void setShoghl(Shoghl shoghl) {
        this.shoghl = shoghl;
    }

    public BimeShode shoghl(Shoghl shoghl){
        setShoghl(shoghl);
        return this;
    }

    public BimeShode() {
    }

    public BimeShode(Shoghl shoghl) {
        this.shoghl = shoghl;
    }

    @Override
    public String toString() {
        if (getShakhseHaghighi() != null)
            return  getShakhseHaghighi().getName()+ " " +
                    getShakhseHaghighi().getName_khanevadegi() +
                    getShakhseHaghighi().getKode_meli();
        else
            return "";
    }

    @Override
    public boolean equals(Object other) {
        return (other != null && getClass() == other.getClass() && id != null)
                ? id.equals(((BimeShode) other).id)
                : (other == this);
    }

    @Override
    public int hashCode() {
        return (id != null)
                ? (getClass().hashCode() + id.hashCode())
                : super.hashCode();
    }

    public List<ElhaghiyeDiff> elhagiyeDiffs(BimeShode otherBimeshode) {

        List<ElhaghiyeDiff> returnList = new ArrayList<>();
        returnList.addAll(shakhseHaghighi.elhagiyeDiffs("bimeshode", otherBimeshode.getShakhseHaghighi()));

        if(this.getShoghl().getId().longValue() != otherBimeshode.getShoghl().getId().longValue())
            returnList.add( new ElhaghiyeDiff("shoghlbimeshode",
                    this.getShoghl().toString(),
                    otherBimeshode.getShoghl().toString()));

        return returnList;
    }

    private Long createdDate;

    public Long getCreatedDate() {
        return createdDate;
    }
    public void setCreatedDate(Long createdDate) {
        this.createdDate = createdDate;
    }

}

