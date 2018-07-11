package ir.parsianinsurance.he.domain.service;

import com.querydsl.jpa.impl.JPAQuery;
import ir.parsianinsurance.he.domain.model.*;
import ir.parsianinsurance.he.domain.model.enums.NoeTaahod;
import ir.parsianinsurance.he.domain.model.enums.VahedType;
import ir.parsianinsurance.he.domain.model.enums.VaziateBimename;
import ir.parsianinsurance.he.infrastructure.Warning;
import ir.parsianinsurance.he.infrastructure.repository.*;
import ir.parsianinsurance.he.infrastructure.security.User;
import ir.parsianinsurance.he.infrastructure.security.UserBean;
import ir.parsianinsurance.he.infrastructure.util.StringUtil;
import ir.parsianinsurance.he.interfaces.view.model.ElhaghiyeSearchModel;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Mohammad on 5/27/2017.
 */

@RequestScoped
public class ElhaghiyeService implements IElhaghiyeService {

    @Inject
    UserRepository emzakonandeRepository;

    @Inject
    VahedRepository vahedRepository;

    @Inject
    ShakhsHoghoghiRepository shakhsHoghoghiRepository;

    @Inject
    BimegozarRepository bimegozarRepository;

    @Inject
    BimeshodeRepository bimeshodeRepository;

    @Inject
    BimenameRepository bimenameRepository;

    @Inject
    ZinafRepository zinafRepository;

    @Inject
    EntityManager entityManager;

    @Inject
    ElhaghiyeRepository elhaghiyeRepository;

    @Inject
    UserBean userBean;

    @Inject
    IArtifactDocService artifactDocService;

    @Inject
    IBimenameService bimenameService;

    @Override
    public Set<ElhaghiyeDiff> elhaghiyeDiffs(Pishnahad oldPishnahad, Pishnahad newPishnahad) {

        Set<ElhaghiyeDiff> diffsList = new HashSet<>();

        List<ElhaghiyeDiff> pishnahadDiffs = oldPishnahad.elhagiyeDiffs(newPishnahad);
        List<ElhaghiyeDiff> bazaryabDiffs = oldPishnahad.getBazaryab().elhagiyeDiffs(newPishnahad.getBazaryab());
        List<ElhaghiyeDiff> bimegozarDiffs = oldPishnahad.getBimeGozar().elhagiyeDiffs(newPishnahad.getBimeGozar());
        List<ElhaghiyeDiff> bimeshodeDiffs = oldPishnahad.getBimeShode().elhagiyeDiffs(newPishnahad.getBimeShode());
        List<ElhaghiyeDiff> emzakonande1Diffs = oldPishnahad.getEmzaKonande_aval().elhagiyeDiffs(newPishnahad.getEmzaKonande_aval());
        List<ElhaghiyeDiff> emzakonande2Diffs = oldPishnahad.getEmzaKonande_dovom().elhagiyeDiffs(newPishnahad.getEmzaKonande_dovom());
        List<ElhaghiyeDiff> ezafekasrDiffs = oldPishnahad.getEzafeKasr().elhagiyeDiffs(newPishnahad.getEzafeKasr());
        List<ElhaghiyeDiff> gharardadDiffs = oldPishnahad.getGharardad().elhagiyeDiffs(newPishnahad.getGharardad());
        List<ElhaghiyeDiff> namayandeDiffs = oldPishnahad.getVahed().elhagiyeDiffs(newPishnahad.getVahed());
        List<ElhaghiyeDiff> khatareEzafiDiffs = elhaghiyeableCollectionElhaghiyeDiff(oldPishnahad.getKhatarEzafis(), newPishnahad.getKhatarEzafis());
        List<ElhaghiyeDiff> zinafDiffs = elhaghiyeableCollectionElhaghiyeDiff(oldPishnahad.getZinafs(), newPishnahad.getZinafs());
        List<ElhaghiyeDiff> taahodDiffs = elhaghiyeableCollectionElhaghiyeDiff(oldPishnahad.getTaahodBimegars(), newPishnahad.getTaahodBimegars());
        List<ElhaghiyeDiff> hagheBimeDiffs = oldPishnahad.getHagheBime().elhagiyeDiffs(newPishnahad.getHagheBime());

        diffsList.addAll(pishnahadDiffs);
        diffsList.addAll(bazaryabDiffs);
        diffsList.addAll(bimegozarDiffs);
        diffsList.addAll(bimeshodeDiffs);
        diffsList.addAll(emzakonande1Diffs);
        diffsList.addAll(emzakonande2Diffs);
        diffsList.addAll(ezafekasrDiffs);
        diffsList.addAll(gharardadDiffs);
        diffsList.addAll(namayandeDiffs);
        diffsList.addAll(khatareEzafiDiffs);
        diffsList.addAll(zinafDiffs);
        diffsList.addAll(taahodDiffs);
        diffsList.addAll(hagheBimeDiffs);
        return diffsList;
    }

