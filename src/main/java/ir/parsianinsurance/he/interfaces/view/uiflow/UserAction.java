package ir.parsianinsurance.he.interfaces.view.uiflow;

/**
 * Created by Mohammad on 6/29/2017.
 */
public class UserAction {

    private StateName state;
    private String success_message;
    private String error_message;

    public static UserAction to(StateName state){
        UserAction userAction = new UserAction();
        userAction.state = state;
        return userAction;
    }

    public UserAction successMessage(String message){
        this.success_message = message;
        return this;
    }

    public UserAction errorMessage(String error){
        this.error_message = error;
        return this;
    }

    public StateName getState() {
        return state;
    }

    public String getSuccess_message() {
        return success_message;
    }

    public String getError_message() {
        return error_message;
    }

}
