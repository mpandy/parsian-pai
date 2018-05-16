package ir.parsianinsurance.he.domain.service;

import ir.parsianinsurance.he.domain.model.*;
import ir.parsianinsurance.he.domain.model.enums.NoeKhatarEzafi;
import ir.parsianinsurance.he.infrastructure.io.Zamime;
import ir.parsianinsurance.he.infrastructure.repository.*;
import ir.parsianinsurance.he.infrastructure.security.User;
import ir.parsianinsurance.he.infrastructure.security.UserBean;

import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Mohammad on 5/31/2017.
 */

@Model
public class PishnahadService implements IPishnahadService {

    @Inject
    VahedRepository vahedRepository;

    @Inject
    PishnahadRepository pishnahadRepository;

    @Inject
    GharardadRepository gharardadRepository;

    @Inject
    ShakhseHaghighiRepository shakhseHaghighiRepository;

    @Inject
    ShakhsHoghoghiRepository shakhsHoghoghiRepository;

    @Inject
    ShoghlRepository shoghlRepository;

    @Inject
    UserRepository userRepository;

    @Inject
    BimegozarRepository bimegozarRepository;

    @Inject
    ZamimeRepository zamimeRepository;

    @Inject
    BimeshodeRepository bimeshodeRepository;

    @Inject
    TaahodBimegarRepository taahodBimegarRepository;

    @Inject
    ZinafRepository zinafRepository;

    @Inject
    KhatarEzafiRepository khatarEzafiRepository;

    @Inject
    IVahedService vahedService;

    @Inject
    UserBean userBean;

    @Inject
    transient ResourceBundle bundle;

    @Override
    public Pishnahad buildPishnahadToPersist(Pishnahad pishnahad)  {

        User bazaryab = userRepository.findOne(pishnahad.getBazaryab().getId());
        User emzaKonande1 = userRepository.findOne(pishnahad.getEmzaKonande_aval().getId());
        User emzaKonande2 = userRepository.findOne(pishnahad.getEmzaKonande_dovom().getId());

        Gharardad gharardad = gharardadRepository.findOne(pishnahad.getGharardad().getId());

        pishnahad   .gharardad(gharardad)
                    .bazaryab(bazaryab)
                    .emzakonande_avval(emzaKonande1)
                    .emzakonande_dovvom(emzaKonande2);

        if(pishnahad.getBimeGozar().getId() != null)
        {
            BimeGozar bimeGozar = bimegozarRepository.findOne(pishnahad.getBimeGozar().getId());
            pishnahad.bimegozar(bimeGozar);
        }
        else
        {
            pishnahad.getBimeGozar().getShakhs().setId(null);
        }

        if(pishnahad.getBimeShode().getShakhseHaghighi().getId() != null)
        {
            ShakhseHaghighi sh = shakhseHaghighiRepository.findOne(pishnahad.getBimeShode().getShakhseHaghighi().getId());
            pishnahad.getBimeShode().setShakhseHaghighi(sh);
        }

        if(pishnahad.getBimeShode().getId() != null)
        {
            BimeShode bimeShode = bimeshodeRepository.findOne(pishnahad.getBimeShode().getId());
            pishnahad.setBimeShode(bimeShode);
        }
        else
        {
            Shoghl shoghl = shoghlRepository.findOne(pishnahad.getBimeShode().getShoghl().getId());
            pishnahad.getBimeShode().setShoghl(shoghl);
        }

        return pishnahad;
    }

    @Override
    public Pishnahad buildPishnahadToUpdate(Pishnahad pishnahadToBeUpdated) {
        shakhseHaghighiRepository.save(pishnahadToBeUpdated.getBimeShode().getShakhseHaghighi());

        Shakhs bimegozarShakhs = pishnahadToBeUpdated.getBimeGozar().getShakhs();

        if(bimegozarShakhs instanceof ShakhseHaghighi)
            shakhseHaghighiRepository.save((ShakhseHaghighi) bimegozarShakhs);
        if(bimegozarShakhs instanceof ShakhseHoghooghi)
            shakhsHoghoghiRepository.save((ShakhseHoghooghi) bimegozarShakhs);

        bimeshodeRepository.save(pishnahadToBeUpdated.getBimeShode());
        bimegozarRepository.save(pishnahadToBeUpdated.getBimeGozar());

        updateZinafs(pishnahadToBeUpdated);
        updateKhatareEzafis(pishnahadToBeUpdated);
        updateTaahods(pishnahadToBeUpdated);
        updateZamimePishnahad(pishnahadToBeUpdated);

        pishnahadRepository.save(pishnahadToBeUpdated);
        return pishnahadToBeUpdated;
    }

    private void updateZamimePishnahad(Pishnahad pishnahadToBeUpdated) {
        Zamime zamimePishnahad = pishnahadToBeUpdated.getZamimePishnahad();
        if(zamimePishnahad != null)
            zamimeRepository.save(zamimePishnahad);
    }

