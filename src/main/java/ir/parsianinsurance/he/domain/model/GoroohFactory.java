package ir.parsianinsurance.he.domain.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by 8119 on 9/3/2017.
 */
public class GoroohFactory {

    public static List<String> goroohListFromString(String listString) {
        String str = listString.substring(1, listString.length() - 1); // chop off brackets
        return Arrays.stream(str.split(","))
                .map(nextGorooh -> nextGorooh.trim())
                .collect(Collectors.toList());
    }
}
