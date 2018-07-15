package ir.parsianinsurance.he.domain.service;

import com.querydsl.jpa.impl.JPAQuery;
import ir.parsianinsurance.he.domain.model.*;
import ir.parsianinsurance.he.domain.model.enums.NoeHadese;
import ir.parsianinsurance.he.domain.model.enums.VahedType;
import ir.parsianinsurance.he.domain.model.enums.VaziateKhesaratCase;
import ir.parsianinsurance.he.domain.model.enums.VaziateParvandeKhesarat;
import ir.parsianinsurance.he.infrastructure.Warning;
import ir.parsianinsurance.he.infrastructure.repository.KhesaratRepository;
import ir.parsianinsurance.he.infrastructure.repository.UserRepository;
import ir.parsianinsurance.he.infrastructure.repository.VahedRepository;
import ir.parsianinsurance.he.infrastructure.security.User;
import ir.parsianinsurance.he.infrastructure.security.UserBean;
import ir.parsianinsurance.he.infrastructure.util.DateUtil;
import ir.parsianinsurance.he.infrastructure.util.StringUtil;
import ir.parsianinsurance.he.interfaces.view.model.BordroKhesaratSearchModel;
import ir.parsianinsurance.he.interfaces.view.model.HavaleKhesaratSearchModel;
import ir.parsianinsurance.he.interfaces.view.model.KhesaratSearchModel;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * Created by 8119 on 7/25/2017.
 */

@RequestScoped
public class KhesaratService implements IKhesaratService {


    @Inject
    VahedRepository vahedRepository;

    @Inject
    KhesaratRepository khesaratRepository;

    @Inject
    UserRepository userRepository;

    @Inject
    EntityManager entityManager;

    @Inject
    UserBean userBean;

    @Inject
    IBimenameService bimenameService;

    @Inject
    IArtifactDocService artifactDocService;

    @Override
    public Khesarat buildKhesarat(Khesarat khesarat) {

        long vahedId = khesarat.getVahed().getId();
        Vahed vahed = vahedRepository.findOne(vahedId);

        khesarat.setVahed(vahed);

        return khesarat;
    }

    @Override
    public HavaleKhesarat buildHavaleKhesarat(HavaleKhesarat havaleKhesarat) {
        Long khesaratId = havaleKhesarat.getKhesarat().getId();
        Khesarat attachedKhesarat = khesaratRepository.findOne(khesaratId);
        havaleKhesarat.setKhesarat(attachedKhesarat);
        return havaleKhesarat;
    }

    @Override
    public KhesaratCase buildKhesaratCase(KhesaratCase khesaratCase) {
        User karshenas = userRepository.findOne(khesaratCase.getKarshenase_khesarat().getId());
        khesaratCase.setKarshenase_khesarat(karshenas);

        return khesaratCase;
    }

    @Override
    public void setShomareKhesaratCases(Khesarat khesarat) {

        List khesaratCasesList = new ArrayList(khesarat.undeletedKhesaratCases());
        Collections.sort(khesaratCasesList);
        int counter = 1;
        for(Object khesaratCase : khesaratCasesList)
        {
            String nextShomareKhesaratCase =    khesarat.getShomare_parvande() +
                                                "/" +
                                                String.format("%03d", counter);
            ((KhesaratCase)khesaratCase).setShomare(nextShomareKhesaratCase);
            counter++;
        }
    }

    @Override
    public void setShomareHavaleKhesarat(Khesarat khesarat) {

        List havalekhesaratslist = new ArrayList(khesarat.undeletedHavaleKhesarats());
        java.util.Collections.sort(havalekhesaratslist);
        int counter = 1;
        for(Object havalekhesarat : havalekhesaratslist)
        {
            String nextShomareHavaleKhesarat =    khesarat.getShomare_parvande() +
                                            "/" +
                                            String.format("%04d", counter);
            ((HavaleKhesarat)havalekhesarat).setShomareHavale(nextShomareHavaleKhesarat);
            counter++;
        }
    }

    @Override
    public List<Khesarat> searchKhesarat(KhesaratSearchModel searchedKhesarat, int rowLimit) {

        JPAQuery query = new JPAQuery(entityManager);
        filterForAll(query);
        filterForVahed(userBean.getCurrentUser().getVahed(), query);
        boolean filterApplied = filterByUserCriteriaAppliedForKhesarat(query, searchedKhesarat);

        if(!filterApplied)
            query.limit(rowLimit);

        query.orderBy(QKhesarat.khesarat.id.desc());
        return query.fetch();
    }

