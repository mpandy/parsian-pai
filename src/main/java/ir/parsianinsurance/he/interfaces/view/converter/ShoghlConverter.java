package ir.parsianinsurance.he.interfaces.view.converter;

import ir.parsianinsurance.he.domain.model.Shoghl;
import ir.parsianinsurance.he.infrastructure.repository.ShoghlRepository;
import ir.parsianinsurance.he.infrastructure.security.User;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by 8119 on 3/16/2017.
 */

@Named
public class ShoghlConverter implements Converter {

    @Inject
    ShoghlRepository shoghlRepository;

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String s) {
//        if(StringUtil.isEmpty(s))
//            return null;
//        try {return shoghlRepository.findOne(Long.valueOf(s));}
//        catch (NumberFormatException e) {
//            throw new ConverterException(new FacesMessage(String.format("%s is not a valid User ID", s)), e);
//        }

        try {
            return shoghlRepository.findOne(Long.parseLong(s));
        }
        catch (Exception e)
        {
            return null;
        }
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object o) {
        return ((Shoghl)o).getId()+"";
    }
}
