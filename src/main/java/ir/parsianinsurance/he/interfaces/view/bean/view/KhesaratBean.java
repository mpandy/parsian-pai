package ir.parsianinsurance.he.interfaces.view.bean.view;

import ir.parsianinsurance.he.domain.facade.IApplicationService;
import ir.parsianinsurance.he.domain.model.*;
import ir.parsianinsurance.he.domain.model.enums.NoeHadese;
import ir.parsianinsurance.he.domain.model.enums.VaziateKhesaratCase;
import ir.parsianinsurance.he.domain.model.enums.VaziateParvandeKhesarat;
import ir.parsianinsurance.he.domain.service.IKhesaratService;
import ir.parsianinsurance.he.domain.validator.SabteKhesaratValidator;
import ir.parsianinsurance.he.infrastructure.HeException;
import ir.parsianinsurance.he.infrastructure.security.UserBean;
import ir.parsianinsurance.he.infrastructure.service.IPrintService;
import ir.parsianinsurance.he.infrastructure.util.StringUtil;
import ir.parsianinsurance.he.infrastructure.workflow.WebAction;
import ir.parsianinsurance.he.interfaces.view.bean.session.MainView;
import ir.parsianinsurance.he.interfaces.view.bean.view.khesaratLoader.KhesaratFilter;
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
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


/**
 * Created by 8119 on 6/29/2017.
 */

@Named
@ViewScoped
public class KhesaratBean implements Serializable{

    @Inject
    IApplicationService heService;

    @Inject
    UserBean userBean;

    @Inject
    MainView mainView;

    @Inject
    IKhesaratService khesaratService;

    @Inject
    FacesContext facesContext;

    @Inject
    IPrintService iPrintService;

    private Khesarat khesarat;
    private KhesaratCase newkhesaratcase;
    private HavaleKhesarat newHavaleKhesarat;
    private boolean KhesaratDialogVisible;
    private boolean khesaratToBeEdited;
    private boolean HavaleKhesaratDialogVisible;
    private boolean HavalekhesaratToBeEdited;
    private List<VaziateParvandeKhesarat> validNextVaziats;
    private KhesaratFilter filter;

    @PostConstruct
    public void init(){
        khesarat = KhesaratFactory.newKhesaratForSodoor();
        khesarat.setVahed(userBean.getCurrentUser().getVahed());
        newkhesaratcase = new KhesaratCase();
        newHavaleKhesarat = new HavaleKhesarat();
    }

    public void newKhesaratCaseInit(){
        newkhesaratcase = KhesaratCaseFactory.newKhesaratCaseForAddToKhesarat();
        newkhesaratcase.setName_khesarat_dide(khesarat  .getBimename()
                                                        .getPishnahadeFaal()
                                                        .getBimeShode()
                                                        .getShakhseHaghighi()
                                                        .toString());
        KhesaratDialogVisible = true;
        khesaratToBeEdited = false;
    }

    public  void newHavaleKhesaratInit(){
        newHavaleKhesarat = HavaleKhesaratFactory.newHavaleKhesaratForAddToKhesarat();
        newHavaleKhesarat.setKhesarat(khesarat);
        HavaleKhesaratDialogVisible = true;
        HavalekhesaratToBeEdited = false;
    }

    public void addOrEditKhesaratcases(){

        if (validateKhesaratCase(newkhesaratcase)) {

            long sarmayePooshesh = newkhesaratcase.getSaghfe_poosheshe_bimeshode();
            long taeedShode = newkhesaratcase.getMablagh_khesarate_taeedshode() ;
            long mazadBarSaghf = 0;

            if(taeedShode > sarmayePooshesh)
                mazadBarSaghf = taeedShode - sarmayePooshesh;

            newkhesaratcase.setMablagh_mazad_bar_saghf(mazadBarSaghf);
            newkhesaratcase.setKhesarat_ghabl_pardakht(newkhesaratcase.getMablagh_khesarate_taeedshode());
            newkhesaratcase.setKarshenase_khesarat(userBean.getCurrentUser());
            newkhesaratcase.setKhesarat(khesarat);

            khesarat.getKhesaratCases().add(newkhesaratcase);
            KhesaratDialogVisible = false;
        }
    }

    public boolean validateKhesaratCase(KhesaratCase khesaratCase) {

        List<String> errorMessges = new ArrayList<>();

        if (!khesarat.getBimename().getPishnahadeFaal().hasTaahod(khesaratCase.getNoehadese().getTaahod()))
            errorMessges.add("bimenamefaghedetaahodemotenazerbahadeseast");

        if (khesaratCase.getMablagh_khesarate_elamshode() == null)
            errorMessges.add("mablagheElamshodeRaRavaredNamaeed");

        if (khesaratCase.getMablagh_khesarate_taeedshode() == null)
            errorMessges.add("mablagheTaeedshodeRaRavaredNamaeed");

        if (khesaratCase.getNoehadese().equals(NoeHadese.EMPTY))
            errorMessges.add("NoeHadeseRaVaredNamaeed");

        if (khesaratCase.getVaziat().equals(VaziateKhesaratCase.EMPTY))
            errorMessges.add("vaziateKhesaratRaVaredNamaeed");

        if(!errorMessges.isEmpty())
            mainView.errors(errorMessges);

        return errorMessges.size() == 0;
    }

    public void updateSarmayeByNoeHadese(){
        NoeHadese hadese = newkhesaratcase.getNoehadese();
        Long sarmayePoshesh = khesarat.getBimename().getPishnahadeFaal().getSarmayePooshesh(hadese.getTaahod());
        newkhesaratcase.setSaghfe_poosheshe_bimeshode(sarmayePoshesh);
    }

