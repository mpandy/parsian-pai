package ir.parsianinsurance.he.domain.model;

import ir.parsianinsurance.he.domain.model.enums.TabagheKhatar;

import javax.persistence.*;

/**
 * Created by 8119 on 2/21/2017.
 */
@Entity
@Table(name = "DMN_SHOGHL")
public class Shoghl {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @Enumerated(EnumType.STRING)
    private TabagheKhatar defaultTabagheKhatar;

    private Boolean deleted;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public TabagheKhatar getDefaultTabagheKhatar() {
        return defaultTabagheKhatar;
    }

    public void setDefaultTabagheKhatar(TabagheKhatar tabagheKhatar) {
        this.defaultTabagheKhatar = tabagheKhatar;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Shoghl(String name, TabagheKhatar defaultTabagheKhatar) {
        this.name = name;
        this.defaultTabagheKhatar = defaultTabagheKhatar;
    }

    public Shoghl() {
    }

    @Override
    public boolean equals(Object other) {
        return (other != null && getClass() == other.getClass() && id != null)
                ? id.equals(((Shoghl) other).id)
                : (other == this);
    }

    @Override
    public int hashCode() {
        return (id != null)
                ? (getClass().hashCode() + id.hashCode())
                : super.hashCode();
    }

    //use for chap and reflection from sabteElhaghiyeTaghir
    @Override
    public String toString() {
        return this.getName();
    }

}
