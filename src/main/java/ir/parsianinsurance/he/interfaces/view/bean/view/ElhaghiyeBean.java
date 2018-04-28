package ir.parsianinsurance.he.interfaces.view.bean.view;

import ir.parsianinsurance.he.domain.facade.IApplicationService;
import ir.parsianinsurance.he.domain.model.*;
import ir.parsianinsurance.he.domain.model.enums.NoeElhaghiye;
import ir.parsianinsurance.he.domain.rule.IAyinName24Rules;
import ir.parsianinsurance.he.domain.rule.IPropertyRules;
import ir.parsianinsurance.he.domain.service.IElhaghiyeService;
import ir.parsianinsurance.he.domain.service.IPishnahadService;
import ir.parsianinsurance.he.domain.validator.SabteElhaghiyeValidator;
import ir.parsianinsurance.he.infrastructure.Warning;
import ir.parsianinsurance.he.infrastructure.util.DateUtil;
import ir.parsianinsurance.he.infrastructure.workflow.WebAction;
import ir.parsianinsurance.he.interfaces.view.uiflow.StateName;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.*;

/**
 * Created by 8119 on 5/17/2017.
 */

@Named
@ViewScoped
public class ElhaghiyeBean implements Serializable{

    @Inject
    transient ResourceBundle bundle;

    @Inject
    IPropertyRules propertyRules;

    @Inject
    IAyinName24Rules ayinName24Rules;

    @Inject
    IElhaghiyeService elhaghiyeDomainService;

    @Inject
    IPishnahadService pishnahadDomainService;

    @Inject
    IApplicationService heService;

    @Inject
    BimenameListBean bimenameListBean;

    @Inject
    BimenameBean bimenameBean;

    private Elhaghiye elhaghiye;
    private List<NoeElhaghiye> noeElhaghiyeOptions;
    public Elhaghiye getElhaghiye() {
        return elhaghiye;
    }

    public void setElhaghiye(Elhaghiye elhaghiye) {
        this.elhaghiye = elhaghiye;
    }

    public List<NoeElhaghiye> getNoeElhaghiyeOptions() {
        return noeElhaghiyeOptions;
    }

    public void setNoeElhaghiyeOptions(List<NoeElhaghiye> noeElhaghiyeOptions) {
        this.noeElhaghiyeOptions = noeElhaghiyeOptions;
    }

    @PostConstruct
    public void init(){
        elhaghiye = ElhaghiyeFactory.newElhaghiyeForSabt();
    }

    @WebAction(toState =StateName.TAGHIR_BIMENAME )
    public void eslahetaghirebimename(){}

    @WebAction( toState = StateName.LIST_ELHAGHIYE,
                successMessage = "sabteElhaghiye",
                validator = SabteElhaghiyeValidator.class)
    public Optional<Warning> sabtNahayiElhaghiye(){

            elhaghiye.setPishnahad_new(bimenameBean.getBimename().getPishnahadeFaal());
            elhaghiye.setCreatedDate(DateUtil.now());
            Optional<Warning> optionalWarning = heService.sabteElhaghiyeTaghir(elhaghiye);
            init();
            return optionalWarning;

    }

    @WebAction( toState = StateName.LIST_ELHAGHIYE,
                successMessage = "sabteElhaghiye")
    public void taeedeSodoorElhaghiye(){

            elhaghiye.beVaziate(VaziateElhaghiye.TAGHIR_NAHAYI_SHODE);
            elhaghiye.setNoe_elhaghie(NoeElhaghiye.TAGHIR);
            elhaghiyeDomainService.taeedeSodooreElhaghiyeyeMojavezDaar(elhaghiye);

    }

    @WebAction( toState = StateName.LIST_BIMENAME,
                successMessage ="enserafeelhaghiye")
    public void enserafelhaghiye(){
        init();
        bimenameBean.init();
        bimenameListBean.init();
    }

    @WebAction(toState =StateName.BAZGASHT_AZ_NAMAYESH)
    public void bazgashazNamayesh(){
        init();
    }


