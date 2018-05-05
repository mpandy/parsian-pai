package ir.parsianinsurance.he.interfaces.view.bean.view;

import ir.parsianinsurance.he.domain.facade.IApplicationService;
import ir.parsianinsurance.he.domain.model.*;
import ir.parsianinsurance.he.domain.model.enums.NesbatBaBimeshode;
import ir.parsianinsurance.he.domain.model.enums.NoePishnahad;
import ir.parsianinsurance.he.domain.model.enums.NoeShakhs;
import ir.parsianinsurance.he.domain.model.enums.TabagheKhatar;
import ir.parsianinsurance.he.domain.rule.IAyinName24Rules;
import ir.parsianinsurance.he.domain.rule.IPropertyRules;
import ir.parsianinsurance.he.domain.service.IBimenameService;
import ir.parsianinsurance.he.domain.service.IGharardadService;
import ir.parsianinsurance.he.domain.service.ITaahodeBimegarService;
import ir.parsianinsurance.he.domain.service.IUserService;
import ir.parsianinsurance.he.domain.validator.MohasebeHagheBimeValidator;
import ir.parsianinsurance.he.domain.validator.PreMohasebeHagheBimeValidator;
import ir.parsianinsurance.he.domain.validator.SabtePishnahadHEValidator;
import ir.parsianinsurance.he.domain.validator.SodoorBimenameValidator;
import ir.parsianinsurance.he.infrastructure.HeException;
import ir.parsianinsurance.he.infrastructure.Warning;
import ir.parsianinsurance.he.infrastructure.io.Zamime;
import ir.parsianinsurance.he.infrastructure.io.ZamimeFactory;
import ir.parsianinsurance.he.infrastructure.repository.*;
import ir.parsianinsurance.he.infrastructure.security.UserBean;
import ir.parsianinsurance.he.infrastructure.service.IFileService;
import ir.parsianinsurance.he.infrastructure.util.DateUtil;
import ir.parsianinsurance.he.infrastructure.workflow.WebAction;
import ir.parsianinsurance.he.interfaces.view.bean.session.MainView;
import ir.parsianinsurance.he.interfaces.view.bean.view.bimenameLoader.BimenameFilter;
import ir.parsianinsurance.he.interfaces.view.uiflow.StateName;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.event.SelectEvent;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.IOException;
import java.io.Serializable;
import java.util.*;

/**
 * Created by 8119 on 3/9/2017.
 */
@Named
@ViewScoped
public class BimenameBean implements Serializable{

    @Inject
    IApplicationService heService;

    @Inject
    IGharardadService gharardadService;

    @Inject
    IUserService userService;

    @Inject
    MainView mainView;

    @Inject
    IBimenameService bimenameService;

    @Inject
    IFileService fileService;

    @Inject
    ITaahodeBimegarService taahodeBimegarService;

    @Inject
    transient ResourceBundle bundle;

    @Inject
    BimeshodeRepository bimeshodeRepository;

    @Inject
    ShakhseHaghighiRepository shakhseHaghighiRepository;

    @Inject
    ShoghlRepository shoghlRepository;

    @Inject
    BimenameRepository bimenameRepository;

    @Inject
    UserBean userBean;

    @Inject
    ElhaghiyeBean elhaghiyeBean;

    @Inject
    ArtifactDocListBean artifactDocListBean;

    @Inject
    VahedRepository vahedRepository;

    @Inject
    IPropertyRules propertyRules;

    @Inject
    IAyinName24Rules ayinName24Rules;

    private Bimename bimename;
    private BimeGozar selectedBimeGozarByAutocomplete;
    private BimeShode selectedBimeShodeByAutocomplete;
    private ShakhseHaghighi selectedZinafShakhsByAutocomplete;
    private boolean newZinafVoraseGhanooni;
    private Zinaf newZinaf;
    private TaahodBimegar newTaahod;
    private KhatarEzafi newKhatarezafi;
    List<TabagheKhatar> tabagheKhatarOptions;
    private boolean zinafDialogVisible;
    private boolean zinafToBeEdited;
    private boolean taahodDialogVisible;
    private boolean taahodToBeEdited;
    private boolean khatarEzafiDialogVisible;
    private boolean khatarToBeEdited;
    private BimenameFilter filter;

