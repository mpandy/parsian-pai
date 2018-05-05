package ir.parsianinsurance.he.interfaces.view.bean.view;


import ir.parsianinsurance.he.domain.model.Shoghl;
import ir.parsianinsurance.he.domain.model.ShoghlFactory;
import ir.parsianinsurance.he.domain.service.IShoghlService;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by 8119 on 8/10/2017.
 */
@Named
@ViewScoped
public class ShoghlAdminPanelBean implements Serializable {

    private List<Shoghl> shoghls;
    private Shoghl newshoghl;
    private Shoghl searchShoghl;
    private String newShoghlTabaghekhatar;
    private String goroohNameToAdd;
    private boolean shoghlDialogVisible;
    private List<Shoghl> shoghlList;

    @Inject
    IShoghlService shoghlService;

    @PostConstruct
    public void init(){
        searchShoghl = ShoghlFactory.newSearchShoghl();
        search();
        newshoghl = ShoghlFactory.newshoghl();
    }

    public  void newshoghl(){
        newshoghl = ShoghlFactory.newshoghl();
        shoghlDialogVisible = true;
    }

    public void editShoghl(Shoghl shoghl){
        this.newshoghl = shoghl;
        shoghlDialogVisible = true;
    }

    public void search(){
        shoghlList = shoghlService.searchShoghl(searchShoghl.getName());
    }

    public void addOrEdittabaghekhatar() {
        shoghlService.saveShoghl(newshoghl);
        shoghlDialogVisible = false;
        init();
    }

    public void removeShodgl(Shoghl shoghl){
        shoghlService.removeShoghl(shoghl);
    }

    public void closeDialogShoghl(){
        shoghlDialogVisible = false;
    }

    public List<Shoghl> getShoghls() {
        return shoghls;
    }

    public void setShoghls(List<Shoghl> shoghls) {
        this.shoghls = shoghls;
    }

    public Shoghl getNewshoghl() {
        return newshoghl;
    }

    public void setNewshoghl(Shoghl newshoghl) {
        this.newshoghl = newshoghl;
    }

    public Shoghl getSearchShoghl() {
        return searchShoghl;
    }

    public void setSearchShoghl(Shoghl searchShoghl) {
        this.searchShoghl = searchShoghl;
    }

    public String getNewShoghlTabaghekhatar() {
        return newShoghlTabaghekhatar;
    }

    public void setNewShoghlTabaghekhatar(String newShoghlTabaghekhatar) {
        this.newShoghlTabaghekhatar = newShoghlTabaghekhatar;
    }

    public String getGoroohNameToAdd() {
        return goroohNameToAdd;
    }

    public void setGoroohNameToAdd(String goroohNameToAdd) {
        this.goroohNameToAdd = goroohNameToAdd;
    }

    public boolean isShoghlDialogVisible() {
        return shoghlDialogVisible;
    }

    public void setShoghlDialogVisible(boolean shoghlDialogVisible) {
        this.shoghlDialogVisible = shoghlDialogVisible;
    }

    public List<Shoghl> getShoghlList() {
        return shoghlList;
    }

    public void setShoghlList(List<Shoghl> shoghlList) {
        this.shoghlList = shoghlList;
    }

    public Set<Shoghl> undeletedShoghls(){
        if(shoghlList.isEmpty())
            return Collections.emptySet();

        return  shoghlList.stream()
                .filter(shoghl -> shoghl.getDeleted() == null )
                .collect(Collectors.toSet());
    }
}
