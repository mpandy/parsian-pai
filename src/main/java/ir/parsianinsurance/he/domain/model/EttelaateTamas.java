package ir.parsianinsurance.he.domain.model;

import javax.persistence.Embeddable;

/**
 * Created by 8119 on 2/15/2017.
 */

@Embeddable
public class EttelaateTamas {
    private String address;
    private String telefon;
    private String mobile;
    private String code_posti;
    private String poste_electronic;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCode_posti() {
        return code_posti;
    }

    public void setCode_posti(String code_posti) {
        this.code_posti = code_posti;
    }

    public String getPoste_electronic() {
        return poste_electronic;
    }

    public void setPoste_electronic(String poste_electronic) {
        this.poste_electronic = poste_electronic;
    }

}
