package ir.parsianinsurance.he.interfaces.view.bean.view;

import ir.parsianinsurance.he.domain.model.NamayandeFactory;
import ir.parsianinsurance.he.domain.model.Vahed;
import ir.parsianinsurance.he.domain.service.ISequenceService;
import ir.parsianinsurance.he.domain.service.IVahedService;
import ir.parsianinsurance.he.interfaces.view.bean.session.MainView;

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
 * Created by 8119 on 8/15/2017.
 */
@Named
@ViewScoped
public class VahedAdminPanelBeen implements Serializable{

    @Inject
    IVahedService vahedService;

    @Inject
    ISequenceService sequenceService;

    @Inject
    MainView mainView;

    private List<Vahed> vaheds;
    private Vahed newVahed;
    private Vahed searchVahed;
    private boolean namayandeDialogVisible;
    private List<Vahed> vahedList;

    @PostConstruct
    public void init(){
        searchVahed = NamayandeFactory.newNamayande();
        search();
        newVahed = NamayandeFactory.newNamayande();
    }

    public void createNewNamayande(){
        newVahed = NamayandeFactory.newNamayandeForAdminPanel();
        namayandeDialogVisible = true;
    }

    public void editNamayande(Vahed vahed){
        this.newVahed = vahed;
        namayandeDialogVisible = true;
    }

    public void search(){
        vahedList = vahedService.searchVahed();
    }

    public void addOrEditNamayande() {
        if(validate(newVahed)) {
            vahedService.saveVahed(newVahed);
            sequenceService.addNamayandeToMemory(newVahed);
            namayandeDialogVisible = false;
            init();
        }
    }

    private boolean validate(Vahed newVahed) {
        boolean valid = true;
//        List<String> errorMessages = new ArrayList<>();
        if(newVahed.getVahedeSodoor() == null) {
            mainView.error("vahedesodoorelzamist");
            return false;
        }
//        if(!valid)
//            mainView.errors(errorMessages);
//
        return valid;
    }

    public void removeNamayande(Vahed vahed){
        vahedService.removeVahed(vahed);
    }

    public void closeDialogNamayande(){
        namayandeDialogVisible = false;
    }

    public List<Vahed> getVaheds() {
        return vaheds;
    }

    public void setVaheds(List<Vahed> vaheds) {
        this.vaheds = vaheds;
    }

    public Vahed getNewVahed() {
        return newVahed;
    }

    public void setNewVahed(Vahed newVahed) {
        this.newVahed = newVahed;
    }

    public Vahed getSearchVahed() {
        return searchVahed;
    }

    public void setSearchVahed(Vahed searchVahed) {
        this.searchVahed = searchVahed;
    }

    public boolean isNamayandeDialogVisible() {
        return namayandeDialogVisible;
    }

    public void setNamayandeDialogVisible(boolean namayandeDialogVisible) {
        this.namayandeDialogVisible = namayandeDialogVisible;
    }

    public List<Vahed> getVahedList() {
        return vahedList;
    }

    public void setVahedList(List<Vahed> vahedList) {
        this.vahedList = vahedList;
    }

    public Set<Vahed> undeletedVaheds(){
        if(vahedList.isEmpty())
            return Collections.emptySet();

        return  vahedList.stream()
                .filter(vahed -> vahed.getDeleted() == null )
                .collect(Collectors.toSet());
    }
}
