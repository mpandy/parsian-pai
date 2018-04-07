package ir.parsianinsurance.he.domain.model;

import ir.parsianinsurance.he.infrastructure.util.StringUtil;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mohammad on 6/18/2017.
 */

@Entity
@Table(name = "DMN_SHAKHS")
@DiscriminatorColumn (name="shakhsType", discriminatorType = DiscriminatorType.STRING)
public class Shakhs {

    @Id
    @GeneratedValue
    private Long id;

    private String pishvand;

    private String name;

    @Embedded
    private EttelaateTamas ettelaateTamas;

    private Long createdDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPishvand() {
        return pishvand;
    }

    public void setPishvand(String pishvand) {
        this.pishvand = pishvand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EttelaateTamas getEttelaateTamas() {
        return ettelaateTamas;
    }

    public void setEttelaateTamas(EttelaateTamas ettelaateTamas) {
        this.ettelaateTamas = ettelaateTamas;
    }

    public Long getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Long createdDate) {
        this.createdDate = createdDate;
    }

    public String getShenase(){
        return "";
    }
    
    public List<ElhaghiyeDiff> elhagiyeDiffs(String caller, Object theOther) {

        Shakhs otherShakhs = (Shakhs) theOther;
        List<ElhaghiyeDiff> returnList = new ArrayList<>();
        
        if(!StringUtil.equals(this.getPishvand(), otherShakhs.getPishvand()))
            returnList.add( new ElhaghiyeDiff("pishvand"+caller,
                    this.getPishvand(), otherShakhs.getPishvand()));

        if(!StringUtil.equals(this.getName(), otherShakhs.getName()))
            returnList.add( new ElhaghiyeDiff("name"+caller,
                    this.getName(), otherShakhs.getName()));

        if(!StringUtil.equals(this.getEttelaateTamas().getAddress(), otherShakhs.getEttelaateTamas().getAddress()))
            returnList.add( new ElhaghiyeDiff("address"+caller,
                    this.getEttelaateTamas().getAddress(),
                    otherShakhs.getEttelaateTamas().getAddress()));

        if(!StringUtil.equals(this.getEttelaateTamas().getTelefon(), otherShakhs.getEttelaateTamas().getTelefon()))
            returnList.add( new ElhaghiyeDiff("telephone"+caller,
                    this.getEttelaateTamas().getTelefon(),
                    otherShakhs.getEttelaateTamas().getTelefon()));

        if(!StringUtil.equals(this.getEttelaateTamas().getMobile(), otherShakhs.getEttelaateTamas().getMobile()))
            returnList.add( new ElhaghiyeDiff("mobile"+caller,
                    this.getEttelaateTamas().getMobile(),
                    otherShakhs.getEttelaateTamas().getMobile()));

        if(!StringUtil.equals(this.getEttelaateTamas().getCode_posti(), otherShakhs.getEttelaateTamas().getCode_posti()))
            returnList.add( new ElhaghiyeDiff("codeposti"+caller,
                    this.getEttelaateTamas().getCode_posti(),
                    otherShakhs.getEttelaateTamas().getCode_posti()));

        if(!StringUtil.equals(this.getEttelaateTamas().getPoste_electronic(), otherShakhs.getEttelaateTamas().getPoste_electronic()))
            returnList.add( new ElhaghiyeDiff("posteelectronic"+caller,
                    this.getEttelaateTamas().getPoste_electronic(),
                    otherShakhs.getEttelaateTamas().getPoste_electronic()));
        
        return returnList;
    }

}
