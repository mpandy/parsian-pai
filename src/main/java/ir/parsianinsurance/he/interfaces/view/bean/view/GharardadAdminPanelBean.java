package ir.parsianinsurance.he.interfaces.view.bean.view;

import ir.parsianinsurance.he.domain.model.Gharardad;
import ir.parsianinsurance.he.domain.model.GharardadFactory;
import ir.parsianinsurance.he.domain.model.GoroohFactory;
import ir.parsianinsurance.he.domain.rule.IPropertyRules;
import ir.parsianinsurance.he.domain.service.IGharardadService;
import ir.parsianinsurance.he.interfaces.view.bean.session.MainView;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Mohammad on 8/7/2017.
 */

@Named
@ViewScoped
public class GharardadAdminPanelBean implements Serializable{

    @Inject
    transient ResourceBundle bundle;

    @Inject
    IPropertyRules propertyRules;

    @Inject
    MainView mainView;

    @Inject
    IGharardadService gharardadService;

    private Gharardad newGharardad;
    private Gharardad searchGharardad;
    private String newGharardadGoroohs;
    private String goroohNameToAdd;
    private boolean gharardadDialogVisible;
    private List<String> selectedGoroohs;
    private List<Gharardad> gharardadList;

    @PostConstruct
    public void init(){
        searchGharardad = GharardadFactory.newSearchGharardad();
        search();
        newGharardad = GharardadFactory.newgharardad();
        setSelectedGoroohs(Collections.emptyList());
    }

    public  void newGharardad(){
        newGharardad = GharardadFactory.newgharardad();
        gharardadDialogVisible = true;
    }

    public void editGharardad(Gharardad gharardad){
        this.newGharardad = gharardad;
        setSelectedGoroohs(GoroohFactory.goroohListFromString(gharardad.getGoroohs()));
        gharardadDialogVisible = true;
    }

    public void search(){
        gharardadList = gharardadService.searchGharardad(searchGharardad.getName());
    }

    public List<String> autocompleteGorooh(String name)
    {
        return propertyRules.getTakhfifgoroohi()
                .keySet()
                .stream()
                .filter(gr_name -> bundle.getString(gr_name).contains(name.trim()))
                .collect(Collectors.toList());
    }


    public void addOrEditGharardad() {

        if (getSelectedGoroohs() == null || getSelectedGoroohs().size() == 0)
            newGharardad.setGoroohs(Arrays.asList("DEFAULT_GROUP").toString());
        else
            newGharardad.setGoroohs(getSelectedGoroohs().toString());

        List<String> possibleErrorMessages = gharardadService.shomareGharardadIsValid(newGharardad.getShomare());
        if(!possibleErrorMessages.isEmpty()) {
            mainView.errors(possibleErrorMessages);
            return;
        }

        gharardadService.saveGharardad(newGharardad);

        gharardadDialogVisible = false;
        setNewGharardadGoroohs("");
        init();
    }


    public void removeGharardad(Gharardad gharardad){
        gharardadService.removeGharardad(gharardad);
    }

    public void closeDialogGharardad(){
        gharardadDialogVisible = false;
    }

    public Gharardad getSearchGharardad() {
        return searchGharardad;
    }

    public void setSearchGharardad(Gharardad searchGharardad) {
        this.searchGharardad = searchGharardad;
    }

    public String getNewGharardadGoroohs() {
        return newGharardadGoroohs;
    }

    public void setNewGharardadGoroohs(String newGharardadGoroohs) {
        this.newGharardadGoroohs = newGharardadGoroohs;
    }

    public List<Gharardad> getGharardadList() {
        return gharardadList;
    }

    public void setGharardadList(List<Gharardad> gharardadList) {
        this.gharardadList = gharardadList;
    }

    public String getGoroohNameToAdd() {
        return goroohNameToAdd;
    }

    public void setGoroohNameToAdd(String goroohNameToAdd) {
        this.goroohNameToAdd = goroohNameToAdd;
    }

    public boolean isGharardadDialogVisible() {
        return gharardadDialogVisible;
    }

    public void setGharardadDialogVisible(boolean gharardadDialogVisible) {
        this.gharardadDialogVisible = gharardadDialogVisible;
    }

    public Gharardad getNewGharardad() {
        return newGharardad;
    }

    public void setNewGharardad(Gharardad newGharardad) {
        this.newGharardad = newGharardad;
    }

    public List<String> getSelectedGoroohs() {
        return selectedGoroohs;
    }

    public void setSelectedGoroohs(List<String> selectedGoroohs) {
        this.selectedGoroohs = selectedGoroohs;
    }


    public Set<Gharardad> undeletedGharardads(){
        if(gharardadList.isEmpty())
            return Collections.emptySet();

        return  gharardadList.stream()
                .filter(gharardad -> gharardad.getDeleted() == null )
                .collect(Collectors.toSet());
    }

    public String translatedGroops(Gharardad gharardad) {
        String translatedOutput = "";
        for(String nextGorooh : GoroohFactory.goroohListFromString(gharardad.getGoroohs()))
            translatedOutput+=(bundle.getString(nextGorooh)+" / ");

        return translatedOutput;
    }

}