    @PostConstruct
    public void init(){

        bimename = BimenameFactory.newBimenameForSodoor();
        bimename.getPishnahadeFaal().setGharardad(gharardadService.gharardadeOmoomiBimeMarkazi());
        bimename.getPishnahadeFaal().setBazaryab(userService.defaultBazaryab());
        bimename.getPishnahadeFaal().setEzafeKasr(EzafeKasrFactory.init());
        bimename.getPishnahadeFaal().setNoePishnahad(NoePishnahad.KATBI);

        setTabagheKhatarOptions(Collections.emptyList());
        newZinaf = ZinafFactory.newZinaf();
        newTaahod = TaahodFactory.newTaahodeBimegar();
        newKhatarezafi = KhatareEzafiFactory.newKhatareEzafi();
        selectedBimeGozarByAutocomplete = new BimeGozar();
        selectedBimeShodeByAutocomplete = new BimeShode();
        selectedZinafShakhsByAutocomplete = ShakhsFactory.newShakhseHaghighi();
    }

    @WebAction(toState = StateName.LIST_BIMENAME)
    public void bazgasht(){
        init();
    }

    @WebAction(toState = StateName.LIST_BIMENAME)
    public void enserafazsodoor(){
        init();
    }

    @WebAction(toState = StateName.LIST_BIMENAME)
    public void enserafazsabtpishnahad(){
        init();
    }

    @WebAction( successMessage = "mohasebenewbimename",
                toState = StateName.SODOOR_NEW_BIMENAME_MOHASEBE,
                validator = MohasebeHagheBimeValidator.class)
    public void mohasebeyeHagheBimesodoor(){

        int modat = bimename.getPishnahadeFaal().modatBimename();
        bimename.getPishnahadeFaal().mohasebeyeHagheBime(   propertyRules.getSinglesDoubleParam("nerkheMaliat"),
                                                            ayinName24Rules.darsadeHagheBimeSalane(modat));
    }

    public void uploadZamimePishnahad(FileUploadEvent event) {
        Zamime newZamime = ZamimeFactory.buildZamimeFromFile(event.getFile());
        bimename.getPishnahadeFaal().setZamimePishnahad(newZamime);
    }
    public void uploadZamime(FileUploadEvent event) {
        Zamime newZamime = ZamimeFactory.buildZamimeFromFile(event.getFile());
        bimename.getPishnahadeFaal().getZamaem().add(newZamime);
    }

    @WebAction( successMessage = "mohasebenewbimename",
                toState = StateName.SABT_NEW_PISHNAHAD_MOHASEBE,
            validator = {   PreMohasebeHagheBimeValidator.class,
                            MohasebeHagheBimeValidator.class})
    public void mohasebeyeHagheBimeSabtPishnahad() throws HeException {

        int modat = bimename.getPishnahadeFaal().modatBimename();
        bimename.getPishnahadeFaal().mohasebeyeHagheBime(   propertyRules.getSinglesDoubleParam("nerkheMaliat"),
                                                            ayinName24Rules.darsadeHagheBimeSalane(modat));
    }


    @WebAction( successMessage = "sodooreBimename",
                toState = StateName.LIST_BIMENAME,
                validator = {   PreMohasebeHagheBimeValidator.class,
                                MohasebeHagheBimeValidator.class,
                                SabtePishnahadHEValidator.class,
                                SodoorBimenameValidator.class})
    public Optional<Warning> sodoornahayi() {

        Optional<Warning> optionalWarning = heService.sodooreBimename(bimename);
        init();
        return optionalWarning;
    }

