package ir.parsianinsurance.he.infrastructure;

import java.util.Arrays;
import java.util.List;

/**
 * Created by 8119 on 10/4/2017.
 */
public class HeException extends Exception{

    private List<String> errorMessages;

    public HeException(List<String> errorMessages) {
        this.errorMessages = errorMessages;
    }

    public HeException(String errorMessage) {
        this.errorMessages = Arrays.asList(errorMessage);
    }


    public List<String> getErrorMessages() {
        return errorMessages;
    }
}
