
package fr.insa.service;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.4
 * 2020-03-31T00:40:41.161+02:00
 * Generated source version: 3.0.4
 * 
 */
public final class ProductOrderingService_ProductOrderingServicePort_Client {

    private static final QName SERVICE_NAME = new QName("http://service.insa.fr/", "ProductOrderingServiceService");

    private ProductOrderingService_ProductOrderingServicePort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = ProductOrderingServiceService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        ProductOrderingServiceService ss = new ProductOrderingServiceService(wsdlURL, SERVICE_NAME);
        ProductOrderingService port = ss.getProductOrderingServicePort();  
        
        {
        System.out.println("Invoking createProductOrdering...");
        fr.insa.service.ProductOrdering _createProductOrdering_arg0 = null;
        fr.insa.service.ProductOrdering _createProductOrdering__return = port.createProductOrdering(_createProductOrdering_arg0);
        System.out.println("createProductOrdering.result=" + _createProductOrdering__return);


        }
        {
        System.out.println("Invoking getProductOrdering...");
        java.lang.String _getProductOrdering_id = "";
        fr.insa.service.ProductOrdering _getProductOrdering__return = port.getProductOrdering(_getProductOrdering_id);
        System.out.println("getProductOrdering.result=" + _getProductOrdering__return);


        }
        {
        System.out.println("Invoking removeProductOrdering...");
        java.lang.String _removeProductOrdering_id = "";
        port.removeProductOrdering(_removeProductOrdering_id);


        }
        {
        System.out.println("Invoking getProductOrderings...");
        java.util.List<fr.insa.service.ProductOrdering> _getProductOrderings__return = port.getProductOrderings();
        System.out.println("getProductOrderings.result=" + _getProductOrderings__return);


        }

        System.exit(0);
    }

}
