package ir.parsianinsurance.he.infrastructure.security;

import ir.parsianinsurance.he.domain.service.IUserService;
import ir.parsianinsurance.he.infrastructure.service.ISMSService;
import ir.parsianinsurance.he.infrastructure.util.RandomStringUtil;
import ir.parsianinsurance.he.interfaces.view.bean.session.MainView;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.web.util.SavedRequest;
import org.apache.shiro.web.util.WebUtils;

import javax.enterprise.inject.Model;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;
import java.io.IOException;
import java.io.Serializable;
import java.util.ResourceBundle;

/**
 * Created by Mohammad on 5/29/2017.
 */

@Model
public class LoginBean implements Serializable {

    @Inject
    FacesContext facesContext;

    @Inject
    transient ResourceBundle bundle;

    @Inject
    IUserService userService;

    @Inject
    ISMSService smsService;

    private String username;
    private String password;
    private boolean remember;

    public String getUsername() {return username;}
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {this.password = password;}
    public boolean isRemember() {
        return remember;
    }
    public void setRemember(boolean remember) {
        this.remember = remember;
    }

    private static final String HOME_URL = "account/main.xhtml";
    private static final String LOGIN_URL = "";

    public void login() throws IOException {

        try {
            userService.login(getUsername(), getPassword(), isRemember());
            HttpServletRequest servletRequest = (HttpServletRequest) facesContext.getExternalContext().getRequest();
            SavedRequest savedRequest = WebUtils.getAndClearSavedRequest(servletRequest);
            facesContext.getExternalContext().redirect(savedRequest != null ? savedRequest.getRequestUrl() : HOME_URL);
        }
        catch (AuthenticationException e) {
            String errorMessage = "loginfailed";
            if(e instanceof UnknownAccountException)
                errorMessage = "nouserfound";
            if(e instanceof IncorrectCredentialsException)
                errorMessage = "passwordwrong";

            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, bundle.getString(errorMessage), "");
            facesContext.addMessage(null, message);
        }
    }

    public void logout() throws IOException {
        SecurityUtils.getSubject().logout();
        facesContext.getExternalContext().invalidateSession();
        facesContext.getExternalContext().redirect(LOGIN_URL);
    }

    @Transactional
    public void sendSMS() {

        User user = null;
        FacesMessage.Severity severity;
        String username = getUsername();
        String message;
        RandomStringUtil randomStringUtil = new RandomStringUtil();
        try {
            if (username == null || username.trim().isEmpty()) {
                message = "enterusername";
                severity = FacesMessage.SEVERITY_ERROR;
            }
            else {
                user = userService.findByUsername(username);
                if(user == null){
                    message = "nouserfound";
                    severity = FacesMessage.SEVERITY_ERROR;
                }
                else {
                    String mobile = user.getMobile();
                    if (mobile == null || mobile.trim().isEmpty()) {
                        message = "mobileforusernotavailable";
                        severity = FacesMessage.SEVERITY_ERROR;
                    }
                    else {
                        String newPassword = randomStringUtil.nextString();
                        userService.changePassword(user, newPassword);
                        smsService.sendSMS(user, mobile, bundle.getString("forgetpassSMSBody")+ " " +newPassword);
                        message = "sendsmsok";
                        severity = FacesMessage.SEVERITY_INFO;
                    }
                }

            }
        }
        catch (Exception e) {
            message = "sendsmserror";
            severity = FacesMessage.SEVERITY_ERROR;

        }
        facesContext.addMessage(null, new FacesMessage(severity, bundle.getString(message), ""));

    }


}
