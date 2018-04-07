package ir.parsianinsurance.he.infrastructure;

import groovy.json.StringEscapeUtils;
import ir.parsianinsurance.he.domain.model.GharardadFactory;
import ir.parsianinsurance.he.domain.model.ShoghlFactory;
import ir.parsianinsurance.he.domain.model.Vahed;
import ir.parsianinsurance.he.domain.model.VahedFactory;
import ir.parsianinsurance.he.domain.model.enums.NoeKhatarEzafi;
import ir.parsianinsurance.he.domain.model.enums.TabagheKhatar;
import ir.parsianinsurance.he.domain.model.enums.VahedType;
import ir.parsianinsurance.he.domain.rule.IPropertyRules;
import ir.parsianinsurance.he.domain.service.IGeoService;
import ir.parsianinsurance.he.infrastructure.repository.GharardadRepository;
import ir.parsianinsurance.he.infrastructure.repository.ShoghlRepository;
import ir.parsianinsurance.he.infrastructure.repository.UserRepository;
import ir.parsianinsurance.he.infrastructure.repository.VahedRepository;
import ir.parsianinsurance.he.infrastructure.security.UserFactory;
import ir.parsianinsurance.he.infrastructure.util.IOUtil;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Mohammad on 7/1/2017.
 */

@Singleton
@Startup
public class StartUpLauncher {

    @Inject
    ComboOptions comboOptions;

    @Inject
    IPropertyRules propertyRules;

    @Inject
    UserRepository userRepository;

    @Inject
    VahedRepository vahedRepository;

    @Inject
    GharardadRepository gharardadRepository;

    @Inject
    ShoghlRepository shoghlRepository;

    @Inject
    IGeoService geoService;

    @PostConstruct
    void init(){

        System.out.println("\n" +
                " _   _                      _                  _____       __                   _ _ \n" +
                "| | | |                    | |                |  ___|     / _|                 | (_)\n" +
                "| |_| | __ ___   ____ _  __| | ___  ___  ___  | |__ _ __ | |_ ___ _ __ __ _  __| |_ \n" +
                "|  _  |/ _` \\ \\ / / _` |/ _` |/ _ \\/ __|/ _ \\ |  __| '_ \\|  _/ _ \\ '__/ _` |/ _` | |\n" +
                "| | | | (_| |\\ V / (_| | (_| |  __/\\__ \\  __/ | |__| | | | ||  __/ | | (_| | (_| | |\n" +
                "\\_| |_/\\__,_| \\_/ \\__,_|\\__,_|\\___||___/\\___| \\____/_| |_|_| \\___|_|  \\__,_|\\__,_|_|\n" +
                "                                                                                    \n" +
                "                                                                                    \n");

        System.out.println("*********************** LOADING PROPERTIES ***************************");


        try {
            propertyRules.setTakhfifgoroohi(
                    IOUtil.readPropertyFile("config/takhfifGoroohi.properties",
                                            String::valueOf,
                                            Double::valueOf));

            propertyRules.setNerkheTaahodFotNaghs(
                    IOUtil.readPropertyFile("config/nerkheTaahodFotNaghs.properties",
                                            TabagheKhatar::valueOf,
                                            Double::valueOf));

            propertyRules.setNerkheTaahodGharameteOmoomi(
                    IOUtil.readPropertyFile("config/nerkheTaahodGharameteOmoomi.properties",
                                            TabagheKhatar::valueOf,
                                            Double::valueOf));

            propertyRules.setNerkheTaahodGharameteBastari(
                    IOUtil.readPropertyFile("config/nerkheTaahodGharameteBastari.properties",
                                            TabagheKhatar::valueOf,
                                            Double::valueOf));

            propertyRules.setNerkheTaahodHazinePezeshki(
                    IOUtil.readPropertyFile("config/nerkheTaahodHazinePezeshki.properties",
                                            TabagheKhatar::valueOf,
                                            Double::valueOf));

            propertyRules.setNerkheKhatareEzafi(
                    IOUtil.readPropertyFile("config/nerkheKhatareEzafi.properties",
                                            NoeKhatarEzafi::valueOf,
                                            Double::valueOf));

            propertyRules.setSinglesDouble(IOUtil.readPropertyFile("config/singlesDouble.properties",
                                                      String::valueOf,
                                                      Double::valueOf));

            propertyRules.setSinglesString(IOUtil.readPropertyFile("config/singlesString.properties",
                                                      String::valueOf,
                                                      String::valueOf));

            List<String> bimegars = loadStringFileResource("config/bimegars");
            comboOptions.setBimegars(bimegars);

            List<String> pishvandHaghighi = loadStringFileResource("config/pishvandHaghighi");
            comboOptions.setPishvandHaghihi(pishvandHaghighi);

            List<String> pishvandHoghooghi = loadStringFileResource("config/pishvandHoghooghi");
            comboOptions.setPishvandHoghooghi(pishvandHoghooghi);

            geoService.load();

        } catch (IOException e) {
            e.printStackTrace();
        }

        boolean noAdminFound = userRepository.findByRolesContains("ADMIN").isEmpty();
        if(noAdminFound)
            initializeDatabase();

    }

