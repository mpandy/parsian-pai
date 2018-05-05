package ir.parsianinsurance.he.domain.service;

import com.querydsl.core.types.Predicate;
import ir.parsianinsurance.he.domain.model.Vahed;
import ir.parsianinsurance.he.domain.rule.IAccessRules;
import ir.parsianinsurance.he.domain.rule.IPropertyRules;
import ir.parsianinsurance.he.infrastructure.repository.UserRepository;
import ir.parsianinsurance.he.infrastructure.repository.VahedRepository;
import ir.parsianinsurance.he.infrastructure.security.*;
import ir.parsianinsurance.he.interfaces.view.model.ChangePssword;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.DefaultPasswordService;

import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * Created by Mohammad on 8/3/2017.
 */

@Model
public class UserService implements IUserService {

    @Inject
    UserRepository userRepository;

    @Inject
    VahedRepository vahedRepository;

    @Inject
    UserBean userBean;

    @Inject
    IAccessRules accessRules;

    @Inject
    IPropertyRules propertyRules;

    @Inject
    IVahedService vahedService;

    @Override
    public void storeShiroUserToSession(User user) {
        Set<String> roles = new HashSet<>();
        Set<String> permissions = new HashSet<>();

        for(String nextRole : user.getRoles()
                .replace("[", "")
                .replace("]", "")
                .split(","))
        {
            nextRole = nextRole.trim();
            roles.add(nextRole);
            Role role = Role.valueOf(nextRole);
            permissions.addAll(accessRules.rolePermissions(role)
                    .stream()
                    .map(Enum::name)
                    .collect(Collectors.toList()));
        }

        userBean.setCurrentUser(user);
        userBean.setRoles(roles);
        userBean.setPermissions(permissions);
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findFirstByUsername(username);
    }

    @Override
    public User defaultBazaryab() {
        return findByUsername(propertyRules.getSinglesStringParam("defaultBazaryabUsername"));
    }

    @Override
    public List<User> autocompleteEmzakonande(String name) {

        return userRepository.findByVahed(userBean.getCurrentUser().getVahed())
                .stream()
                .filter(x -> hasRole(x, Role.EMZAKONANDE) && x.getRealName().contains(name))
                .collect(Collectors.toList());
    }

    @Override
    public List<User> autocompleteBazaryab(String name) {

        QUser user = QUser.user;
        String trimmedString = name.trim();
        Predicate bazaryabAndRealnameOrCodeContains =   user.roles.contains(Role.BAZARYAB.name()).and(
                user.realName.contains(trimmedString).or(
                        user.codeBazaryab.contains(trimmedString)));
        Iterable<User> iterable =  userRepository.findAll(bazaryabAndRealnameOrCodeContains);
        return StreamSupport
                .stream(iterable.spliterator(), false)
                .collect(Collectors.toList());
    }

    @Override
    public User buildUser(User user) {

        Vahed vahed = vahedRepository.findOne(user.getVahed().getId());
        user.setVahed(vahed);

        return user;
    }

    @Override
    public Set<String> shiroUserRolesString() {
        return userBean.getRoles();
    }

    @Override
    public Set<String> shiroUserPermissionsString() {
        return userBean.getPermissions();
    }

    public boolean hasRole(User user, Role role)
    {
        return RoleFactory.roleListFromString(user.getRoles()).contains(role);
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        Vahed vahedeMahalleKhedmat = vahedRepository.findOne(user.getVahed().getId());
        user.setVahed(vahedeMahalleKhedmat);
        userRepository.save(user);
    }

    @Override
    @Transactional
    public void removeUser(User user) {
        user.setDeleted(true);
        userRepository.save(user);
    }

    @Override
    public List<User> searchUser(String username) {
        if(username.trim().isEmpty())
            return userRepository.findTop5ByOrderByIdDesc();
        else
            return userRepository.findByUsernameContains(username);

    }

    @Override
    @Transactional
    public void changePassword(User user, String newPassword) {
        User userToChangePassword = userRepository.findOne(user.getId());
        String encryptedValue = new DefaultPasswordService().encryptPassword(newPassword);
        userToChangePassword.setPassword(encryptedValue);

        userRepository.save(userToChangePassword);
    }

    @Override
    public List<String> validateChangePassword(User user, ChangePssword changePssword) {

        List<String> errorMessages = new ArrayList();

        try{login(user.getUsername(), changePssword.getCurrentPassword(), false);}
        catch (AuthenticationException e) {
            errorMessages.add("currentpasswordiswrong");
        }

        if(!changePssword.getNewPassword().equals(changePssword.getRepaeadNewPassword()))
            errorMessages.add("newpassworddontmatch");

        return errorMessages;

    }

    @Override
    public void login(String username, String password, boolean rememberMe) {
        UsernamePasswordToken token = new UsernamePasswordToken(username, password, rememberMe);
        SecurityUtils.getSubject().login(token);
    }

}
