package ir.parsianinsurance.he.interfaces.view.bean.view.bimenameLoader;

/**
 * Created by Mohammad on 6/13/2017.
 */
public class BimenameFilter {

    private boolean bimeshodeDetails;
    private boolean bimegozarHaghighiDetails;
    private boolean bimegozarHoghooghiDetails;
    private boolean takhfifekarmandi;
    private boolean takhfifegoroohi;
    private boolean takhfifetavafoghi;
    private boolean ezafenerkhepezeshki;
    private boolean shoghleBimeshode;
    private boolean panelBimename;
    private boolean shomarePishnahad;
    private boolean shomareBimename;
    private boolean tarikhsodoor;
    private boolean vahedesodoor;
    private boolean copyFromBimegozarButton;

    public static BimenameFilter init(){
        BimenameFilter bimenameFilter = new BimenameFilter( true, true, true, true,
                                                            true, true, true, true,
                                                            true, true, true, true,
                                                            true, true);
        return bimenameFilter;
    }

    private BimenameFilter(boolean bimeshodeDetails, boolean bimegozarHaghighiDetails, boolean bimegozarHoghooghiDetails, boolean takhfifekarmandi, boolean takhfifegoroohi, boolean takhfifetavafoghi, boolean ezafenerkhepezeshki, boolean shoghleBimeshode, boolean panelBimename, boolean shomarePishnahad, boolean shomareBimename, boolean copyFromBimegozarButton, boolean vahedesodoor, boolean tarikhsodoor) {
        this.bimeshodeDetails = bimeshodeDetails;
        this.bimegozarHaghighiDetails = bimegozarHaghighiDetails;
        this.bimegozarHoghooghiDetails = bimegozarHoghooghiDetails;
        this.takhfifekarmandi = takhfifekarmandi;
        this.takhfifegoroohi = takhfifegoroohi;
        this.takhfifetavafoghi = takhfifetavafoghi;
        this.ezafenerkhepezeshki = ezafenerkhepezeshki;
        this.shoghleBimeshode = shoghleBimeshode;
        this.panelBimename = panelBimename;
        this.shomarePishnahad = shomarePishnahad;
        this.shomareBimename = shomareBimename;
        this.copyFromBimegozarButton = copyFromBimegozarButton;
        this.vahedesodoor = vahedesodoor;
        this.tarikhsodoor = tarikhsodoor;
    }

    public boolean isBimeshodeDetails() {
        return bimeshodeDetails;
    }

    public BimenameFilter hideBimeshodeDetails() {
        this.bimeshodeDetails = false;
        return this;
    }

    public BimenameFilter showBimeshodeDetails() {
        this.bimeshodeDetails = true;
        return this;
    }

    public boolean isBimegozarHaghighiDetails() {
        return bimegozarHaghighiDetails;
    }

    public BimenameFilter hideBimegozarHaghighiDetails() {
        this.bimegozarHaghighiDetails = false;
        return this;
    }
    public BimenameFilter showBimegozarHaghighiDetails() {
        this.bimegozarHaghighiDetails = true;
        return this;
    }

    public boolean isBimegozarHoghooghiDetails() {
        return bimegozarHoghooghiDetails;
    }

    public BimenameFilter hideBimegozarHoghooghiDetails() {
        this.bimegozarHoghooghiDetails = false;
        return this;
    }

    public BimenameFilter showBimegozarHoghooghiDetails() {
        this.bimegozarHoghooghiDetails = true;
        return this;
    }

    public boolean isShoghleBimeshode() {
        return shoghleBimeshode;
    }

    public BimenameFilter hideShoghleBimeshode() {
        this.shoghleBimeshode = false;
        return this;
    }

    public BimenameFilter showShoghleBimeshode() {
        this.shoghleBimeshode = true;
        return this;
    }

    public boolean isTakhfifekarmandi() {
        return takhfifekarmandi;
    }

    public BimenameFilter disableTakhfifekarmandi() {
        this.takhfifekarmandi = false;
        return this;
    }

    public BimenameFilter enableTakhfifekarmandi() {
        this.takhfifekarmandi = true;
        return this;
    }

    public boolean isTakhfifegoroohi() {
        return takhfifegoroohi;
    }

    public BimenameFilter disableTakhfifegoroohi() {
        this.takhfifegoroohi = false;
        return this;
    }

    public BimenameFilter enableTakhfifegoroohi() {
        this.takhfifegoroohi = true;
        return this;
    }

    public boolean isEzafenerkhepezeshki() {
        return ezafenerkhepezeshki;
    }

    public BimenameFilter disableEzafenerkhepezeshki() {
        this.ezafenerkhepezeshki = false;
        return this;
    }

    public BimenameFilter enableEzafenerkhepezeshki() {
        this.ezafenerkhepezeshki = true;
        return this;
    }

    public boolean isPanelBimename() {
        return panelBimename;
    }

    public BimenameFilter hidePanelBimename() {
        this.panelBimename = false;
        return this;
    }

    public boolean isShomarePishnahad() {
        return shomarePishnahad;
    }
    public BimenameFilter hideShomarePishnahad() {
        this.shomarePishnahad = false;
        return this;
    }

    public BimenameFilter showShomarePishnahad() {
        this.shomarePishnahad = true;
        return this;
    }

    public void setShomarePishnahad(boolean shomarePishnahad) {
        this.shomarePishnahad = shomarePishnahad;
    }

    public boolean isShomareBimename() {
        return shomareBimename;
    }

    public void setShomareBimename(boolean shomareBimename) {
        this.shomareBimename = shomareBimename;
    }

    public BimenameFilter showShomareBimename() {
        this.shomareBimename = true;
        return this;
    }

    public BimenameFilter hideShomareBimename() {
        this.shomareBimename = false;
        return this;
    }

    public BimenameFilter showPanelBimename() {
        this.panelBimename = true;
        return this;
    }

    public boolean isCopyFromBimegozarButton() {
        return copyFromBimegozarButton;
    }

    public BimenameFilter showCopyFromBimegozarButton() {
        this.copyFromBimegozarButton = true;
        return this;
    }

    public BimenameFilter hideCopyFromBimegozarButton() {
        this.copyFromBimegozarButton = false;
        return this;
    }

    public boolean isVahedesodoor() {
        return vahedesodoor;
    }

    public BimenameFilter hideVahedesodoor() {
        this.vahedesodoor = false;
        return this;
    }

    public BimenameFilter showVahedesodoor() {
        this.vahedesodoor = true;
        return this;
    }

    public boolean isTarikhsodoor() {
        return tarikhsodoor;
    }

    public BimenameFilter hideTarikhsodoor() {
        this.tarikhsodoor = false;
        return this;
    }

    public BimenameFilter showTarikhsodoor() {
        this.tarikhsodoor = true;
        return this;
    }

}
