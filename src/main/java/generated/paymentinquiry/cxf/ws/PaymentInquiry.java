package generated.paymentinquiry.cxf.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.5
 * 2018-08-16T17:54:18.640+03:00
 * Generated source version: 3.2.5
 *
 */
@WebServiceClient(name = "PaymentInquiry",
                  wsdlLocation = "http://40.113.2.64:6019/PaymentInquiry.svc?wsdl",
                  targetNamespace = "http://tempuri.org/")
public class PaymentInquiry extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://tempuri.org/", "PaymentInquiry");
    public final static QName BasicHttpBindingIPaymentInquiry = new QName("http://tempuri.org/", "BasicHttpBinding_IPaymentInquiry");
    public final static QName WSHttpBindingIPaymentInquiry1 = new QName("http://tempuri.org/", "WSHttpBinding_IPaymentInquiry1");
    public final static QName BasicHttpBindingIPaymentInquiry1 = new QName("http://tempuri.org/", "BasicHttpBinding_IPaymentInquiry1");
    public final static QName WSHttpBindingIPaymentInquiry = new QName("http://tempuri.org/", "WSHttpBinding_IPaymentInquiry");
    static {
        URL url = null;
        try {
            url = new URL("http://40.113.2.64:6019/PaymentInquiry.svc?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(PaymentInquiry.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://40.113.2.64:6019/PaymentInquiry.svc?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public PaymentInquiry(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public PaymentInquiry(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PaymentInquiry() {
        super(WSDL_LOCATION, SERVICE);
    }

    public PaymentInquiry(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public PaymentInquiry(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public PaymentInquiry(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns IPaymentInquiry
     */
    @WebEndpoint(name = "BasicHttpBinding_IPaymentInquiry")
    public IPaymentInquiry getBasicHttpBindingIPaymentInquiry() {
        return super.getPort(BasicHttpBindingIPaymentInquiry, IPaymentInquiry.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IPaymentInquiry
     */
    @WebEndpoint(name = "BasicHttpBinding_IPaymentInquiry")
    public IPaymentInquiry getBasicHttpBindingIPaymentInquiry(WebServiceFeature... features) {
        return super.getPort(BasicHttpBindingIPaymentInquiry, IPaymentInquiry.class, features);
    }


    /**
     *
     * @return
     *     returns IPaymentInquiry
     */
    @WebEndpoint(name = "WSHttpBinding_IPaymentInquiry1")
    public IPaymentInquiry getWSHttpBindingIPaymentInquiry1() {
        return super.getPort(WSHttpBindingIPaymentInquiry1, IPaymentInquiry.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IPaymentInquiry
     */
    @WebEndpoint(name = "WSHttpBinding_IPaymentInquiry1")
    public IPaymentInquiry getWSHttpBindingIPaymentInquiry1(WebServiceFeature... features) {
        return super.getPort(WSHttpBindingIPaymentInquiry1, IPaymentInquiry.class, features);
    }


    /**
     *
     * @return
     *     returns IPaymentInquiry
     */
    @WebEndpoint(name = "BasicHttpBinding_IPaymentInquiry1")
    public IPaymentInquiry getBasicHttpBindingIPaymentInquiry1() {
        return super.getPort(BasicHttpBindingIPaymentInquiry1, IPaymentInquiry.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IPaymentInquiry
     */
    @WebEndpoint(name = "BasicHttpBinding_IPaymentInquiry1")
    public IPaymentInquiry getBasicHttpBindingIPaymentInquiry1(WebServiceFeature... features) {
        return super.getPort(BasicHttpBindingIPaymentInquiry1, IPaymentInquiry.class, features);
    }


    /**
     *
     * @return
     *     returns IPaymentInquiry
     */
    @WebEndpoint(name = "WSHttpBinding_IPaymentInquiry")
    public IPaymentInquiry getWSHttpBindingIPaymentInquiry() {
        return super.getPort(WSHttpBindingIPaymentInquiry, IPaymentInquiry.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IPaymentInquiry
     */
    @WebEndpoint(name = "WSHttpBinding_IPaymentInquiry")
    public IPaymentInquiry getWSHttpBindingIPaymentInquiry(WebServiceFeature... features) {
        return super.getPort(WSHttpBindingIPaymentInquiry, IPaymentInquiry.class, features);
    }

}