    private void translateIfAvailable(ElhaghiyeDiff diff) {

        String oldValue;
        try {
            oldValue = bundle.getString(diff.getOldValue());
        } catch (MissingResourceException e) {
            oldValue = diff.getOldValue();
        } catch (NullPointerException e) {
            oldValue = "-";
        }

        String newValue;
        try {
            newValue = bundle.getString(diff.getNewValue());
        } catch (MissingResourceException e) {
            newValue = diff.getNewValue();
        }
        catch (NullPointerException e) {
            newValue = "-";
        }

        diff.setOldValue(oldValue);
        diff.setNewValue(newValue);
    }

    public void taeedElhaghiyeTaghirat(Pishnahad pishnahadeFaal){

        pishnahadDomainService.buildPishnahadToPersist(pishnahadeFaal);
        Set<ElhaghiyeDiff> elhaghiyeDiffSet = elhaghiyeDomainService.elhaghiyeDiffs(elhaghiye.getPishnahad_old(),
                                                                                    pishnahadeFaal);

        elhaghiyeDiffSet.forEach(this::translateIfAvailable);
        elhaghiyeDiffSet.forEach(diff -> diff.setElhaghiye(elhaghiye));

        elhaghiye.setDiffsList(elhaghiyeDiffSet);
        Long mablagh =  pishnahadeFaal.getHagheBime().getHaghe_bime_ghabelepardakht().longValue()-
                elhaghiye.getPishnahad_old().getHagheBime().getHaghe_bime_ghabelepardakht().longValue();
        elhaghiye.setMablagheElhaghiye(mablagh);
    }

    @WebAction( toState = StateName.MOHASEBE_EBTAL,
                validator = SabteElhaghiyeValidator.class)
    public void mohasebeEbtal(){
        Long mablaghEbtal = elhaghiye.getBimename().getPishnahadeFaal().getHagheBime().getHaghe_bime_ghabelepardakht();
        elhaghiye.setMablagheElhaghiye(mablaghEbtal);
    }

    @WebAction( successMessage = "bimenamebatelgardid",
                toState = StateName.LIST_BIMENAME)
    public Optional<Warning> taeedNahayiEbtal(){
        elhaghiye.setCreatedDate(DateUtil.now());
        Optional<Warning> optionalWarning = heService.sabteElhaghiyeEbtal(elhaghiye);
        init();
        return optionalWarning;
    }

    @WebAction( toState = StateName.MOHASEBE_FASKH,
                validator = SabteElhaghiyeValidator.class)
    public void mohasebefaskh(){

        Long mablaghElhaghiye = 0L;
        Long haghebimekol = elhaghiye.getBimename().getPishnahadeFaal().getHagheBime().getHaghe_bime_ghabelepardakht();

        switch (elhaghiye.getNoe_elhaghie()){
            case FASKHAZTARAFEBIMEGAR:
                int daysDiff = DateUtil.getTimeDifferenceByDayCount(elhaghiye.getBimename().getTarikhesodoor(),
                                                                    elhaghiye.getTarikh_asar_elhaghie());
                int moddat = elhaghiye.getBimename().getPishnahadeFaal().modatBimename();
                mablaghElhaghiye = (haghebimekol/moddat)*(moddat-daysDiff);
                break;

            case FASKHAZTARAFEBIMEGOZAR:
                int modat = DateUtil.getTimeDifferenceByDayCount(DateUtil.getJalaliCurrentDate(), elhaghiye.getBimename().getTarikhesodoor());
                mablaghElhaghiye = (Math.round (haghebimekol * (1- ayinName24Rules.darsadeHagheBimeSalane(modat))));
                break;
        }
        elhaghiye.setMablagheElhaghiye(mablaghElhaghiye);
    }

    @WebAction( successMessage = "bimenamefaskhgardid",
                toState = StateName.LIST_BIMENAME)
    public Optional<Warning> taeedNahayFaskh(){
        elhaghiye.setCreatedDate(DateUtil.now());
        Optional<Warning> optionalWarning = heService.sabteElhaghiyeFaskh(elhaghiye);
        init();
        return optionalWarning;
    }


}
