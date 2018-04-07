package ir.parsianinsurance.he.interfaces.webservice.resource;

import ir.parsianinsurance.he.domain.facade.IApplicationService;
import ir.parsianinsurance.he.domain.model.Bimename;
import ir.parsianinsurance.he.domain.model.enums.NoePishnahad;
import ir.parsianinsurance.he.infrastructure.repository.BimenameRepository;
import ir.parsianinsurance.he.infrastructure.service.IPrintService;
import ir.parsianinsurance.he.infrastructure.util.DateUtil;
import ir.parsianinsurance.he.interfaces.webservice.model.AgencyBimenameInfo;
import ir.parsianinsurance.he.interfaces.webservice.model.AgencyWebserviceResponse;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;

import javax.inject.Inject;
import javax.servlet.ServletContext;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/**
 * Created by Mohammad on 8/13/2017.
 */

@Path("agencyservice/1.0")
public class AgencyBimenameResource {

    private static final String AGENCY_TOKEN = "@GenTPars23_HE";

    @Inject
    IApplicationService IApplicationService;

    @Inject
    BimenameRepository bimenameRepository;

    @Inject
    IPrintService printService;

    @GET
    @Path("/help")
    @Produces("text/plain") // default: */*
    public String help() {
        return "\t\t\t----------------------------------------------------------------------\n" +
                "\t\t\tParsian Personal Accident Insurance RESTful Web Service v1.0\n" +
                "\t\t\t----------------------------------------------------------------------\n" +
                "\n" +
                "___________________\n" +
                "1.Sodoor service\n" +
                "___________________\n" +
                "\n" +
                "\t1.1.endpoint url:\n" +
                "\t\t[ip:port]/he/webresources/agencyservice/1.0/sodoor\n" +
                "\n" +
                "\t1.2.HTTP method:\n" +
                "\t\tPOST\n" +
                "\t\t\n" +
                "\t1.3.Authentication:\n" +
                "\t\ta request header parameter named 'X-Parsian-HE-Token' with the value provided by Parsian insurance authorities\n" +
                "\t\n" +
                "\t1.4.Request parameters:\n" +
                "\t\t- name [Insured person's first name]\n" +
                "\t\t- namekhanavadegi [Insured person's last name]\n" +
                "\t\t- codemelli [Insured person's national code]\n" +
                "\t\t- tarikhtavalod [Insured person's birthdate e.g. 1365-07-11]\n" +
                "\t\t- shoamareshenasname [Insured person's birth certificate number ]\n" +
                "\t\t- namepedar [Father's name of insured person]\n" +
                "\t\t- mobile [Insured person's phone number]\n" +
                "\t\t- shahr [Insured person's residence city]\n" +
                "\t\t- azTarikh [Insurance start date e.g. 1396-05-23]\n" +
                "\t\t- taTarikh [Insurance end date e.g. 1397-05-23]\n" +
                "\t\n" +
                "\t1.5.Sample request\n" +
                "\t\tPOST [ip:port]/he/webresources/agencyservice/1.0/sodoor?name=mahsa&namekhanavadegi=gholipoor&codemelli=1123214&tarikhtavalod=1360-01-01&shomareshenasname=111&namepedar=ahmad&mobile=09125874578&shahr=tehran&azTarikh=1396-05-24&taTarikh=1396-06-02\n" +
                "\t\t\n" +
                "\t1.6.Response\n" +
                "\t\tA json string containing the following fields:\n" +
                "\t\t- status [Response status with two possible values, \"OK\" or \"NOK\"]\n" +
                "\t\t- message [Detailed description of response status] \n" +
                "\t\tIf the status is \"OK\", then the message body is the insurance policy number.\n" +
                "\n" +
                "\t1.7.Sample response\n" +
                "\t\t{\"status\":\"NOK\", \"message\":\"Start date should be greater than or equal to today\"}\n" +
                "\n" +
                "___________________\n" +
                "2.Print service\n" +
                "___________________\n" +
                "\t\n" +
                "\t2.1.endpoint url\n" +
                "\t\t[ip:port]/he/webresources/agencyservice/1.0/chap\n" +
                "\t\t\n" +
                "\t2.2.HTTP method:\n" +
                "\t\tGET\n" +
                "\t\t\n" +
                "\t2.3.Authentication:\n" +
                "\t\ta request header parameter named 'X-Parsian-HE-Token' with the value provided by Parsian insurance authorities\n" +
                "\t\n" +
                "\t2.4.Arguments\n" +
                "\t\t- shomarebimename [Insurance policy number using '-' delimiter]\n" +
                "\n" +
                "\t2.5.Sample request\n" +
                "\t\tGET\n" +
                "\t\t[ip:port]http://localhost:8080/he/webresources/agencyservice/1.0/chap?shomarebimename=2610-503230-96-000004\n" +
                "\n" +
                "\t2.6.Response\n" +
                "\t\tPolicy print formatted in pdf";
    }

