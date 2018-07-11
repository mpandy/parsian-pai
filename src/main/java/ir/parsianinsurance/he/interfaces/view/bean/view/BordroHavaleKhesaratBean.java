package ir.parsianinsurance.he.interfaces.view.bean.view;

import ir.parsianinsurance.he.domain.model.HavaleKhesarat;
import ir.parsianinsurance.he.domain.service.IKhesaratService;
import ir.parsianinsurance.he.interfaces.view.model.HavaleKhesaratSearchModel;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class BordroHavaleKhesaratBean implements Serializable {

    @Inject
    IKhesaratService khesaratService;

    private List<HavaleKhesarat> havaleKhesarats;
    private HavaleKhesaratSearchModel havaleKhesaratSearchModel;

    @PostConstruct
    public void init(){
        havaleKhesaratSearchModel = new HavaleKhesaratSearchModel();
    }

    public void search(){
        havaleKhesarats = khesaratService.searchHavaleKhesarat(havaleKhesaratSearchModel);
    }

    public List<HavaleKhesarat> getHavaleKhesarats() {
        return havaleKhesarats;
    }

    public void setHavaleKhesarats(List<HavaleKhesarat> havaleKhesarats) {
        this.havaleKhesarats = havaleKhesarats;
    }

    public HavaleKhesaratSearchModel getHavaleKhesaratSearchModel() {
        return havaleKhesaratSearchModel;
    }

    public void setHavaleKhesaratSearchModel(HavaleKhesaratSearchModel havaleKhesaratSearchModel) {
        this.havaleKhesaratSearchModel = havaleKhesaratSearchModel;
    }
}
