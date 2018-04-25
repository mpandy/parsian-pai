package ir.parsianinsurance.he.domain.service;

import com.querydsl.jpa.impl.JPAQuery;
import ir.parsianinsurance.he.domain.model.*;
import ir.parsianinsurance.he.domain.model.enums.ArtifactDocState;
import ir.parsianinsurance.he.domain.model.enums.NoeTaahod;
import ir.parsianinsurance.he.domain.model.enums.VahedType;
import ir.parsianinsurance.he.domain.model.enums.VaziateParvandeKhesarat;
import ir.parsianinsurance.he.infrastructure.io.Zamime;
import ir.parsianinsurance.he.infrastructure.repository.*;
import ir.parsianinsurance.he.infrastructure.security.UserBean;
import ir.parsianinsurance.he.interfaces.view.model.ArtifactSearchModel;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Set;

/**
 * Created by 8119 on 11/11/2017.
 */
@RequestScoped
public class ArtifactDocService implements IArtifactDocService {

    @Inject
    UserBean userBean;

    @Inject
    ArtifactDocRepository artifactDocRepository;

    @Inject
    ZamimeRepository zamimeRepository;

    @Inject
    BimenameRepository bimenameRepository;

    @Inject
    ElhaghiyeRepository elhaghiyeRepository;

    @Inject
    KhesaratRepository khesaratRepository;

    @Inject
    FaskhArtifactDocRepository faskhArtifactDocRepository;

    @Inject
    EbtalArtifactDocRepository ebtalArtifactDocRepository;

    @Inject
    SaghfeSodoorArtifactDocRepository saghfeSodoorArtifactDocRepository;

    @Inject
    TakhfifModiriatiArtifactDocRepository takhfifModiriatiArtifactDocRepository;

    @Inject
    KhesaratFotArtifactDocRepository khesaratFotArtifactDocRepository;

    @Inject
    KhesaratNaghseOzvArtifactDocRepository khesaratNaghseOzvArtifactDocRepository;

    @Inject
    KhesaratHazPezArtifactDocRepository khesaratHazPezArtifactDocRepository;

    @Inject
    KhesaratCaseRepository khesaratCaseRepository;

    @Inject
    IVahedService vahedService;

    @Inject
    IKhesaratService khesaratService;

    @Inject
    EntityManager entityManager;

    @Override
    public void addSaghfeSodoorArtifactDoc(Bimename bimename) {

        SaghfeSodoorArtifactDoc ad = ArtifactDocFactory.newSaghfeSodoorArtifactDoc(userBean.getCurrentUser());
        ad.setSarmayeTaahod(bimename.getPishnahadeFaal().getSarmayePooshesh(NoeTaahod.FOT));
        ad.setBimename(bimename);
        saghfeSodoorArtifactDocRepository.save(ad);
    }

    @Override
    public boolean alreadyHasTayidShodeArfictDocOfSaghfeSodoor(Bimename bimename) {

        return saghfeSodoorArtifactDocRepository.findByBimename(bimename)
               .stream()
               .filter(ad -> ad.getArtifactDocState().equals(ArtifactDocState.TAYID))
               .filter(ad -> bimename.getPishnahadeFaal().getSarmayePooshesh(NoeTaahod.FOT) <= ad.getSarmayeTaahod())
               .findAny()
               .isPresent();
    }

    @Override
    public boolean alreadyHasTayidShodeArfictDocOfTakhfifeModiriati(Bimename bimename) {

        return  takhfifModiriatiArtifactDocRepository.findByBimename(bimename)
                .stream()
                .filter(ad -> ad.getArtifactDocState().equals(ArtifactDocState.TAYID))
                .filter(ad -> bimename.getPishnahadeFaal().getEzafeKasr().getTakhfife_modiriati() <= ad.getTakhfif())
                .findAny()
                .isPresent();
    }

    @Override
    public boolean alreadyHasTayidShodeArfictDocOfFaskh(Elhaghiye elhaghiye) {
        return elhaghiye.getId() != null &&
                faskhArtifactDocRepository.findByElhaghiye(elhaghiye)
                .stream()
                .filter(ad -> ad.getArtifactDocState().equals(ArtifactDocState.TAYID))
                .findAny()
                .isPresent();
    }

