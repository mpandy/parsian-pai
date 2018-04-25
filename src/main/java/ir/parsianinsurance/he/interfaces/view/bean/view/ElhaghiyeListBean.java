package ir.parsianinsurance.he.interfaces.view.bean.view;

import ir.parsianinsurance.he.domain.model.Elhaghiye;
import ir.parsianinsurance.he.domain.model.VaziateElhaghiye;
import ir.parsianinsurance.he.domain.model.enums.NoeElhaghiye;
import ir.parsianinsurance.he.domain.service.IElhaghiyeService;
import ir.parsianinsurance.he.infrastructure.ComboOptions;
import ir.parsianinsurance.he.infrastructure.repository.ElhaghiyeRepository;
import ir.parsianinsurance.he.infrastructure.service.IPrintService;
import ir.parsianinsurance.he.infrastructure.workflow.WebAction;
import ir.parsianinsurance.he.interfaces.view.bean.session.MainView;
import ir.parsianinsurance.he.interfaces.view.model.ElhaghiyeSearchModel;
import ir.parsianinsurance.he.interfaces.view.uiflow.StateName;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;

import javax.annotation.PostConstruct;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 8119 on 6/13/2017.
 */

@Named
@ViewScoped
public class ElhaghiyeListBean implements Serializable{

    @Inject
    ElhaghiyeRepository elhaghiyeRepository;

    @Inject
    ElhaghiyeBean elhaghiyeBean;

    @Inject
    FacesContext facesContext;

    @Inject
    IPrintService iPrintService;

    @Inject
    MainView mainView;

    @Inject
    ComboOptions comboOptions;

    @Inject
    IElhaghiyeService elhaghiyeService;

    private List<Elhaghiye> elhaghiyes;
    private Elhaghiye selectedElhaghiye;
    private ElhaghiyeSearchModel searchElhaghiye;
    private int selectedItemRow;
    private static final int ELHAGHIYE_MAX_ROW = 5;
    private boolean showFaskhButton;
    private boolean showEbtalButton;

    @PostConstruct
    public void init() {
        this.searchElhaghiye = new ElhaghiyeSearchModel();
        search();
        setSelectedItemRow(-1);
    }

    public List<Elhaghiye> getElhaghiyes() {
        return elhaghiyes;
    }

    public void setElhaghiyes(List<Elhaghiye> elhaghiyes) {
        this.elhaghiyes = elhaghiyes;
    }

    public ElhaghiyeRepository getElhaghiyeRepository() {
        return elhaghiyeRepository;
    }

    public void setElhaghiyeRepository(ElhaghiyeRepository elhaghiyeRepository) {
        this.elhaghiyeRepository = elhaghiyeRepository;
    }

    public boolean isShowFaskhButton() {
        return showFaskhButton;
    }

    public void setShowFaskhButton(boolean showFaskhButton) {
        this.showFaskhButton = showFaskhButton;
    }

    public boolean isShowEbtalButton() {
        return showEbtalButton;
    }

    public void setShowEbtalButton(boolean showEbtalButton) {
        this.showEbtalButton = showEbtalButton;
    }

    public Elhaghiye getSelectedElhaghiye() {
        return selectedElhaghiye;
    }

    public void setSelectedElhaghiye(Elhaghiye selectedElhaghiye) {
        this.selectedElhaghiye = selectedElhaghiye;
        hideShowOperationButtons();
    }

    private void hideShowOperationButtons() {
        showFaskhButton =   selectedElhaghiye.getVaziateElhaghiye().equals(VaziateElhaghiye.TAYIDE_MOJAVEZ) &&
                                (selectedElhaghiye.getNoe_elhaghie().equals(NoeElhaghiye.FASKHAZTARAFEBIMEGAR) ||
                                selectedElhaghiye.getNoe_elhaghie().equals(NoeElhaghiye.FASKHAZTARAFEBIMEGOZAR));
        showEbtalButton =   selectedElhaghiye.getVaziateElhaghiye().equals(VaziateElhaghiye.TAYIDE_MOJAVEZ) &&
                            selectedElhaghiye.getNoe_elhaghie().equals(NoeElhaghiye.EBTAL);
    }

