package ir.parsianinsurance.he.domain.model;

import ir.parsianinsurance.he.domain.model.enums.NahveMohasebe;
import ir.parsianinsurance.he.domain.model.enums.NoePishnahad;
import ir.parsianinsurance.he.domain.model.enums.NoeShakhs;
import ir.parsianinsurance.he.infrastructure.io.Zamime;
import ir.parsianinsurance.he.infrastructure.security.User;
import ir.parsianinsurance.he.infrastructure.util.DateUtil;
import ir.parsianinsurance.he.interfaces.webservice.model.AgencyBimenameInfo;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Mohammad on 5/27/2017.
 */

public class PishnahadFactory {

    public static Pishnahad newPishnahadForSodooor() {

        Pishnahad pishnahad = new Pishnahad();
        pishnahad.setBimeShode(new BimeShode(new Shoghl()));
        pishnahad
                .emzakonande_avval(new User())
                .emzakonande_dovvom(new User())
                .hagheBime(HagheBimeFactory.newHagheBimeForSodoor())
                .tarikh(DateUtil.getJalaliCurrentDate())
                .noePishnahad(NoePishnahad.EMPTY)
                .bazaryab(new User())
                .bimegozar(new BimeGozar())
                .bimeshode(new BimeShode())
                .createdDate(DateUtil.now())
                .setEzafeKasr(new EzafeKasr());

        Set<Zinaf> zinafs = new HashSet<>();
        Set<TaahodBimegar> taahodBimegars = new HashSet<>();
        Set<KhatarEzafi> khatarEzafis = new HashSet<>();
        Set<Zamime> zamaem = new HashSet<>();

        pishnahad.setZinafs(zinafs);
        pishnahad.taahods(taahodBimegars);
        pishnahad.setKhatarEzafis(khatarEzafis);
        pishnahad.setZamaem(zamaem);

        return pishnahad;
    }

    public static Pishnahad copyPishnahadForElhaghiye(Pishnahad original) {

        Pishnahad pishnahad = new Pishnahad();
        pishnahad.shomare(original.getShomare_pishnahad());
        pishnahad.vahed(original.getVahed());
        pishnahad.tarikh(original.getTarikh_pishnahad());
        pishnahad.setAztarikh(original.getAztarikh());
        pishnahad.setTatarikh(original.getTatarikh());
        pishnahad.noePishnahad(original.getNoePishnahad());
        pishnahad.setNahveMohasebe(original.getNahveMohasebe());
        pishnahad.setTabagheKhatar(original.getTabagheKhatar());
        pishnahad.sharh(original.getSharhe_pishnahad());
        pishnahad.gorooh(original.getGoroohbimename());
        pishnahad.setShomare_bime_sale_ghabl(original.getShomare_bime_sale_ghabl());
        pishnahad.setTarikhe_engheza_ghabli(original.getTarikhe_engheza_ghabli());
        pishnahad.setSharayete_khosoosi(original.getSharayete_khosoosi());
        pishnahad.noeBimegozar(original.getNoeBimegozar());
        pishnahad.setEzafeKasr(EzafeKasrFactory.copyEzafeKasrForElhaghiye(original.getEzafeKasr()));
        pishnahad.setCreatedDate(DateUtil.now());

        Set<Zinaf> zinafs = new HashSet();
        original.getZinafs().forEach(zn -> zinafs.add(ZinafFactory.copyZinafForElhaghiye(zn)));
        pishnahad.setZinafs(zinafs);

        Set<KhatarEzafi> khatarEzafis = new HashSet();
        original.getKhatarEzafis().forEach(ke -> khatarEzafis.add(KhatareEzafiFactory.copyKhatarEzafiForElhaghiye(ke)));
        pishnahad.setKhatarEzafis(khatarEzafis);

        Set<TaahodBimegar> taahodBimegars = new HashSet();
        original.getTaahodBimegars().forEach(tb -> taahodBimegars.add(TaahodFactory.copyTaahodeBimegarForElhaghiye(tb)));
        pishnahad.taahods(taahodBimegars);

        User bazaryab = new User();
        bazaryab.setId(original.getBazaryab().getId());
        pishnahad.bazaryab(bazaryab);

        Gharardad gharardad = new Gharardad();
        gharardad.setId(original.getGharardad().getId());
        pishnahad.gharardad(gharardad);

        User emzaKonande1 = new User();
        emzaKonande1.setId(original.getEmzaKonande_aval().getId());

        User emzaKonande2 = new User();
        emzaKonande2.setId(original.getEmzaKonande_dovom().getId());

        pishnahad.emzakonande_avval(emzaKonande1)
                .emzakonande_dovvom(emzaKonande2);

        pishnahad.bimegozar(BimeGozarFactory.copyBimegozarForElhaghiye(original.getBimeGozar(), original.getNoeBimegozar()));

        pishnahad.setBimeShode(BimeShodeFactory.copyBimeshodeForElhaghiye(original.getBimeShode()));

        pishnahad.setHagheBime(HagheBimeFactory.copyHagheBimeForElhaghiye(original.getHagheBime()));

        return pishnahad;
    }

    public static Pishnahad newPishnahadForAgency(AgencyBimenameInfo info) {

        Pishnahad pishnahad = new Pishnahad();
        BimeGozar bimeGozar = BimeGozarFactory.newBimegozarForAgencyWebservice(info);
        BimeShode bimeShode = BimeShodeFactory.copyFromBimegozar(bimeGozar);

        pishnahad.bimeshode(bimeShode)
                .bimegozar(bimeGozar)
                .noeBimegozar(NoeShakhs.HAGHIGHI)
                .tarikhshoroo(info.getAzTarikh())
                .tarikhpayan(info.getTaTarikh())
                .taahods(TaahodFactory.taahodatForAgency())
                .createdDate(DateUtil.now())
                .tarikh(DateUtil.getJalaliCurrentDate())
                .sharh("agency web service")
                .noeBimegozar(NoeShakhs.HAGHIGHI)
                .nahveMohasebe(NahveMohasebe.KOOTAHMODAT)
                .noePishnahad(NoePishnahad.INTERNETI)
                .gorooh("SHERKATE_HAVAPEYMAYI")
                .hagheBime(HagheBimeFactory.hagheBimeForAgency(info.modat()));

        return pishnahad;

    }

    }