    @Override
    public boolean alreadyHasTayidShodeArfictDocOfEbtal(Elhaghiye elhaghiye) {
        return  elhaghiye.getId() != null &&
                ebtalArtifactDocRepository.findByElhaghiye(elhaghiye)
                .stream()
                .filter(ad -> ad.getArtifactDocState().equals(ArtifactDocState.TAYID))
                .findAny()
                .isPresent();
    }

    @Override
    public boolean alreadyHasTayidShodeArfictDocOfKhesaratFot(KhesaratCase khesaratCase) {
        return  khesaratCase.getId() != null &&
                khesaratFotArtifactDocRepository.findByKhesaratCase(khesaratCase)
                .stream()
                .filter(ad -> ad.getArtifactDocState().equals(ArtifactDocState.TAYID))
                .filter(ad -> khesaratCase.getKhesarat_ghabl_pardakht() <= ad.getKhesarateGhabelePardakhtFot())
                .findAny()
                .isPresent();
    }

    @Override
    public boolean alreadyHasTayidShodeArfictDocOfKhesaratNaghseOzv(KhesaratCase khesaratCase) {
        return  khesaratCase.getId() != null &&
                khesaratNaghseOzvArtifactDocRepository.findByKhesaratCase(khesaratCase)
                .stream()
                .filter(ad -> ad.getArtifactDocState().equals(ArtifactDocState.TAYID))
                .filter(ad -> khesaratCase.getKhesarat_ghabl_pardakht() <= ad.getKhesarateGhabelePardakhtNaghs())
                .findAny()
                .isPresent();
    }

    @Override
    public boolean alreadyHasTayidShodeArfictDocOfKhesaratHazPez(KhesaratCase khesaratCase) {
        return  khesaratCase.getId() != null &&
                khesaratHazPezArtifactDocRepository.findByKhesaratCase(khesaratCase)
                .stream()
                .filter(ad -> ad.getArtifactDocState().equals(ArtifactDocState.TAYID))
                .filter(ad -> khesaratCase.getKhesarat_ghabl_pardakht() <= ad.getKhesarateGhabelePardakhtHazPez())
                .findAny()
                .isPresent();
    }


    @Override
    public void addTakhfifeModiriatiArtifactDoc(Bimename bimename) {
        TakhfifeModiriatiArtifactDoc ad = ArtifactDocFactory.newTakhfifModiriatiArtifactDoc( userBean.getCurrentUser());
        ad.setTakhfif(bimename.getPishnahadeFaal().getEzafeKasr().getTakhfife_modiriati());
        ad.setBimename(bimename);
        takhfifModiriatiArtifactDocRepository.save(ad);

    }

    @Override
    public void addFaskhArtifactDoc(Elhaghiye elhaghiye) {
        FaskhArtifactDoc ad = ArtifactDocFactory.newFaskhArtifactDoc( userBean.getCurrentUser());
        ad.setElhaghiye(elhaghiye);
        faskhArtifactDocRepository.save(ad);

    }

    @Override
    public void addEbtalArtifactDoc(Elhaghiye elhaghiye) {
        EbtalArtifactDoc ad = ArtifactDocFactory.newEbtalArtifactDoc( userBean.getCurrentUser());
        ad.setElhaghiye(elhaghiye);
        ebtalArtifactDocRepository.save(ad);

    }

    @Override
    public void addElhaghiyeSaghfeSodoorArtifactDoc(Elhaghiye elhaghiye) {
        ElhaghiyeSaghfeSodoorArtifactDoc ad = ArtifactDocFactory.newElhaghiyeSaghfArtifactDoc( userBean.getCurrentUser());
        ad.setElhaghiye(elhaghiye);
        ebtalArtifactDocRepository.save(ad);
    }

