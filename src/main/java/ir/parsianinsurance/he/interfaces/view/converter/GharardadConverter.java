package ir.parsianinsurance.he.interfaces.view.converter;

import ir.parsianinsurance.he.domain.model.Gharardad;
import ir.parsianinsurance.he.infrastructure.repository.GharardadRepository;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by Mohammad on 7/29/2017.
 */

@Named
public class GharardadConverter implements Converter {

    @Inject
    GharardadRepository gharardadRepository;

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String s) {

        try {
            return gharardadRepository.findOne(Long.parseLong(s));
        }
        catch (Exception e)
        {
            return null;
        }
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object o) {
        return ((Gharardad)o).getId()+"";
    }
}
