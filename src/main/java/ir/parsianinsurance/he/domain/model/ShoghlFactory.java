package ir.parsianinsurance.he.domain.model;

import ir.parsianinsurance.he.domain.model.enums.TabagheKhatar;

/**
 * Created by 8119 on 8/8/2017.
 */
public class ShoghlFactory {


    public static Shoghl newshoghl(){
        Shoghl shoghl = new Shoghl();
        shoghl.setDefaultTabagheKhatar(TabagheKhatar.YEK);
        return shoghl;
    }

    public static Shoghl newSearchShoghl() {
        Shoghl shoghl = new Shoghl();
        return shoghl;
    }

    public static Shoghl newshoghl(String name, TabagheKhatar tabagheKhatar){
        Shoghl shoghl = new Shoghl();
        shoghl.setName(name);
        shoghl.setDefaultTabagheKhatar(tabagheKhatar);
        return shoghl;
    }
}
