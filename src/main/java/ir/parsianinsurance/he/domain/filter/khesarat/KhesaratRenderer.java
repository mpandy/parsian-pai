package ir.parsianinsurance.he.domain.filter.khesarat;

import ir.parsianinsurance.he.domain.model.enums.VaziateParvandeKhesarat;
import ir.parsianinsurance.he.interfaces.view.bean.view.KhesaratBean;
import ir.parsianinsurance.he.interfaces.view.bean.view.khesaratLoader.KhesaratFilter;

import javax.annotation.Priority;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import java.io.Serializable;

/**
 * Created by 8119 on 11/5/2017.
 */

@Interceptor
@Priority(value = 1)
@KhesaratRender
public class KhesaratRenderer implements Serializable {

    @Inject
    KhesaratBean khesaratBean;

    @AroundInvoke
    public Object filter(InvocationContext ctx) throws Exception {
        try {
            return ctx.proceed();
        } finally {

            KhesaratFilter filter = KhesaratFilter.init();
            VaziateParvandeKhesarat vaziateParvande = khesaratBean.getKhesarat().getVaziateparvande();

            switch (vaziateParvande)
            {
                case ELAAM_BE_MAALI:
                    filter.disableTarikhhadese();
                    break;

            }

            khesaratBean.setFilter(filter);

        }
    }
}