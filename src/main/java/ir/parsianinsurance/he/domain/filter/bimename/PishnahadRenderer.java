package ir.parsianinsurance.he.domain.filter.bimename;

import ir.parsianinsurance.he.interfaces.view.bean.view.BimenameBean;
import ir.parsianinsurance.he.interfaces.view.bean.view.bimenameLoader.BimenameFilter;
import ir.parsianinsurance.he.interfaces.view.bean.view.bimenameLoader.HalateNamayesheBimename;

import javax.annotation.Priority;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import java.io.Serializable;

/**
 * Created by 8119 on 8/7/2017.
 */
@Interceptor
@Priority(value = 1)
@BimenameRender(halate = HalateNamayesheBimename.SABTE_PISHNAHAD)
public class PishnahadRenderer implements Serializable {

    @Inject
    BimenameBean bimenameBean;

    @AroundInvoke
    public Object filter(InvocationContext ctx) throws Exception {
        try{
            return ctx.proceed();
        }
        finally {

                bimenameBean.setFilter(
                    BimenameFilter.init()
                            .hideBimegozarHaghighiDetails()
                            .hideBimegozarHoghooghiDetails()
                            .hideBimeshodeDetails()
                            .hideCopyFromBimegozarButton()
                            .hidePanelBimename()
                            .hideVahedesodoor()
                            .hideShomarePishnahad());

        }
    }
}
