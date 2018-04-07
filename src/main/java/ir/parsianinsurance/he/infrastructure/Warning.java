package ir.parsianinsurance.he.infrastructure;


/**
 * Created by 8119 on 11/18/2017.
 */
public class Warning {

    private String message;

    public static Warning warn(String message)
    {
        return new Warning(message);
    }

    public String getMessage() {
        return message;
    }

    public Warning(String message) {
        this.message = message;
    }
}
