package ir.parsianinsurance.he.domain.service;

import com.querydsl.jpa.impl.JPAQuery;
import ir.parsianinsurance.he.domain.model.*;
import ir.parsianinsurance.he.domain.model.enums.*;
import ir.parsianinsurance.he.domain.rule.IPropertyRules;
import ir.parsianinsurance.he.infrastructure.Warning;
import ir.parsianinsurance.he.infrastructure.repository.BimenameRepository;
import ir.parsianinsurance.he.infrastructure.repository.VahedRepository;
import ir.parsianinsurance.he.infrastructure.security.User;
import ir.parsianinsurance.he.infrastructure.security.UserBean;
import ir.parsianinsurance.he.infrastructure.util.DateUtil;
import ir.parsianinsurance.he.infrastructure.util.StringUtil;
import ir.parsianinsurance.he.interfaces.view.model.BimenameSearchModel;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

/**
 * Created by Mohammad on 9/5/2017.
 */

@RequestScoped
public class BimenameService implements IBimenameService {

    @Inject
    UserBean userBean;

    @Inject
    BimenameRepository bimenameRepository;

    @Inject
    VahedRepository vahedRepository;

    @Inject
    EntityManager entityManager;

    @Inject
    IArtifactDocService artifactDocService;

    @Inject
    IPropertyRules propertyRules;

    @Override
    public List<Bimename> searchBimename(BimenameSearchModel searchedBimename, int rowLimit) {
        /**
         * QueryDsl has limitation on depth of implicit join, so for this
         * particular situation we had to use explicit join which needs to
         * have explicit reference to entity manager.
         * **/
        JPAQuery query = new JPAQuery(entityManager);
        QBimename qBimename = QBimename.bimename;

        filterForAll(query);

        filterForVahed(userBean.getCurrentUser().getVahed(), query);

        boolean filterApplied = filterForUserCriteria(query, searchedBimename);

        if(!filterApplied)
            query.limit(rowLimit);

        query.orderBy(qBimename.id.desc());
        return query.fetch();
    }

    @Override
    public boolean isEbtalable(Bimename bimename) {
        boolean bimenameHasBeenIssuedWithin24Hours = false;
        if(bimename.getTarikhesodoor().equals(DateUtil.getJalaliCurrentDate()))
            bimenameHasBeenIssuedWithin24Hours = true;

        return bimenameHasBeenIssuedWithin24Hours;
    }

    @Override
    @Transactional
    public String tarikhSodoorFaskh(Bimename bimename) {
        Bimename b = bimenameRepository.findOne(bimename.getId());

        for (Elhaghiye elhaghiye : b.getElhaghiyes())
            if (elhaghiye.getNoe_elhaghie().equals(NoeElhaghiye.FASKHAZTARAFEBIMEGAR) ||
                elhaghiye.getNoe_elhaghie().equals(NoeElhaghiye.FASKHAZTARAFEBIMEGOZAR))
                    return elhaghiye.getTarikh_sodoor_elhaghie();
        return "";
    }

    @Override
    public Optional<Warning> addPossibleBimenameSaghfeSodoorArtifactDocs(Bimename bimename, User user) {

        long saghfeSodoor = vahedRepository.findOne(user.getVahed().getId()).getSaghfe_sodoor();
        if (saghfeSodoor < bimename.getPishnahadeFaal().getSarmayePooshesh(NoeTaahod.FOT)) {
            if (!artifactDocService.alreadyHasTayidShodeArfictDocOfSaghfeSodoor(bimename)) {
                artifactDocService.addSaghfeSodoorArtifactDoc(bimename);
                return Optional.of(Warning.warn("sarmayefotBishtarAzSaghfeSodoorAst"));
            }
        }

        return Optional.empty();
    }

