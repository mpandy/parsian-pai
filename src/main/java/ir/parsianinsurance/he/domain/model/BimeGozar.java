package ir.parsianinsurance.he.domain.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by 8119 on 2/15/2017.
 */

@Entity
@Table(name = "DMN_BIMEGOZAR")
public class BimeGozar {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne(cascade = CascadeType.PERSIST)
    private Shakhs shakhs;

    private boolean deprecatedByElhaghiye;

    @OneToMany(mappedBy="bimeGozar",cascade = CascadeType.PERSIST)
    private List<Pishnahad> pishnahads;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Pishnahad> getPishnahads() {
        return pishnahads;
    }

    public void setPishnahads(List<Pishnahad> pishnahads) {
        this.pishnahads = pishnahads;
    }

    public boolean isDeprecatedByElhaghiye() {
        return deprecatedByElhaghiye;
    }

    public void setDeprecatedByElhaghiye(boolean deprecatedByElhaghiye) {
        this.deprecatedByElhaghiye = deprecatedByElhaghiye;
    }

    @Override
    public String toString() {
        if(shakhs != null) {
            if (shakhs instanceof ShakhseHaghighi)
                return  shakhs.getName() + " " +
                        ((ShakhseHaghighi) shakhs).getName_khanevadegi() + " " +
                        ((ShakhseHaghighi) shakhs).getKode_meli();

            if (shakhs instanceof ShakhseHoghooghi)
                return shakhs.getName() + " " + ((ShakhseHoghooghi) shakhs).getCode_eghtesadi();
        }
            else
                return "";
        return "";
    }


    public String codeMelliEghtesadi(){
        if(shakhs != null) {
            if (shakhs instanceof ShakhseHaghighi)
                return ((ShakhseHaghighi) shakhs).getKode_meli();

            if (shakhs instanceof ShakhseHoghooghi)
                return ((ShakhseHoghooghi) shakhs).getCode_eghtesadi();
        }
        else
            return "";
        return "";
    }

    @Override
    public boolean equals(Object other) {
        return (other != null && getClass() == other.getClass() && id != null)
                ? id.equals(((BimeGozar) other).id)
                : (other == this);
    }

    @Override
    public int hashCode() {
        return (id != null)
                ? (getClass().hashCode() + id.hashCode())
                : super.hashCode();
    }

    public Shakhs getShakhs() {
        return shakhs;
    }

    public void setShakhs(Shakhs shakhs) {
        this.shakhs = shakhs;
    }

    public List<ElhaghiyeDiff> elhagiyeDiffs(BimeGozar theOther) {
            return shakhs.elhagiyeDiffs("bimegozar", theOther.getShakhs());
    }

    private Long createdDate;

    public Long getCreatedDate() {
        return createdDate;
    }
    public void setCreatedDate(Long createdDate) {
        this.createdDate = createdDate;
    }

}
