package ir.parsianinsurance.he.infrastructure.service;

import ir.parsianinsurance.he.domain.model.*;
import ir.parsianinsurance.he.domain.model.enums.NoeShakhs;
import ir.parsianinsurance.he.domain.model.enums.NoeTaahod;
import ir.parsianinsurance.he.domain.rule.IPropertyRules;
import ir.parsianinsurance.he.infrastructure.util.DateUtil;
import ir.parsianinsurance.he.interfaces.report.*;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

/**
 * Created by 8119 on 4/27/2017.
 */

@RequestScoped
public class PrintService implements IPrintService {

    @Inject
    IPropertyRules propertyRules;

    @Inject
    FacesContext facesContext;

    @Inject
    transient ResourceBundle bundle;

    @Override
    public JasperPrint printBimename(Bimename bimename, ServletContext context) throws JRException, IOException {

        BimenamePrint bimenamePrint = new BimenamePrint();

        bimenamePrint.setBimename(bimename);

        if(bimename.getPishnahadeFaal().getNoeBimegozar().equals(NoeShakhs.HAGHIGHI))
            bimenamePrint.setBimegozarShakhsHaghighi((ShakhseHaghighi) bimename.getPishnahadeFaal().getBimeGozar().getShakhs());

        if(bimename.getPishnahadeFaal().getNoeBimegozar().equals(NoeShakhs.HOGHOOGHI))
            bimenamePrint.setBimegozarShakhsHoghooghi((ShakhseHoghooghi) bimename.getPishnahadeFaal().getBimeGozar().getShakhs());

        bimenamePrint.setKhatarateEzafi(new JRBeanCollectionDataSource(bimename.getPishnahadeFaal().getKhatarEzafis()));
        bimenamePrint.setTaahodateBimegar(new JRBeanCollectionDataSource(bimename.getPishnahadeFaal().getTaahodBimegars()));
        bimenamePrint.setZinafha(new JRBeanCollectionDataSource(bimename.getPishnahadeFaal().getZinafs()));

        ArrayList<BimenamePrint> bimenamePrints = new ArrayList<>();
        bimenamePrints.add(bimenamePrint);
        JRBeanCollectionDataSource beanColDataSource = new JRBeanCollectionDataSource(bimenamePrints);
        Map parameters = new HashMap();

        parameters.put("moddat", bimename.getPishnahadeFaal().modatBimename());
        parameters.put("khatareEzafi", translateKhatarateEzafe(bimename));
        parameters.put("realPath", context.getRealPath("/")+"\\reports\\");
        parameters.put("maliat", (propertyRules.getSinglesDoubleParam("nerkheMaliat")* bimename.getPishnahadeFaal().getHagheBime().getHaghe_bime_ghabelepardakht()+""));

        JasperCompileManager.compileReportToFile(   context.getRealPath("/reports/bimename_taahodebimegar.jrxml"),
                                                    context.getRealPath("/reports/bimename_taahodebimegar.jasper"));
        JasperCompileManager.compileReportToFile(   context.getRealPath("/reports/bimename_zinafha.jrxml"),
                                                    context.getRealPath("/reports/bimename_zinafha.jasper"));
        JasperCompileManager.compileReportToFile(   context.getRealPath("/reports/bimename.jrxml"),
                                                    context.getRealPath("/reports/bimename.jasper"));

        JasperPrint jasperPrint = JasperFillManager.fillReport(context.getResourceAsStream("/reports/bimename.jasper"), parameters, beanColDataSource);
        return jasperPrint;

    }