    @Override
    public Optional<Warning> addPossibleBimenameTakhfifModiriatiArtifactDocs(Bimename bimename, User user) {

        double saghfe_takhfif_modiriati = vahedRepository.findOne(user.getVahed().getId()).getSaghfe_takhfif_modiriati();
        if (saghfe_takhfif_modiriati < bimename.getPishnahadeFaal().getEzafeKasr().getTakhfife_modiriati()) {
            if(!artifactDocService.alreadyHasTayidShodeArfictDocOfTakhfifeModiriati(bimename)) {
                artifactDocService.addTakhfifeModiriatiArtifactDoc(bimename);
                return Optional.of(Warning.warn("takhfifmodiriatibishaz20niazbemojavezdarad"));
            }
        }
        return Optional.empty();
    }


    private void filterForAll(JPAQuery query) {

        QBimename qBimename = QBimename.bimename;
        QPishnahad qPishnahad = QPishnahad.pishnahad;

        query   .from(qBimename)
                .join(qBimename.pishnahadeFaal, qPishnahad);
    }

    private void filterForVahed(Vahed currentUserVahed, JPAQuery query) {

        if(currentUserVahed.getVahedType().equals(VahedType.SETAD))
            return;

        QVahed qvahedsodoor = QVahed.vahed;
        QPishnahad qPishnahad = QPishnahad.pishnahad;
        QBimename qBimename = QBimename.bimename;

        query   .leftJoin(qBimename.vahedeSodoor, qvahedsodoor)
                .where( qPishnahad.vahed.eq(currentUserVahed).or(
                        qPishnahad.vahed.sarparast.eq(currentUserVahed)).or(
                        qvahedsodoor.eq(currentUserVahed)).or(
                        qvahedsodoor.sarparast.eq(currentUserVahed)));
    }

