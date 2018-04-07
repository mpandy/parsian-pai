package ir.parsianinsurance.he.domain.model.enums;

/**
 * Created by 8119 on 8/1/2017.
 */
public enum OlaviateKhesarat {
    EMPTY,
    YEK,
    DO,
    SE,
    CHAHAR;

    private int indexValue;

    static {
        YEK.indexValue = 0;
        DO.indexValue = 1;
        SE.indexValue = 2;
        CHAHAR.indexValue = 3;
    }

    public int getIndexValue() {
        return indexValue;
    }

}
