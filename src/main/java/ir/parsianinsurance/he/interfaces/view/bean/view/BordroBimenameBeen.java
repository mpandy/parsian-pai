package ir.parsianinsurance.he.interfaces.view.bean.view;

import ir.parsianinsurance.he.domain.model.Bimename;
import ir.parsianinsurance.he.domain.model.BimenameFactory;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import java.util.List;

/**
 * Created by 8119 on 8/14/2017.
 */
@Model
public class BordroBimenameBeen {

    private List<Bimename> bimenames;
    private Bimename searchBimename;

    @PostConstruct
    public void init(){

        searchBimename = BimenameFactory.newBimenameForBordroBimename();
    }

    public List<Bimename> getBimenames() {
        return bimenames;
    }

    public void setBimenames(List<Bimename> bimenames) {
        this.bimenames = bimenames;
    }

    public Bimename getSearchBimename() {
        return searchBimename;
    }

    public void setSearchBimename(Bimename searchBimename) {
        this.searchBimename = searchBimename;
    }
}
