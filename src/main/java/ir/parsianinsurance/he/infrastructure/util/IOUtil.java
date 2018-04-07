package ir.parsianinsurance.he.infrastructure.util;

import ir.parsianinsurance.he.domain.model.enums.TabagheKhatar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.function.Function;

/**
 * Created by Mohammad on 10/23/2017.
 */
public class IOUtil {

    public static <S, T> HashMap<S, T> readPropertyFile(String fileName,
                                                        Function<String, S> parseKey,
                                                        Function<String, T> parseValue) throws IOException {

        HashMap<S, T> stringMap = new HashMap<>();
        final InputStream stream = Thread
                                    .currentThread()
                                    .getContextClassLoader()
                                    .getResourceAsStream(fileName);
        if (stream == null) {
            System.err.println("No such fime :"+fileName);
        }
        try (BufferedReader buffer = new BufferedReader(new InputStreamReader(stream))) {

            buffer  .lines()
                    .forEach(lineStr -> {
                        String[] splitLineWithTheFirstOccurrenceOfAssignment = lineStr.split("=", 2);
                        stringMap.put(  parseKey.apply(splitLineWithTheFirstOccurrenceOfAssignment[0]),
                                        parseValue.apply(splitLineWithTheFirstOccurrenceOfAssignment[1]));
                    });
        }

        return stringMap;
    }



    public static void main(String[] args) {
        try {
            HashMap<TabagheKhatar, Double> map = IOUtil.readPropertyFile("config/takhfifGoroohi.properties",
                    TabagheKhatar::valueOf,
                    Double::valueOf);

            map.keySet().stream()
                        .forEach(x->System.out.format("%s : %g", x, map.get(x)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
