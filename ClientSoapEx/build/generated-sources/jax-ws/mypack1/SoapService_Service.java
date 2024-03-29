
package mypack1;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SoapService", targetNamespace = "http://mypack/", wsdlLocation = "http://localhost:8080/SoapService/SoapService?wsdl")
public class SoapService_Service
    extends Service
{

    private final static URL SOAPSERVICE_WSDL_LOCATION;
    private final static WebServiceException SOAPSERVICE_EXCEPTION;
    private final static QName SOAPSERVICE_QNAME = new QName("http://mypack/", "SoapService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/SoapService/SoapService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SOAPSERVICE_WSDL_LOCATION = url;
        SOAPSERVICE_EXCEPTION = e;
    }

    public SoapService_Service() {
        super(__getWsdlLocation(), SOAPSERVICE_QNAME);
    }

    public SoapService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), SOAPSERVICE_QNAME, features);
    }

    public SoapService_Service(URL wsdlLocation) {
        super(wsdlLocation, SOAPSERVICE_QNAME);
    }

    public SoapService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SOAPSERVICE_QNAME, features);
    }

    public SoapService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SoapService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SoapService
     */
    @WebEndpoint(name = "SoapServicePort")
    public SoapService getSoapServicePort() {
        return super.getPort(new QName("http://mypack/", "SoapServicePort"), SoapService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SoapService
     */
    @WebEndpoint(name = "SoapServicePort")
    public SoapService getSoapServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://mypack/", "SoapServicePort"), SoapService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SOAPSERVICE_EXCEPTION!= null) {
            throw SOAPSERVICE_EXCEPTION;
        }
        return SOAPSERVICE_WSDL_LOCATION;
    }

}
