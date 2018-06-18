package ir.parsianinsurance.he.interfaces.view.bean.view;

import ir.parsianinsurance.he.domain.facade.IApplicationService;
import ir.parsianinsurance.he.domain.filter.bimename.BimenameRender;
import ir.parsianinsurance.he.domain.filter.khesarat.KhesaratRender;
import ir.parsianinsurance.he.domain.model.*;
import ir.parsianinsurance.he.domain.model.enums.NoeElhaghiye;
import ir.parsianinsurance.he.domain.model.enums.TabagheKhatar;
import ir.parsianinsurance.he.domain.model.enums.VaziateBimename;
import ir.parsianinsurance.he.domain.model.enums.VaziateParvandeKhesarat;
import ir.parsianinsurance.he.domain.service.IArtifactDocService;
import ir.parsianinsurance.he.domain.service.IBimenameService;
import ir.parsianinsurance.he.domain.service.IPishnahadService;
import ir.parsianinsurance.he.infrastructure.io.Zamime;
import ir.parsianinsurance.he.infrastructure.repository.BimenameRepository;
import ir.parsianinsurance.he.infrastructure.repository.SaghfeSodoorArtifactDocRepository;
import ir.parsianinsurance.he.infrastructure.repository.TakhfifModiriatiArtifactDocRepository;
import ir.parsianinsurance.he.infrastructure.security.UserBean;
import ir.parsianinsurance.he.infrastructure.service.IAshkhaseHoghooghiService;
import ir.parsianinsurance.he.infrastructure.service.IPrintService;
import ir.parsianinsurance.he.infrastructure.workflow.WebAction;
import ir.parsianinsurance.he.interfaces.view.bean.session.MainView;
import ir.parsianinsurance.he.interfaces.view.bean.view.bimenameLoader.HalateNamayesheBimename;
import ir.parsianinsurance.he.interfaces.view.model.BimenameSearchModel;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * Created by 8119 on 3/31/2017.
 */

@Named
@ViewScoped
public class BimenameListBean implements Serializable{

    private List<Bimename> bimenames;
    private Bimename selectedBimename;
    private BimenameSearchModel searchBimename;
    private int selectedItemRow;
    private static final int BIMENAME_MAX_ROW = 10;
    private boolean showSodoorButton;
    private boolean showKhesaratButton;
    private boolean showElhaghiyeButton;
    private boolean showChapButton;
    private boolean showFaskhButton;
    private boolean showEbtalButton;
    private boolean showNamayeshButton;
    private boolean showDarkhastMojavezButton;
    private TabagheKhatar[] tabagheKhatars;

    @Inject
    FacesContext facesContext;

    @Inject
    BimenameRepository bimenameRepository;

    @Inject
    SaghfeSodoorArtifactDocRepository saghfeSodoorArtifactDocRepository;

    @Inject
    TakhfifModiriatiArtifactDocRepository takhfifModiriatiArtifactDocRepository;

    @Inject
    IPrintService printService;

    @Inject
    BimenameBean bimenameBean;

    @Inject
    IPishnahadService pishnahadService;

    @Inject
    IBimenameService bimenameService;

    @Inject
    IArtifactDocService artifactDocService;

    @Inject
    ElhaghiyeBean elhaghiyeBean;

    @Inject
    KhesaratBean khesaratBeen;

    @Inject
    UserBean userBean;

    @Inject
    ArtifactDocListBean artifactDocListBean;

    @Inject
    MainView mainView;

    @PostConstruct
    public void init(){
        this.searchBimename = new BimenameSearchModel();
        searchBimename.setTabagheKhatar(TabagheKhatar.EMPTY);
        this.tabagheKhatars = TabagheKhatar.values();
        search();
        setSelectedItemRow(-1);
    }

    public List<Bimename> getBimenames() {
        return bimenames;
    }

    public BimenameSearchModel getSearchBimename() {
        return searchBimename;
    }

    public void setSearchBimename(BimenameSearchModel searchBimename) {
        this.searchBimename = searchBimename;
    }


    @WebAction(toState =StateName.BIMENAME_SELECTED)
    public void selectBimename(Bimename bimename,int selectedItemRow){
        setSelectedBimename(bimename);
        setSelectedItemRow(selectedItemRow);
    }