    @WebAction( successMessage = "pishnahadJadidSabtGardid",
            toState = StateName.LIST_BIMENAME,
            validator = SabtePishnahadHEValidator.class)
    public void sabtenahayiePishnahad() {
        heService.sabtePishnahad(bimename);
        init();
    }


    @WebAction(toState = StateName.SODOOR_NEW_BIMENAME)
    public void eslahesodoor(){}

    @WebAction(toState = StateName.SABT_PISHNAHAD)
    public void eslaheSabtPishnahad(){}

    public void bimegozarHaghighi(){
        bimename.getPishnahadeFaal().getBimeGozar().setShakhs(ShakhsFactory.newShakhseHaghighi());
        bimename.getPishnahadeFaal().getBimeGozar().setCreatedDate(DateUtil.now());
        bimename.getPishnahadeFaal().noeBimegozar(NoeShakhs.HAGHIGHI);
        getFilter() .showBimegozarHaghighiDetails()
                    .hideBimegozarHoghooghiDetails()
                    .showCopyFromBimegozarButton();
    }

    public void bimegozarHoghooghi(){
        bimename.getPishnahadeFaal().getBimeGozar().setShakhs(ShakhsFactory.newShakhseHoghooghi());
        bimename.getPishnahadeFaal().getBimeGozar().setCreatedDate(DateUtil.now());
        bimename.getPishnahadeFaal().noeBimegozar(NoeShakhs.HOGHOOGHI);
        getFilter() .showBimegozarHoghooghiDetails()
                    .hideBimegozarHaghighiDetails()
                    .hideCopyFromBimegozarButton();
    }

    public void bimeshodeJadid(){
        bimename.getPishnahadeFaal().getBimeShode().setShakhseHaghighi(ShakhsFactory.newShakhseHaghighi());
        bimename.getPishnahadeFaal().getBimeShode().setShoghl(new Shoghl());
        bimename.getPishnahadeFaal().getBimeShode().setCreatedDate(DateUtil.now());
        getFilter().showBimeshodeDetails();
    }

    public void bimeshodeCopyFromBimegozar(){
        BimeGozar bimeGozar = bimename.getPishnahadeFaal().getBimeGozar();
        if(bimeGozar.getShakhs() instanceof ShakhseHaghighi) {
            bimename.getPishnahadeFaal().setBimeShode(BimeShodeFactory.copyFromBimegozar(bimeGozar));
            getFilter().showBimeshodeDetails();
        }
    }

    public void bimegozarSelectedFromAutocomplete()
    {
        bimename.getPishnahadeFaal().setBimeGozar(selectedBimeGozarByAutocomplete);
        Shakhs shakhs = selectedBimeGozarByAutocomplete.getShakhs();
        if(shakhs instanceof ShakhseHaghighi) {
            getFilter() .showBimegozarHaghighiDetails()
                    .hideBimegozarHoghooghiDetails()
                    .showCopyFromBimegozarButton();
            getBimename().getPishnahadeFaal().setNoeBimegozar(NoeShakhs.HAGHIGHI);
        }
        if(shakhs instanceof ShakhseHoghooghi) {
            getFilter() .showBimegozarHoghooghiDetails()
                    .hideBimegozarHaghighiDetails()
                    .hideCopyFromBimegozarButton();
            getBimename().getPishnahadeFaal().setNoeBimegozar(NoeShakhs.HOGHOOGHI);

        }

    }

    public HashMap<String, String> loadGoroohs(){
        Gharardad gharardad = bimename.getPishnahadeFaal().getGharardad();

        HashMap goroohs = new HashMap<String, String>();
        GoroohFactory.goroohListFromString(gharardad.getGoroohs())
                .forEach(gorooh -> goroohs.put(bundle.getString(gorooh), gorooh));

        return goroohs;
    }

