package ir.parsianinsurance.he.interfaces.view.bean.session;

import ir.parsianinsurance.he.domain.rule.IPropertyRules;
import ir.parsianinsurance.he.domain.service.IUserService;
import ir.parsianinsurance.he.infrastructure.repository.ShoghlRepository;
import ir.parsianinsurance.he.infrastructure.repository.VahedRepository;
import ir.parsianinsurance.he.infrastructure.security.UserBean;
import ir.parsianinsurance.he.interfaces.view.model.ChangePssword;
import ir.parsianinsurance.he.interfaces.view.uiflow.StateName;
import ir.parsianinsurance.he.interfaces.view.uiflow.UIFlow;
import ir.parsianinsurance.he.interfaces.view.uiflow.UIState;
import org.apache.shiro.authc.credential.DefaultPasswordService;
import org.primefaces.context.RequestContext;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;


@Named
@SessionScoped
public class MainView implements Serializable {

    @Inject
    UIFlow uiFlow;

    @Inject
    VahedRepository vahedRepository;

    @Inject
    ShoghlRepository shoghlRepository;

    @Inject
    IPropertyRules propertyRules;

    @Inject
    transient IUserService userService;

    @Inject
    UserBean userBean;

    @Inject
    transient ResourceBundle bundle;

    private int idleTimeBeforeLogout;
    private String formattedRoles;
    private String formattedPermissions;
    private ChangePssword changePssword;

    @Inject
    transient FacesContext facesContext;

    private UIState currentUIState;

    @PostConstruct
    public void init() {
        stateChange(StateName.LIST_BIMENAME);
        formatUserInfo();
        changePssword = new ChangePssword();
        if(userBean.getCurrentUser().getPassword().equals(propertyRules.getSinglesStringParam("defaultpassword")))
            warning("loftanpasswordetanraavazkonid");
    }

    private void formatUserInfo() {
        String translatedRoles = "";
        for(String nextRole : userBean.getRoles())
            translatedRoles+=(bundle.getString(nextRole)+" / ");
        setFormattedRoles(translatedRoles);

        String translatedPermissions = "";
        for(String nextPermission : userBean.getPermissions())
            translatedPermissions+=(bundle.getString(nextPermission)+" / ");
        setFormattedPermissions(translatedPermissions);
    }

    public void infoWithoutTranslate(String infoMessage){
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, infoMessage, "");
        facesContext.addMessage("", message);
        RequestContext.getCurrentInstance().update("msg");
    }

    public void info(String infoMessage){
        message(Arrays.asList(infoMessage), FacesMessage.SEVERITY_INFO);
    }

    public void warning(String warningMessage){
        message(Arrays.asList(warningMessage), FacesMessage.SEVERITY_WARN);
    }

    public void error(String errorMessage){
        message(Arrays.asList(errorMessage), FacesMessage.SEVERITY_ERROR);
    }

    public void errors(List<String> errorMessages){
       message(errorMessages, FacesMessage.SEVERITY_ERROR);
    }

    private void message(List<String> errorMessages, FacesMessage.Severity severity){
        for(String nextErrorMessage : errorMessages) {
                String nexttTranslatedMessage = bundle.getString(nextErrorMessage);
                FacesMessage message = new FacesMessage(severity, nexttTranslatedMessage, "");
                facesContext.addMessage("", message);
            }
        RequestContext.getCurrentInstance().update("msg");
    }

    public void stateChange(StateName state){
        UIState stv = uiFlow.next(state);
        setCurrentUIState(stv);
        RequestContext.getCurrentInstance().update("mainpanel");
    }

    public boolean inAnyOf(ArrayList<StateName> stateNames){
        return stateNames.contains(currentUIState.getState());
    }

    public boolean notInAnyOf(ArrayList<StateName> stateNames){
        return !stateNames.contains(currentUIState.getState());
    }

    private void setCurrentUIState(UIState currentUIState) {
        this.currentUIState = currentUIState;
    }

    public UIState getCurrentUIState() {
        return currentUIState;
    }

    public String userRealName() {
        return userBean.getCurrentUser().getRealName();
    }

    public String getFormattedRoles() {
        return formattedRoles;
    }

    public void setFormattedRoles(String formattedRoles) {
        this.formattedRoles = formattedRoles;
    }

    public ChangePssword getChangePssword() {
        return changePssword;
    }

    public void setChangePssword(ChangePssword changePssword) {
        this.changePssword = changePssword;
    }

    public String getFormattedPermissions() {
        return formattedPermissions;
    }

    public int getIdleTimeBeforeLogout() {
        int dah_daghighie_be_millisecond = 10 * 60 * 1000;
        return dah_daghighie_be_millisecond;
    }

    public void setFormattedPermissions(String formattedPermissions) {
        this.formattedPermissions = formattedPermissions;
    }

    public void doChangePassword(){

        List<String> errorMessaes = userService.validateChangePassword(userBean.getCurrentUser(), getChangePssword());
        if(errorMessaes.isEmpty()) {
            userService.changePassword(userBean.getCurrentUser(),
                    getChangePssword().getNewPassword());
            RequestContext context = RequestContext.getCurrentInstance();
            context.execute("PF('changepasswordDialog').hide()");
        }
        else
            errors(errorMessaes);
    }

    public static void main(String[] args) {
        DefaultPasswordService x = new DefaultPasswordService();
        System.out.println(x.encryptPassword("1234"));
    }
}