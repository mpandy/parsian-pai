package ir.parsianinsurance.he.infrastructure.security;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by 8119 on 11/1/2017.
 */
public class PermissionFactory {

    public static List<Permission> permissionListFromString(String listString) {
        String str = listString.substring(1, listString.length() - 1); // chop off brackets
        return Arrays.stream(str.split(","))
                .map(nextPermission -> Permission.valueOf(nextPermission.trim()))
                .collect(Collectors.toList());
    }
}
