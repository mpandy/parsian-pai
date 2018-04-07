package ir.parsianinsurance.he.interfaces.view.bean.view;

import ir.parsianinsurance.he.domain.filter.khesarat.KhesaratRender;
import ir.parsianinsurance.he.domain.model.Khesarat;
import ir.parsianinsurance.he.domain.model.enums.VaziateParvandeKhesarat;
import ir.parsianinsurance.he.domain.rule.IWorkflowRules;
import ir.parsianinsurance.he.domain.service.IKhesaratService;
import ir.parsianinsurance.he.infrastructure.repository.KhesaratRepository;
import ir.parsianinsurance.he.infrastructure.service.IPrintService;
import ir.parsianinsurance.he.infrastructure.workflow.WebAction;
import ir.parsianinsurance.he.interfaces.view.bean.session.MainView;
import ir.parsianinsurance.he.interfaces.view.model.KhesaratSearchModel;
import ir.parsianinsurance.he.interfaces.view.uiflow.StateName;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

/**
 * Created by 8119 on 6/29/2017.
 */

@Named
@ViewScoped
public class KhesaratListBean implements Serializable{

    private List<Khesarat> khesarats;
    private Khesarat selectedKhesarat;
    private KhesaratSearchModel searchKhesarat;
    private int selectedItemRow;
    private static final int KHESARAT_MAX_ROW = 5;
    private boolean hideEditButton;
    private boolean hidehavaleButton;
    private boolean showSabteKhesaratButton;

    @Inject
    KhesaratRepository khesaratRepository;

    @Inject
    KhesaratBean khesaratBean;

    @Inject
    IKhesaratService khesaratService;

    @Inject
    MainView mainView;

    @Inject
    IPrintService iPrintService;

    @Inject
    FacesContext facesContext;

    @Inject
    IWorkflowRules workflowRules;

    @PostConstruct
    public void init(){
        this.searchKhesarat = new KhesaratSearchModel();
        search();
        setSelectedItemRow(-1);
    }

    @WebAction(toState =StateName.KHESARAT_SELECTED)
    public void selectKhesarat(Khesarat khesarat,int selectedItemRow){
        setSelectedKhesarat(khesarat);
        setSelectedItemRow(selectedItemRow);
        hideEditButton = workflowRules.nextVaziatKhesarat(khesarat.getVaziateparvande()).isEmpty();
        hidehavaleButton = !khesarat.getVaziateparvande().equals(VaziateParvandeKhesarat.ELAAM_BE_MAALI);
    }

    public void search(){
        khesarats = khesaratService.searchKhesarat(searchKhesarat, KHESARAT_MAX_ROW);
    }

    @WebAction(toState = StateName.NAMAYESH_KHESARAT)
    public void namayeshKhesarat() {
        khesaratBean.setKhesarat(selectedKhesarat);
        setSelectedItemRow(-1);
    }

    @KhesaratRender
    @WebAction(toState = StateName.VIRAYESH_KHESARAT)
    public void editKhesarat() {
        khesaratBean.setKhesarat(selectedKhesarat);
        khesaratBean.setValidNextVaziats(workflowRules.nextVaziatKhesarat(selectedKhesarat.getVaziateparvande()));
        setSelectedItemRow(-1);
    }

    @WebAction( toState = StateName.SODOOR_NEW_HAVALE_KHESARAT)
    public void newSodoorHavaleKhesarat(){
        khesaratBean.setKhesarat(selectedKhesarat);
        setSelectedItemRow(-1);
    }

    public boolean isShowSabteKhesaratButton() {
        return showSabteKhesaratButton;
    }

    public void setShowSabteKhesaratButton(boolean showSabteKhesaratButton) {
        this.showSabteKhesaratButton = showSabteKhesaratButton;
    }

    private void hideShowOperationButtons() {
        showSabteKhesaratButton = selectedKhesarat.getVaziateparvande().equals(VaziateParvandeKhesarat.TAYIDE_MOJAVEZ);
    }

    public List<Khesarat> getKhesarats() {
        return khesarats;
    }

    public void setKhesarats(List<Khesarat> khesarats) {
        this.khesarats = khesarats;
    }

    public Khesarat getSelectedKhesarat() {
        return selectedKhesarat;
    }

    public void setSelectedKhesarat(Khesarat selectedKhesarat) {
        this.selectedKhesarat = selectedKhesarat;
        hideShowOperationButtons();
    }

    public KhesaratSearchModel getSearchKhesarat() {
        return searchKhesarat;
    }

    public void setSearchKhesarat(KhesaratSearchModel searchKhesarat) {
        this.searchKhesarat = searchKhesarat;
    }

    public int getSelectedItemRow() {
        return selectedItemRow;
    }

    public void setSelectedItemRow(int selectedItemRow) {
        this.selectedItemRow = selectedItemRow;
    }

    public boolean isHideEditButton() {
        return hideEditButton;
    }

    public void setHideEditButton(boolean hideEditButton) {
        this.hideEditButton = hideEditButton;
    }

    public boolean isHidehavaleButton() {
        return hidehavaleButton;
    }

    public void setHidehavaleButton(boolean hidehavaleButton) {
        this.hidehavaleButton = hidehavaleButton;
    }

    @WebAction(toState = StateName.KHESARAT)
    public void sabteKhesarat() {
        khesaratBean.setKhesarat(selectedKhesarat);
        khesaratBean.setValidNextVaziats(workflowRules.nextVaziatKhesarat(selectedKhesarat.getVaziateparvande()));
        setSelectedItemRow(-1);
    }
}


