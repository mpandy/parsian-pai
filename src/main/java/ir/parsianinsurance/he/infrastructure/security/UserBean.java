package ir.parsianinsurance.he.infrastructure.security;

import ir.parsianinsurance.he.domain.model.enums.VahedType;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by Mohammad on 8/3/2017.
 */

@SessionScoped
@Named
public class UserBean implements Serializable{

    private User currentUser;
    private Set<String> roles;
    private Set<String> permissions;

    public Set<String> getRoles() {
        return roles;
    }

    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }

    public Set<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<String> permissions) {
        this.permissions = permissions;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    public boolean isSetad(){
        return currentUser.getVahed().getVahedType().equals(VahedType.SETAD);
    }
}
