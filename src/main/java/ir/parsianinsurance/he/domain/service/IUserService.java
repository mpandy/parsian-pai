package ir.parsianinsurance.he.domain.service;


import ir.parsianinsurance.he.infrastructure.security.Role;
import ir.parsianinsurance.he.infrastructure.security.User;
import ir.parsianinsurance.he.interfaces.view.model.ChangePssword;

import java.util.List;
import java.util.Set;

/**
 * Created by Mohammad on 8/3/2017.
 */
public interface IUserService {

    void storeShiroUserToSession(User user);
    Set<String> shiroUserRolesString();
    Set<String> shiroUserPermissionsString();
    User buildUser(User user);
    boolean hasRole(User user, Role role);
    User findByUsername(String username);
    User defaultBazaryab();
    List<User> autocompleteEmzakonande(String name);
    List<User> autocompleteBazaryab(String name);
    void saveUser(User user);
    void removeUser(User user);
    List<User> searchUser(String username);
    void changePassword(User user, String newPassword);
    List<String> validateChangePassword(User user, ChangePssword changePssword);
    void login(String username, String password, boolean rememberMe);

}
