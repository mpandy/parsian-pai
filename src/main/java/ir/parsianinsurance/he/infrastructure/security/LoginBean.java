package ir.parsianinsurance.he.infrastructure.security;

import ir.parsianinsurance.he.domain.service.IUserService;
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

}
