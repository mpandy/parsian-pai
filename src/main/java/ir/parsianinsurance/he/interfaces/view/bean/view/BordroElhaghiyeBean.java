package ir.parsianinsurance.he.interfaces.view.bean.view;

import ir.parsianinsurance.he.domain.model.Elhaghiye;
import ir.parsianinsurance.he.domain.model.ElhaghiyeFactory;
import ir.parsianinsurance.he.domain.model.VaziateElhaghiye;
import ir.parsianinsurance.he.domain.model.enums.VaziateBimename;
import ir.parsianinsurance.he.domain.service.IBimenameService;
import ir.parsianinsurance.he.domain.service.IElhaghiyeService;
import ir.parsianinsurance.he.interfaces.view.model.ElhaghiyeSearchModel;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

/**
 * Created by 8119 on 8/16/2017.
 */
@Named
@ViewScoped
public class BordroElhaghiyeBean implements Serializable{

    @Inject
    IElhaghiyeService elhaghiyeService;

    private List<Elhaghiye> elhaghiyes;
    private ElhaghiyeSearchModel elhaghiyeSearchModel;

    @PostConstruct
    public void init(){
        elhaghiyeSearchModel = new ElhaghiyeSearchModel();
    }

    public void search(){
        elhaghiyes = elhaghiyeService.searchElhaghiye(elhaghiyeSearchModel, 0);
    }

    public List<Elhaghiye> getElhaghiyes() {
        return elhaghiyes;
    }

    public void setElhaghiyes(List<Elhaghiye> elhaghiyes) {
        this.elhaghiyes = elhaghiyes;
    }

    public ElhaghiyeSearchModel getElhaghiyeSearchModel() {
        return elhaghiyeSearchModel;
    }

    public void setElhaghiyeSearchModel(ElhaghiyeSearchModel elhaghiyeSearchModel) {
        this.elhaghiyeSearchModel = elhaghiyeSearchModel;
    }
}
