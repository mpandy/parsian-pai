package ir.parsianinsurance.he.infrastructure.producer;

import javax.enterprise.inject.Produces;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import java.util.ResourceBundle;

/**
 * Created by 8119 on 8/14/2017.
 */
public class BundleProducer {

    @Inject
    FacesContext facesContext;

    @Produces
    public ResourceBundle getBundle() {
        return facesContext.getApplication().getResourceBundle(facesContext, "msg");
    }

}