    @Override
    public boolean isKhesaratAble(Khesarat khesarat) {
        String tarikhSodoorFaskh = bimenameService.tarikhSodoorFaskh(khesarat.getBimename());
        String tarikhVoghooHadese = khesarat.getTarikhe_hadese();

        return StringUtil.isEmpty(tarikhSodoorFaskh) ?
                true : DateUtil.isGreaterThanOrEqual(tarikhSodoorFaskh, tarikhVoghooHadese);
    }

    @Override
    public Optional<Warning> addPossibleSaghfeKhesaratFotArtifactDocs(KhesaratCase khesaratCase, User user) {
        long saghfeKhesaratFot = vahedRepository.findOne(user.getVahed().getId()).getSaghfe_khesarat_fot();
        if (saghfeKhesaratFot < khesaratCase.getKhesarat_ghabl_pardakht()) {
            if (!artifactDocService.alreadyHasTayidShodeArfictDocOfKhesaratFot(khesaratCase)) {
                artifactDocService.addKhesaratFotArtifactDoc(khesaratCase);
                return Optional.of(Warning.warn("khesaratBishtarAzSaghfeKhesarateFotAst"));
            }
        }

        return Optional.empty();
    }

    @Override
    public Optional<Warning> addPossibleSaghfeKhesaratNaghseOzvArtifactDocs(KhesaratCase khesaratCase, User user) {
        long saghfeKhesaratNaghseOzv = vahedRepository.findOne(user.getVahed().getId()).getSaghfe_khesarat_naghsOzv();
        if (saghfeKhesaratNaghseOzv < khesaratCase.getKhesarat_ghabl_pardakht()) {
            if (!artifactDocService.alreadyHasTayidShodeArfictDocOfKhesaratNaghseOzv(khesaratCase)) {
                artifactDocService.addKhesaratNaghsOzvArtifactDoc(khesaratCase);
                return Optional.of(Warning.warn("khesaratBishtarAzSaghfeKhesarateNaghseOzvAst"));
            }
        }

        return Optional.empty();
    }

    @Override
    public Optional<Warning> addPossibleSaghfeKhesaratHazPezArtifactDocs(KhesaratCase khesaratCase, User user) {
        long saghfeKhesaratHazPez = vahedRepository.findOne(user.getVahed().getId()).getSaghfe_khesarat_hazinePezeshki();
        if (saghfeKhesaratHazPez < khesaratCase.getKhesarat_ghabl_pardakht()) {
            if (!artifactDocService.alreadyHasTayidShodeArfictDocOfKhesaratHazPez(khesaratCase)) {
                artifactDocService.addKhesaratHazPezArtifactDoc(khesaratCase);
                return Optional.of(Warning.warn("khesaratBishtarAzSaghfeKhesarateHazPezAst"));
            }
        }

        return Optional.empty();
    }

    @Override
    public boolean allOfKhesaratCasesTayidShodeHastand(Khesarat khesarat) {
        for(KhesaratCase khesaratCase : khesarat.undeletedKhesaratCases())
            if(!khesaratCase.getVaziat().equals(VaziateKhesaratCase.TAYIDE_MOJAVEZ))
                return false;
        return true;
    }

    @Override
    public boolean ayaBimenameBasteMishavad(Khesarat khesarat) {
        return khesarat .undeletedKhesaratCases()
                        .stream()
                        .anyMatch(khcase -> khcase.getNoehadese().equals(NoeHadese.FOT));
    }