    private void hideShowOperationButtons() {
        showSodoorButton = selectedBimename.getVaziateBimename().equals(VaziateBimename.MOVAGHAT) || selectedBimename.getVaziateBimename().equals(VaziateBimename.TAYIDE_MOJAVEZ);
        showKhesaratButton = selectedBimename.getVaziateBimename().equals(VaziateBimename.DAEM) || selectedBimename.getVaziateBimename().equals(VaziateBimename.DARAYE_ELHAGHIYE_TAGHIR);
        showElhaghiyeButton = selectedBimename.getVaziateBimename().equals(VaziateBimename.DAEM) || selectedBimename.getVaziateBimename().equals(VaziateBimename.DARAYE_ELHAGHIYE_TAGHIR);;
        showChapButton = selectedBimename.getVaziateBimename().equals(VaziateBimename.DAEM) || selectedBimename.getVaziateBimename().equals(VaziateBimename.DARAYE_ELHAGHIYE_TAGHIR);;
        showFaskhButton = selectedBimename.getVaziateBimename().equals(VaziateBimename.DAEM) || selectedBimename.getVaziateBimename().equals(VaziateBimename.DARAYE_ELHAGHIYE_TAGHIR);;
        showEbtalButton = ((selectedBimename.getVaziateBimename().equals(VaziateBimename.DAEM)  ||
                            selectedBimename.getVaziateBimename().equals(VaziateBimename.DARAYE_ELHAGHIYE_TAGHIR)) &&
                            (bimenameService.isEbtalable(selectedBimename)));
        showDarkhastMojavezButton = selectedBimename.getVaziateBimename().equals(VaziateBimename.NIAZ_BE_AKHZE_MOJAVEZ);
    }

    @BimenameRender(halate = HalateNamayesheBimename.SABTE_PISHNAHAD)
    @WebAction( toState = StateName.SABT_PISHNAHAD)
    public void sabtePishnahad(){
        Vahed vahed = userBean.getCurrentUser().getVahed();
        bimenameBean.getBimename().getPishnahadeFaal().setVahed(vahed);
        setSelectedItemRow(-1);
    }

    @BimenameRender(halate = HalateNamayesheBimename.SODOORE_BIMENAME)
    @WebAction( toState = StateName.SODOOR_NEW_BIMENAME)
    public void sodoor(){

        Vahed vahedeSodoor = userBean.getCurrentUser().getVahed();
        getSelectedBimename().setVahedeSodoor(vahedeSodoor);

//        Zamime zamimePishnahad = pishnahadService.loadZamimePishnahad(getSelectedBimename().getPishnahadeFaal().getId());
//        getSelectedBimename().getPishnahadeFaal().setZamimePishnahad(zamimePishnahad);

        bimenameBean.setBimename(getSelectedBimename());
        setSelectedItemRow(-1);
    }

    @BimenameRender(halate = HalateNamayesheBimename.ELHAGHIYE_TAGHIR)
    @WebAction(toState = StateName.TAGHIR_BIMENAME)
    public void elhaghiyeTaghir(){
        List<NoeElhaghiye> elhaghieTypeOptions = Arrays.asList(NoeElhaghiye.TAGHIR);
        elhaghiyeBean.setNoeElhaghiyeOptions(elhaghieTypeOptions);
        Pishnahad originalPishnahad = getSelectedBimename().getPishnahadeFaal();

        elhaghiyeBean.getElhaghiye().setBimename(getSelectedBimename());
        elhaghiyeBean.getElhaghiye().setPishnahad_old(originalPishnahad);

        Pishnahad copiedPishnahad = PishnahadFactory.copyPishnahadForElhaghiye(originalPishnahad);
        getSelectedBimename().pishnahad(pishnahadService.loadPishnahad(copiedPishnahad));

        bimenameBean.setBimename(getSelectedBimename());

        setSelectedItemRow(-1);
    }

    @KhesaratRender
    @WebAction( toState = StateName.KHESARAT)
    public void sabteKhesarat(){
        khesaratBeen.init();
        khesaratBeen.getKhesarat().setBimename(selectedBimename);
        khesaratBeen.setValidNextVaziats(Arrays.asList(VaziateParvandeKhesarat.TASHKILE_PARVANDE_VA_KARSHENASI));
        setSelectedItemRow(-1);
    }

    @BimenameRender(halate = HalateNamayesheBimename.NAMAYESH)
    @WebAction(toState =StateName.NAMAYESH_BIMENAME)
    public void namayesh(){

//        Zamime zamimePishnahad = pishnahadService.loadZamimePishnahad(getSelectedBimename().getPishnahadeFaal().getId());
//        getSelectedBimename().getPishnahadeFaal().setZamimePishnahad(zamimePishnahad);

        bimenameBean.setBimename(getSelectedBimename());
        setSelectedItemRow(-1);
    }