    @Override
    public void printAghsat(Bimename bimename) throws JRException, IOException {

        AghsatPrint aghsatPrint = new AghsatPrint();
        aghsatPrint.setBimename(bimename);

        ExternalContext externalContext = facesContext.getExternalContext();
        JasperCompileManager.compileReportToFile(externalContext.getRealPath("/reports/aghsat.jrxml"), externalContext.getRealPath("/reports/aghsat.jasper"));
        ArrayList<AghsatPrint> aghsatPrints = new ArrayList<AghsatPrint>();
        aghsatPrints.add(aghsatPrint);
        JRBeanCollectionDataSource beanColDataSource = new JRBeanCollectionDataSource(aghsatPrints);
        Map parameters = new HashMap();
        parameters.put("realPath", externalContext.getRealPath("/")+"\\reports\\");
        JasperPrint jasperPrint = JasperFillManager.fillReport(externalContext.getResourceAsStream("/reports/aghsat.jasper"), parameters, beanColDataSource);

        HttpServletResponse httpServletResponse = (HttpServletResponse)externalContext.getResponse();
        httpServletResponse.addHeader("Content-disposition", "attachment; filename=report.pdf");
        ServletOutputStream servletOutputStream = httpServletResponse.getOutputStream();
        JasperExportManager.exportReportToPdfStream(jasperPrint, servletOutputStream);
        facesContext.responseComplete();
    }

    @Override
    public JasperPrint printParvandekhesarat(Khesarat khesarat, ServletContext context) throws JRException, IOException {
        KhesaratPrint khesaratPrint = new KhesaratPrint();
        khesaratPrint.setKhesarat(khesarat);
        for(KhesaratCase khesaratCase : khesarat.getKhesaratCases()) {
            khesaratCase.setVaziatFarsi(bundle.getString(khesaratCase.getVaziat().name()));
            khesaratCase.setNoeKhesaratFarsi(bundle.getString(khesaratCase.getNoe_khesarat().name()));
        }
        khesaratPrint.setMavared(new JRBeanCollectionDataSource(khesarat.getKhesaratCases()));

        if(khesarat.getBimename().getPishnahadeFaal().getNoeBimegozar().equals(NoeShakhs.HAGHIGHI)) {
            ShakhseHaghighi shakhs = (ShakhseHaghighi) khesarat
                    .getBimename()
                    .getPishnahadeFaal()
                    .getBimeGozar()
                    .getShakhs();
            khesaratPrint.setBimegozarShakhsHaghighi(shakhs);
        }

        ArrayList<KhesaratPrint> khesaratPrints = new ArrayList<>();
        khesaratPrints.add(khesaratPrint);
        JRBeanCollectionDataSource beanColDataSource = new JRBeanCollectionDataSource(khesaratPrints);
        Map parameters = new HashMap();

        parameters.put("sarmayefot", khesarat.getBimename().getPishnahadeFaal().getSarmayePooshesh(NoeTaahod.FOT));
        parameters.put("sarmayenaghsozv", khesarat.getBimename().getPishnahadeFaal().getSarmayePooshesh(NoeTaahod.NAGHSOZV_AZKAROFTADEGI));
        parameters.put("sarmayehazinepezeshki", khesarat.getBimename().getPishnahadeFaal().getSarmayePooshesh(NoeTaahod.HAZINE_PEZESHKI));
        parameters.put("realPath", context.getRealPath("/")+"\\reports\\");

        JasperCompileManager.compileReportToFile(context.getRealPath("/reports/chapkhesarat_mavared.jrxml"),
                context.getRealPath("/reports/chapkhesarat_mavared.jasper"));

        JasperCompileManager.compileReportToFile(context.getRealPath("/reports/chapkhesarat.jrxml"),
                context.getRealPath("/reports/chapkhesarat.jasper"));

        JasperPrint jasperPrint = JasperFillManager.fillReport(context.getResourceAsStream("/reports/chapkhesarat.jasper"), parameters, beanColDataSource);

        return jasperPrint;

    }

