package ir.parsianinsurance.he.interfaces.view.converter;

import ir.parsianinsurance.he.infrastructure.repository.UserRepository;
import ir.parsianinsurance.he.infrastructure.security.User;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by 8119 on 8/1/2017.
 */
@Named
public class EmzakonandeConverter implements Converter {
    @Inject
    UserRepository emzakonandeRepository;

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String s) {

        try {
            return emzakonandeRepository.findOne(Long.parseLong(s));
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
