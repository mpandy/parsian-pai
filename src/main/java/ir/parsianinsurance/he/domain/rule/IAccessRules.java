package ir.parsianinsurance.he.domain.rule;

import ir.parsianinsurance.he.infrastructure.security.Permission;
import ir.parsianinsurance.he.infrastructure.security.Role;

import java.util.List;

/**
 * Created by 8119 on 11/9/2017.
 */
public interface IAccessRules {
    List<Permission> rolePermissions(Role role);
}
