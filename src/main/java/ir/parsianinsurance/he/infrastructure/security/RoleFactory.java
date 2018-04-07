package ir.parsianinsurance.he.infrastructure.security;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by 8119 on 9/3/2017.
 */
public class RoleFactory {

    public static List<Role> roleListFromString(String listString) {
        String str = listString.substring(1, listString.length() - 1); // chop off brackets
        return Arrays.stream(str.split(","))
                .map(nextRole -> Role.valueOf(nextRole.trim()))
                .collect(Collectors.toList());

    }


}
