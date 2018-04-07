package ir.parsianinsurance.he.infrastructure.workflow;

import ir.parsianinsurance.he.domain.validator.DefaultHEValidator;
import ir.parsianinsurance.he.interfaces.view.uiflow.StateName;

import javax.enterprise.util.Nonbinding;
import javax.interceptor.InterceptorBinding;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by Mohammad on 7/6/2017.
 */
@InterceptorBinding
@Target({METHOD, TYPE})
@Retention(RUNTIME)
public @interface WebAction {
    @Nonbinding
    String successMessage() default "";
    @Nonbinding
    StateName toState() default StateName.LIST_BIMENAME;
    @Nonbinding
    Class[] validator() default DefaultHEValidator.class;

}