    @Override
    public void addKhesaratFotArtifactDoc(KhesaratCase khesaratCase) {
        SaghfeKhesaratFotArtifactDoc ad = ArtifactDocFactory.newSaghfeKhesaratFotArtifactDoc(userBean.getCurrentUser());
        ad.setKhesarateGhabelePardakhtFot(khesaratCase.getKhesarat_ghabl_pardakht());
        ad.setKhesaratCase(khesaratCase);
        khesaratFotArtifactDocRepository.save(ad);
    }

    @Override
    public void addKhesaratNaghsOzvArtifactDoc(KhesaratCase khesaratCase) {
        SaghfeKhesaratNaghseOzvArtifactDoc ad = ArtifactDocFactory.newSaghfeKhesaratNaghseOzvArtifactDoc(userBean.getCurrentUser());
        ad.setKhesarateGhabelePardakhtNaghs(khesaratCase.getKhesarat_ghabl_pardakht());
        ad.setKhesaratCase(khesaratCase);
        khesaratNaghseOzvArtifactDocRepository.save(ad);
    }

    @Override
    public void addKhesaratHazPezArtifactDoc(KhesaratCase khesaratCase) {
        SaghfeKhesaratHazPezArtifactDoc ad = ArtifactDocFactory.newSaghfeKhesaratHazPezArtifactDoc(userBean.getCurrentUser());
        ad.setKhesarateGhabelePardakhtHazPez(khesaratCase.getKhesarat_ghabl_pardakht());
        ad.setKhesaratCase(khesaratCase);
        khesaratHazPezArtifactDocRepository.save(ad);
    }

    @Override
    public List<ArtifactDoc> searchArtifact(ArtifactSearchModel searchedArtifact, int rowLimit) {

        JPAQuery query = new JPAQuery(entityManager);

        filterForAll(query);

        filterForVahed(userBean.getCurrentUser().getVahed(), query);

//        boolean filterApplied = filterByUserCriteriaAppliedForArtifactDoc(query, searchedArtifact);

//        if(!filterApplied)
//            query.limit(rowLimit);

        query.orderBy(QArtifactDoc.artifactDoc.createdDate.desc());
        return query.fetch();
    }

    @Override
    @Transactional
    public Set<Zamime> loadZamaem(ArtifactDoc artifactDoc) {

        Set<Zamime> zamaem = artifactDocRepository.findOne(artifactDoc.getId()).getZamaem();
        for (Zamime zamime : zamaem)
            zamimeRepository.findOne(zamime.getId());

        return zamaem;
    }

    @Override
    public boolean currentUserIsEligibleToPermit(ArtifactDoc artifactDoc) {

        Vahed vahed = userBean.getCurrentUser().getVahed();

        if(!vahed.getVahedType().equals(VahedType.SETAD))
        {
            long saghfeSodoor = vahed.getSaghfe_sodoor();
            long taahod = ((SaghfeSodoorArtifactDoc)artifactDoc).getSarmayeTaahod();
            return saghfeSodoor >= taahod;
        }
        else
            return true;
    }

    @Override
    @Transactional
    public Vahed originalArtifactDoc(ArtifactDoc artifactDoc) {

        ArtifactDoc previousArtifactDoc = artifactDoc;

        while(previousArtifactDoc.getDarEdameye() != null) {
            previousArtifactDoc = artifactDocRepository.findOne(previousArtifactDoc.getId());
            previousArtifactDoc = previousArtifactDoc.getDarEdameye();
        }

        return previousArtifactDoc.getAz();
    }

    @Override
    @Transactional
    public void saveArtifactDoc(ArtifactDoc dialogArtifactDoc) {

        ArtifactDoc darEdameye = dialogArtifactDoc.getDarEdameye();
        darEdameye.setJavabDadeShode(true);
        artifactDocRepository.save(dialogArtifactDoc);
        artifactDocRepository.save(darEdameye);

        boolean artifactIsInFinalState = dialogArtifactDoc.getArtifactDocState().isFinalState();
        if(artifactIsInFinalState)
            updateAttachedDocState(dialogArtifactDoc);

    }