    @WebAction(toState = StateName.EBTAL)
    public void ebtaleBimename(){
        List<NoeElhaghiye> elhaghieTypeOptions = Arrays.asList(NoeElhaghiye.EBTAL);
        elhaghiyeBean.setNoeElhaghiyeOptions(elhaghieTypeOptions);
        elhaghiyeBean.getElhaghiye().setBimename(getSelectedBimename());
        setSelectedItemRow(-1);
    }

    @WebAction(toState = StateName.FASKH)
    public void faskheBimename(){
        List<NoeElhaghiye> elhaghieTypeOptions = Arrays.asList( NoeElhaghiye.EMPTY,
                                                                NoeElhaghiye.FASKHAZTARAFEBIMEGAR,
                                                                NoeElhaghiye.FASKHAZTARAFEBIMEGOZAR);
        elhaghiyeBean.setNoeElhaghiyeOptions(elhaghieTypeOptions);
        elhaghiyeBean.getElhaghiye().setBimename(getSelectedBimename());
        setSelectedItemRow(-1);
    }

    @WebAction(toState =StateName.LIST_ARTIFACTDOC)
    public void darkhastMojavezRooyeBimename(){

        List<ArtifactDoc> artifactDocList = new ArrayList<>();

        List<SaghfeSodoorArtifactDoc> artifactDocs1 = saghfeSodoorArtifactDocRepository.findByBimename(getSelectedBimename());
        List<TakhfifeModiriatiArtifactDoc> artifactDocs2 = takhfifModiriatiArtifactDocRepository.findByBimename(getSelectedBimename());

        artifactDocList.addAll(artifactDocs1);
        artifactDocList.addAll(artifactDocs2);

        artifactDocListBean.setArtifactDocList(artifactDocList);
        setSelectedItemRow(-1);
    }

    public void search(){
        bimenames = bimenameService.searchBimename(searchBimename, BIMENAME_MAX_ROW);
    }

    public void printBimename()
    {
        try {
            ExternalContext externalContext = facesContext.getExternalContext();
            ServletContext servletContext = (ServletContext) externalContext.getContext();
            JasperPrint jasperPrint = printService.printBimename(getSelectedBimename(), servletContext);
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

    public void printAghsat()
    {
        try {
            printService.printAghsat(getSelectedBimename());
        } catch (JRException e) {
            e.printStackTrace();
            mainView.error(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            mainView.error(e.getMessage());
        }
    }


    public Bimename getSelectedBimename() {
        return selectedBimename;
    }

    public void setSelectedBimename(Bimename selectedBimename) {
        this.selectedBimename = selectedBimename;
        hideShowOperationButtons();
    }

    public int getSelectedItemRow() {
        return selectedItemRow;
    }

    public void setSelectedItemRow(int selectedItemRow) {
        this.selectedItemRow = selectedItemRow;
    }

    public boolean isShowSodoorButton() {
        return showSodoorButton;
    }

    public void setShowSodoorButton(boolean showSodoorButton) {
        this.showSodoorButton = showSodoorButton;
    }

    public boolean isShowKhesaratButton() {
        return showKhesaratButton;
    }

    public void setShowKhesaratButton(boolean showKhesaratButton) {
        this.showKhesaratButton = showKhesaratButton;
    }

    public boolean isShowElhaghiyeButton() {
        return showElhaghiyeButton;
    }

    public void setShowElhaghiyeButton(boolean showElhaghiyeButton) {
        this.showElhaghiyeButton = showElhaghiyeButton;
    }

    public boolean isShowChapButton() {
        return showChapButton;
    }

    public boolean isShowDarkhastMojavezButton() {
        return showDarkhastMojavezButton;
    }

    public void setShowDarkhastMojavezButton(boolean showDarkhastMojavezButton) {
        this.showDarkhastMojavezButton = showDarkhastMojavezButton;
    }

    public void setShowChapButton(boolean showChapButton) {
        this.showChapButton = showChapButton;
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

    public boolean isShowNamayeshButton() {
        return showNamayeshButton;
    }

    public void setShowNamayeshButton(boolean showNamayeshButton) {
        this.showNamayeshButton = showNamayeshButton;
    }

    public TabagheKhatar[] getTabagheKhatars() {
        return tabagheKhatars;
    }

    public void setTabagheKhatars(TabagheKhatar[] tabagheKhatars) {
        this.tabagheKhatars = tabagheKhatars;
    }
}
