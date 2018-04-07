package ir.parsianinsurance.he;

import ir.parsianinsurance.he.domain.model.*;
import ir.parsianinsurance.he.domain.model.enums.*;
import ir.parsianinsurance.he.domain.service.ElhaghiyeService;
import ir.parsianinsurance.he.domain.service.IElhaghiyeService;
import ir.parsianinsurance.he.infrastructure.util.DateUtil;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Mohammad on 7/1/2017.
 */
public class ElhaghiyeTest {

    IElhaghiyeService IElhaghiyeService;
    Pishnahad oldPish;
    Pishnahad newPish;
    KhatarEzafi k1;
    KhatarEzafi k2;
    KhatarEzafi kh;
    TaahodBimegar T1;
    TaahodBimegar T2;
    TaahodBimegar Ta;
    Zinaf z1;
    Zinaf zi;


    @Before
    public void setupElhaghiye(){

        oldPish = PishnahadFactory.newPishnahadForSodooor();
        oldPish.noeBimegozar(NoeShakhs.HAGHIGHI);
        oldPish.getBimeGozar().setShakhs(ShakhsFactory.newShakhseHaghighi());
        oldPish.getBimeShode().setShakhseHaghighi(ShakhsFactory.newShakhseHaghighi());
        oldPish.ezafeKasr(new EzafeKasr(0d, 0d, 0d));

        Set<KhatarEzafi> khatarEzafiSet = new HashSet<>();
        k1 = KhatareEzafiFactory.newKhatareEzafi();
        k1.setNoekhatarezafi(NoeKhatarEzafi.BOKS);
        k1.setNerkh(0.8);
        k1.setCreatedDate(DateUtil.now());

//        Set<Zinaf> zinafSet = new HashSet<>();
//        z1 = ZinafFactory.newZinaf();
//        z1.setNesbat_ba_bimeshode(NesbatBaBimeshode.MADAR);
//        z1.setOlaviat_khesarat("1");
//        z1.setZarib_sahm("2");
//
//        zinafSet.add(z1);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        k2 = KhatareEzafiFactory.newKhatareEzafi();
        k2.setNoekhatarezafi(NoeKhatarEzafi.DOMEYDANI);
        k2.setNerkh(1.2);
        k2.setCreatedDate(DateUtil.now());

        khatarEzafiSet.add(k1);
        khatarEzafiSet.add(k2);

        oldPish.setKhatarEzafis(khatarEzafiSet);
//        oldPish.setZinafs(zinafSet);


//        Set<TaahodBimegar> taahodBimegarSet = new HashSet<>();
//        T1 = TaahodFactory.newTaahodeBimegar();
//        T1.setSarmaye_taahod(1000000L);
//        T1.setZamane_ejad(DateUtil.now());
//        T1.setNoetaahod(NoeTaahod.FOT_NAGHSOZV_AZKAROFTADEGI);
//        T1.setHagh_bime_zelzelevamotor(4000L);
//        T1.setHagh_bime_khataratezafi(0L);
//        T1.setHagh_bime_taahod(120000L);
//        T1.setNerkh_khatareEzafi(0d);
//        T1.setNerkh_paye(0.012);
//        T1.setNerkh_taahod(.15);
//
//        taahodBimegarSet.add(T1);
//
//        oldPish.setTaahodBimegars(taahodBimegarSet);

        newPish = PishnahadFactory.copyPishnahadForElhaghiye(oldPish);
        IElhaghiyeService = new ElhaghiyeService();
//        IElhaghiyeService.init();
    }


    @Test
    public void editKardaneYekKhatarEzafiBayadTooyeListeTaghiratBiad(){

        List<KhatarEzafi> khatarEzafiList = new ArrayList<>(newPish.getKhatarEzafis());
        khatarEzafiList.get(0).setNoekhatarezafi(NoeKhatarEzafi.FOOTBAL);
//
//        kh = KhatareEzafiFactory.copyBimegozarForElhaghiye(k1);
//        kh.setNoekhatarezafi(NoeKhatarEzafi.FOOTBAL);
//
//        Set<KhatarEzafi> newKhatarEzafiSet = new HashSet<>();
//        newKhatarEzafiSet.add(kh);
//        newKhatarEzafiSet.add(k2);
//
//        newPish.setKhatarEzafis(newKhatarEzafiSet);

        List<ElhaghiyeDiff> x = IElhaghiyeService.elhaghiyeableCollectionElhaghiyeDiff(oldPish.getKhatarEzafis(),
                                                                newPish.getKhatarEzafis());

        x.forEach(ElhaghiyeDiff::print);

        assertThat( x.get(0).getTitle(), is("noekhatarezafi"));
    }

