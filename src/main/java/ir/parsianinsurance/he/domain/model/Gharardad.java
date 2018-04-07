package ir.parsianinsurance.he.domain.model;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by 8119 on 2/15/2017.
 */

@Entity
@Table(name = "DMN_GHARARDAD")
public class Gharardad {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @Column(unique = true)
    private String shomare;

    private String goroohs;
    private Boolean deleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShomare() {
        return shomare;
    }

    public void setShomare(String shomare) {
        this.shomare = shomare;
    }

    public String getGoroohs() {
        return goroohs;
    }

    public void setGoroohs(String goroohs) {
        this.goroohs = goroohs;
    }

    @Override
    public boolean equals(Object other) {
        return (other != null && getClass() == other.getClass() && id != null)
                ? id.equals(((Gharardad) other).id)
                : (other == this);
    }

    @Override
    public int hashCode() {
        return (id != null)
                ? (getClass().hashCode() + id.hashCode())
                : super.hashCode();
    }


    public List<ElhaghiyeDiff> elhagiyeDiffs(Gharardad otherGharardad) {
        if(this.getId()!=otherGharardad.getId())
            return Arrays.asList(
                    new ElhaghiyeDiff(
                            this.getClass().getSimpleName().toLowerCase(),
                            this.getName(),
                            otherGharardad.getName()));
        else
            return Collections.emptyList();
    }

}
