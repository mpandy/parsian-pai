package ir.parsianinsurance.he.infrastructure.security;

import ir.parsianinsurance.he.domain.service.IUserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import javax.enterprise.inject.spi.CDI;

/**
 * Created by Mohammad on 8/3/2017.
 */

public class SecurityManagerRealm extends AuthorizingRealm {

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        // identify account to log to
        UsernamePasswordToken userPassToken = (UsernamePasswordToken) authenticationToken;
        final String username = userPassToken.getUsername();

        if (username == null) {
            System.out.println("Username is null.");
            return null;
        }

        IUserService iUserService = CDI.current().select(IUserService.class).get();
        // read password hash and salt from db
        final User user = iUserService.findByUsername(username);

        if (user == null || user.getVaziateFaaliat().equals(VaziateFaaliat.GHEYRE_FAAL)) {
            System.out.println("No account found for user [" + username + "]");
            return null;
        }
        else {
            iUserService.storeShiroUserToSession(user);
        }

        // return salted credentials
//        SaltedAuthenticationInfo info = new MySaltedAuthentificationInfo(username, user.getPassword(), user.getSalt());

        return new SimpleAuthenticationInfo(user.getUsername(), user.getPassword(), getName());
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        if (principalCollection == null) {
            throw new AuthorizationException("PrincipalCollection method argument cannot be null.");
        }

        IUserService userService = CDI.current().select(IUserService.class).get();

        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.setRoles(userService.shiroUserRolesString());
        info.setStringPermissions(userService.shiroUserPermissionsString());

        return info;
    }

}
