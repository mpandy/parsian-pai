package ir.parsianinsurance.he.interfaces.view.converter;

import ir.parsianinsurance.he.domain.model.BimeGozar;
import ir.parsianinsurance.he.infrastructure.repository.BimegozarRepository;
import ir.parsianinsurance.he.infrastructure.util.StringUtil;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by 8119 on 4/17/2017.
 */

@Named
public class BimeGozarConverter  implements Converter {

    @Inject
    BimegozarRepository bimegozarRepository;

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String s) {
        if(StringUtil.isEmpty(s) || s.equals("null"))
            return null;
        try {return bimegozarRepository.findOne(Long.valueOf(s));}
        catch (NumberFormatException e) {
            throw new ConverterException(new FacesMessage(String.format("%s is not a valid User ID", s)), e);
        }
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object o) {
        if(o == null )
            return "";
        if(o instanceof BimeGozar)
        {
            return String.valueOf(((BimeGozar)o).getId());
        }
        else
            throw new ConverterException(new FacesMessage(String.format("%s is not a valid User", o)));
    }
}