    private void initializeDatabase() {

        Vahed setad = VahedFactory.newVahed("110011", VahedType.SETAD, 1000000000000L, 100D, 1000000000000L, 1000000000000L, 1000000000000L, "ستاد", "تهران-ساختمان مركزي");
        setad.setVahedeSodoor(setad);

        Vahed mojtamaMarkaz = VahedFactory.newVahed("111110", VahedType.MOJTAMA, 1000000L, 20D, 1000000L, 1000000L, 1000000L, "مجتمع مرکز", "ساختمان مرکزی");
        mojtamaMarkaz.setVahedeSodoor(mojtamaMarkaz);
        mojtamaMarkaz.setSarparast(setad);

        Vahed namayandegi = VahedFactory.newVahed("38509", VahedType.NAMAYANDE_HAGHIGHI, 1000L, 20D, 1000L, 1000L, 1000L, "نمایندگی پونک", "میدان پونک");
        namayandegi.setVahedeSodoor(mojtamaMarkaz);
        namayandegi.setSarparast(mojtamaMarkaz);

        vahedRepository.save(setad);
        vahedRepository.save(mojtamaMarkaz);
        vahedRepository.save(namayandegi);

        userRepository.save(UserFactory.newFaalUser("ادمین سیستم حوادث انفرادی", propertyRules.getSinglesStringParam("defaultpassword"), "mhp", "[ADMIN]", setad, null));
        userRepository.save(UserFactory.newFaalUser("لیلا مطهری", propertyRules.getSinglesStringParam("defaultpassword"), "leila_mot", "[EMZAKONANDE, KARSHENAS_SODOOR, KARSHENAS_KHESARAT]", setad, null));
        userRepository.save(UserFactory.newFaalUser("هانی شباهنگ", propertyRules.getSinglesStringParam("defaultpassword"), "hani_shab", "[EMZAKONANDE, KARSHENAS_SODOOR, KARSHENAS_KHESARAT]", setad, null));
        userRepository.save(UserFactory.newFaalUser("کاربر آزمایشی ستاد", propertyRules.getSinglesStringParam("defaultpassword"), "setad", "[KARSHENAS_SODOOR]", setad, null));
        userRepository.save(UserFactory.newFaalUser("کاربر آزمایشی مجتمع", propertyRules.getSinglesStringParam("defaultpassword"), "mojtama", "[KARSHENAS_SODOOR]", mojtamaMarkaz, null));
        userRepository.save(UserFactory.newFaalUser("کاربر آزمایشی نمایندگی", propertyRules.getSinglesStringParam("defaultpassword"), "namayande", "[NAMAYANDE, KARSHENAS_SODOOR, KARSHENAS_KHESARAT]", namayandegi, null));
        userRepository.save(UserFactory.newFaalUser("بازاریاب پیش فرض", null, propertyRules.getSinglesStringParam("defaultBazaryabUsername"), "[BAZARYAB]", null, propertyRules.getSinglesStringParam("defaultBazaryabCode")));
        userRepository.save(UserFactory.newFaalUser("محمد قلی زاده", null, null, "[BAZARYAB]", null, "23324"));
        userRepository.save(UserFactory.newFaalUser("رضا عليپوري حافظي", null, null, "[BAZARYAB]", null, "6666"));

        gharardadRepository.save(GharardadFactory.newgharardad("قرارداد عمومی بیمه مرکزی", "[DEFAULT_GROUP]", propertyRules.getSinglesStringParam("shomaregharardadeomoomiebimemarkazi")));
        gharardadRepository.save(GharardadFactory.newgharardad("سهام داران حقیقی بانک پارسیان", "[SAHAMDARAN_HAGHIGHI_BIME_PARSIAN_10000_TA_50000, SAHAMDARAN_HAGHIGHI_BIME_PARSIAN_50001_TA_100000, SAHAMDARAN_HAGHIGHI_BIME_PARSIAN_BISHTAR_AZ_100000]", "1111"));
        gharardadRepository.save(GharardadFactory.newgharardad("کارکنان سهام داران و سپرده گذاران حقیقی بانک پارسیان", "[KARKONAN_SAHAMDARAN_SEPORDEGOZARAN_HAGHIGHI_BANK_PARSIAN]", "2222"));
        gharardadRepository.save(GharardadFactory.newgharardad("دارندگان بیمه عمر و سرمایه گذاری", "[DARANDE_BIME_OMR_TABAGHE_SIMIN, DARANDE_BIME_OMR_TABAGHE_BOLOORIN, DARANDE_BIME_OMR_TABAGHE_NOKHOST, DARANDE_BIME_OMR_TABAGHE_ZARRIN]", "3333"));
        gharardadRepository.save(GharardadFactory.newgharardad("پرسنل شرکت بیمه پارسیان", "[PERSONEL_BIME_PARSIAN]", "4444"));
        gharardadRepository.save(GharardadFactory.newgharardad("سازمان تنظيم مقررات و ارتباطات رادیویی", "[SAZMANE_TANZIME_MOGHARRARAT_VA_ERTEBATATE_RADIOYI]", "5555"));
        gharardadRepository.save(GharardadFactory.newgharardad("سرمايه گذاری البرز", "[SARMAYEGOZARI_ALBORZ]", "6666"));

        shoghlRepository.save(ShoghlFactory.newshoghl("نا مشخص", TabagheKhatar.YEK));
        shoghlRepository.save(ShoghlFactory.newshoghl("ملوان", TabagheKhatar.SE));

    }

    private List<String> loadStringFileResource(String path) {
        List<String> ostans = new ArrayList();
        final InputStream stream = Thread
                .currentThread()
                .getContextClassLoader()
                .getResourceAsStream(path);
        try {
            try (BufferedReader buffer = new BufferedReader(new InputStreamReader(stream))) {
                ostans.add("---");
                ostans.addAll(buffer
                                .lines()
                                .map(str -> StringEscapeUtils.unescapeJava(str))
                                .collect(Collectors.toList()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return ostans;
    }

}
