package ir.parsianinsurance.he.domain.rule;

import ir.parsianinsurance.he.infrastructure.security.Permission;
import ir.parsianinsurance.he.infrastructure.security.Role;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 8119 on 8/14/2017.
 */

@ApplicationScoped
public class AccessRules implements IAccessRules {

    @Override
    public List<Permission> rolePermissions(Role role) {

        List<Permission> permissions = new ArrayList<>();
        switch (role){

            case ADMIN:
                return Arrays.asList(   Permission.values());

            case NAMAYANDE:
                return Arrays.asList(   Permission.MOSHAHEBE_BIMENAME,
                                        Permission.MOSHAHEDE_ELHAGHIYE,
                                        Permission.NAMAYESHE_JOZIATE_ELHAGHIYE,
                                        Permission.MOSHAHEDE_KHESARAT,
                                        Permission.NAMAYESHE_JOZIATE_KHESARAT,
                                        Permission.MOSHAHEDE_GOZARESH,
                                        Permission.SABT_PISHNAHAD,
                                        Permission.MOSHAHEDE_DARKHAST,
                                        Permission.NAMAYESHE_JOZIATE_BIMENAME,
                                        Permission.SABT_FASKH,
                                        Permission.SABT_EBTAL
                        );

            case KARSHENAS_SODOOR:
                return Arrays.asList(   Permission.MOSHAHEBE_BIMENAME,
                                        Permission.MOSHAHEDE_ELHAGHIYE,
                                        Permission.MOSHAHEDE_KHESARAT,
                                        Permission.MOSHAHEDE_GOZARESH,
                                        Permission.SODOOR_BIMENAME,
                                        Permission.SABT_ELHAGHIYE_TAGHIR,
                                        Permission.SABT_PISHNAHAD,
                                        Permission.DARKHAST_MOJAVEZ_ROOYE_BIMENAME,
                                        Permission.MOSHAHEDE_DARKHAST,
                                        Permission.NAMAYESHE_JOZIATE_BIMENAME,
                                        Permission.SABT_FASKH,
                                        Permission.CHAP_BIMENAME,
                                        Permission.CHAP_ELHAGHIYE,
                                        Permission.CHAP_HAGHEBIME,
                                        Permission.SABT_EBTAL
                        );

            case KARSHENAS_KHESARAT:
                return Arrays.asList(   Permission.MOSHAHEBE_BIMENAME,
                                        Permission.MOSHAHEDE_ELHAGHIYE,
                                        Permission.MOSHAHEDE_KHESARAT,
                                        Permission.MOSHAHEDE_GOZARESH,
                                        Permission.VIRAYESHE_KHESARAT,
                                        Permission.NAMAYESHE_JOZIATE_KHESARAT,
                                        Permission.SABTE_HAVALE_KHESARAT,
                                        Permission.SODOOR_KHESARAT);

        }
        return permissions;
    }
}