    @Ignore
    @Test
    public void addKardaneYekKhatarEzafiBayadTooyeListeTaghiratBiad(){

        KhatarEzafi k3 = KhatareEzafiFactory.newKhatareEzafi();
        k3.setNoekhatarezafi(NoeKhatarEzafi.ZELZELE);
        k3.setNerkh(.9);
        k3.setCreatedDate(DateUtil.now());
        Set<KhatarEzafi> newKhatarEzafiSet = new HashSet<>();

        newKhatarEzafiSet.add(k3);

        newPish.setKhatarEzafis(newKhatarEzafiSet);

        List<ElhaghiyeDiff> x = IElhaghiyeService.elhaghiyeableCollectionElhaghiyeDiff(oldPish.getKhatarEzafis(), newPish.getKhatarEzafis());

        x.forEach(ElhaghiyeDiff::print);

        assertThat( x.get(0).getOldValue(), is("EMPTY"));
    }

    @Ignore
    @Test
    public void editKardaneYekTaahodBayadTooyeListeTaghiratBiad(){

        Ta = TaahodFactory.copyTaahodeBimegarForElhaghiye(T1);
        Ta.setNoetaahod(NoeTaahod.HAZINE_PEZESHKI);

        Set<TaahodBimegar> newTaahodSet = new HashSet<>();
        newTaahodSet.add(Ta);

        newPish.taahods(newTaahodSet);

        List<ElhaghiyeDiff> x = IElhaghiyeService.elhaghiyeableCollectionElhaghiyeDiff(oldPish.getTaahodBimegars(), newPish.getTaahodBimegars());

        x.forEach(ElhaghiyeDiff::print);

        assertThat( x.get(0).getTitle(), is("noetaahod"));
    }

    @Test
    public void addKardaneYekTaahodBayadTooyeListeTaghiratBiad(){

        TaahodBimegar T3 = TaahodFactory.newTaahodeBimegar();

        T3.setSarmaye_taahod(100000L);
        T3.setCreatedDate(DateUtil.now());
        T3.setNoetaahod(NoeTaahod.HAZINE_PEZESHKI);
        T3.setHagh_bime_zelzelevamotor(500L);
        T3.setHagh_bime_khataratezafi(0L);
        T3.setHagh_bime_taahod(12000L);
        T3.setNerkh_khatareEzafi(0d);
        T3.setNerkh_paye(0.01);
        T3.setNerkh_taahod(.11);

        Set<TaahodBimegar> newTaahodBimegarSet = new HashSet<>();
        newTaahodBimegarSet.add(T3);

        newPish.taahods(newTaahodBimegarSet);

        List<ElhaghiyeDiff> x = IElhaghiyeService.elhaghiyeableCollectionElhaghiyeDiff(oldPish.getTaahodBimegars(), newPish.getTaahodBimegars());

        x.forEach(ElhaghiyeDiff::print);

        assertThat( x.get(0).getOldValue(), is("EMPTY"));
    }

    @Test
    public void editKardaneYekZinafBayadTooyeListeTaghiratBiad(){

        zi = ZinafFactory.copyZinafForElhaghiye(z1);
        zi.setNesbat_ba_bimeshode(NesbatBaBimeshode.AME);

        Set<Zinaf> newZinafSet = new HashSet<>();
        newZinafSet.add(zi);

        newPish.setZinafs(newZinafSet);

        List<ElhaghiyeDiff> x = IElhaghiyeService.elhaghiyeableCollectionElhaghiyeDiff(oldPish.getZinafs(), newPish.getZinafs());

        x.forEach(ElhaghiyeDiff::print);

        assertThat( x.get(0).getTitle(), is("nesbatbabimeshode"));
    }

    @Test
    public void addKardaneYekZinafBayadTooyeListeTaghiratBiad(){

        Zinaf z3 = ZinafFactory.newZinaf();
        z3.setNesbat_ba_bimeshode(NesbatBaBimeshode.AMOO);
        z3.setZarib_sahm(100);
        z3.setOlaviat_khesarat(OlaviateKhesarat.CHAHAR);

        Set<Zinaf> newZinafSet = new HashSet<>();
        newZinafSet.add(z3);
        newZinafSet.add(z1);

        newPish.setZinafs(newZinafSet);

        List<ElhaghiyeDiff> x = IElhaghiyeService.elhaghiyeableCollectionElhaghiyeDiff(oldPish.getZinafs(), newPish.getZinafs());

        x.forEach(ElhaghiyeDiff::print);

        assertThat( x.get(0).getOldValue(), is("EMPTY"));
    }


    @Ignore
    @Test
    public void baAvazKardanePishnahadMeghdareJadidBayadTooyeListeTaghiratBiad(){
        Set<ElhaghiyeDiff> x = IElhaghiyeService.elhaghiyeDiffs(oldPish, newPish);
        List<ElhaghiyeDiff> l = new ArrayList<>();
        x.forEach(a -> l.add(a));
        assertThat( l.get(0).getNewValue(), is("555"));
    }

    @Ignore
    @Test
    public void baAvazKardanePishnahadMeghdareGhabliBayadTooyeListeTaghiratBiad(){
        Set<ElhaghiyeDiff> x = IElhaghiyeService.elhaghiyeDiffs(oldPish, newPish);
        List<ElhaghiyeDiff> l = new ArrayList<>();
        x.forEach(a -> l.add(a));
        assertThat( l.get(0).getOldValue(), is("75325025029"));
    }




}
