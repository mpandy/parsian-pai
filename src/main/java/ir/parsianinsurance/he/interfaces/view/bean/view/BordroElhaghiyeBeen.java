package ir.parsianinsurance.he.interfaces.view.bean.view;

import ir.parsianinsurance.he.domain.model.Elhaghiye;
import ir.parsianinsurance.he.domain.model.ElhaghiyeFactory;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import java.util.List;

/**
 * Created by 8119 on 8/16/2017.
 */
@Model
public class BordroElhaghiyeBeen {

    private List<Elhaghiye> elhaghiyes;
    private Elhaghiye searchElhaghiye;

    @PostConstruct
    public void init(){

        searchElhaghiye = ElhaghiyeFactory.newBimenameForBordroElhaghiye();
    }

    public List<Elhaghiye> getElhaghiyes() {
        return elhaghiyes;
    }

    public void setElhaghiyes(List<Elhaghiye> elhaghiyes) {
        this.elhaghiyes = elhaghiyes;
    }

    public Elhaghiye getSearchElhaghiye() {
        return searchElhaghiye;
    }

    public void setSearchElhaghiye(Elhaghiye searchElhaghiye) {
        this.searchElhaghiye = searchElhaghiye;
    }
}
