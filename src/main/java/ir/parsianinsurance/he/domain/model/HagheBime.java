package ir.parsianinsurance.he.domain.model;

import ir.parsianinsurance.he.domain.model.enums.NahvePardakht;
import ir.parsianinsurance.he.infrastructure.util.StringUtil;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by 8119 on 2/16/2017.
 */
@Embeddable
public class HagheBime {

    private Long jame_khatarate_asli;
    private Long jame_khatarate_ezafi;
    private Short kasr_hezar_rial;

    @Enumerated(EnumType.STRING)
    private NahvePardakht nahvePardakht;

    private Long haghe_bime_ghabelepardakht;
    private Long karmozd;
    private Long haghe_bime_khales;
    private Long haghe_bime_notRounded;
    private Long maliat;
    private String haghe_bime_horoof;

    public Long getJame_khatarate_asli() {
        return jame_khatarate_asli;
    }

    public void setJame_khatarate_asli(Long jame_khatarate_asli) {
        this.jame_khatarate_asli = jame_khatarate_asli;
    }

    public Long getJame_khatarate_ezafi() {
        return jame_khatarate_ezafi;
    }

    public void setJame_khatarate_ezafi(Long jame_khatarate_ezafi) {
        this.jame_khatarate_ezafi = jame_khatarate_ezafi;
    }

    public Long getHaghe_bime_ghabelepardakht() {
        return haghe_bime_ghabelepardakht;
    }

    public Long getHaghe_bime_khales() {
        return haghe_bime_khales;
    }

    public void setHaghe_bime_khales(Long haghe_bime_khales) {
        this.haghe_bime_khales = haghe_bime_khales;
    }

    public void setHaghe_bime_ghabelepardakht(Long haghe_bime_ghabelepardakht) {
        this.haghe_bime_ghabelepardakht = haghe_bime_ghabelepardakht;
        this.haghe_bime_horoof = StringUtil.convertMeghdareAdadiBeHorofi(haghe_bime_ghabelepardakht+"");
    }

    public Long getHaghe_bime_notRounded() {
        return haghe_bime_notRounded;
    }

    public void setHaghe_bime_notRounded(Long haghe_bime_notRounded) {
        this.haghe_bime_notRounded = haghe_bime_notRounded;
    }

    public Short getKasr_hezar_rial() {
        return kasr_hezar_rial;
    }

    public void setKasr_hezar_rial(Short kasr_hezar_rial) {
        this.kasr_hezar_rial = kasr_hezar_rial;
    }

    public Long getKarmozd() {
        return karmozd;
    }

    public void setKarmozd(Long karmozd) {
        this.karmozd = karmozd;
    }

    public Long getMaliat() {
        return maliat;
    }

    public void setMaliat(Long maliat) {
        this.maliat = maliat;
    }

    public NahvePardakht getNahvePardakht() {
        return nahvePardakht;
    }

    public void setNahvePardakht(NahvePardakht nahvePardakht) {
        this.nahvePardakht = nahvePardakht;
    }

    //     TODO: takhfif karmandi va gorohi hamzaman nbashad
    public void mohasebehaghbime(EzafeKasr ezafeKasr, Double maliat, double darsadeHagheBimeSalane)
    {
            setJame_khatarate_asli((long) ((1+
                                            (ezafeKasr.getEzafe_nerkh_pezeshki()/100)-
                                            (ezafeKasr.getTakhfife_goroohi()/100)-
                                             ezafeKasr.getTakhfife_modiriati()/100)* getJame_khatarate_asli()));

            setJame_khatarate_ezafi((long) ((1+
                                            (ezafeKasr.getEzafe_nerkh_pezeshki()/100)-
                                            (ezafeKasr.getTakhfife_goroohi()/100)-
                                            (ezafeKasr.getTakhfife_modiriati()/100))* getJame_khatarate_ezafi()));

            setHaghe_bime_khales(getJame_khatarate_asli() + getJame_khatarate_ezafi());

            long hagheBimeBedooneEmaaleDarsad = (long) ((( getHaghe_bime_khales() *(1 + maliat))/ 100.00 ) * 100);

            long hagheBimePasAzEmaaleDarsad = (long) (hagheBimeBedooneEmaaleDarsad * darsadeHagheBimeSalane);

            setHaghe_bime_notRounded(hagheBimePasAzEmaaleDarsad);
            setMaliat(getHaghe_bime_notRounded() - getHaghe_bime_khales());

            long[] round1000 = round1000(getHaghe_bime_notRounded());
            setKasr_hezar_rial((short) round1000[1]);
            setHaghe_bime_ghabelepardakht(round1000[0]);
            setKarmozd((long)(getHaghe_bime_ghabelepardakht() * 0.28));

    }

    public String getHaghe_bime_horoof() {
        return haghe_bime_horoof;
    }

    public void setHaghe_bime_horoof(String haghe_bime_horoof) {
        this.haghe_bime_horoof = haghe_bime_horoof;
    }

    public List<ElhaghiyeDiff> elhagiyeDiffs(HagheBime otherHagheBime) {
        List<ElhaghiyeDiff> diffs = new ArrayList<>();

        if(this.getHaghe_bime_ghabelepardakht().longValue() != otherHagheBime.getHaghe_bime_ghabelepardakht().longValue())
            diffs.add(new ElhaghiyeDiff("haghebimeghabelpardakht",
                                        new DecimalFormat("#,###").format(this.getHaghe_bime_ghabelepardakht()),
                                        new DecimalFormat("#,###").format(otherHagheBime.getHaghe_bime_ghabelepardakht())));

        if(!this.getNahvePardakht().equals(otherHagheBime.getNahvePardakht()))
            diffs.add(new ElhaghiyeDiff("nahvepardakht",
                                        this.getNahvePardakht().name(),
                                        otherHagheBime.getNahvePardakht().name()));

        if(this.getJame_khatarate_asli().longValue() != otherHagheBime.getJame_khatarate_asli().longValue())
            diffs.add(new ElhaghiyeDiff("jamekhatarateasli",
                                        new DecimalFormat("#,###").format(this.getJame_khatarate_asli()),
                                        new DecimalFormat("#,###").format(otherHagheBime.getJame_khatarate_asli())));

        if(this.getJame_khatarate_ezafi().longValue() != otherHagheBime.getJame_khatarate_ezafi().longValue())
            diffs.add(new ElhaghiyeDiff("jamekhatarateezafi",
                                        new DecimalFormat("#,###").format(this.getJame_khatarate_ezafi()),
                                        new DecimalFormat("#,###").format(otherHagheBime.getJame_khatarate_ezafi())));

        if(this.getKasr_hezar_rial().longValue() != otherHagheBime.getKasr_hezar_rial().longValue())
            diffs.add(new ElhaghiyeDiff("kasrehezarrial",
                        this.getKasr_hezar_rial()+"",
                        otherHagheBime.getKasr_hezar_rial()+""));

        return diffs;
    }

    private long[] round1000(long x) {
        long y = Math.round(x / (float)1000);
        long returnValue = y*1000;
        return new long[]{returnValue, x-returnValue};
    }
}
