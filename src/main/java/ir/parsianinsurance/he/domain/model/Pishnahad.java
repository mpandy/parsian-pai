package ir.parsianinsurance.he.domain.model;

import ir.parsianinsurance.he.domain.model.enums.*;
import ir.parsianinsurance.he.infrastructure.io.Zamime;
import ir.parsianinsurance.he.infrastructure.security.User;
import ir.parsianinsurance.he.infrastructure.util.DateUtil;
import ir.parsianinsurance.he.infrastructure.util.StringUtil;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by 8119 on 2/15/2017.
 */

@Entity
@Table(name = "DMN_PISHNAHAD")
public class Pishnahad {
    @Id
    @GeneratedValue
    private Long id;

    private String shomare_pishnahad;
    private String tarikh_pishnahad;

    @Enumerated(EnumType.STRING)
    private NoePishnahad noePishnahad;

    @Enumerated(EnumType.STRING)
    private NahveMohasebe nahveMohasebe;

    private String aztarikh;
    private String tatarikh;
    private String sharhe_pishnahad;
    private String goroohbimename;
    private String shomare_bime_sale_ghabl;
    private String tarikhe_engheza_ghabli;
    private String sharayete_khosoosi;
    private String tozihate_zamaem;

    @ManyToOne
    @JoinColumn(name="gharardad_id")
    private Gharardad gharardad;

    @OneToOne
    private Vahed vahed;