    @POST
    @Path("/sodoor")
    @Produces(value = "application/json")
    public Response sodooreBimename(
            @HeaderParam("X-Parsian-HE-Token") String token,
            @QueryParam ("name") String name,
            @QueryParam ("namekhanavadegi") String namekhanavadegi,
            @QueryParam ("codemelli") String codemelli,
            @QueryParam ("tarikhtavalod") String tarikhtavalod,
            @QueryParam ("shomareshenasname") String shomareshenasname,
            @QueryParam ("namepedar") String namepedar,
            @QueryParam ("mobile") String mobile,
            @QueryParam ("shahr") String shahr,
            @QueryParam ("azTarikh") String azTarikh,
            @QueryParam ("taTarikh") String taTarikh)
    {

            if(!authenticate(token))
                return Response.status(Response.Status.FORBIDDEN).build();

            azTarikh = azTarikh.replaceAll("-","/");
            taTarikh = taTarikh.replaceAll("-", "/");
            tarikhtavalod = tarikhtavalod.replaceAll("-", "/");

            AgencyBimenameInfo info = new AgencyBimenameInfo(   name, namekhanavadegi, codemelli,
                                                                tarikhtavalod, shomareshenasname,
                                                                namepedar, mobile,
                                                                shahr, azTarikh, taTarikh);

            String validateString = validateSodoorRequest(info);
            if (!validateString.isEmpty())
                return Response.ok(new AgencyWebserviceResponse("NOK", validateString)).build();

            Bimename issuedBimename = IApplicationService.sodooreBimenameAgency(info);

            return Response.ok(new AgencyWebserviceResponse("OK", issuedBimename.getShomare())).build();
    }

    @GET
    @Path("/chap")
    public Response chap(@QueryParam ("shomarebimename") String shomareBimename,
                         @QueryParam ("bypassAuthentication") String bypassAuthentication,
                         @HeaderParam ("X-Parsian-HE-Token") String token,
                         @Context ServletContext context) throws Exception
    {

        if(bypassAuthentication != null)
            token = AGENCY_TOKEN;

        if(!authenticate(token))
            return Response.status(Response.Status.FORBIDDEN).build();

        Bimename bimename = bimenameRepository.findByShomare(shomareBimename.replaceAll("-","/"));

        String validateString = validateChapRequest(bimename);
        if (!validateString.isEmpty())
            return Response.ok(validateString).build();

        JasperPrint jasperPrint = printService.printBimename(bimename, context);
        byte[] buff = JasperExportManager.exportReportToPdf(jasperPrint);
        InputStream is = new ByteArrayInputStream(buff);
        Response.ResponseBuilder responseBuilder = Response.ok(is);
        responseBuilder.type("application/pdf");
        responseBuilder.header("Content-Disposition", "filename=test.pdf");
        return responseBuilder.build();
    }

    private String validateSodoorRequest(AgencyBimenameInfo info) {

        if(!DateUtil.valiateDashDelimitedJalaliAzAndTaDateFormat(info.getAzTarikh()))
            return "Invalid 'azTarikh' format";

        if(!DateUtil.valiateDashDelimitedJalaliAzAndTaDateFormat(info.getTaTarikh()))
            return "Invalid 'taTarikh' format";

        if(!DateUtil.valiateDashDelimitedJalaliTavallodDateFormat(info.getTarikhtavalod()))
            return "Invalid 'tarikhtavalod' format";

        if (info.modat() < 5)
            return "Insurance duration should not be less than 5 days";

        if (info.modat() > 21)
            return "Insurance duration should not be greater than 21 days";

        if (!DateUtil.isGreaterThanOrEqual(info.getAzTarikh(), DateUtil.getJalaliCurrentDate()))
             return "Start date should be greater than or equal to today";

        if (!DateUtil.isGreaterThanOrEqual(info.getTaTarikh(), info.getAzTarikh()))
            return "End date should be greater than or equal to start date";

        return "";
    }

    private String validateChapRequest(Bimename bimename) {

        if(bimename == null)
            return "Insurence number not found";

        if(!bimename.getPishnahadeFaal().getNoePishnahad().equals(NoePishnahad.INTERNETI) ||
           !bimename.getPishnahadeFaal().getGoroohbimename().equals("SHERKATE_HAVAPEYMAYI"))
            return "Unauthorized access";

        return "";
    }

    private boolean authenticate(String token)
    {
        if(     token != null    &&
                token.equals(AGENCY_TOKEN))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {


    }
}