    public void loadTakhfifGoroohi(){

        Double takhfifGoroohi;
        String gorooh = bimename.getPishnahadeFaal().getGoroohbimename();
        if(gorooh != null) {
            takhfifGoroohi = propertyRules.takhfifgoroohi(gorooh);
            bimename.getPishnahadeFaal().getEzafeKasr().setTakhfife_goroohi(takhfifGoroohi);

            if(gorooh.equals("PERSONEL_BIME_PARSIAN"))
                bimename.getPishnahadeFaal().getEzafeKasr().setKarmandi(true);
        }
    }

    public void bimeshodeSelectedFromAutocomplete(){

        bimename.getPishnahadeFaal().setBimeShode(selectedBimeShodeByAutocomplete);
        updateTabagheKhatarByShoghl(null);
        getFilter() .showBimeshodeDetails()
                    .showCopyFromBimegozarButton();
    }

    public Bimename getBimename() {
        return bimename;
    }

    public void setBimename(Bimename bimename) {
        loadTabagheKhatarOptions(bimename);
        this.bimename = bimename;
    }

    public Zinaf getNewZinaf() {
        return newZinaf;
    }

    public void setNewZinaf(Zinaf newZinaf) {
        this.newZinaf = newZinaf;
    }

    public List<TabagheKhatar> getTabagheKhatarOptions() {
        return tabagheKhatarOptions;
    }

    public void setTabagheKhatarOptions(List<TabagheKhatar> tabagheKhatarOptions) {
        this.tabagheKhatarOptions = tabagheKhatarOptions;
    }

    public void newZinafInit(){
        newZinaf = ZinafFactory.newZinaf();
        selectedZinafShakhsByAutocomplete = ShakhsFactory.newShakhseHaghighi();
        zinafToBeEdited = false;
        zinafDialogVisible = true;
        setNewZinafVoraseGhanooni(false);
    }

    public  void newTaahodInit(){
        newTaahod = new TaahodBimegar();
        taahodDialogVisible = true;
        taahodToBeEdited = false;
    }
     public  void newKhatarezafiInit(){
         newKhatarezafi = KhatareEzafiFactory.newKhatareEzafi();
         khatarEzafiDialogVisible = true;
         khatarToBeEdited = false;
        }

    @WebAction( toState = StateName.TAEEDE_ELHAGHIYE_TAGHIRAT,
                validator = {   PreMohasebeHagheBimeValidator.class,
                                MohasebeHagheBimeValidator.class,
                                SabtePishnahadHEValidator.class,
                                SodoorBimenameValidator.class})
    public void taeedElhaghiyeTaghirat() {
        Pishnahad pishnahadeFaal = getBimename().getPishnahadeFaal();
        int modat = pishnahadeFaal.modatBimename();
        pishnahadeFaal.mohasebeyeHagheBime( propertyRules.getSinglesDoubleParam("nerkheMaliat"),
                                            ayinName24Rules.darsadeHagheBimeSalane(modat));
        elhaghiyeBean.taeedElhaghiyeTaghirat(pishnahadeFaal);
    }

    public void voraseGhanooniCheckboxUpdate(){
        if(newZinafVoraseGhanooni)
            newZinaf.setNesbat_ba_bimeshode(NesbatBaBimeshode.VORASE_GHANOONI);
        else
            newZinaf.setNesbat_ba_bimeshode(NesbatBaBimeshode.EMPTY);
    }

    public KhatarEzafi getNewKhatarezafi() {
        return newKhatarezafi;
    }

    public void setNewKhatarezafi(KhatarEzafi newKhatarezafi) {
        this.newKhatarezafi = newKhatarezafi;
    }

    public TaahodBimegar getNewTaahod() {
        return newTaahod;
    }

    public void setNewTaahod(TaahodBimegar newTaahod) {
        this.newTaahod = newTaahod;
    }

    public boolean isZinafDialogVisible() {
        return zinafDialogVisible;
    }

    public void setZinafDialogVisible(boolean zinafDialogVisible) {
        this.zinafDialogVisible = zinafDialogVisible;
    }

