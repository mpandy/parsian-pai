package ir.parsianinsurance.he.interfaces.view.converter;

import ir.parsianinsurance.he.domain.model.Vahed;
import ir.parsianinsurance.he.infrastructure.repository.VahedRepository;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by 8119 on 8/13/2017.
 */

@Named
public class VahedConverter implements Converter {
    @Inject
    VahedRepository vahedRepository;

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String s) {

        try {
            return vahedRepository.findOne(Long.parseLong(s));
        }
        catch (Exception e)
        {
            return null;
        }
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object o) {
        return ((Vahed)o).getId()+"";
    }
}
