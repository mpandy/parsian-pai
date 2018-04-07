package ir.parsianinsurance.he.interfaces.view.model;

/**
 * Created by 8119 on 11/21/2017.
 */
public class ChangePssword {

    private String currentPassword;
    private String newPassword;
    private String repaeadNewPassword;

    public String getCurrentPassword() {
        return currentPassword;
    }

    public void setCurrentPassword(String currentPassword) {
        this.currentPassword = currentPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getRepaeadNewPassword() {
        return repaeadNewPassword;
    }

    public void setRepaeadNewPassword(String repaeadNewPassword) {
        this.repaeadNewPassword = repaeadNewPassword;
    }

}