    public void closeDialogKhesarat(){
        KhesaratDialogVisible = false;
    }

    public void addOrEditHavaleKhesarat(){

        if(validateHavaleKhesarat(newHavaleKhesarat))
        {
            khesarat.getHavaleKhesarats().add(newHavaleKhesarat);
            HavaleKhesaratDialogVisible = false;
        }

    }

    public void closeDialogHavaleKhesarat(){
        HavaleKhesaratDialogVisible = false;
    }

    public void editKhesaratCase(KhesaratCase khesaratCase){
        setNewkhesaratcase(khesaratCase);
        khesaratToBeEdited = true;
        KhesaratDialogVisible = true;
    }

    public void editHavaleKhesarat(HavaleKhesarat havaleKhesarat){
        setNewHavaleKhesarat(havaleKhesarat);
        HavalekhesaratToBeEdited = true;
        HavaleKhesaratDialogVisible = true;
    }

    public boolean havaleIsNotSentToSanam(HavaleKhesarat havaleKhesarat){
        return havaleKhesarat.getBeSanamRafte() == null;
    }

    public void removeKhesaratCase(KhesaratCase khesaratCase){
        khesaratCase.setDeleted(true);
    }

    public void removeHavaleKhesarat(HavaleKhesarat havaleKhesarat){
        havaleKhesarat.setDeleted(true);
    }

    @WebAction(toState = StateName.LIST_KHESARAT)
    public void enserafazkhesarat(){
        init();
    }

    @WebAction(toState = StateName.LIST_KHESARAT)
    public void bazagasht(){
        init();
    }

    @WebAction( toState = StateName.LIST_KHESARAT,
                validator = SabteKhesaratValidator.class)
    public void sabtkhesarat() throws HeException {

        if (!khesaratService.isKhesaratAble(khesarat))
            throw new HeException("bimenameghablAztarikhvoghooHadeseFaskhShodeAst");

        heService.sabteKhesarat(khesarat);
        init();
    }

    public void printHavaleKhesarat(HavaleKhesarat havaleKhesarat)
    {
        try {
            ExternalContext externalContext = facesContext.getExternalContext();
            ServletContext servletContext = (ServletContext) externalContext.getContext();
            JasperPrint jasperPrint = iPrintService.printHavalekhesarat(havaleKhesarat, servletContext);
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

    public boolean validateHavaleKhesarat(HavaleKhesarat havaleKhesarat) {

        List<String> errorMessges = new ArrayList<>();

        if (!shabaIsOk(havaleKhesarat.getEttelaateShaba()))
            errorMessges.add("shabaisnotOk");

        if (!StringUtil.isValidIranianNationalCode(havaleKhesarat.getKodemelli_daryaft_konande()))
            errorMessges.add("KodeMeliDaryaftKonandeMotabarNemibashad");

        if(!errorMessges.isEmpty())
            mainView.errors(errorMessges);

        return errorMessges.size() == 0;
    }


    @WebAction(toState = StateName.LIST_KHESARAT)
    public void sabtHavalekhesarat(){
        heService.sabteKhesaratHavales(khesarat);
    }

    public Khesarat getKhesarat() {
        return khesarat;
    }

    public void setKhesarat(Khesarat khesarat) {
        this.khesarat = khesarat;
    }

    public KhesaratCase getNewkhesaratcase() {
        return newkhesaratcase;
    }

    public void setNewkhesaratcase(KhesaratCase newkhesaratcase) {
        this.newkhesaratcase = newkhesaratcase;
    }

    public boolean isKhesaratDialogVisible() {
        return KhesaratDialogVisible;
    }

    public void setKhesaratDialogVisible(boolean khesaratDialogVisible) {
        KhesaratDialogVisible = khesaratDialogVisible;
    }

    public boolean isKhesaratToBeEdited() {
        return khesaratToBeEdited;
    }

    public void setKhesaratToBeEdited(boolean khesaratToBeEdited) {
        this.khesaratToBeEdited = khesaratToBeEdited;
    }

    public HavaleKhesarat getNewHavaleKhesarat() {
        return newHavaleKhesarat;
    }

    public void setNewHavaleKhesarat(HavaleKhesarat newHavaleKhesarat) {
        this.newHavaleKhesarat = newHavaleKhesarat;
    }

    public boolean isHavaleKhesaratDialogVisible() {
        return HavaleKhesaratDialogVisible;
    }

    public void setHavaleKhesaratDialogVisible(boolean havaleKhesaratDialogVisible) {
        HavaleKhesaratDialogVisible = havaleKhesaratDialogVisible;
    }

    public boolean isHavalekhesaratToBeEdited() {
        return HavalekhesaratToBeEdited;
    }

    public void setHavalekhesaratToBeEdited(boolean havalekhesaratToBeEdited) {
        HavalekhesaratToBeEdited = havalekhesaratToBeEdited;
    }

    public List<VaziateParvandeKhesarat> getValidNextVaziats() {
        return validNextVaziats;
    }

    public void setValidNextVaziats(List<VaziateParvandeKhesarat> validNextVaziats) {
        this.validNextVaziats = validNextVaziats;
    }

    public KhesaratFilter getFilter() {
        return filter;
    }

    public void setFilter(KhesaratFilter filter) {
        this.filter = filter;
    }

    public boolean shabaIsOk(String shaba) {
        shaba = shaba.trim();
        if (shaba.length() != 24) {
            return false;
        } else {
            try {
                BigInteger toCheck = new BigInteger(shaba.substring(2) + "1827" + shaba.substring(0, 2));
                if (toCheck.mod(new BigInteger("97")).intValue() != 1) {
                    return false;
                }
            }
            catch (Exception e){
                return false;
            }
        }
        return true;
    }
}
