package ir.parsianinsurance.he.domain.model;

import ir.parsianinsurance.he.domain.model.enums.NoeKhatarEzafi;
import ir.parsianinsurance.he.infrastructure.util.StringUtil;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 8119 on 2/16/2017.
 */

@Entity
@Table(name = "DMN_KHATAREZAFI")
public class KhatarEzafi extends ElhaghiyeableCollection {

    @Id
    @GeneratedValue
    private Long id;

    @Enumerated(EnumType.STRING)
    private NoeKhatarEzafi noekhatarezafi;
    private Double nerkh;
    private String tozih;
    private Long createdDate;

    public NoeKhatarEzafi getNoekhatarezafi() {
        return noekhatarezafi;
    }

    public void setNoekhatarezafi(NoeKhatarEzafi noekhatarezafi) {
        this.noekhatarezafi = noekhatarezafi;
    }

    public Double getNerkh() {
        return nerkh;
    }

    public void setNerkh(Double nerkh) {
        this.nerkh = nerkh;
    }

    public String getTozih() {
        return tozih;
    }

    public void setTozih(String tozih) {
        this.tozih = tozih;
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


    public KhatarEzafi(NoeKhatarEzafi noekhatarezafi, Double nerkh) {
        this.noekhatarezafi = noekhatarezafi;
        this.nerkh = nerkh;
    }

    protected KhatarEzafi() {
    }

    @Override
    public List<ElhaghiyeDiff> elhagiyeDiffs(ElhaghiyeableCollection theOther) {

        KhatarEzafi otherKhatarEzafi = theOther == null ? KhatareEzafiFactory.newKhatareEzafi() : (KhatarEzafi) theOther;
        List<ElhaghiyeDiff> returnList = new ArrayList<>();

        if(!StringUtil.equals(this.getNoekhatarezafi().name(), otherKhatarEzafi.getNoekhatarezafi().name()))
            returnList.add(new ElhaghiyeDiff("noekhatarezafi",
                                            this.getNoekhatarezafi().name(),
                                            otherKhatarEzafi.getNoekhatarezafi().name()));

        return returnList;
    }

    @Override
    public boolean equals(Object obj) {
        return this.getCreatedDate() == ((KhatarEzafi)obj).getCreatedDate();
    }

    public Long getCreatedDate() {
        return this.createdDate;
    }


}
