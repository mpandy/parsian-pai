package ir.parsianinsurance.he.infrastructure.producer;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.faces.context.FacesContext;

/**
 * Created by Mohammad on 6/29/2017.
 */
class FacesContextProducer {
    @Produces
    @RequestScoped
    FacesContext getFacesContext() {
        return FacesContext.getCurrentInstance();
    }

}