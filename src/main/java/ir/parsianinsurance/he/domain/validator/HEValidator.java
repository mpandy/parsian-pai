package ir.parsianinsurance.he.domain.validator;

import javax.interceptor.InvocationContext;

/**
 * Created by Mohammad on 9/23/2017.
 */
public abstract class HEValidator {
    public abstract void validate(InvocationContext context) throws Exception;
}
