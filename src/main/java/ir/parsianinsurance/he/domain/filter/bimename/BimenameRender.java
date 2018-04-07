package ir.parsianinsurance.he.domain.filter.bimename;

import ir.parsianinsurance.he.interfaces.view.bean.view.bimenameLoader.HalateNamayesheBimename;

import javax.interceptor.InterceptorBinding;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by Mohammad on 6/25/2017.
 */

@InterceptorBinding
@Target({METHOD, TYPE})
@Retention(RUNTIME)
public @interface BimenameRender {
    HalateNamayesheBimename halate();
}
