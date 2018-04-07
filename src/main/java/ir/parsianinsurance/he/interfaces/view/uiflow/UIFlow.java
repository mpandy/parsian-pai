package ir.parsianinsurance.he.interfaces.view.uiflow;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Mohammad on 6/28/2017.
 */

@ApplicationScoped
public class UIFlow {

    private Set<UIState> rules;

    @PostConstruct
    public void init(){
        rules = new HashSet<>();

        rules.add(new UIState(StateName.MODIRIATE_KARBARAN, View.useradminpanel));
        rules.add(new UIState(StateName.MODIRIATE_GHARARDADHA, View.gharardadadminpanel));
        rules.add(new UIState(StateName.MODIRIATE_MASHAGHEL, View.shoghladminpanel));
        rules.add(new UIState(StateName.MODIRIATE_NAMAYANDEGAN, View.vahedadminpanel));
        rules.add(new UIState(StateName.BORDRO_BIMENAME, View.bordrobimename));
        rules.add(new UIState(StateName.BORDRO_ELHAGHIYE, View.bordroelhaghiye));
        rules.add(new UIState(StateName.SABT_PISHNAHAD, View.bimename));
        rules.add(new UIState(StateName.SABT_NEW_PISHNAHAD_MOHASEBE, View.bimename));
        rules.add(new UIState(StateName.LIST_BIMENAME, View.bimenamelist));
        rules.add(new UIState(StateName.SODOOR_NEW_BIMENAME, View.bimename));
        rules.add(new UIState(StateName.TAGHIR_BIMENAME, View.bimename));
        rules.add(new UIState(StateName.EBTAL, View.elhaghiye));
        rules.add(new UIState(StateName.MOHASEBE_EBTAL, View.elhaghiye));
        rules.add(new UIState(StateName.FASKH, View.elhaghiye));
        rules.add(new UIState(StateName.MOHASEBE_FASKH, View.elhaghiye));
        rules.add(new UIState(StateName.ENSERAF_AZ_ELHAGHIYE, View.bimenamelist));
        rules.add(new UIState(StateName.BAZGASHT_AZ_NAMAYESH, View.elhaghiyelist));
        rules.add(new UIState(StateName.TAGHIR_BIMENAME_MOHASEBE_HAGHEBIME, View.elhaghiye));
        rules.add(new UIState(StateName.SODOOR_NEW_BIMENAME_MOHASEBE, View.bimename));
        rules.add(new UIState(StateName.TAEEDE_ELHAGHIYE_TAGHIRAT, View.elhaghiye));
        rules.add(new UIState(StateName.TAEEDE_NAHAYI_ELHAGHIYE_TAGHIRAT, View.elhaghiyelist));
        rules.add(new UIState(StateName.NAMAYESH_BIMENAME, View.bimename));
        rules.add(new UIState(StateName.ESLAHE_SODOOR, View.bimename));
        rules.add(new UIState(StateName.NAMAYESH_ELHAGHIYE, View.elhaghiye));
        rules.add(new UIState(StateName.LIST_ELHAGHIYE, View.elhaghiyelist));
        rules.add(new UIState(StateName.ELHAGHIYE_SELECTED, View.elhaghiyelist));
        rules.add(new UIState(StateName.LIST_KHESARAT, View.khesaratlist));
        rules.add(new UIState(StateName.KHESARAT, View.khesarat));
        rules.add(new UIState(StateName.SODOOR_NEW_HAVALE_KHESARAT, View.khesarat));
        rules.add(new UIState(StateName.KHESARAT_SELECTED, View.khesaratlist));
        rules.add(new UIState(StateName.NAMAYESH_KHESARAT, View.khesarat));
        rules.add(new UIState(StateName.VIRAYESH_KHESARAT, View.khesarat));
        rules.add(new UIState(StateName.BIMENAME_SELECTED, View.bimenamelist));
        rules.add(new UIState(StateName.LIST_ARTIFACTDOC, View.ARTIFACTDOCLIST));

    }

    public UIState next(StateName stateName){
        return rules
                .stream()
                .filter((stv) -> stv.getState().equals(stateName))
                .findAny()
                .get();
    }

    public static void main(String[] args) {

        EnumSet<StateName> s = EnumSet.of(StateName.BAZGASHT_AZ_NAMAYESH, StateName.BAZGASHT_AZ_NAMAYESH);
        System.out.println(s.size());
    }
}
