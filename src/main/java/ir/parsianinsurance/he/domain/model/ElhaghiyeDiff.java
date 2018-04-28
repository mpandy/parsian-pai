package ir.parsianinsurance.he.domain.model;

import javax.persistence.*;

/**
 * Created by Mohammad on 5/27/2017.
 */

@Entity
@Table(name = "DMN_ELHAGHIYE_DIFF")
public class ElhaghiyeDiff {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name="elhaghiye_id")
    private Elhaghiye elhaghiye;

    private String title;
    private String oldValue;
    private String newValue;

    public ElhaghiyeDiff() {
    }

    public String getOldValue() {
        return oldValue;
    }

    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }

    public String getNewValue() {
        return newValue;
    }

    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ElhaghiyeDiff(String title, String oldValue, String newValue) {
        this.title = title;
        this.oldValue = oldValue;
        this.newValue = newValue;
    }

    public Elhaghiye getElhaghiye() {
        return elhaghiye;
    }

    public void setElhaghiye(Elhaghiye elhaghiye) {
        this.elhaghiye = elhaghiye;
    }

    public ElhaghiyeDiff swapNewAndOld(){
        return new ElhaghiyeDiff(this.title, this.newValue, this.oldValue);
    }

    public void print(){
        System.out.println("title:"+this.getTitle());
        System.out.println("old:"+this.getOldValue());
        System.out.println("new:"+this.getNewValue());
        System.out.println("---------------------");
    }
}