    public boolean isZinafToBeEdited() {
        return zinafToBeEdited;
    }

    public boolean isTaahodDialogVisible() {
        return taahodDialogVisible;
    }

    public void setTaahodDialogVisible(boolean taahodDialogVisible) {
        this.taahodDialogVisible = taahodDialogVisible;
    }

    public boolean isTaahodToBeEdited() {
        return taahodToBeEdited;
    }

    public boolean isNewZinafVoraseGhanooni() {
        return newZinafVoraseGhanooni;
    }

    public void setNewZinafVoraseGhanooni(boolean newZinafVoraseGhanooni) {
        this.newZinafVoraseGhanooni = newZinafVoraseGhanooni;
    }

    public void addOrEditZinaf(){
        if(!isZinafToBeEdited()) {
            newZinaf.setCreatedDate(DateUtil.now());
            bimename.getPishnahadeFaal().getZinafs().add(newZinaf);
        }
        zinafDialogVisible = false;
    }

    public void closeDialogZinaf(){
        zinafDialogVisible = false;
    }

    public void closeDialogTaahod(){
        taahodDialogVisible = false;
    }

    public void closeDialogKhatar(){
        khatarEzafiDialogVisible = false;
    }

    public void removeZinafFromZinafs(Zinaf zinaf){
        bimename.getPishnahadeFaal().getZinafs().remove(zinaf);
    }

    public void editZinaf(Zinaf zinaf){
        setNewZinaf(zinaf);
        zinafToBeEdited = true;
        zinafDialogVisible = true;
        setNewZinafVoraseGhanooni(zinaf.getNesbat_ba_bimeshode().equals(NesbatBaBimeshode.VORASE_GHANOONI));
    }

    public void addOrEditTaahods(){

        Shoghl shoghl = bimename.getPishnahadeFaal().getBimeShode().getShoghl();
        if (shoghl != null && shoghl.getName()!= null) {
            TabagheKhatar tabagheKhatar = shoghl.getDefaultTabagheKhatar();
            if(!tabagheKhatar.equals(TabagheKhatar.EMPTY)) {
                taahodeBimegarService.setNerkheTaahod(newTaahod, tabagheKhatar);
                if (!isTaahodToBeEdited()) {
                    newTaahod.setCreatedDate(DateUtil.now());
                    bimename.getPishnahadeFaal().getTaahodBimegars().add(newTaahod);
                }
            }
            else {
                mainView.error("pishAzVaredKardaneTaahodTabaghekhatarRaVaredNamaeed");
            }
        }
        else
            mainView.error("pishAzVaredKardaneTaahodShoghlRaVaredNamaeed");

        taahodDialogVisible = false;
    }

    public void removeTaahodFromTaahods(TaahodBimegar taahodBimegar){
        bimename.getPishnahadeFaal().getTaahodBimegars().remove(taahodBimegar);
    }

    public void editTaahod(TaahodBimegar taahodBimegar){
        setNewTaahod(taahodBimegar);
        taahodToBeEdited = true;
        taahodDialogVisible = true;
    }

    public void addOrEditKhatars(){
        newKhatarezafi.setNerkh(propertyRules.nerkheKhatareEzafi(newKhatarezafi.getNoekhatarezafi()));
        if(!isKhatarToBeEdited()) {
            newKhatarezafi.setCreatedDate(DateUtil.now());
            bimename.getPishnahadeFaal().getKhatarEzafis().add(newKhatarezafi);
        }
        khatarEzafiDialogVisible = false;
    }

    public void removeKhatarFromKhatars(KhatarEzafi khatarEzafi){
        bimename.getPishnahadeFaal().getKhatarEzafis().remove(khatarEzafi);
    }

    public void removeZamimeFromZamaem(Zamime zamime){
        bimename.getPishnahadeFaal().getZamaem().remove(zamime);
    }

    public void removeZamimePishnahad(){
        bimename.getPishnahadeFaal().setZamimePishnahad(null);
    }