    @Override
    public JasperPrint printHavalekhesarat(HavaleKhesarat havaleKhesarat, ServletContext context) throws JRException, IOException {
        HavaleKhesaratPrint havaleKhesaratPrint = new HavaleKhesaratPrint();
        havaleKhesaratPrint.setHavaleKhesarat(havaleKhesarat);

        if(havaleKhesarat.getKhesarat().getBimename().getPishnahadeFaal().getNoeBimegozar().equals(NoeShakhs.HAGHIGHI)) {
            ShakhseHaghighi shakhs = (ShakhseHaghighi) havaleKhesarat   .getKhesarat()
                                                                        .getBimename()
                                                                        .getPishnahadeFaal()
                                                                        .getBimeGozar()
                                                                        .getShakhs();
            havaleKhesaratPrint.setBimegozarShakhsHaghighi(shakhs);
        }

        ArrayList<HavaleKhesaratPrint> havaleKhesaratPrints = new ArrayList<>();
        havaleKhesaratPrints.add(havaleKhesaratPrint);
        JRBeanCollectionDataSource beanColDataSource = new JRBeanCollectionDataSource(havaleKhesaratPrints);
        Map parameters = new HashMap();

        parameters.put("realPath", context.getRealPath("/")+"\\reports\\");
        parameters.put("currentDate", DateUtil.getJalaliCurrentDate());

        JasperCompileManager.compileReportToFile(   context.getRealPath("/reports/chaphavalekhesarat.jrxml"),
                context.getRealPath("/reports/chaphavalekhesarat.jasper"));

        JasperPrint jasperPrint = JasperFillManager.fillReport(context.getResourceAsStream("/reports/chaphavalekhesarat.jasper"), parameters, beanColDataSource);
        return jasperPrint;

    }

    @Override
    public JasperPrint printElhaghiye(Elhaghiye elhaghiye, ServletContext context) throws JRException, IOException {

        ElhaghiyePrint elhaghiyePrint = new ElhaghiyePrint();
        elhaghiyePrint.setElhaghiye(elhaghiye);

        if(elhaghiye.getBimename().getPishnahadeFaal().getNoeBimegozar().equals(NoeShakhs.HAGHIGHI)) {
            ShakhseHaghighi shakhs = (ShakhseHaghighi) elhaghiye.getBimename().getPishnahadeFaal().getBimeGozar().getShakhs();
            elhaghiyePrint.setBimegozarShakhsHaghighi(shakhs);
        }
        if(elhaghiye.getBimename().getPishnahadeFaal().getNoeBimegozar().equals(NoeShakhs.HOGHOOGHI)) {
            ShakhseHoghooghi shakhs = (ShakhseHoghooghi) elhaghiye.getBimename().getPishnahadeFaal().getBimeGozar().getShakhs();
            elhaghiyePrint.setBimegozarShakhsHoghooghi(shakhs);
        }

        ArrayList<ElhaghiyePrint> elhaghiyePrints = new ArrayList<>();
        elhaghiyePrints.add(elhaghiyePrint);
        JRBeanCollectionDataSource beanColDataSource = new JRBeanCollectionDataSource(elhaghiyePrints);
        Map parameters = new HashMap();

        parameters.put("realPath", context.getRealPath("/")+"\\reports\\");
        parameters.put("noeElhaghiye", bundle.getString(elhaghiye.getNoe_elhaghie().name()));
        parameters.put("maliat", (propertyRules.getSinglesDoubleParam("nerkheMaliat")* elhaghiye.getBimename().getPishnahadeFaal().getHagheBime().getHaghe_bime_ghabelepardakht()+""));

        JasperCompileManager.compileReportToFile(   context.getRealPath("/reports/elhaghiye.jrxml"),
                context.getRealPath("/reports/elhaghiye.jasper"));

        JasperPrint jasperPrint = JasperFillManager.fillReport(context.getResourceAsStream("/reports/elhaghiye.jasper"), parameters, beanColDataSource);
        return jasperPrint;
    }

    private String translateKhatarateEzafe(Bimename bimename) {
        if (bimename.getPishnahadeFaal().getKhatarEzafis().size() != 0) {
            String returnString = "";
            for (KhatarEzafi khatarEzafi : bimename.getPishnahadeFaal().getKhatarEzafis())
                returnString += (bundle.getString(khatarEzafi.getNoekhatarezafi().name()) + " - ");

            return returnString.substring(0, returnString.length() - 3);
        } else {
            return null;
        }
    }

}