    @ManyToOne
    @JoinColumn(name = "bazaryab_id")
    private User bazaryab;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "bimegozar_id")
    private BimeGozar bimeGozar;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "bimeshode_id")
    private BimeShode bimeShode;

    @OneToOne(cascade = CascadeType.PERSIST)
    private Elhaghiye elhaghiye;

    @Enumerated(EnumType.STRING)
    private NoeShakhs noeBimegozar;

    @Embedded
    private EzafeKasr ezafeKasr;

    @OneToOne
    private User emzaKonande_aval;

    @OneToOne
    private User emzaKonande_dovom;

    @Enumerated(EnumType.STRING)
    private TabagheKhatar tabagheKhatar;

    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinColumn(name = "pishnahad_id")
    private Set<Zinaf> zinafs;

    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinColumn(name = "pishnahad_id")
    private Set<TaahodBimegar> taahodBimegars;

    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "pishnahad_id")
    private Set<Zamime> zamaem;

    @OneToOne
    private Zamime zamimePishnahad;

    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinColumn(name = "pishnahad_id")
    private Set<KhatarEzafi> khatarEzafis;

    @Embedded
    private HagheBime hagheBime;

    private Long createdDate;

    public Long getCreatedDate() {
        return createdDate;
    }

    public NahveMohasebe getNahveMohasebe() {
        return nahveMohasebe;
    }

    public void setNahveMohasebe(NahveMohasebe nahveMohasebe) {
        this.nahveMohasebe = nahveMohasebe;
    }

    public String getAztarikh() {
        return aztarikh;
    }

    public void setAztarikh(String aztarikh) {
        this.aztarikh = aztarikh;
    }

    public String getTatarikh() {
        return tatarikh;
    }

    public void setTatarikh(String tatarikh) {
        this.tatarikh = tatarikh;
    }

    public void setCreatedDate(Long createdDate) {
        this.createdDate = createdDate;
    }

    public String getSharhe_pishnahad() {
        return sharhe_pishnahad;
    }

    public void setSharhe_pishnahad(String sharhe_pishnahad) {
        this.sharhe_pishnahad = sharhe_pishnahad;
    }

    public Gharardad getGharardad() {
        return gharardad;
    }

    public void setGharardad(Gharardad gharardad) {
        this.gharardad = gharardad;
    }

    public String getShomare_pishnahad() {
        return shomare_pishnahad;
    }

    public void setShomare_pishnahad(String shomare_pishnahad) {
        this.shomare_pishnahad = shomare_pishnahad;
    }

    public String getTarikh_pishnahad() {
        return tarikh_pishnahad;
    }

    public void setTarikh_pishnahad(String tarikh_pishnahad) {
        this.tarikh_pishnahad = tarikh_pishnahad;
    }

    public NoePishnahad getNoePishnahad() {
        return noePishnahad;
    }

    public void setNoePishnahad(NoePishnahad noePishnahad) {
        this.noePishnahad = noePishnahad;
    }

    public String getTozihate_zamaem() {
        return tozihate_zamaem;
    }

    public void setTozihate_zamaem(String tozihate_zamaem) {
        this.tozihate_zamaem = tozihate_zamaem;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGoroohbimename() {
        return goroohbimename;
    }

    public void setGoroohbimename(String goroohbimename) {
        this.goroohbimename = goroohbimename;
    }

    public String getShomare_bime_sale_ghabl() {
        return shomare_bime_sale_ghabl;
    }

    public void setShomare_bime_sale_ghabl(String shomare_bime_sale_ghabl) {
        this.shomare_bime_sale_ghabl = shomare_bime_sale_ghabl;
    }

    public String getTarikhe_engheza_ghabli() {
        return tarikhe_engheza_ghabli;
    }

    public void setTarikhe_engheza_ghabli(String tarikhe_engheza_ghabli) {
        this.tarikhe_engheza_ghabli = tarikhe_engheza_ghabli;
    }

    public String getSharayete_khosoosi() {
        return sharayete_khosoosi;
    }

    public void setSharayete_khosoosi(String sharayete_khosoosi) {
        this.sharayete_khosoosi = sharayete_khosoosi;
    }

    public Vahed getVahed() {
        return vahed;
    }

    public void setVahed(Vahed vahed) {
        this.vahed = vahed;
    }

    public Zamime getZamimePishnahad() {
        return zamimePishnahad;
    }

    public void setZamimePishnahad(Zamime zamimePishnahad) {
        this.zamimePishnahad = zamimePishnahad;
    }

    public User getBazaryab() {
        return bazaryab;
    }

    public void setBazaryab(User bazaryab) {
        this.bazaryab = bazaryab;
    }

    public BimeGozar getBimeGozar() {
        return bimeGozar;
    }

    public void setBimeGozar(BimeGozar bimeGozar) {
        this.bimeGozar = bimeGozar;
    }

    public BimeShode getBimeShode() {
        return bimeShode;
    }

    public void setBimeShode(BimeShode bimeShode) {
        this.bimeShode = bimeShode;
    }

    public EzafeKasr getEzafeKasr() {
        return ezafeKasr;
    }

    public void setEzafeKasr(EzafeKasr ezafeKasr) {
        this.ezafeKasr = ezafeKasr;
    }

    public User getEmzaKonande_aval() {
        return emzaKonande_aval;
    }

    public void setEmzaKonande_aval(User emzaKonande_aval) {
        this.emzaKonande_aval = emzaKonande_aval;
    }

    public User getEmzaKonande_dovom() {
        return emzaKonande_dovom;
    }

    public void setEmzaKonande_dovom(User emzaKonande_dovom) {
        this.emzaKonande_dovom = emzaKonande_dovom;
    }

    public Set<Zinaf> getZinafs() {
        return zinafs;
    }

    public void setZinafs(Set<Zinaf> zinafs) {
        this.zinafs = zinafs;
    }

    public Set<TaahodBimegar> getTaahodBimegars() {
        return taahodBimegars;
    }

    public void setTaahodBimegars(Set<TaahodBimegar> taahodBimegars) {
        this.taahodBimegars = taahodBimegars;
    }

    public Set<KhatarEzafi> getKhatarEzafis() {
        return khatarEzafis;
    }

    public void setKhatarEzafis(Set<KhatarEzafi> khatarEzafis) {
        this.khatarEzafis = khatarEzafis;
    }

    public HagheBime getHagheBime() {
        return hagheBime;
    }

    protected void setHagheBime(HagheBime hagheBime) {
        this.hagheBime = hagheBime;
    }

    public TabagheKhatar getTabagheKhatar() {
        return tabagheKhatar;
    }

    public void setTabagheKhatar(TabagheKhatar tabagheKhatar) {
        this.tabagheKhatar = tabagheKhatar;
    }

    public Set<Zamime> getZamaem() {
        return zamaem;
    }

    public void setZamaem(Set<Zamime> zamaem) {
        this.zamaem = zamaem;
    }

    public double getMaxNerkhKhatareEzafi() {

        List<KhatarEzafi> newList = getKhatarEzafis()
                .stream()
                .filter(x ->!x.getNoekhatarezafi().equals(NoeKhatarEzafi.HEDAYAT_MOTORCYCLET_DANDEYI) &&
                            !x.getNoekhatarezafi().equals(NoeKhatarEzafi.ZELZELE))
                .collect(Collectors.toList());

        if (newList.size() != 0 ) {
            return Collections.max(newList, (ke1, ke2) -> ke1.getNerkh().compareTo(ke2.getNerkh())).getNerkh();
        } else {
            return 0d;
        }
    }
    public String formatKhatarateEzafi() {
        if (getKhatarEzafis().size() != 0) {
            String returnString = "";
            for (KhatarEzafi khatarEzafi : getKhatarEzafis())
                returnString += (khatarEzafi.getNoekhatarezafi() + " - ");

            return returnString.substring(0, returnString.length() - 3);
        } else {
            return null;
        }
    }

    public double getNerkheZelze(){
        for(KhatarEzafi khatarEzafi : getKhatarEzafis())
        {
            if(khatarEzafi.getNoekhatarezafi().equals(NoeKhatarEzafi.ZELZELE))
                return khatarEzafi.getNerkh();
        }
        return 0;
    }
    public double getNerkheMotor(){
        for(KhatarEzafi khatarEzafi : getKhatarEzafis())
        {
            if(khatarEzafi.getNoekhatarezafi().equals(NoeKhatarEzafi.HEDAYAT_MOTORCYCLET_DANDEYI))
                return khatarEzafi.getNerkh();
        }
        return 0;
    }

    public NoeShakhs getNoeBimegozar() {
        return noeBimegozar;
    }

    public void setNoeBimegozar(NoeShakhs noeBimegozar) {
        this.noeBimegozar = noeBimegozar;
    }

    public Pishnahad bimegozar(BimeGozar bimeGozar){
        this.setBimeGozar(bimeGozar);
        return this;
    }

    public Pishnahad bimeshode(BimeShode bimeShode){
        this.setBimeShode(bimeShode);
        return this;
    }

    public Pishnahad shomare(String shomare){
        this.setShomare_pishnahad(shomare);
        return this;
    }

    public Pishnahad nahveMohasebe(NahveMohasebe nahveMohasebe){
        this.setNahveMohasebe(nahveMohasebe);
        return this;
    }

    public Pishnahad noeBimegozar(NoeShakhs noeBimegozar){
        this.setNoeBimegozar(noeBimegozar);
        return this;
    }

    public Pishnahad tarikh(String tarikh){
        this.setTarikh_pishnahad(tarikh);
        return this;
    }

    public Pishnahad noePishnahad(NoePishnahad noePishnahad){
        this.setNoePishnahad(noePishnahad);
        return this;
    }

    public Pishnahad sharh(String sharh){
        this.setSharhe_pishnahad(sharh);
        return this;
    }

    public Pishnahad gorooh(String goroohbimename){
        this.setGoroohbimename(goroohbimename);
        return this;
    }

    public Pishnahad gharardad(Gharardad gharardad){
        this.setGharardad(gharardad);
        return this;
    }

    public Pishnahad createdDate(Long createdDate){
        this.setCreatedDate(createdDate);
        return this;
    }

    public Pishnahad taahods(Set<TaahodBimegar> taahodBimegars){
        this.setTaahodBimegars(taahodBimegars);
        return this;
    }

    public Pishnahad vahed(Vahed vahed){
        this.setVahed(vahed);
        return this;
    }

    public Pishnahad hagheBime(HagheBime hagheBime){
        this.setHagheBime(hagheBime);
        return this;
    }

    public Pishnahad bazaryab(User bazaryab){
        this.setBazaryab(bazaryab);
        return this;
    }

    public Pishnahad tarikhshoroo(String tarikhshoroo){
        this.setAztarikh(tarikhshoroo);
        return this;
    }

    public Pishnahad tarikhpayan(String tarikhpayan){
        this.setTatarikh(tarikhpayan);
        return this;
    }

    public Pishnahad emzakonande_avval(User emzaKonande_aval){
        this.setEmzaKonande_aval(emzaKonande_aval);
        return this;
    }

    public Pishnahad emzakonande_dovvom(User emzaKonande_dovom){
        this.setEmzaKonande_dovom(emzaKonande_dovom);
        return this;
    }

    public Pishnahad ezafeKasr(EzafeKasr ezafeKasr){
        this.setEzafeKasr(ezafeKasr);
        return this;
    }

    public Elhaghiye getElhaghiye() {
        return elhaghiye;
    }

    public void setElhaghiye(Elhaghiye elhaghiye) {
        this.elhaghiye = elhaghiye;
    }

    public void mohasebeyeHagheBime(Double nerkheMaliat, double darsadeHagheBimeSalane)
    {

        long jame_khatarate_asli = 0;
        double max_nerkh_khatare_ezafi = getMaxNerkhKhatareEzafi();
        long jame_khatare_ezafi = 0;
        long hagh_bime_zelzelevamotor= 0;

        for(TaahodBimegar tbimegar : getTaahodBimegars()) {

            long nextKhatareAsli = (Math.round (tbimegar.getSarmaye_taahod() * tbimegar.getNerkh_taahod()));
            tbimegar.setHagh_bime_taahod(nextKhatareAsli);

            System.out.println("Hagh_bime_taahod:"+nextKhatareAsli);

            jame_khatarate_asli += nextKhatareAsli;

            long nextHagheBimeKhatareEzafi = (Math.round((tbimegar.getSarmaye_taahod() * tbimegar.getNerkh_paye() * max_nerkh_khatare_ezafi)));
            tbimegar.setHagh_bime_khataratezafi(nextHagheBimeKhatareEzafi);

            jame_khatare_ezafi += nextHagheBimeKhatareEzafi;

            if (tbimegar.getNoetaahod().equals(NoeTaahod.HAZINE_PEZESHKI) || tbimegar.getNoetaahod().equals(NoeTaahod.FOT) || tbimegar.getNoetaahod().equals(NoeTaahod.NAGHSOZV_AZKAROFTADEGI)) {

                if (getNerkheZelze() != 0 || getNerkheMotor() != 0) {
                    long nextHaghbimezelzelevamotor = Math.round(tbimegar.getSarmaye_taahod() * tbimegar.getNerkh_paye() * (getNerkheMotor() + getNerkheZelze()));
                    tbimegar.setHagh_bime_zelzelevamotor(nextHaghbimezelzelevamotor);
                    hagh_bime_zelzelevamotor += nextHaghbimezelzelevamotor;
                }
            }
        }

        getHagheBime().setJame_khatarate_asli((jame_khatarate_asli));
        getHagheBime().setJame_khatarate_ezafi(jame_khatare_ezafi + hagh_bime_zelzelevamotor);
        getHagheBime().mohasebehaghbime(getEzafeKasr(), nerkheMaliat, darsadeHagheBimeSalane);
    }

    public List<ElhaghiyeDiff> elhagiyeDiffs(Pishnahad otherPishnahad) {
        List<ElhaghiyeDiff> diffs = new ArrayList<>();

        if(!StringUtil.equals(this.getTarikh_pishnahad(), otherPishnahad.getTarikh_pishnahad()))
            diffs.add(new ElhaghiyeDiff("tarikh_pishnahad", this.getTarikh_pishnahad(), otherPishnahad.getTarikh_pishnahad()));

        if(!this.getNoePishnahad().equals(otherPishnahad.getNoePishnahad()))
            diffs.add(new ElhaghiyeDiff("noePishnahad", this.getNoePishnahad().name(), otherPishnahad.getNoePishnahad().name()));

        if(!StringUtil.equals(this.getSharhe_pishnahad(), otherPishnahad.getSharhe_pishnahad()))
            diffs.add(new ElhaghiyeDiff("sharhe_pishnahad", this.getSharhe_pishnahad(), otherPishnahad.getSharhe_pishnahad()));

        if(!StringUtil.equals(this.getGoroohbimename(), otherPishnahad.getGoroohbimename()))
            diffs.add(new ElhaghiyeDiff("gorooheBimename", this.getGoroohbimename(), otherPishnahad.getGoroohbimename()));

        if(!StringUtil.equals(this.getShomare_bime_sale_ghabl(), otherPishnahad.getShomare_bime_sale_ghabl()))
            diffs.add(new ElhaghiyeDiff("shomarebimesaleghabl", this.getShomare_bime_sale_ghabl(), otherPishnahad.getShomare_bime_sale_ghabl()));

        if(!StringUtil.equals(this.getTarikhe_engheza_ghabli(), otherPishnahad.getTarikhe_engheza_ghabli()))
            diffs.add(new ElhaghiyeDiff("tarikheenghazayeghabli", this.getTarikhe_engheza_ghabli(), otherPishnahad.getTarikhe_engheza_ghabli()));

        if(!StringUtil.equals(this.getSharayete_khosoosi(), otherPishnahad.getSharayete_khosoosi()))
            diffs.add(new ElhaghiyeDiff("sharayetekhosoosi", this.getSharayete_khosoosi(), otherPishnahad.getSharayete_khosoosi()));

        if(!StringUtil.equals(this.getTatarikh(), otherPishnahad.getTatarikh()))
            diffs.add(new ElhaghiyeDiff("tarikhpayan", this.getTatarikh(), otherPishnahad.getTatarikh()));

        if(!StringUtil.equals(this.getAztarikh(), otherPishnahad.getAztarikh()))
            diffs.add(new ElhaghiyeDiff("tarikhshoroo", this.getAztarikh(), otherPishnahad.getAztarikh()));

        return diffs;
    }

    public int modatBimename() {
        return DateUtil.getTimeDifferenceByDayCount(getAztarikh(),getTatarikh());
    }

    public Long getSarmayePooshesh(NoeTaahod noeTaahod){

        for (TaahodBimegar tb : taahodBimegars)
            if (tb.getNoetaahod().equals(noeTaahod))
                return tb.getSarmaye_taahod();
        return 0L;
    }

}
