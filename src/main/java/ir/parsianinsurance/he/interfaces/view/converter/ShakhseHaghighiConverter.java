package ir.parsianinsurance.he.interfaces.view.converter;

import ir.parsianinsurance.he.domain.model.ShakhseHaghighi;
import ir.parsianinsurance.he.infrastructure.repository.ShakhseHaghighiRepository;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by 8119 on 10/7/2017.
 */

@Named
public class ShakhseHaghighiConverter implements Converter {

    @Inject
    ShakhseHaghighiRepository shakhseHaghighiRepository;

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String s) {

        try {
            return shakhseHaghighiRepository.findOne(Long.parseLong(s));
        }
        catch (Exception e)
        {
            return null;
        }
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object o) {
        return ((ShakhseHaghighi)o).getId()+"";
    }
}