    public void editKhatar(KhatarEzafi khatarEzafi){
        setNewKhatarezafi(khatarEzafi);
        khatarToBeEdited = true;
        khatarEzafiDialogVisible = true;
    }

    public boolean isKhatarEzafiDialogVisible() {
        return khatarEzafiDialogVisible;
    }

    public void setKhatarEzafiDialogVisible(boolean khatarEzafiDialogVisible) {
        this.khatarEzafiDialogVisible = khatarEzafiDialogVisible;
    }


    public boolean isKhatarToBeEdited() {
        return khatarToBeEdited;
    }

    public void setKhatarToBeEdited(boolean khatarToBeEdited) {
        this.khatarToBeEdited = khatarToBeEdited;
    }




    @WebAction(toState =StateName.LIST_BIMENAME)
    public void enserafazelhaghiye(){
        init();
    }

    public BimenameFilter getFilter() {
        return filter;
    }

    public void updateTabagheKhatarByShoghl(SelectEvent event)
    {
        Long shoghlId;

        if(event != null)
            shoghlId = (Long) event.getObject();
        else
            shoghlId = bimename.getPishnahadeFaal().getBimeShode().getShoghl().getId();

        if (shoghlId != null) {
            Shoghl shoghl = shoghlRepository.findOne(shoghlId);
            setTabagheKhatarOptions(shoghl.getDefaultTabagheKhatar().getOptions());
            bimename.getPishnahadeFaal().getBimeShode().setShoghl(shoghl);
        }
    }

    public void loadTabagheKhatarOptions(Bimename bimename)
    {
        setTabagheKhatarOptions(bimename.getPishnahadeFaal()
                                        .getBimeShode()
                                        .getShoghl()
                                        .getDefaultTabagheKhatar()
                                        .getOptions());
    }

    public void updateTaahodByTabagheKhatar()
    {
        TabagheKhatar newTabagheKhatar = bimename.getPishnahadeFaal().getTabagheKhatar();

        for(TaahodBimegar taahodBimegar : bimename.getPishnahadeFaal().getTaahodBimegars())
        {
            taahodeBimegarService.setNerkheTaahod(taahodBimegar, newTabagheKhatar);
            taahodBimegar.setHagh_bime_taahod((Math.round (taahodBimegar.getSarmaye_taahod() * taahodBimegar.getNerkh_taahod())));
        }
    }

    public void setFilter(BimenameFilter filter) {
        this.filter = filter;
    }


    public BimeShode getSelectedBimeShodeByAutocomplete() {
        return selectedBimeShodeByAutocomplete;
    }

    public void setSelectedBimeShodeByAutocomplete(BimeShode selectedBimeShodeByAutocomplete) {
        this.selectedBimeShodeByAutocomplete = selectedBimeShodeByAutocomplete;
    }

    public void setSelectedBimeGozarByAutocomplete(BimeGozar selectedBimeGozarByAutocomplete) {
        this.selectedBimeGozarByAutocomplete = selectedBimeGozarByAutocomplete;
    }

    public BimeGozar getSelectedBimeGozarByAutocomplete() {
        return selectedBimeGozarByAutocomplete;
    }

    public ShakhseHaghighi getSelectedZinafShakhsByAutocomplete() {
        return selectedZinafShakhsByAutocomplete;
    }

    public void setSelectedZinafShakhsByAutocomplete(ShakhseHaghighi selectedZinafShakhsByAutocomplete) {
        this.selectedZinafShakhsByAutocomplete = selectedZinafShakhsByAutocomplete;
    }

    public UserBean getUserBean() {
        return userBean;
    }

    public void downloadZamime(Zamime zamime) throws IOException{
        fileService.downloadZamime(zamime);
    }
    public void downloadZamimePishnahad() throws IOException{
        fileService.downloadZamime(bimename.getPishnahadeFaal().getZamimePishnahad());
    }
}
