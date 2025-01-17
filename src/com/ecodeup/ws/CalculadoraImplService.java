
package com.ecodeup.ws;

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
 * Generated by type wsimport -s . http://localhost:1515/WS/Calculadora?wsdl in JAXWS-Calculadora/src/
 */
@WebServiceClient(name = "CalculadoraImplService", targetNamespace = "http://ws.ecodeup.com/", wsdlLocation = "http://localhost:1515/WS/Calculadora?wsdl")
public class CalculadoraImplService
    extends Service
{

    private final static URL CALCULADORAIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException CALCULADORAIMPLSERVICE_EXCEPTION;
    private final static QName CALCULADORAIMPLSERVICE_QNAME = new QName("http://ws.ecodeup.com/", "CalculadoraImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:1515/WS/Calculadora?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CALCULADORAIMPLSERVICE_WSDL_LOCATION = url;
        CALCULADORAIMPLSERVICE_EXCEPTION = e;
    }

    public CalculadoraImplService() {
        super(__getWsdlLocation(), CALCULADORAIMPLSERVICE_QNAME);
    }

    public CalculadoraImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CALCULADORAIMPLSERVICE_QNAME, features);
    }

    public CalculadoraImplService(URL wsdlLocation) {
        super(wsdlLocation, CALCULADORAIMPLSERVICE_QNAME);
    }

    public CalculadoraImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CALCULADORAIMPLSERVICE_QNAME, features);
    }

    public CalculadoraImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CalculadoraImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Calculadora
     */
    @WebEndpoint(name = "CalculadoraImplPort")
    public Calculadora getCalculadoraImplPort() {
        return super.getPort(new QName("http://ws.ecodeup.com/", "CalculadoraImplPort"), Calculadora.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Calculadora
     */
    @WebEndpoint(name = "CalculadoraImplPort")
    public Calculadora getCalculadoraImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.ecodeup.com/", "CalculadoraImplPort"), Calculadora.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CALCULADORAIMPLSERVICE_EXCEPTION!= null) {
            throw CALCULADORAIMPLSERVICE_EXCEPTION;
        }
        return CALCULADORAIMPLSERVICE_WSDL_LOCATION;
    }

}
