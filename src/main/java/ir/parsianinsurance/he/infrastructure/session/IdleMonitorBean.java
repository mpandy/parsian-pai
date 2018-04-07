package ir.parsianinsurance.he.infrastructure.session;

/**
 * Created by 8119 on 10/5/2017.
 */
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean(name = "idleBean")
public class IdleMonitorBean {

    public void welcomeListener() {
        FacesContext.getCurrentInstance().addMessage(
                null,
                new FacesMessage(FacesMessage.SEVERITY_WARN, "Welcome Back",
                        "Continue your works."));

    }

    public void logoutListener() {
        FacesContext.getCurrentInstance().addMessage(
                null,
                new FacesMessage(FacesMessage.SEVERITY_WARN,
                        "You Have Logged Out!",
                        "Thank you for using abc Online Financial Services"));

        // invalidate session, and redirect to other pages
    }
}