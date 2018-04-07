package ir.parsianinsurance.he.domain.validator;

import ir.parsianinsurance.he.domain.model.Pishnahad;
import ir.parsianinsurance.he.domain.model.ShakhseHaghighi;
import ir.parsianinsurance.he.domain.model.ShakhseHoghooghi;
import ir.parsianinsurance.he.domain.model.Zinaf;
import ir.parsianinsurance.he.domain.model.enums.NesbatBaBimeshode;
import ir.parsianinsurance.he.domain.model.enums.NoeShakhs;
import ir.parsianinsurance.he.domain.model.enums.OlaviateKhesarat;
import ir.parsianinsurance.he.infrastructure.HeException;
import ir.parsianinsurance.he.infrastructure.util.StringUtil;
import ir.parsianinsurance.he.interfaces.view.bean.view.BimenameBean;

import javax.interceptor.InvocationContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by Mohammad on 9/26/2017.
 */
public class SabtePishnahadHEValidator extends HEValidator {

    @Override
    public void validate(InvocationContext context) throws Exception {
        List<String> errorMessages = new ArrayList<>();

        Pishnahad pishnahad = ((BimenameBean) context.getTarget()).getBimename().getPishnahadeFaal();

        if (pishnahad.getBazaryab() == null)
            errorMessages.add("BazaryabEntekhabNashodeAst");

        if (pishnahad.getGharardad() == null)
            errorMessages.add("GharardadiEntekhabNashodeAst");

        if (pishnahad.getEmzaKonande_aval() == null)
            errorMessages.add("EmzaKonandeAvalRaVaredNamaeed");

        if (pishnahad.getEmzaKonande_dovom() == null)
            errorMessages.add("EmzaKonandeDovomRaVaredNamaeed");

        if (pishnahad.getBimeGozar().getShakhs() == null)
            throw new HeException("BimegozarRaVaredNamaeed");

        if (pishnahad.getBimeShode().getShakhseHaghighi() == null)
            throw new HeException("BimeshodeRaVaredNamaeed");

        if (pishnahad.getNoeBimegozar().equals(NoeShakhs.HAGHIGHI)) {
            List<String> shakhsHaghighiErrorMessage = new ShakhseHaghighiValidator(
                    (ShakhseHaghighi) pishnahad.getBimeGozar().getShakhs(),
                    "bimegozar").validate();
            errorMessages.addAll(shakhsHaghighiErrorMessage);
        }

        if (pishnahad.getNoeBimegozar().equals(NoeShakhs.HOGHOOGHI)) {
            List<String> shakhsHoghoghiErrorMessage = new ShakhseHoghoghiValidator(
                    (ShakhseHoghooghi) pishnahad.getBimeGozar().getShakhs())
                    .validate();
            errorMessages.addAll(shakhsHoghoghiErrorMessage);
        }

        List<String> bimeshodeErrorMessage = new ShakhseHaghighiValidator(
                pishnahad.getBimeShode().getShakhseHaghighi(),
                "bimeshode").validate();
        errorMessages.addAll(bimeshodeErrorMessage);

        validateZinafs(errorMessages, pishnahad.getZinafs());

        if(!errorMessages.isEmpty())
            throw new HeException(errorMessages);
    }

    private void validateZinafs(List<String> errorMessages, Set<Zinaf> zinafs) throws HeException {

        if (zinafs.size() == 0)
            errorMessages.add("ZinafRaVaredNamaeed");

        int[] majmoozarayebOlaviate = new int[4];


        for (Zinaf zinaf : zinafs) {

            if (zinaf.getOlaviat_khesarat().equals(OlaviateKhesarat.EMPTY))
                throw new HeException("olaviatekhesaratZinafRaVaredNamaeed");

            if (zinaf.getZarib_sahm() == null)
                throw new HeException("ZaribeSahmDarZinafRaVaredNamaeed");

            if (!zinaf.getOlaviat_khesarat().equals(OlaviateKhesarat.EMPTY))
                majmoozarayebOlaviate[zinaf.getOlaviat_khesarat().getIndexValue()] += zinaf.getZarib_sahm();

            if (zinaf.getNesbat_ba_bimeshode().equals(NesbatBaBimeshode.EMPTY))
                errorMessages.add("NesbatBabimeshodeZinafRaVaredNamaeed");

            if(!zinaf.getNesbat_ba_bimeshode().equals(NesbatBaBimeshode.VORASE_GHANOONI)) {

                if (zinaf.getName().equals(""))
                    errorMessages.add("NameZinafRaVaredKonid");

                if (zinaf.getName_khanevadegi().equals(""))
                    errorMessages.add("NameKhanevadegiZinafRaVaredKonid");

                if (zinaf.getName_pedar().equals(""))
                    errorMessages.add("NamePedareZinafRaVaredKonid");

                if (zinaf.getKode_meli().equals(""))
                    errorMessages.add("codemelliZinafRaVaredKonid");

                if (!StringUtil.isValidIranianNationalCode(zinaf.getKode_meli()))
                    errorMessages.add("KodeMeliZinafMotabarNemibashad");

            }
        }

        for(int majmoozarayeb : majmoozarayebOlaviate)
            if(majmoozarayeb != 0 && majmoozarayeb != 100)
                throw new HeException("majmooeZarayebSahamDarZinafBayadSadShavad");
    }


}
