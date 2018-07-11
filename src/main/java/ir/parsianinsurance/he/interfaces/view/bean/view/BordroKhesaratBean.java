package ir.parsianinsurance.he.interfaces.view.bean.view;

import ir.parsianinsurance.he.domain.model.Khesarat;
import ir.parsianinsurance.he.domain.service.IKhesaratService;
import ir.parsianinsurance.he.interfaces.view.model.BordroKhesaratSearchModel;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class BordroKhesaratBean implements Serializable{

    @Inject
    IKhesaratService khesaratService;

    private List<Khesarat> khesarats;
    private BordroKhesaratSearchModel bordroKhesaratSearchModel;

    @PostConstruct
    public void init(){
        bordroKhesaratSearchModel = new BordroKhesaratSearchModel();
    }

    public void search(){
        khesarats = khesaratService.searchBordroKhesarat(bordroKhesaratSearchModel);
    }

    public List<Khesarat> getKhesarats() {
        return khesarats;
    }

    public void setKhesarats(List<Khesarat> khesarats) {
        this.khesarats = khesarats;
    }

    public BordroKhesaratSearchModel getBordroKhesaratSearchModel() {
        return bordroKhesaratSearchModel;
    }

    public void setBordroKhesaratSearchModel(BordroKhesaratSearchModel bordroKhesaratSearchModel) {
        this.bordroKhesaratSearchModel = bordroKhesaratSearchModel;
    }
}
