package ir.parsianinsurance.he.domain.facade;

import ir.parsianinsurance.he.domain.model.*;
import ir.parsianinsurance.he.domain.model.enums.NoeElhaghiye;
import ir.parsianinsurance.he.domain.model.enums.VaziateBimename;
import ir.parsianinsurance.he.domain.model.enums.VaziateKhesaratCase;
import ir.parsianinsurance.he.domain.model.enums.VaziateParvandeKhesarat;
import ir.parsianinsurance.he.domain.service.*;
import ir.parsianinsurance.he.infrastructure.Warning;
import ir.parsianinsurance.he.infrastructure.logging.ArtifactLog;
import ir.parsianinsurance.he.infrastructure.repository.*;
import ir.parsianinsurance.he.infrastructure.security.UserBean;
import ir.parsianinsurance.he.infrastructure.util.DateUtil;
import ir.parsianinsurance.he.interfaces.view.bean.session.MainView;
import ir.parsianinsurance.he.interfaces.webservice.model.AgencyBimenameInfo;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.Optional;

/**
 * Created by Mohammad on 7/6/2017.
 */

@Stateless
public class ApplicationService
        implements IApplicationService {

    @Inject
    BimenameRepository bimenameRepository;

    @Inject
    ElhaghiyeRepository elhaghiyeRepository;

    @Inject
    KhesaratRepository khesaratRepository;

    @Inject
    KhesaratCaseRepository khesaratCaseRepository;

    @Inject
    HavaleKhesaratRepository havaleKhesaratRepository;

    @Inject
    VahedRepository vahedRepository;

    @Inject
    ShoghlRepository shoghlRepository;

    @Inject
    GharardadRepository gharardadRepository;

    @Inject
    ArtifactLogRepository artifactLogRepository;

    @Inject
    ISequenceService sequenceService;

    @Inject
    IPishnahadService pishnahadService;

    @Inject
    IElhaghiyeService elhaghiyeService;

    @Inject
    IBimenameService bimenameService;

    @Inject
    IKhesaratService khesaratService;

    @Inject
    IArtifactDocService artifactDocService;

    @Inject
    UserBean userBean;

    @Inject
    MainView mainView;

    @Override
    public Pishnahad sabtePishnahad(Bimename bimename) {

        Vahed vahed = userBean.getCurrentUser().getVahed();
        Vahed vahedeSodoor = vahed.getVahedeSodoor();

        Pishnahad pishnahad = pishnahadService.buildPishnahadToPersist(bimename.getPishnahadeFaal());
        pishnahad.vahed(vahed);

        bimename.pishnahad(pishnahad)
                .vaziat(VaziateBimename.MOVAGHAT);

        String shomrePishnahad = sequenceService.nextShomarePishnahad(vahedeSodoor);
        bimename.getPishnahadeFaal().setShomare_pishnahad(shomrePishnahad);

        bimenameRepository.save(bimename);

        return bimename.getPishnahadeFaal();
    }

    @Override
    public Optional<Warning> sodooreBimename(Bimename bimename) {

        Optional<Warning> saghfeSodoorPossibleWarning =
                bimenameService.addPossibleBimenameSaghfeSodoorArtifactDocs(bimename, userBean.getCurrentUser());
        if (saghfeSodoorPossibleWarning.isPresent()) {
            return addWarningEffectToBimename(bimename, saghfeSodoorPossibleWarning);
        }

        Optional<Warning> takhfifPossibleWarning =
                bimenameService.addPossibleBimenameTakhfifModiriatiArtifactDocs(bimename, userBean.getCurrentUser());
        if (takhfifPossibleWarning.isPresent()) {
            return addWarningEffectToBimename(bimename, takhfifPossibleWarning);
        }

        Vahed vahedeSodoor = userBean.getCurrentUser().getVahed().getVahedeSodoor();

        bimename.pishnahad(pishnahadService.buildPishnahadToUpdate(bimename.getPishnahadeFaal()));
        String shomreBimename = sequenceService.nextShomareBimename(vahedeSodoor);

        bimename.shomare(shomreBimename)
                .vahedeSodoor(vahedeSodoor)
                .tarikhsodoor(DateUtil.getJalaliCurrentDate())
                .vaziat(VaziateBimename.DAEM);

        bimenameRepository.save(bimename);

        ArtifactLog log = new ArtifactLog(   userBean.getCurrentUser().getUsername(),
                                                Bimename.class.getSimpleName(),
                                                bimename.getId());
        artifactLogRepository.save(log);
        return Optional.empty();
    }

    private Optional<Warning> addWarningEffectToBimename(Bimename bimename, Optional<Warning> possibleWarning) {
        mainView.warning(possibleWarning.get().getMessage());
        bimename.setVaziateBimename(VaziateBimename.NIAZ_BE_AKHZE_MOJAVEZ);
        bimenameRepository.save(bimename);

        return possibleWarning;
    }

    private Optional<Warning> addWarningEffectToKhesarat(KhesaratCase khesaratCase, Optional<Warning> possibleWarning) {
        mainView.warning(possibleWarning.get().getMessage());
        khesaratCase.setVaziat(VaziateKhesaratCase.NIAZ_BE_AKHZE_MOJAVEZ);
        khesaratCaseRepository.save(khesaratCase);
        return possibleWarning;
    }

    @Override
    public Optional<Warning> sabteElhaghiyeTaghir(Elhaghiye elhaghiye) {

        elhaghiye = elhaghiyeService.buildElhaghiyeToPersist(elhaghiye);
        Bimename bimename = bimenameRepository.findOne(elhaghiye.getBimename().getId());
        Pishnahad oldPishnahad = bimename.getPishnahadeFaal();
        Pishnahad newPishnahad = pishnahadService.buildPishnahadToPersist(elhaghiye.getPishnahad_new());

        elhaghiyeService.deprecateOldPishnahad(oldPishnahad);

        elhaghiye
                .bimename(bimename)
                .az(oldPishnahad)
                .be(newPishnahad)
                .beVaziate(VaziateElhaghiye.TAGHIR_NAHAYI_SHODE);

        String shomareElhaghiye = elhaghiyeService.generateShomareElhaghiye(bimename);
        elhaghiye.setShomareElhaghiye(shomareElhaghiye);

        newPishnahad.setElhaghiye(elhaghiye);
        bimename.pishnahad(newPishnahad);
        bimename.vaziat(VaziateBimename.DARAYE_ELHAGHIYE_TAGHIR);

        elhaghiyeRepository.save(elhaghiye);

        ArtifactLog log = new ArtifactLog(  userBean.getCurrentUser().getUsername(),
                                            Elhaghiye.class.getSimpleName(),
                                            elhaghiye.getId());
        artifactLogRepository.save(log);

        Optional<Warning> saghfeSodoorPossibleWarning =
                elhaghiyeService.addPossibleElhaghiyeTaghirSaghfeSodoorArtifactDocs(elhaghiye, userBean.getCurrentUser());
        if (saghfeSodoorPossibleWarning.isPresent()) {
            return addWarningEffectToElhaghiye(elhaghiye, saghfeSodoorPossibleWarning);
        }
        return Optional.empty();
    }

    @Override
    public Optional<Warning> sabteKhesarat(Khesarat khesarat) {

        Optional<Warning> possibleWarning = Optional.empty();
        for(KhesaratCase khesaratCase : khesarat.undeletedKhesaratCases()) {

            khesaratCase = khesaratService.buildKhesaratCase(khesaratCase);
            switch (khesaratCase.getNoehadese())
            {
                case FOT:
                    Optional<Warning> possibleSaghfeKhesaratFot =
                            khesaratService.addPossibleSaghfeKhesaratFotArtifactDocs(khesaratCase, userBean.getCurrentUser());
                    if (possibleSaghfeKhesaratFot.isPresent()) {
                        possibleWarning = addWarningEffectToKhesarat(khesaratCase, possibleSaghfeKhesaratFot);
                    }
                    break;

                case NAGHSOZV_AZKAROFTADEGI:
                    Optional<Warning> possibleSaghfeKhesaratNaghseOzv =
                            khesaratService.addPossibleSaghfeKhesaratNaghseOzvArtifactDocs(khesaratCase, userBean.getCurrentUser());
                    if (possibleSaghfeKhesaratNaghseOzv.isPresent()) {
                        possibleWarning = addWarningEffectToKhesarat(khesaratCase, possibleSaghfeKhesaratNaghseOzv);
                    }
                    break;

                case HAZINE_PEZESHKI:
                    Optional<Warning> possibleSaghfeKhesaratHazPez =
                            khesaratService.addPossibleSaghfeKhesaratHazPezArtifactDocs(khesaratCase, userBean.getCurrentUser());
                    if (possibleSaghfeKhesaratHazPez.isPresent()) {
                        possibleWarning = addWarningEffectToKhesarat(khesaratCase, possibleSaghfeKhesaratHazPez);
                    }
                    break;
            }
        }

        if(possibleWarning.isPresent())
        {
            khesarat.setVaziateparvande(VaziateParvandeKhesarat.NIAZ_BE_AKHZE_MOJAVEZ);
            khesaratRepository.save(khesarat);

            khesarat.getBimename().setVaziateBimename(VaziateBimename.DAR_ENTEZARE_KHESARAT);
            bimenameRepository.save(khesarat.getBimename());

            return possibleWarning;
        }

        if(khesarat.getVaziateparvande().equals(VaziateParvandeKhesarat.TASHKILE_PARVANDE_VA_KARSHENASI))
        {
            Vahed vahed = userBean.getCurrentUser().getVahed();
            Vahed vahedeSodoor = vahed.getVahedeSodoor();

            khesaratService.buildKhesarat(khesarat.vahed(vahed)
                    .masool_parvande(userBean.getCurrentUser()));

            String shomare_parvande = sequenceService.nextParvandeKhesarat(vahedeSodoor);
            khesarat.setShomare_parvande(shomare_parvande);
        }


        if(khesarat.getVaziateparvande().equals(VaziateParvandeKhesarat.ELAAM_BE_MAALI))
            khesarat.setTarikh_elam_be_mali(DateUtil.getJalaliCurrentDate());

        khesaratService.setShomareKhesaratCases(khesarat);
        khesaratRepository.save(khesarat);

        if(khesaratService.ayaBimenameBasteMishavad(khesarat))
            khesarat.getBimename().setVaziateBimename(VaziateBimename.BASTE_SHODE);
        else
            khesarat.getBimename().setVaziateBimename(VaziateBimename.DAEM);

        bimenameRepository.save(khesarat.getBimename());

        return Optional.empty();
    }

    @Override
    public Khesarat sabteKhesaratHavales(Khesarat khesarat) {
        khesaratService.setShomareHavaleKhesarat(khesarat);
        for(HavaleKhesarat havaleKhesarat : khesarat.undeletedHavaleKhesarats()) {

            if(havaleKhesarat.getBeSanamRafte() == null) {
                khesaratService.buildHavaleKhesarat(havaleKhesarat);

                ArtifactLog log = new ArtifactLog(userBean.getCurrentUser().getUsername(),
                        HavaleKhesarat.class.getSimpleName(),
                        havaleKhesarat.getId());
                artifactLogRepository.save(log);
                havaleKhesarat.setBeSanamRafte(true);
                havaleKhesaratRepository.save(havaleKhesarat);
            }

        }
        return khesarat;
    }

    @Override
    public Optional<Warning> sabteElhaghiyeEbtal(Elhaghiye elhaghiye) {

        elhaghiye = elhaghiyeService.buildElhaghiyeToPersist(elhaghiye);

        if(!userBean.isSetad()) {
            Optional<Warning> warningMessages = elhaghiyeService.addPossibleElhaghiyeEbtalArtifactDocs(elhaghiye, userBean.getCurrentUser());
            if (warningMessages.isPresent()) {
                return addWarningEffectToElhaghiye(elhaghiye, warningMessages);
            }
        }

        Bimename bimename = bimenameRepository.findOne(elhaghiye.getBimename().getId());

        bimename.setVaziateBimename(VaziateBimename.EBTAL_SHODE);
        elhaghiye   .bimename(bimename)
                    .az(bimename.getPishnahadeFaal())
                    .be(bimename.getPishnahadeFaal())
                    .beVaziate(VaziateElhaghiye.EBTAL_NAHAYI_SHODE);

        String shomareElhaghiye = elhaghiyeService.generateShomareElhaghiye(bimename);
        elhaghiye.setShomareElhaghiye(shomareElhaghiye);

        elhaghiyeRepository.save(elhaghiye);
        bimenameRepository.save(bimename);

        ArtifactLog log = new ArtifactLog(  userBean.getCurrentUser().getUsername(),
                                            Elhaghiye.class.getSimpleName(),
                                            elhaghiye.getId());
        artifactLogRepository.save(log);

        return Optional.empty();
    }


    @Override
    public Optional<Warning> sabteElhaghiyeFaskh(Elhaghiye elhaghiye) {

        elhaghiye = elhaghiyeService.buildElhaghiyeToPersist(elhaghiye);

        if(!userBean.isSetad()) {
            Optional<Warning> warningMessages = elhaghiyeService.addPossibleElhaghiyeFaskhArtifactDocs(elhaghiye, userBean.getCurrentUser());
            if (warningMessages.isPresent()) {
                return addWarningEffectToElhaghiye(elhaghiye, warningMessages);
            }
        }

        Bimename bimename = bimenameRepository.findOne(elhaghiye.getBimename().getId());

        bimename.setVaziateBimename(VaziateBimename.FASKH_SHODE);
        elhaghiye   .bimename(bimename)
                    .az(bimename.getPishnahadeFaal())
                    .be(bimename.getPishnahadeFaal())
                    .beVaziate(VaziateElhaghiye.FASKH_NAHAYI_SHODE);

        String shomareElhaghiye = elhaghiyeService.generateShomareElhaghiye(bimename);
        elhaghiye.setShomareElhaghiye(shomareElhaghiye);

        elhaghiyeRepository.save(elhaghiye);
        bimenameRepository.save(bimename);

        ArtifactLog log = new ArtifactLog(  userBean.getCurrentUser().getUsername(),
                                            Elhaghiye.class.getSimpleName(),
                                            elhaghiye.getId());
        artifactLogRepository.save(log);

        return Optional.empty();
    }

    private Optional<Warning> addWarningEffectToElhaghiye(Elhaghiye elhaghiye, Optional<Warning> warningMessages) {
        mainView.warning(warningMessages.get().getMessage());
        elhaghiye.beVaziate(VaziateElhaghiye.NIAZ_BE_AKHZE_MOJAVEZ);

        if(elhaghiye.getNoe_elhaghie().equals(NoeElhaghiye.FASKHAZTARAFEBIMEGOZAR) ||
           elhaghiye.getNoe_elhaghie().equals(NoeElhaghiye.FASKHAZTARAFEBIMEGAR))
            elhaghiye.getBimename().setVaziateBimename(VaziateBimename.DAR_ENTEZARE_FASKH);

        if(elhaghiye.getNoe_elhaghie().equals(NoeElhaghiye.EBTAL))
            elhaghiye.getBimename().setVaziateBimename(VaziateBimename.DAR_ENTEZARE_EBTAL);

        if(elhaghiye.getNoe_elhaghie().equals(NoeElhaghiye.TAGHIR))
            elhaghiye.getBimename().setVaziateBimename(VaziateBimename.DAR_ENTEZARE_ELHAGHIYE_TAGHIR);

        bimenameRepository.save(elhaghiye.getBimename());
        elhaghiyeRepository.save(elhaghiye);

        return warningMessages;
    }

    @Override
    public Bimename sodooreBimenameAgency(AgencyBimenameInfo info) {

//        Gharardad agencyGharardad = gharardadRepository.findFirstByName("alibaba");
        Vahed agencyVahed = vahedRepository.findByCode("503230");
        Shoghl shoghlBimeshode = shoghlRepository.findByName("N-A");

        Bimename bimename = BimenameFactory.newBimenameForAgency(info);
        bimename.getPishnahadeFaal().getBimeShode().shoghl(shoghlBimeshode);
//        bimename.getPishnahadeFaal().setGharardad(agencyGharardad);
        bimename.getPishnahadeFaal().setVahed(agencyVahed);
        bimename.setVahedeSodoor(agencyVahed.getSarparast());

        String shomarePishnahad = sequenceService.nextShomarePishnahad(agencyVahed);
        String shomareBimename = sequenceService.nextShomareBimename(agencyVahed.getSarparast());

        bimename.setShomare(shomareBimename);
        bimename.getPishnahadeFaal().setShomare_pishnahad(shomarePishnahad);

        bimenameRepository.save(bimename);

        ArtifactLog log = new ArtifactLog(  userBean.getCurrentUser().getUsername(),
                                            Elhaghiye.class.getSimpleName(),
                                            bimename.getId());
        artifactLogRepository.save(log);

        return bimename;
    }
}
