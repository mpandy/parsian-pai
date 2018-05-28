
package ir.parsianinsurance.he.interfaces.webservice.client.ashkhasehoghooghi_v3;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "LegalInq", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://reinsure.centinsur.ir/LegalInqV3Out?wsdl")
public class LegalInq
    extends Service
{

    private final static URL LEGALINQ_WSDL_LOCATION;
    private final static WebServiceException LEGALINQ_EXCEPTION;
    private final static QName LEGALINQ_QNAME = new QName("http://tempuri.org/", "LegalInq");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://reinsure.centinsur.ir/LegalInqV3Out?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        LEGALINQ_WSDL_LOCATION = url;
        LEGALINQ_EXCEPTION = e;
    }

    public LegalInq() {
        super(__getWsdlLocation(), LEGALINQ_QNAME);
    }

    public LegalInq(WebServiceFeature... features) {
        super(__getWsdlLocation(), LEGALINQ_QNAME, features);
    }

    public LegalInq(URL wsdlLocation) {
        super(wsdlLocation, LEGALINQ_QNAME);
    }

    public LegalInq(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, LEGALINQ_QNAME, features);
    }

    public LegalInq(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LegalInq(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ILegalInq
     */
    @WebEndpoint(name = "myBasicHttpBinding_ILegalInq")
    public ILegalInq getMyBasicHttpBindingILegalInq() {
        return super.getPort(new QName("http://tempuri.org/", "myBasicHttpBinding_ILegalInq"), ILegalInq.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ILegalInq
     */
    @WebEndpoint(name = "myBasicHttpBinding_ILegalInq")
    public ILegalInq getMyBasicHttpBindingILegalInq(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "myBasicHttpBinding_ILegalInq"), ILegalInq.class, features);
    }

    private static URL __getWsdlLocation() {
        if (LEGALINQ_EXCEPTION!= null) {
            throw LEGALINQ_EXCEPTION;
        }
        return LEGALINQ_WSDL_LOCATION;
    }

}
