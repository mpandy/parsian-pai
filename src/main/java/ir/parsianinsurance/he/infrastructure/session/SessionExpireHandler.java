package ir.parsianinsurance.he.infrastructure.session;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import java.io.IOException;

/**
 * Created by 8119 on 10/5/2017.
 */

public class SessionExpireHandler implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {

    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect("");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
