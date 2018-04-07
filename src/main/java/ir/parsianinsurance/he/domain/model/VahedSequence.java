package ir.parsianinsurance.he.domain.model;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by Mohammad on 9/2/2017.
 */

@Embeddable
public class VahedSequence implements Serializable {

    private Integer bimename_count;
    private Integer pishnahad_count;
    private Integer khesarat_count;

    public Integer getBimename_count() {
        return bimename_count;
    }

    public void setBimename_count(Integer bimename_count) {
        this.bimename_count = bimename_count;
    }

    public Integer getPishnahad_count() {
        return pishnahad_count;
    }

    public void setPishnahad_count(Integer pishnahad_count) {
        this.pishnahad_count = pishnahad_count;
    }

    public Integer getKhesarat_count() {
        return khesarat_count;
    }

    public void setKhesarat_count(Integer khesarat_count) {
        this.khesarat_count = khesarat_count;
    }

    protected void initializeSequence(){
        setBimename_count(1);
        setPishnahad_count(1);
        setKhesarat_count(1);
    }
}