    private void updateAttachedDocState(ArtifactDoc dialogArtifactDoc) {

        if (dialogArtifactDoc.getArtifactDocState().equals(ArtifactDocState.TAYID))
            dialogArtifactDoc.tayidArtifactDocAttachable();

        if (dialogArtifactDoc.getArtifactDocState().equals(ArtifactDocState.ADAMETAYID))
            dialogArtifactDoc.adameTayidArtifactDocAttachable();

        ArtifactDocAttachable artifactDocAttachable = dialogArtifactDoc.getArtifactDocAttachable();

        if(artifactDocAttachable instanceof Bimename)
            bimenameRepository.save((Bimename) artifactDocAttachable);

        if(artifactDocAttachable instanceof Elhaghiye) {
            Elhaghiye elhaghiye = (Elhaghiye) artifactDocAttachable;
            elhaghiyeRepository.save(elhaghiye);
            if (dialogArtifactDoc.getArtifactDocState().equals(ArtifactDocState.ADAMETAYID))
                bimenameRepository.save(elhaghiye.getBimename());
        }

        if(artifactDocAttachable instanceof KhesaratCase)
        {
            KhesaratCase khesaratCase = (KhesaratCase) artifactDocAttachable;
            khesaratCaseRepository.save(khesaratCase);

            if (dialogArtifactDoc.getArtifactDocState().equals(ArtifactDocState.ADAMETAYID))
                khesaratRepository.save(khesaratCase.getKhesarat());

            if (dialogArtifactDoc.getArtifactDocState().equals(ArtifactDocState.TAYID))
            {
                if(khesaratService.allOfKhesaratCasesTayidShodeHastand(khesaratCase.getKhesarat())) {
                    khesaratCase.getKhesarat().setVaziateparvande(VaziateParvandeKhesarat.TAYIDE_MOJAVEZ);
                    khesaratRepository.save(khesaratCase.getKhesarat());
                }
            }
        }
    }

    private void filterForAll(JPAQuery query) {

        QArtifactDoc qArtifactDoc = QArtifactDoc.artifactDoc;
        query   .from(qArtifactDoc);
    }

    private void filterForVahed(Vahed currentUserVahed, JPAQuery query) {

//        if(currentUserVahed.getVahedType().equals(VahedType.SETAD))
//            return;

        QArtifactDoc qArtifactDoc = QArtifactDoc.artifactDoc;

        query.where(qArtifactDoc.az.eq(currentUserVahed)
                .or(qArtifactDoc.be.eq(currentUserVahed)
                .or(qArtifactDoc.az.sarparast.eq(currentUserVahed))
                .or(qArtifactDoc.be.sarparast.eq(currentUserVahed)))
        );
    }

//    private boolean filterByUserCriteriaAppliedForArtifactDoc(JPAQuery query, ArtifactSearchModel artifactSearchModel) {
//
//        boolean applied = false;
//        QArtifactDoc qArtifactDoc = QArtifactDoc.artifactDoc;
//
//        ArtifactDaryaftiErsali ersali_or_daryafti = artifactSearchModel.getErsali_or_daryafti();
//        if(ersali_or_daryafti != null && !ersali_or_daryafti.equals(ArtifactDaryaftiErsali.EMPTY_KHATAR))
//            switch (ersali_or_daryafti)
//            {
//                case DARYAFTI:
//                    query.where(qArtifactDoc.be.eq(userBean.getCurrentUser().getVahed()));
//                    applied = true;
//                break;
//
//                case ERSALI:
//                    query.where(qArtifactDoc.az.eq(userBean.getCurrentUser().getVahed()));
//                    applied = true;
//                break;
//            }
//
//        String shomarePishnahad = artifactSearchModel.getShomarePishnahad();
//        if(!StringUtil.isEmpty(shomarePishnahad)) {
//            QBimename qBimename = QBimename.bimename;
//            QPishnahad qPishnahad = QPishnahad.pishnahad;
//
//            query   .join(qArtifactDoc.bimename, qBimename)
//                    .join(qBimename.pishnahadeFaal, qPishnahad)
//                    .where(qPishnahad.shomare_pishnahad.contains(shomarePishnahad));
//
//            applied = true;
//        }
//
//        return applied;
//    }

}
