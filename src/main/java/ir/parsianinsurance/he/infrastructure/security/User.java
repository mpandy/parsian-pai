package ir.parsianinsurance.he.infrastructure.security;

import ir.parsianinsurance.he.domain.model.ElhaghiyeDiff;
import ir.parsianinsurance.he.domain.model.Vahed;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Mohammad on 8/2/2017.
 */

@Entity
@Table(name = "INFRA_USER")
public class User implements Serializable{

    @Id
    @GeneratedValue
    private Long id;

    @Enumerated(EnumType.STRING)
    private VaziateFaaliat vaziateFaaliat;

    private Boolean deleted;

    private String realName;

    private String password;

    @Column(unique = true)
    private String username;

    private String roles;

    private String mobile;

    @OneToOne(cascade = CascadeType.PERSIST)
    private Vahed vahed;

    private String codeBazaryab;

    public String getCodeBazaryab() {
        return codeBazaryab;
    }

    public void setCodeBazaryab(String codeBazaryab) {
        this.codeBazaryab = codeBazaryab;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public VaziateFaaliat getVaziateFaaliat() {
        return vaziateFaaliat;
    }

    public void setVaziateFaaliat(VaziateFaaliat vaziateFaaliat) {
        this.vaziateFaaliat = vaziateFaaliat;
    }

    public Vahed getVahed() {
        return vahed;
    }

    public void setVahed(Vahed vahedeSodoor) {
        this.vahed = vahedeSodoor;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return getRealName() == null ? "" : getRealName();
    }

    public String toStringBazaryab() {
        String codeBazaryabSection = getCodeBazaryab() == null ? "" : ("-"+getCodeBazaryab());
        String realName = getRealName() == null ? "" : getRealName();
        return realName + codeBazaryabSection;
    }

    public List<ElhaghiyeDiff> elhagiyeDiffs(User otherBazaryab) {
        if(this.getId()!=otherBazaryab.getId())
            return Arrays.asList(
                    new ElhaghiyeDiff(
                            this.getClass().getSimpleName().toLowerCase(),
                            this.toString(),
                            otherBazaryab.toString()));
        else
            return Collections.emptyList();
    }

}
