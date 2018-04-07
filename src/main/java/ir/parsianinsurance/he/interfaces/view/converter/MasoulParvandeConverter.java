package ir.parsianinsurance.he.interfaces.view.converter;

import ir.parsianinsurance.he.infrastructure.repository.UserRepository;
import ir.parsianinsurance.he.infrastructure.security.User;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by Mohammad on 10/22/2017.
 */

@Named
public class MasoulParvandeConverter implements Converter {

    @Inject
    UserRepository masoulParvandeRepository;

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String s) {

        try {
            return masoulParvandeRepository.findOne(Long.parseLong(s));
        }
        catch (Exception e)
        {
            return null;
        }
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object o) {
        return ((User)o).getId()+"";
    }
}
