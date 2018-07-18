package ir.parsianinsurance.he.interfaces.view.bean.view;

import ir.parsianinsurance.he.domain.model.Bimename;
import ir.parsianinsurance.he.domain.model.BimenameFactory;
import ir.parsianinsurance.he.domain.model.enums.TabagheKhatar;
import ir.parsianinsurance.he.domain.model.enums.VaziateBimename;
import ir.parsianinsurance.he.domain.service.IBimenameService;
import ir.parsianinsurance.he.interfaces.view.model.BimenameSearchModel;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

/**
 * Created by 8119 on 8/14/2017.
 */
@Named
@ViewScoped
public class BordroBimenameBean implements Serializable {

    @Inject
    IBimenameService bimenameService;

    private List<Bimename> bimenames;
    private BimenameSearchModel searchBimename;
    private TabagheKhatar[] tabagheKhatars;

    @PostConstruct
    public void init(){
        this.searchBimename = new BimenameSearchModel();
        searchBimename.setTabagheKhatar(TabagheKhatar.EMPTY);
        this.tabagheKhatars = TabagheKhatar.values();
    }

    public void search(){
        bimenames = bimenameService.searchBimename(searchBimename, 1);
    }

    public List<Bimename> getBimenames() {
        return bimenames;
    }

    public void setBimenames(List<Bimename> bimenames) {
        this.bimenames = bimenames;
    }

    public TabagheKhatar[] getTabagheKhatars() {
        return tabagheKhatars;
    }

    public void setTabagheKhatars(TabagheKhatar[] tabagheKhatars) {
        this.tabagheKhatars = tabagheKhatars;
    }

    public BimenameSearchModel getSearchBimename() {
        return searchBimename;
    }

    public void setSearchBimename(BimenameSearchModel searchBimename) {
        this.searchBimename = searchBimename;
    }
}