    private ElhaghiyeableCollection getElhaghiyeableCollectionIfZamaneIjadExists(List<ElhaghiyeableCollection> elhaghiyeableCollections, long createdDate)
    {
        for (ElhaghiyeableCollection elhaghiyeableCollection : elhaghiyeableCollections)
            if (elhaghiyeableCollection.getCreatedDate() == createdDate)
                return elhaghiyeableCollection;

        return null;
    }

    @Override
    public List<ElhaghiyeDiff> elhaghiyeableCollectionElhaghiyeDiff(Set<? extends ElhaghiyeableCollection> oldSet,
                                                                    Set<? extends ElhaghiyeableCollection> newSet)
    {
        List<ElhaghiyeDiff> diffsList = new ArrayList<>();
        Set<ElhaghiyeableCollection> deletedDiffsList = new HashSet<>();
        Set<ElhaghiyeableCollection> addedDiffsList = new HashSet<>();

        List<ElhaghiyeableCollection> oldList = new ArrayList<ElhaghiyeableCollection>(oldSet)
                                                        .stream()
                                                        .collect(Collectors.toList());

        List<ElhaghiyeableCollection> newList = new ArrayList<ElhaghiyeableCollection>(newSet)
                                                        .stream()
                                                        .collect(Collectors.toList());

        for(ElhaghiyeableCollection elhaghiyeableCollection : oldList) {
            ElhaghiyeableCollection tryToFind = getElhaghiyeableCollectionIfZamaneIjadExists(newList, elhaghiyeableCollection.getCreatedDate());
            if(tryToFind == null)
                deletedDiffsList.add(elhaghiyeableCollection);
            else
                diffsList.addAll(elhaghiyeableCollection.elhagiyeDiffs(tryToFind));
        }

        for(ElhaghiyeableCollection elhaghiyeableCollection : newList) {
            ElhaghiyeableCollection tryToFind = getElhaghiyeableCollectionIfZamaneIjadExists(oldList, elhaghiyeableCollection.getCreatedDate());
            if(tryToFind == null)
                addedDiffsList.add(elhaghiyeableCollection);
        }

        for(ElhaghiyeableCollection addedElhaghiyeableCollection : addedDiffsList)
        {
            addedElhaghiyeableCollection.elhagiyeDiffs(null)
                    .forEach(ed -> diffsList.add(ed.swapNewAndOld()));
        }

        for(ElhaghiyeableCollection deletedElhaghiyeableCollection : deletedDiffsList)
        {
            deletedElhaghiyeableCollection.elhagiyeDiffs(null)
                    .forEach(ed -> diffsList.add(ed));
        }

        return diffsList;
    }

    @Override
    public Elhaghiye buildElhaghiyeToPersist(Elhaghiye elhaghiye){

        User emzaKonande_aval = emzakonandeRepository.findOne(elhaghiye.getEmzaKonande_aval().getId());
        elhaghiye.setEmzaKonande_aval(emzaKonande_aval);

        User emzaKonande_dovom = emzakonandeRepository.findOne(elhaghiye.getEmzaKonande_dovom().getId());
        elhaghiye.setEmzaKonande_dovom(emzaKonande_dovom);

        elhaghiye.vahed(userBean.getCurrentUser().getVahed());

        return elhaghiye;
    }

    @Override
    public String generateShomareElhaghiye(Bimename bimename) {

        int elhaghiyeCount = bimename.getElhaghiyes().size() + 1;
        String shomareElhaghiye =   bimename.getShomare() +
                                    "/" +
                                    String.format("%03d", elhaghiyeCount);
        return shomareElhaghiye;
    }

    @Override
    public List<Elhaghiye> searchElhaghiye(ElhaghiyeSearchModel searchedElhaghiye, int rowLimit) {

        /**
         * QueryDsl has limitation on depth of implicit join, so for this
         * particular situation we had to use explicit join which needs to
         * have explicit reference to entity manager.
         * **/
        JPAQuery query = new JPAQuery(entityManager);

        filterForAll(query);

        filterForVahed(userBean.getCurrentUser().getVahed(), query);

        boolean filterApplied = filterByUserCriteriaAppliedForElhaghiye(query, searchedElhaghiye);

        if(!filterApplied)
            query.limit(rowLimit);

        query.orderBy(QElhaghiye.elhaghiye.id.desc());
        return query.fetch();
    }

    @Override
    public void deprecateOldPishnahad(Pishnahad oldPishnahad) {

        oldPishnahad.getBimeGozar().setDeprecatedByElhaghiye(true);
        bimegozarRepository.save(oldPishnahad.getBimeGozar());

        oldPishnahad.getBimeShode().setDeprecatedByElhaghiye(true);
        bimeshodeRepository.save(oldPishnahad.getBimeShode());

        oldPishnahad.getZinafs().forEach(zf->{
            zf.setDeprecatedByElhaghiye(true);
            zinafRepository.save(zf);
        });
    }

