package ir.parsianinsurance.he.domain.model.enums;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Mohammad on 7/9/2017.
 */
public enum TabagheKhatar {

    EMPTY,
    YEK,
    DO,
    SE,
    CHAHAR,
    PANJ;

    private List<TabagheKhatar> options;

    static {
        YEK.options = Arrays.asList(YEK, DO, SE, CHAHAR, PANJ);
        DO.options = Arrays.asList(DO, SE, CHAHAR, PANJ);
        SE.options = Arrays.asList(SE, CHAHAR, PANJ);
        CHAHAR.options = Arrays.asList(CHAHAR, PANJ);
        PANJ.options = Arrays.asList(PANJ);
    }

    public List<TabagheKhatar> getOptions() {
        return options;
    }
}
