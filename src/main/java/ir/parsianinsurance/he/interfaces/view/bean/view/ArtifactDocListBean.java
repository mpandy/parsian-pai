package ir.parsianinsurance.he.interfaces.view.bean.view;

import ir.parsianinsurance.he.domain.model.*;
import ir.parsianinsurance.he.domain.model.enums.ArtifactDocState;
import ir.parsianinsurance.he.domain.model.enums.VahedType;
import ir.parsianinsurance.he.domain.rule.IWorkflowRules;
import ir.parsianinsurance.he.domain.service.IArtifactDocService;
import ir.parsianinsurance.he.domain.service.IVahedService;
import ir.parsianinsurance.he.infrastructure.io.Zamime;
import ir.parsianinsurance.he.infrastructure.io.ZamimeFactory;
import ir.parsianinsurance.he.infrastructure.security.UserBean;
import ir.parsianinsurance.he.infrastructure.service.IFileService;
import ir.parsianinsurance.he.interfaces.view.model.ArtifactSearchModel;
import org.primefaces.event.FileUploadEvent;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by 8119 on 11/11/2017.
 */

@Named
@ViewScoped
public class ArtifactDocListBean implements Serializable {

    @Inject
    IWorkflowRules workflowRules;

    @Inject
    IFileService fileService;

    @Inject
    IVahedService vahedService;

    @Inject
    UserBean userBean;

    @Inject
    IArtifactDocService artifactDocService;

    private List<ArtifactDoc> artifactDocList;
    private ArtifactDoc dialogArtifactDoc;
    private boolean artifactDialogVisible;
    private boolean halateNamayesh;
    private boolean replierIsEligibile;
    private List<ArtifactDocState> validNextVaziats;
    private ArtifactSearchModel searchArtifact;
    private int selectedItemRow;
    private static final int ARTIFACT_MSX_ROW = 3;

    @PostConstruct
    public void init(){
        dialogArtifactDoc = new SaghfeSodoorArtifactDoc();
        this.searchArtifact = new ArtifactSearchModel();
        search();
        setSelectedItemRow(-1);
        setReplierIsEligibile(true);
    }


    public void namayesh(ArtifactDoc artifactDoc){

        Set<Zamime> loadedZamaemFiles = artifactDocService.loadZamaem(artifactDoc);
        artifactDoc.setZamaem(loadedZamaemFiles);
        setDialogArtifactDoc(artifactDoc);
        setValidNextVaziats(Arrays.asList(artifactDoc.getArtifactDocState()));

        halateNamayesh = true;
        artifactDialogVisible = true;
    }

    public void taghirVaziat(ArtifactDoc artifactDoc){

        dialogArtifactDoc = artifactDoc.giveForTaghirVaziat(userBean.getCurrentUser());
        setReplierIsEligibile(setDestination(artifactDoc));

        if(replierIsEligibile)
            setValidNextVaziats(workflowRules.nextArtifactDocStates(artifactDoc.getArtifactDocState()));
        else
            setValidNextVaziats(Arrays.asList(artifactDoc.getArtifactDocState()));

        halateNamayesh = false;
        artifactDialogVisible = true;
    }

    private boolean setDestination(ArtifactDoc artifactDoc) {

        if(artifactDoc instanceof SaghfeSodoorArtifactDoc)
            return setDestinationForAnySaghf(artifactDoc);

        if(artifactDoc instanceof SaghfeKhesaratFotArtifactDoc)
            return setDestinationForAnySaghf(artifactDoc);

        if(artifactDoc instanceof SaghfeKhesaratNaghseOzvArtifactDoc)
            return setDestinationForAnySaghf(artifactDoc);

        if(artifactDoc instanceof SaghfeKhesaratHazPezArtifactDoc)
            return setDestinationForAnySaghf(artifactDoc);

        if(artifactDoc instanceof TakhfifeModiriatiArtifactDoc ||
           artifactDoc instanceof FaskhArtifactDoc ||
           artifactDoc instanceof EbtalArtifactDoc) {
                setDestinationForTakhfifModiriatiOrFaskhOrEbtal(artifactDoc);
                return true;
            }

        return true;
    }

    private void setDestinationForTakhfifModiriatiOrFaskhOrEbtal(ArtifactDoc artifactDoc) {
        switch (artifactDoc.getArtifactDocState())
        {
            case NIAZ:
                dialogArtifactDoc.setBe(vahedService.setad());
                break;

            case JADID:
                dialogArtifactDoc.setBe(artifactDoc.getAz());
                break;

            case ELAME_NAGHS:
                dialogArtifactDoc.setBe(vahedService.setad());
                break;

            case RAFE_NAGHS:
                dialogArtifactDoc.setBe(artifactDoc.getAz());
                break;
        }
    }