    @WebAction(toState =StateName.ELHAGHIYE_SELECTED)
    public void selectElhaghie(Elhaghiye elhaghiye, int selectedItemRow) {

        setSelectedElhaghiye(elhaghiye);
        setSelectedItemRow(selectedItemRow);

    }

    public ElhaghiyeSearchModel getSearchElhaghiye() {
        return searchElhaghiye;
    }

    public void setSearchElhaghiye(ElhaghiyeSearchModel searchElhaghiye) {
        this.searchElhaghiye = searchElhaghiye;
    }

    public int getSelectedItemRow() {
        return selectedItemRow;
    }

    public void setSelectedItemRow(int selectedItemRow) {
        this.selectedItemRow = selectedItemRow;
    }

    public boolean mojavezeElhaghiyeTayidShode(){

        return  selectedElhaghiye!=null &&
                selectedElhaghiye.getVaziateElhaghiye() != null &&
                selectedElhaghiye.getVaziateElhaghiye().equals(VaziateElhaghiye.TAYIDE_MOJAVEZ);
    }

    @WebAction(toState = StateName.NAMAYESH_ELHAGHIYE)
    public void namayeshElhaghiye() {
        elhaghiyeBean.setElhaghiye(selectedElhaghiye);
        setSelectedItemRow(-1);
    }

    @WebAction(toState = StateName.TAEEDE_ELHAGHIYE_TAGHIRAT)
    public void sodoorElhaghiyePasAzTayidMojavez() {
            elhaghiyeBean.setElhaghiye(selectedElhaghiye);
        setSelectedItemRow(-1);
    }

    @WebAction(toState = StateName.FASKH)
    public void faskh() {
        List<NoeElhaghiye> elhaghieTypeOptions = Arrays.asList( NoeElhaghiye.EMPTY,
                NoeElhaghiye.FASKHAZTARAFEBIMEGAR,
                NoeElhaghiye.FASKHAZTARAFEBIMEGOZAR);
        elhaghiyeBean.setNoeElhaghiyeOptions(elhaghieTypeOptions);
        elhaghiyeBean.setElhaghiye(selectedElhaghiye);
        setSelectedItemRow(-1);
    }

    @WebAction(toState = StateName.EBTAL)
    public void ebtal() {
        List<NoeElhaghiye> elhaghieTypeOptions = Arrays.asList( NoeElhaghiye.EMPTY, NoeElhaghiye.EBTAL);
        elhaghiyeBean.setNoeElhaghiyeOptions(elhaghieTypeOptions);
        elhaghiyeBean.setElhaghiye(selectedElhaghiye);
        setSelectedItemRow(-1);
    }

    public void search() {
        elhaghiyes = elhaghiyeService.searchElhaghiye(searchElhaghiye, ELHAGHIYE_MAX_ROW);
    }

    public void printElhaghiye()
    {
        try {
            ExternalContext externalContext = facesContext.getExternalContext();
            ServletContext servletContext = (ServletContext) externalContext.getContext();
            JasperPrint jasperPrint = iPrintService.printElhaghiye(getSelectedElhaghiye(), servletContext);
            HttpServletResponse httpServletResponse = (HttpServletResponse) externalContext.getResponse();
            httpServletResponse.addHeader("Content-disposition", "attachment; filename=report.pdf");
            ServletOutputStream servletOutputStream = httpServletResponse.getOutputStream();
            JasperExportManager.exportReportToPdfStream(jasperPrint, servletOutputStream);
            facesContext.responseComplete();
        } catch (JRException e) {
            e.printStackTrace();
            mainView.error(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            mainView.error(e.getMessage());
        }
    }
}