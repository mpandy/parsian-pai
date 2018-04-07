package ir.parsianinsurance.he.infrastructure;

import ir.parsianinsurance.he.domain.model.enums.*;
import ir.parsianinsurance.he.interfaces.view.model.ArtifactDaryaftiErsali;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.util.List;

/**
 * Created by Mohammad on 6/24/2017.
 */

@Named
@ApplicationScoped
public class ComboOptions {

    private List<String> bimegars;
    private List<String> pishvandHaghihi;
    private List<String> pishvandHoghooghi;

    public Jensiat[] getJensiats() {
        return Jensiat.values();
    }
    public Melliat[] getMelliats() {
        return Melliat.values();
    }
    public NoePishnahad[] getNoePishNahads() { return NoePishnahad.values(); }
    public VaziateBimename[] getVaziateBimenames() {
        return VaziateBimename.values();
    }
    public NahvePardakht[] getNahvePardakhts() {return new NahvePardakht[]{NahvePardakht.PARDAKHT_NAGHDI_HAMZAMAN_BA_SODOOR};}
    public NesbatBaBimeshode[] getNesbatBaBimeshodes() {
        return NesbatBaBimeshode.values();
    }
    public NoeTaahod[] getNoeTaahods() {
        return NoeTaahod.values();
    }
    public NahveMohasebe[] getNahveMohasebes() {
        return NahveMohasebe.values();
    }
    public NahveElameKhesarat[] getNahveElameKhesarat() {return NahveElameKhesarat.values();}
    public NoeKhesarat[] getNoeKhesarat() {return NoeKhesarat.values();}
    public NoeHadese[] getNoeHadese() {return NoeHadese.values();}
    public ElateHadese[] getElateHadese() {return ElateHadese.values();}
    public VaziateKhesaratCase[] getSelectableVaziateKhesaratCase() {
        return new VaziateKhesaratCase[]{   VaziateKhesaratCase.EMPTY,
                                            VaziateKhesaratCase.ANALIZ_SHODE,
                                            VaziateKhesaratCase.MOVAGHAT,
                                            VaziateKhesaratCase.DAEM};
    }
    public OlaviateKhesarat[] getOlaviateKhesarat() {return OlaviateKhesarat.values();}
    public NoeKhaseElhaghiye[] getNoeKhaseElhaghiye() {return NoeKhaseElhaghiye.values();}
    public TabagheKhatar[] getTabagheKhatar() {return TabagheKhatar.values();}
    public NoeDaryaftKonande[] getNoeDaryaftKonande() {return NoeDaryaftKonande.values();}
    public VahedType[] getVahedType() {return VahedType.values();}
    public NoeHavale[] getNoeHavale() {return NoeHavale.values();}
    public ArtifactDaryaftiErsali[] getArtifactDaryaftiErsali() {return ArtifactDaryaftiErsali.values();}
    public List<String> getBimegars() {return bimegars;}
    public void setBimegars(List<String> bimegars) {this.bimegars = bimegars;}
    public List<String> getPishvandHaghihi() {
        return pishvandHaghihi;
    }
    public void setPishvandHaghihi(List<String> pishvandHaghihi) {
        this.pishvandHaghihi = pishvandHaghihi;
    }
    public List<String> getPishvandHoghooghi() {
        return pishvandHoghooghi;
    }
    public void setPishvandHoghooghi(List<String> pishvandHoghooghi) {
        this.pishvandHoghooghi = pishvandHoghooghi;
    }

}
