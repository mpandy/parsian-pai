package ir.parsianinsurance.he.infrastructure.workflow;

import ir.parsianinsurance.he.domain.validator.DefaultHEValidator;
import ir.parsianinsurance.he.domain.validator.HEValidator;
import ir.parsianinsurance.he.infrastructure.HeException;
import ir.parsianinsurance.he.infrastructure.Warning;
import ir.parsianinsurance.he.interfaces.view.bean.session.MainView;
import ir.parsianinsurance.he.interfaces.view.bean.view.*;
import ir.parsianinsurance.he.interfaces.view.uiflow.StateName;

import javax.annotation.Priority;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import java.io.Serializable;
import java.util.Optional;
import java.util.ResourceBundle;

/**
 * Created by Mohammad on 7/6/2017.
 */

@Interceptor
@Priority(value = 1)
@WebAction
public class WebActionInterceptor implements Serializable {

    @Inject
    MainView mainView;

    @Inject
    BimenameBean bimenameBean;

    @Inject
    BimenameListBean bimenameListBean;

    @Inject
    ElhaghiyeBean elhaghiyeBean;

    @Inject
    ElhaghiyeListBean elhaghiyeListBean;

    @Inject
    KhesaratBean khesaratBeen;

    @Inject
    KhesaratListBean khesaratListBean;

    @Inject
    ResourceBundle bundle;

    @AroundInvoke
    public Object filter(InvocationContext ctx) throws Exception {

        String successMessage = ctx.getMethod().getAnnotation(WebAction.class).successMessage();
        StateName toState = ctx.getMethod().getAnnotation(WebAction.class).toState();
        Class[] validator = ctx.getMethod().getAnnotation(WebAction.class).validator();

        try{

            for(Class nextValidator : validator)
                if(!nextValidator.isAssignableFrom(DefaultHEValidator.class))
                    ((HEValidator) nextValidator.newInstance()).validate(ctx);

            Object returnMethod = ctx.proceed();

            if (toState.equals(StateName.LIST_BIMENAME))
                bimenameListBean.init();

            if (toState.equals(StateName.LIST_ELHAGHIYE)){
                bimenameBean.init();
                elhaghiyeListBean.init();
            }

            if (toState.equals(StateName.LIST_KHESARAT))
                khesaratListBean.init();

            mainView.stateChange(toState);

            boolean warningHappened = warningHappened(returnMethod);

            if(!successMessage.isEmpty() && !warningHappened)
                mainView.info(successMessage);

            return returnMethod;
        }
        catch (HeException e)
        {
            mainView.errors(e.getErrorMessages());
            return null;
        }

    }

    private boolean warningHappened(Object returnMethod) {

        if(returnMethod != null && Optional.of(Warning.class).getClass().isAssignableFrom(returnMethod.getClass()))
        {
            Optional<Warning> possibleWarnings = ((Optional<Warning>)returnMethod);

            return  possibleWarnings.isPresent() &&
                    !possibleWarnings.get().getMessage().isEmpty();
        }
        else
            return false;

    }

}