    @Override
    @Transactional
    public void taeedeSodooreElhaghiyeyeMojavezDaar(Elhaghiye elhaghiye) {
        elhaghiyeRepository.save(elhaghiye);
        elhaghiye.getBimename().setVaziateBimename(VaziateBimename.DARAYE_ELHAGHIYE_TAGHIR);
        bimenameRepository.save(elhaghiye.getBimename());
    }

    @Override
    public Optional<Warning> addPossibleElhaghiyeFaskhArtifactDocs(Elhaghiye elhaghiye, User user) {

            if(!artifactDocService.alreadyHasTayidShodeArfictDocOfFaskh(elhaghiye))
                {
                    artifactDocService.addFaskhArtifactDoc(elhaghiye);
                    return Optional.of(Warning.warn("faskhniazbemojavezdarad"));
                }

        return Optional.empty();
    }


    @Override
    public Optional<Warning> addPossibleElhaghiyeEbtalArtifactDocs(Elhaghiye elhaghiye, User user) {

            if(!artifactDocService.alreadyHasTayidShodeArfictDocOfEbtal(elhaghiye))
                {
                    artifactDocService.addEbtalArtifactDoc(elhaghiye);
                    return Optional.of(Warning.warn("ebtalniazbemojavezdarad"));
                }

        return Optional.empty();
    }

    @Override
    public Optional<Warning> addPossibleElhaghiyeTaghirSaghfeSodoorArtifactDocs(Elhaghiye elhaghiye, User user) {

        long saghfeSodoor = vahedRepository.findOne(user.getVahed().getId()).getSaghfe_sodoor();
        if (saghfeSodoor < elhaghiye.getBimename().getPishnahadeFaal().getSarmayePooshesh(NoeTaahod.FOT)) {
                artifactDocService.addElhaghiyeSaghfeSodoorArtifactDoc(elhaghiye);
                return Optional.of(Warning.warn("sarmayefotBishtarAzSaghfeSodoorAst"));
        }

        return Optional.empty();
    }


    private void filterForAll(JPAQuery query) {

        QElhaghiye qElhaghiye = QElhaghiye.elhaghiye;
        query   .from(qElhaghiye);
    }


    private void filterForVahed(Vahed currentUserVahed, JPAQuery query) {

        if(currentUserVahed.getVahedType().equals(VahedType.SETAD))
            return;

        QElhaghiye qElhaghiye = QElhaghiye.elhaghiye;

        query.where(qElhaghiye.vahed.eq(currentUserVahed).or(
                    qElhaghiye.vahed.sarparast.eq(currentUserVahed)));
    }

    private boolean filterByUserCriteriaAppliedForElhaghiye(JPAQuery query, ElhaghiyeSearchModel searchedElhaghiye){
        boolean applied = false;
        QElhaghiye qElhaghiye = QElhaghiye.elhaghiye;


        String shomareElhaghiye = searchedElhaghiye.getShomareElhaghiye();
        if(!StringUtil.isEmpty(shomareElhaghiye)) {
            query.where(qElhaghiye.shomareElhaghiye.contains(shomareElhaghiye));
            applied = true;
        }

        String shomareBimename = searchedElhaghiye.getShomareBimename();
        if(!StringUtil.isEmpty(shomareBimename)) {
            QBimename qBimename = QBimename.bimename;
            query.join(qElhaghiye.bimename, qBimename)
                 .where(qBimename.shomare.contains(shomareBimename));
            applied = true;
        }

        Vahed vahedeSodoor = searchedElhaghiye.getVahedeSodoor();
        if(vahedeSodoor != null) {
            query.where(qElhaghiye.vahed.code.eq(vahedeSodoor.getCode()));
            applied = true;
        }

        String aztarikhsodoor = searchedElhaghiye.getAztarikheSodoor();
        if(aztarikhsodoor != null && !aztarikhsodoor.trim().isEmpty()) {
            query.where(qElhaghiye.tarikh_sodoor_elhaghie.gt(aztarikhsodoor));
            applied = true;
        }

        String tatarikhsodoor = searchedElhaghiye.getTatarikheSodoor();
        if(tatarikhsodoor != null && !tatarikhsodoor.trim().isEmpty()) {
            query.where(qElhaghiye.tarikh_sodoor_elhaghie.lt(tatarikhsodoor));
            applied = true;
        }

        String aztarikhsodoorBimename = searchedElhaghiye.getAztarikheSodoorBimename();
        if(aztarikhsodoorBimename != null && !aztarikhsodoorBimename.trim().isEmpty()) {
            query.where(qElhaghiye.bimename.tarikhesodoor.gt(aztarikhsodoorBimename));
            applied = true;
        }

        String tatarikhsodoorBimename = searchedElhaghiye.getTatarikheSodoorBimename();
        if(tatarikhsodoorBimename != null && !tatarikhsodoorBimename.trim().isEmpty()) {
            query.where(qElhaghiye.bimename.tarikhesodoor.lt(tatarikhsodoorBimename));
            applied = true;
        }

        return applied;
    }

}