    private boolean setDestinationForAnySaghf(ArtifactDoc artifactDoc) {
        switch (artifactDoc.getArtifactDocState())
        {
            case NIAZ:
                Vahed sarparast = userBean.getCurrentUser().getVahed().getSarparast();
                dialogArtifactDoc.setBe(sarparast);
                return true;

            case JADID:
                Vahed currentUserVahed = userBean.getCurrentUser().getVahed();
                if(currentUserVahed.getVahedType().equals(VahedType.MOJTAMA))
                {
                    long saghf = 0;
                    long mizaneKhasteShode = 0;

                    if(artifactDoc instanceof SaghfeSodoorArtifactDoc)
                    {
                        saghf = currentUserVahed.getSaghfe_sodoor();
                        mizaneKhasteShode = ((SaghfeSodoorArtifactDoc)artifactDoc).getSarmayeTaahod();
                    }

                    if(artifactDoc instanceof SaghfeKhesaratFotArtifactDoc)
                    {
                        saghf = currentUserVahed.getSaghfe_khesarat_fot();
                        mizaneKhasteShode = ((SaghfeKhesaratFotArtifactDoc)artifactDoc).getKhesarateGhabelePardakhtFot();
                    }

                    if(artifactDoc instanceof SaghfeKhesaratNaghseOzvArtifactDoc)
                    {
                        saghf = currentUserVahed.getSaghfe_khesarat_naghsOzv();
                        mizaneKhasteShode = ((SaghfeKhesaratNaghseOzvArtifactDoc)artifactDoc).getKhesarateGhabelePardakhtNaghs();
                    }

                    if(artifactDoc instanceof SaghfeKhesaratHazPezArtifactDoc)
                    {
                        saghf = currentUserVahed.getSaghfe_khesarat_hazinePezeshki();
                        mizaneKhasteShode = ((SaghfeKhesaratHazPezArtifactDoc)artifactDoc).getKhesarateGhabelePardakhtHazPez();
                    }

                    if(saghf >= mizaneKhasteShode)
                    {
                        dialogArtifactDoc.setBe(artifactDoc.getAz());
                        return true;
                    }
                    else
                    {
                        dialogArtifactDoc.setBe(vahedService.setad());
                        return false;
                    }
                }
                    dialogArtifactDoc.setBe(artifactDocService.originalArtifactDoc(artifactDoc));
                    return true;

            case ELAME_NAGHS:
                dialogArtifactDoc.setBe(artifactDoc.getAz());
                return true;

            case RAFE_NAGHS:
                dialogArtifactDoc.setBe(artifactDoc.getAz());
                return true;

            default:
                return true;
        }
    }
    public void uploadZamime(FileUploadEvent event) {
        Zamime newZamime = ZamimeFactory.buildZamimeFromFile(event.getFile());
        dialogArtifactDoc.getZamaem().add(newZamime);
    }

    public boolean showTaghirVaziatButton(ArtifactDoc artifactDoc){

        Vahed myVahed = userBean.getCurrentUser().getVahed();
        return  !artifactDoc.getJavabDadeShode() &&
                ((artifactDoc.getBe().equals(myVahed) && artifactDoc.getArtifactDocState().isInternalState()) ||
                (artifactDoc.getAz().equals(myVahed) && artifactDoc.getArtifactDocState().isStartState()));

    }

    public boolean showNamayeshButton(ArtifactDoc artifactDoc){

             return !artifactDoc.getArtifactDocState().isStartState();
    }

    public void add() {
        artifactDocService.saveArtifactDoc(dialogArtifactDoc);
        artifactDialogVisible = false;
        init();
    }

    public void closeDialog(){
        artifactDialogVisible = false;
    }

    public void search(){
       artifactDocList = artifactDocService.searchArtifact(searchArtifact, ARTIFACT_MSX_ROW);
    }

    public void removeZamimeFromZamaem(Zamime zamime){
        dialogArtifactDoc.getZamaem().remove(zamime);
    }

    public void downloadZamime(Zamime zamime) throws IOException {
        fileService.downloadZamime(zamime);
    }

    public List<ArtifactDoc> getArtifactDocList() {
        return artifactDocList;
    }

    public List<ArtifactDoc> showOperatableArtifactDocs(){
        return getArtifactDocList() .stream()
                                    .filter(ad -> showNamayeshButton(ad) || showTaghirVaziatButton(ad))
                                    .collect(Collectors.toList());
    }

    public void setArtifactDocList(List<ArtifactDoc> artifactDocList) {
        this.artifactDocList = artifactDocList;
    }

    public boolean isArtifactDialogVisible() {
        return artifactDialogVisible;
    }

    public void setArtifactDialogVisible(boolean artifactDialogVisible) {
        this.artifactDialogVisible = artifactDialogVisible;
    }

    public ArtifactDoc getDialogArtifactDoc() {
        return dialogArtifactDoc;
    }

    public boolean isReplierIsEligibile() {
        return replierIsEligibile;
    }

    public void setReplierIsEligibile(boolean replierIsEligibile) {
        this.replierIsEligibile = replierIsEligibile;
    }

    public void setDialogArtifactDoc(ArtifactDoc dialogArtifactDoc) {
        this.dialogArtifactDoc = dialogArtifactDoc;
    }

    public List<ArtifactDocState> getValidNextVaziats() {
        return validNextVaziats;
    }

    public void setValidNextVaziats(List<ArtifactDocState> validNextVaziats) {
        this.validNextVaziats = validNextVaziats;
    }

    public ArtifactSearchModel getSearchArtifact() {
        return searchArtifact;
    }

    public void setSearchArtifact(ArtifactSearchModel searchArtifact) {
        this.searchArtifact = searchArtifact;
    }

    public int getSelectedItemRow() {
        return selectedItemRow;
    }

    public void setSelectedItemRow(int selectedItemRow) {
        this.selectedItemRow = selectedItemRow;
    }

    public boolean isHalateNamayesh() {
        return halateNamayesh;
    }

    public void setHalateNamayesh(boolean halateNamayesh) {
        this.halateNamayesh = halateNamayesh;
    }

    public boolean eligibleToChangeState(ArtifactDoc artifactDoc) {
        return artifactDoc.getBe().equals(userBean.getCurrentUser().getVahed());
    }

}
