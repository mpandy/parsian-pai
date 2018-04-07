package ir.parsianinsurance.he.domain.model;

import ir.parsianinsurance.he.domain.model.enums.NoeTaahod;
import ir.parsianinsurance.he.infrastructure.util.StringUtil;

import javax.persistence.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 8119 on 2/16/2017.
 */
@Entity
@Table(name = "DMN_TAAHODBIMEGAR")
public class TaahodBimegar extends ElhaghiyeableCollection {

    @Id
    @GeneratedValue
    private Long id;

    @Enumerated(EnumType.STRING)
    private NoeTaahod noetaahod;

    private Long sarmaye_taahod;
    private Double nerkh_taahod;
    private Double nerkh_paye;
    private Double nerkh_khatareEzafi;
    private Long hagh_bime_taahod;
    private Long hagh_bime_khataratezafi;
    private Long hagh_bime_zelzelevamotor;
    private Long createdDate;

    public NoeTaahod getNoetaahod() {
        return noetaahod;
    }

    public void setNoetaahod(NoeTaahod noetaahod) {
        this.noetaahod = noetaahod;
    }

    public Long getSarmaye_taahod() {
        return sarmaye_taahod;
    }

    public void setSarmaye_taahod(Long sarmaye_taahod) {
        this.sarmaye_taahod = sarmaye_taahod;
    }

    public Double getNerkh_taahod() {
        return nerkh_taahod;
    }

    public void setNerkh_taahod(Double nerkh_taahod) {
        this.nerkh_taahod = nerkh_taahod;
    }

    public Double getNerkh_paye() {
        return nerkh_paye;
    }

    public void setNerkh_paye(Double nerkh_paye) {
        this.nerkh_paye = nerkh_paye;
    }

    public Long getHagh_bime_taahod() {
        return hagh_bime_taahod;
    }

    public void setHagh_bime_taahod(Long hagh_bime_taahod) {
        this.hagh_bime_taahod = hagh_bime_taahod;
    }

    public Long getHagh_bime_khataratezafi() {
        return hagh_bime_khataratezafi;
    }

    public void setHagh_bime_khataratezafi(Long hagh_bime_khataratezafi) {
        this.hagh_bime_khataratezafi = hagh_bime_khataratezafi;
    }

    public Long getHagh_bime_zelzelevamotor() {
        return hagh_bime_zelzelevamotor;
    }

    public void setHagh_bime_zelzelevamotor(Long hagh_bime_zelzelevamotor) {
        this.hagh_bime_zelzelevamotor = hagh_bime_zelzelevamotor;
    }

    public void setCreatedDate(Long createdDate) {
        this.createdDate = createdDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getNerkh_khatareEzafi() {
        return nerkh_khatareEzafi;
    }

    public void setNerkh_khatareEzafi(Double nerkh_khatareEzafi) {
        this.nerkh_khatareEzafi = nerkh_khatareEzafi;
    }

    @Override
    public List<ElhaghiyeDiff> elhagiyeDiffs(ElhaghiyeableCollection theOther) {

        TaahodBimegar otherTaahodBimegar = theOther == null ? TaahodFactory.newTaahodeBimegar() : (TaahodBimegar) theOther;
        List<ElhaghiyeDiff> returnList = new ArrayList<>();

        if(!StringUtil.equals(this.getNoetaahod().name(), otherTaahodBimegar.getNoetaahod().name()))
            returnList.add(new ElhaghiyeDiff("noetaahod",
                                            this.getNoetaahod().name(),
                                            otherTaahodBimegar.getNoetaahod().name()));

        if(!StringUtil.equals(this.getSarmaye_taahod()+"", otherTaahodBimegar.getSarmaye_taahod()+""))
            returnList.add(new ElhaghiyeDiff("sarmayetaahod",
                                            new DecimalFormat("#,###").format(this.getSarmaye_taahod()),
                                            new DecimalFormat("#,###").format(otherTaahodBimegar.getSarmaye_taahod())));

        return returnList;
    }

    @Override
    public Long getCreatedDate() {
        return this.createdDate;
    }

}
