package ir.parsianinsurance.he.domain.model;

import javax.persistence.Embeddable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 8119 on 2/16/2017.
 */
@Embeddable
public class EzafeKasr {

    private Double takhfife_goroohi;
    private Double ezafe_nerkh_pezeshki;
    private Double takhfife_modiriati;
    private Boolean isKarmandi;

    public EzafeKasr(Double takhfife_goroohi, Double ezafe_nerkh_pezeshki, Double takhfife_modiriati) {
        this.takhfife_goroohi = takhfife_goroohi;
        this.ezafe_nerkh_pezeshki = ezafe_nerkh_pezeshki;
        this.takhfife_modiriati = takhfife_modiriati;
    }

    public EzafeKasr() {
    }

    public Boolean getKarmandi() {
        return isKarmandi;
    }

    public void setKarmandi(Boolean karmandi) {
        isKarmandi = karmandi;
    }

    public Double getTakhfife_goroohi() {
        return takhfife_goroohi;
    }

    public void setTakhfife_goroohi(Double takhfife_goroohi) {
        this.takhfife_goroohi = takhfife_goroohi;
    }

    public Double getTakhfife_modiriati() {
        return takhfife_modiriati;
    }

    public void setTakhfife_modiriati(Double takhfife_modiriati) {
        this.takhfife_modiriati = takhfife_modiriati;
    }

    public Double getEzafe_nerkh_pezeshki() {
        return ezafe_nerkh_pezeshki;
    }

    public void setEzafe_nerkh_pezeshki(Double ezafe_nerkh_pezeshki) {
        this.ezafe_nerkh_pezeshki = ezafe_nerkh_pezeshki;
    }


    public List<ElhaghiyeDiff> elhagiyeDiffs(EzafeKasr otherEzafeKasr) {

        List<ElhaghiyeDiff> returnList = new ArrayList<>();

        if (this.getEzafe_nerkh_pezeshki().doubleValue() != otherEzafeKasr.getEzafe_nerkh_pezeshki().doubleValue()) {

            returnList.add(new ElhaghiyeDiff(
                    "ezafe_nerkh_pezeshki",
                    this.getEzafe_nerkh_pezeshki().doubleValue()+"",
                    otherEzafeKasr.getEzafe_nerkh_pezeshki().doubleValue()+""));
        }
        if (this.getTakhfife_goroohi().doubleValue() != otherEzafeKasr.getTakhfife_goroohi().doubleValue()) {

            returnList.add(new ElhaghiyeDiff(
                    "takhfife_goroohi",
                    this.getTakhfife_goroohi().doubleValue()+"",
                    otherEzafeKasr.getTakhfife_goroohi().doubleValue()+""));
        }

        if (this.getTakhfife_modiriati().doubleValue() != otherEzafeKasr.getTakhfife_modiriati().doubleValue()) {

            returnList.add(new ElhaghiyeDiff(
                    "takhfife_modiriati",
                    this.getTakhfife_modiriati().doubleValue()+"",
                    otherEzafeKasr.getTakhfife_modiriati().doubleValue()+""));
        }

        return returnList;
    }

}
