package ir.parsianinsurance.he.interfaces.view.converter;

import ir.parsianinsurance.he.domain.model.BimeShode;
import ir.parsianinsurance.he.infrastructure.repository.BimeshodeRepository;
import ir.parsianinsurance.he.infrastructure.util.StringUtil;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by 8119 on 3/26/2017.
 */

@Named
public class BimeShodeConverter implements Converter {

    @Inject
    BimeshodeRepository bimeshodeRepository;

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String s) {
        if(StringUtil.isEmpty(s) || s.equals("null"))
            return null;
        try {return bimeshodeRepository.findOne(Long.valueOf(s));}
        catch (NumberFormatException e) {
            throw new ConverterException(new FacesMessage(String.format("%s is not a valid User ID", s)), e);
        }
    }


    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object o) {
        if(o == null )
            return "";
        if(o instanceof BimeShode)
        {
            return String.valueOf(((BimeShode)o).getId());
        }
        else
            throw new ConverterException(new FacesMessage(String.format("%s is not a valid User", o)));
    }
}