    private void updateTaahods(Pishnahad pishnahadToBeUpdated) {
        for (TaahodBimegar tb : pishnahadToBeUpdated.getTaahodBimegars())
            taahodBimegarRepository.save(tb);

        Set<TaahodBimegar> oldTaahodBimegars = pishnahadRepository.findOne(pishnahadToBeUpdated.getId()).getTaahodBimegars();
        oldTaahodBimegars.forEach(tb -> {
            if(!pishnahadToBeUpdated.getTaahodBimegars().contains(tb))
                taahodBimegarRepository.delete(tb);
        });
    }

    private void updateKhatareEzafis(Pishnahad pishnahadToBeUpdated) {

        for (KhatarEzafi ke : pishnahadToBeUpdated.getKhatarEzafis())
            khatarEzafiRepository.save(ke);

        Set<KhatarEzafi> oldKhatarEzafis = pishnahadRepository.findOne(pishnahadToBeUpdated.getId()).getKhatarEzafis();
        oldKhatarEzafis.forEach(ke -> {
            if(!pishnahadToBeUpdated.getKhatarEzafis().contains(ke))
                khatarEzafiRepository.delete(ke);
        });

    }

    private void updateZinafs(Pishnahad pishnahadToBeUpdated) {

        for (Zinaf z : pishnahadToBeUpdated.getZinafs())
            zinafRepository.save(z);

        Set<Zinaf> oldZinafs = pishnahadRepository.findOne(pishnahadToBeUpdated.getId()).getZinafs();
        oldZinafs.forEach(z -> {
            if(!pishnahadToBeUpdated.getZinafs().contains(z))
                zinafRepository.delete(z);
        });
    }

    @Override
    public Pishnahad loadPishnahad(Pishnahad pishnahad) {

        Long gharardadId = pishnahad.getGharardad().getId();
        Long bazaryabId = pishnahad.getBazaryab().getId();
        Long zamimeId = pishnahad.getZamimePishnahad().getId();
        Long emzakonandeavalId = pishnahad.getEmzaKonande_aval().getId();
        Long emzakonandedovomId = pishnahad.getEmzaKonande_dovom().getId();

        Gharardad gharardad = gharardadRepository.findOne(gharardadId);
        User emzaKonandeaval = userRepository.findOne(emzakonandeavalId);
        User emzaKonandedovom = userRepository.findOne(emzakonandedovomId);
        User bazaryab = userRepository.findOne(bazaryabId);
        Zamime zamime = zamimeRepository.findOne(zamimeId);

        pishnahad.gharardad(gharardad);
        pishnahad.setZamimePishnahad(zamime);
        pishnahad.setEmzaKonande_aval(emzaKonandeaval);
        pishnahad.setEmzaKonande_dovom(emzaKonandedovom);
        pishnahad.setBazaryab(bazaryab);

        return pishnahad;
    }

    @Override
    public Zamime loadZamimePishnahad(Long pishnahadId) {
        Zamime zamimePishnahad = pishnahadRepository.findOne(pishnahadId).getZamimePishnahad();
        return (zamimePishnahad == null) ?
                null : zamimeRepository.findOne(zamimePishnahad.getId());
    }

    @Override
    public List<Gharardad> autocompleteGharardad(String name) {
        return gharardadRepository.findByNameContains(name.trim());
    }

    @Override
    public List<BimeGozar> autocompleteBimegozar(String name) {

        Set<BimeGozar> bimeGozars = new HashSet<>();
        Set<Pishnahad> pishnahads = new HashSet<>();
        List<Vahed> vaheds = vahedService.zirmajmooe(userBean.getCurrentUser().getVahed());
        for (Vahed vahed : vaheds)
            pishnahads.addAll(pishnahadRepository.findByVahed(vahed));

        for(Pishnahad pishnahad : pishnahads)
        {
            if(!pishnahad.getBimeGozar().isDeprecatedByElhaghiye() &&
                    pishnahad.getBimeGozar().toString().contains(name))
                bimeGozars.add(pishnahad.getBimeGozar());
        }

        List<BimeGozar> l = new ArrayList<>();
        for(BimeGozar bimeGozar : bimeGozars)
            l.add(bimeGozar);

        return l;

    }

    @Override
    public List<BimeShode> autocompleteBimeshode(String name) {

        Set<BimeShode> bimeShodes = new HashSet<>();
        Set<Pishnahad> pishnahads = new HashSet<>();
        List<Vahed> vaheds = vahedService.zirmajmooe(userBean.getCurrentUser().getVahed());
        for (Vahed vahed : vaheds)
            pishnahads.addAll(pishnahadRepository.findByVahed(vahed));

        for(Pishnahad pishnahad : pishnahads)
        {
            if(!pishnahad.getBimeGozar().isDeprecatedByElhaghiye() &&
                    pishnahad.getBimeGozar().toString().contains(name))
                bimeShodes.add(pishnahad.getBimeShode());
        }

        List<BimeShode> l = new ArrayList<>();
        for(BimeShode bimeShode : bimeShodes)
            l.add(bimeShode);

        return l;

    }

    public List<NoeKhatarEzafi> autocompleteKhatareEzafi(String khatar) {
        return Arrays   .stream(NoeKhatarEzafi.values())
                        .filter(x -> bundle.getString(x.name()).contains(khatar))
                        .collect(Collectors.toList());

    }

    @Override
    public List<Shoghl> autocompleteShoghl(String shoghl) {
        return shoghlRepository.findByNameContains(shoghl);
    }

}
