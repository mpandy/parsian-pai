package ir.parsianinsurance.he.interfaces.view.bean.view;

import ir.parsianinsurance.he.domain.rule.IPropertyRules;
import ir.parsianinsurance.he.domain.service.IUserService;
import ir.parsianinsurance.he.infrastructure.security.*;
import ir.parsianinsurance.he.interfaces.view.bean.session.MainView;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Mohammad on 8/7/2017.
 */

@Named
@ViewScoped
public class UserAdminPanelBean implements Serializable{

    @Inject
    IUserService userService;

    @Inject
    MainView mainView;

    @Inject
    IPropertyRules propertyRules;

    @Inject
    transient ResourceBundle bundle;

    private User newKarbar;
    private boolean karbarDialogVisible;
    private boolean showNewPasswordCheckBox;
    private User searchUser;
    private String password;
    private List<User> userList;
    private List<Role> selectedRoles;

    @PostConstruct
    public void init(){
        searchUser = UserFactory.newSearchUser();
        search();
        newKarbar = UserFactory.newFaalUser();
    }

    public void closeDialogKarbar(){
        karbarDialogVisible = false;
    }

    public  void newKarbar(){
        newKarbar = UserFactory.newFaalUser();
        karbarDialogVisible = true;
        setShowNewPasswordCheckBox(false);
        setPassword("");
    }

    public void editKarbar(User user){
        this.newKarbar = user;
        setSelectedRoles(RoleFactory.roleListFromString(user.getRoles()));
        setShowNewPasswordCheckBox(true);
        setPassword("");
        karbarDialogVisible = true;
    }

    public String translateRoles(String roles){
        String output = "";
        List<Role> rolesList = RoleFactory.roleListFromString(roles);
        for(Role role : rolesList)
            output += bundle.getString(role.name())+" / ";
        return output.trim();
    }

    public void removeKarbar(User user){
        userService.removeUser(user);
    }

    public void search(){
        userList = userService.searchUser(searchUser.getUsername());
    }

    public void addOrEditKarbar() {

        newKarbar.setRoles(getSelectedRoles().toString());
        userService.buildUser(newKarbar);

        if (newKarbar.getPassword() == null)
            newKarbar.setPassword(propertyRules.getSinglesStringParam("defaultpassword"));

        if(validate(newKarbar)) {
            userService.saveUser(newKarbar);
            karbarDialogVisible = false;
            selectedRoles.clear();
            init();
        }



    }

    private boolean validate(User newKarbar) {

        boolean valid = true;
        List<String> errorMessages = new ArrayList<>();

        if(!newKarbar.getRoles().contains(Role.BAZARYAB.name()) && newKarbar.getVahed() == null) {
            mainView.error("entekhabevahedelzamist");
            return false;
        }

        if(userService.hasRole(newKarbar, Role.KARSHENAS_SODOOR) &&
           newKarbar.getVahed().getVahedeSodoor() == null) {

            valid = false;
            errorMessages.add("ageKarshenaseSodooriBayadVahedsodoorDashteBaashi");
        }

        if(!valid)
            mainView.errors(errorMessages);

        return valid;
    }

    public List<Role> autocompleteRole(String name)
    {

        return Arrays.stream(Role.values())
                .filter(gr -> gr.name().toLowerCase().contains(name.trim().toLowerCase()))
                .collect(Collectors.toList());
    }

    public boolean isKarbarDialogVisible() {
        return karbarDialogVisible;
    }

    public void setKarbarDialogVisible(boolean karbarDialogVisible) {
        this.karbarDialogVisible = karbarDialogVisible;
    }


    public boolean isShowNewPasswordCheckBox() {
        return showNewPasswordCheckBox;
    }

    public void setShowNewPasswordCheckBox(boolean showNewPasswordCheckBox) {
        this.showNewPasswordCheckBox = showNewPasswordCheckBox;
    }

    public User getNewKarbar() {
        return newKarbar;
    }

    public Role[] getRoles() {return Role.values();}

    public VaziateFaaliat[] getUserTypes() {return VaziateFaaliat.values();}

    public User getSearchUser() {
        return searchUser;
    }

    public void setSearchUser(User searchUser) {
        this.searchUser = searchUser;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public List<Role> getSelectedRoles() {
        return selectedRoles;
    }

    public void setSelectedRoles(List<Role> selectedRoles) {
        this.selectedRoles = selectedRoles;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<User> undeletedUsers(){
        if(userList.isEmpty())
            return Collections.emptySet();

        return  userList.stream()
                .filter(user -> user.getDeleted() == null )
                .collect(Collectors.toSet());
    }
}