    @Override
    public List<HavaleKhesarat> searchHavaleKhesarat(HavaleKhesaratSearchModel havaleKhesaratSearchModel) {
        JPAQuery query = new JPAQuery(entityManager);

        QHavaleKhesarat qHavaleKhesarat = QHavaleKhesarat.havaleKhesarat;
        query.from(qHavaleKhesarat);

        QKhesarat qKhesarat = QKhesarat.khesarat;

        VaziateParvandeKhesarat vaziateParvandeKhesarat = havaleKhesaratSearchModel.getVaziateParvandeKhesarat();
        if(!vaziateParvandeKhesarat.equals(VaziateParvandeKhesarat.EMPTY)) {
            query.join(qHavaleKhesarat.khesarat, qKhesarat)
                    .where(qKhesarat.vaziateparvande.eq(vaziateParvandeKhesarat));
        }

        Vahed namayande = havaleKhesaratSearchModel.getNamayandegi();
        if(namayande != null) {
            query.join(qHavaleKhesarat.khesarat, qKhesarat)
                    .where(qKhesarat.vahed.id.eq(namayande.getId()));
        }

        String sodoorAz = havaleKhesaratSearchModel.getAzTarikhSodoorHavale();
        if(!StringUtil.isEmpty(sodoorAz)) {
            query.where(qHavaleKhesarat.tarikhSodoorHavale.gt(sodoorAz));
        }

        String sodoorTa = havaleKhesaratSearchModel.getTaTarikhSodoorHavale();
        if(!StringUtil.isEmpty(sodoorTa)) {
            query.where(qHavaleKhesarat.tarikhSodoorHavale.lt(sodoorTa));
        }

        query.orderBy(QKhesarat.khesarat.id.desc());
        return query.fetch();    }

    @Override
    public List<Khesarat> searchBordroKhesarat(BordroKhesaratSearchModel bordroKhesaratSearchModel) {
        JPAQuery query = new JPAQuery(entityManager);

        QKhesarat qKhesarat = QKhesarat.khesarat;
        query.from(qKhesarat);

        QBimename qBimename = QBimename.bimename;
        QBimeGozar qBimeGozar = QBimeGozar.bimeGozar;

        String shomareBimename = bordroKhesaratSearchModel.getShomareBimename();
        if(!StringUtil.isEmpty(shomareBimename)) {
            query.join(qKhesarat.bimename, qBimename)
                    .where(qBimename.shomare.contains(shomareBimename));
        }

        BimeGozar bimeGozar = bordroKhesaratSearchModel.getBimeGozar();
        if(bimeGozar != null) {
            query.join(qBimename.pishnahadeFaal.bimeGozar, qBimeGozar)
                    .where(qBimeGozar.id.eq(bimeGozar.getId()));
        }

        Vahed namayande = bordroKhesaratSearchModel.getNamayandegi();
        if(namayande != null) {
            query.where(qKhesarat.vahed.id.eq(namayande.getId()));
        }

        String tarikhtashkilAz = bordroKhesaratSearchModel.getAzTarikh();
        if(!StringUtil.isEmpty(tarikhtashkilAz)) {
            query.where(qKhesarat.tarikhe_tashkil_parvande.gt(tarikhtashkilAz));
        }

        String tarikhtashkilTa = bordroKhesaratSearchModel.getTaTarikh();
        if(!StringUtil.isEmpty(tarikhtashkilTa)) {
            query.where(qKhesarat.tarikhe_tashkil_parvande.lt(tarikhtashkilTa));
        }

        query.orderBy(QKhesarat.khesarat.id.desc());
        return query.fetch();
    }

    private void filterForAll(JPAQuery query) {
        QKhesarat qKhesarat = QKhesarat.khesarat;
        query   .from(qKhesarat);
    }

    private void filterForVahed(Vahed currentUserVahed, JPAQuery query) {

        if(currentUserVahed.getVahedType().equals(VahedType.SETAD))
            return;

        QKhesarat qKhesarat = QKhesarat.khesarat;

        query.where(qKhesarat.vahed.eq(currentUserVahed)
                .or(qKhesarat.vahed.sarparast.eq(currentUserVahed))
        );
    }

    private boolean filterByUserCriteriaAppliedForKhesarat(JPAQuery query, KhesaratSearchModel searchedKhesarat) {

        boolean applied = false;

        QKhesarat qKhesarat = QKhesarat.khesarat;
        QBimename qBimename = QBimename.bimename;

        String shomareBimename = searchedKhesarat.getShomareBimename();
        if(!StringUtil.isEmpty(shomareBimename)) {
            query.join(qKhesarat.bimename, qBimename)
                    .where(qBimename.shomare.contains(shomareBimename));
            applied = true;
        }

        String shomareParvande = searchedKhesarat.getShomareParvande();
        if(!StringUtil.isEmpty(shomareParvande)) {
            query.where(qKhesarat.shomare_parvande.contains(shomareParvande));
            applied = true;
        }
        return applied;
    }



}