    private boolean filterForUserCriteria(JPAQuery query, BimenameSearchModel searchedBimename) {

        boolean applied = false;

        QBimename qBimename = QBimename.bimename;
        QPishnahad qPishnahad = QPishnahad.pishnahad;

        String shomareBimename = searchedBimename.getShomareBimename();
        if(!StringUtil.isEmpty(shomareBimename)) {
            query.where(qBimename.shomare.contains(shomareBimename));
            applied = true;
        }

        VaziateBimename vaziateBimename = searchedBimename.getVaziateBimename();
        if(vaziateBimename != null && !vaziateBimename.equals(VaziateBimename.EMPTY)) {
            query.where(qBimename.vaziateBimename.eq(vaziateBimename));
            applied = true;
        }

        String nameBimegozar = searchedBimename.getBimegozarName();
        if(!StringUtil.isEmpty(nameBimegozar)) {
            QBimeGozar qBimeGozar = QBimeGozar.bimeGozar;
            QShakhseHaghighi qShakhseHaghighi = QShakhseHaghighi.shakhseHaghighi;

            query.join(qPishnahad.bimeGozar, qBimeGozar)
                    .join(qBimeGozar.shakhs, qShakhseHaghighi)
                    .where( qShakhseHaghighi.name.contains(nameBimegozar).or(
                            qShakhseHaghighi.name_khanevadegi.contains(nameBimegozar)
                    ));
            applied = true;
        }

        String nameBimeshode = searchedBimename.getBimeshodeName();
        if(!StringUtil.isEmpty(nameBimeshode)) {
            QBimeShode qBimeShode = QBimeShode.bimeShode;
            QShakhseHaghighi qShakhseHaghighi = QShakhseHaghighi.shakhseHaghighi;

            query.join(qPishnahad.bimeShode, qBimeShode)
                    .join(qBimeShode.shakhseHaghighi, qShakhseHaghighi)
                    .where( qShakhseHaghighi.name.contains(nameBimeshode).or(
                            qShakhseHaghighi.name_khanevadegi.contains(nameBimeshode)
                    ));
            applied = true;
        }

        String codeMelliBimeshode = searchedBimename.getCodemeliBimeshode();
        if(!StringUtil.isEmpty(codeMelliBimeshode)) {
            QBimeShode qBimeShode = QBimeShode.bimeShode;
            QShakhseHaghighi qShakhseHaghighi = QShakhseHaghighi.shakhseHaghighi;

            query.join(qPishnahad.bimeShode, qBimeShode)
                 .join(qBimeShode.shakhseHaghighi, qShakhseHaghighi)
                 .where(qShakhseHaghighi.kode_meli.eq(codeMelliBimeshode));
            applied = true;
        }

        String codeMelliBimeGozar = searchedBimename.getCodemeliBimegozar();
        if(!StringUtil.isEmpty(codeMelliBimeGozar)) {
            QBimeGozar qBimeGozar = QBimeGozar.bimeGozar;
            QShakhseHaghighi qShakhseHaghighi = QShakhseHaghighi.shakhseHaghighi;

            query.join(qPishnahad.bimeGozar, qBimeGozar)
                    .join(qBimeGozar.shakhs, qShakhseHaghighi)
                    .where(qShakhseHaghighi.kode_meli.eq(codeMelliBimeGozar));
            applied = true;
        }

        Vahed namayandegi = searchedBimename.getNamayandegi();
        if(namayandegi != null) {
            query.where(qPishnahad.vahed.code.eq(namayandegi.getCode()));
            applied = true;
        }

        Vahed vahedeSodoor = searchedBimename.getVahedeSodoor();
        if(vahedeSodoor != null) {
            query.where(qBimename.vahedeSodoor.code.eq(vahedeSodoor.getCode()));
            applied = true;
        }

        String gharardadName = searchedBimename.getGharardadName();
        if(!StringUtil.isEmpty(gharardadName)) {
            query.where(qPishnahad.gharardad.name.contains(gharardadName));
            applied = true;
        }

        String gorooh = searchedBimename.getGoroohName();
        if(!StringUtil.isEmpty(gorooh)) {
            query.where(qPishnahad.gharardad.goroohs.contains(gorooh));
            applied = true;
        }

        TabagheKhatar tabaghekhatar = searchedBimename.getTabagheKhatar();
        if(!tabaghekhatar.equals(TabagheKhatar.EMPTY)) {
            query.where(qPishnahad.tabagheKhatar.eq(tabaghekhatar));
            applied = true;
        }

        String shoghl = searchedBimename.getShoghl();
        if(!StringUtil.isEmpty(shoghl)) {
            QBimeShode qBimeShode = QBimeShode.bimeShode;
            query.join(qPishnahad.bimeShode, qBimeShode)
                    .where(qBimeShode.shoghl.name.contains(shoghl));
            applied = true;
        }

        User bazaryab = searchedBimename.getBazaryab();
        if(bazaryab != null) {
            query.where(qPishnahad.bazaryab.codeBazaryab.eq(bazaryab.getCodeBazaryab()));
            applied = true;
        }

        String nameSherkat = searchedBimename.getNameSherkat();
        if(!StringUtil.isEmpty(nameSherkat)) {
            QBimeGozar qBimeGozar = QBimeGozar.bimeGozar;
            QShakhseHoghooghi qShakhseHoghooghi = QShakhseHoghooghi.shakhseHoghooghi;

            query.join(qPishnahad.bimeGozar, qBimeGozar)
                    .join(qBimeGozar.shakhs, qShakhseHoghooghi)
                    .where(qShakhseHoghooghi.name.contains(nameSherkat));
            applied = true;
        }

        String shomarePishnahad = searchedBimename.getShomarePishnahad();
        if(!StringUtil.isEmpty(shomarePishnahad)) {
            query.where(qPishnahad.shomare_pishnahad.contains(shomarePishnahad));
            applied = true;
        }

        String aztarikhesodoor = searchedBimename.getAztarikheSodoor();
        if(!StringUtil.isEmpty(aztarikhesodoor)) {
            query.where(qBimename.tarikhesodoor.gt(aztarikhesodoor));
            applied = true;
        }

        String tatarikhesodoor = searchedBimename.getTatarikheSodoor();
        if(!StringUtil.isEmpty(tatarikhesodoor)) {
            query.where(qBimename.tarikhesodoor.lt(tatarikhesodoor));
            applied = true;
        }

        return applied;
    }
}
