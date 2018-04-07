package ir.parsianinsurance.he.domain.filter.bimename;

import ir.parsianinsurance.he.domain.model.enums.NoeShakhs;
import ir.parsianinsurance.he.interfaces.view.bean.view.BimenameBean;
import ir.parsianinsurance.he.interfaces.view.bean.view.BimenameListBean;
import ir.parsianinsurance.he.interfaces.view.bean.view.bimenameLoader.BimenameFilter;
import ir.parsianinsurance.he.interfaces.view.bean.view.bimenameLoader.HalateNamayesheBimename;

import javax.annotation.Priority;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import java.io.Serializable;

/**
 * Created by Mohammad on 6/25/2017.
 */

@Interceptor
@Priority(value = 1)
@BimenameRender(halate = HalateNamayesheBimename.SODOORE_BIMENAME)
public class SodoorRenderer implements Serializable {

    @Inject
    BimenameListBean bimenameListBean;

    @Inject
    BimenameBean bimenameBean;

    @AroundInvoke
    public Object filter(InvocationContext ctx) throws Exception {
        try{
            return ctx.proceed();
        }
        finally {

            NoeShakhs noe_shakhs = bimenameListBean.getSelectedBimename().getPishnahadeFaal().getNoeBimegozar();

            BimenameFilter bimenameFilter = BimenameFilter.init();

            if(noe_shakhs.equals(NoeShakhs.HAGHIGHI))
                bimenameFilter.hideBimegozarHoghooghiDetails();
            if(noe_shakhs.equals(NoeShakhs.HOGHOOGHI))
                bimenameFilter.hideBimegozarHaghighiDetails();

            bimenameFilter  .hideShomareBimename()
                            .hideTarikhsodoor();

            bimenameBean.setFilter(bimenameFilter);


        }
    }
}
