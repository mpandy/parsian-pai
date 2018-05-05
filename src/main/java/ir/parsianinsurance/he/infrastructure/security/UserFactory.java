package ir.parsianinsurance.he.infrastructure.security;

import ir.parsianinsurance.he.domain.model.Vahed;

/**
 * Created by Mohammad on 8/7/2017.
 */
public class UserFactory {
    public static User newFaalUser() {
        User user = new User();
        user.setVaziateFaaliat(VaziateFaaliat.FAAL);
        return user;
    }

    public static User newSearchUser() {
        User user = new User();
        user.setUsername("");
        return user;
    }

    public static User newFaalUser(String realName, String password, String username, String roles, Vahed vahed, String codeBazaryab) {
        User user = new User();
        user.setVaziateFaaliat(VaziateFaaliat.FAAL);
        user.setCodeBazaryab(codeBazaryab);
        user.setRealName(realName);
        user.setUsername(username);
        user.setPassword(password);
        user.setRoles(roles);
        user.setVahed(vahed);
        return user;
    }

}
