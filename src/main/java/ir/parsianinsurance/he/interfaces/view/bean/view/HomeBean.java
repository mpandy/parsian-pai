package ir.parsianinsurance.he.interfaces.view.bean.view;

import ir.parsianinsurance.he.infrastructure.workflow.WebAction;
import ir.parsianinsurance.he.interfaces.view.uiflow.StateName;

import javax.enterprise.inject.Model;
import java.io.Serializable;

/**
 * Created by Mohammad on 7/5/2017.
 */

@Model
public class HomeBean implements Serializable{

    @WebAction(toState = StateName.LIST_BIMENAME)
    public void listPishnahad(){
    }

    @WebAction(toState = StateName.LIST_KHESARAT)
    public void listKhesarat(){
    }

    @WebAction(toState = StateName.LIST_ARTIFACTDOC)
    public void moshahedeDarkhastha(){
    }

    @WebAction(toState = StateName.LIST_ELHAGHIYE)
    public void listElhaghiye(){
    }

    @WebAction(toState = StateName.MODIRIATE_KARBARAN)
    public void modiriateKarbaran(){
    }

    @WebAction(toState = StateName.MODIRIATE_GHARARDADHA)
    public void modiriateGharardadha(){
    }

    @WebAction(toState = StateName.MODIRIATE_MASHAGHEL)
    public void modiriateMashaghel(){
    }

    @WebAction(toState = StateName.MODIRIATE_NAMAYANDEGAN)
    public void modiriateNamayandegan(){
    }

    @WebAction(toState = StateName.BORDRO_BIMENAME)
    public void listbordroBimename(){
    }

    @WebAction(toState = StateName.BORDRO_ELHAGHIYE)
    public void listbordroElhaghiye(){
    }
}
