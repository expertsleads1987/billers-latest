
package generated.prepaidpayment.cxf.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated.prepaidpayment.cxf.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PayGuid_QNAME = new QName("http://tempuri.org/", "guid");
    private final static QName _PayTokenKey_QNAME = new QName("http://tempuri.org/", "tokenKey");
    private final static QName _PayPaymnentValidationRequest_QNAME = new QName("http://tempuri.org/", "paymnentValidationRequest");
    private final static QName _PayResponsePayResult_QNAME = new QName("http://tempuri.org/", "PayResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated.prepaidpayment.cxf.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Pay }
     * 
     */
    public Pay createPay() {
        return new Pay();
    }

    /**
     * Create an instance of {@link PayResponse }
     * 
     */
    public PayResponse createPayResponse() {
        return new PayResponse();
    }

    /**
     * Create an instance of {@link Pay.PaymnentValidationRequest }
     * 
     */
    public Pay.PaymnentValidationRequest createPayPaymnentValidationRequest() {
        return new Pay.PaymnentValidationRequest();
    }

    /**
     * Create an instance of {@link PayResponse.PayResult }
     * 
     */
    public PayResponse.PayResult createPayResponsePayResult() {
        return new PayResponse.PayResult();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "guid", scope = Pay.class)
    public JAXBElement<String> createPayGuid(String value) {
        return new JAXBElement<String>(_PayGuid_QNAME, String.class, Pay.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "tokenKey", scope = Pay.class)
    public JAXBElement<String> createPayTokenKey(String value) {
        return new JAXBElement<String>(_PayTokenKey_QNAME, String.class, Pay.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Pay.PaymnentValidationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "paymnentValidationRequest", scope = Pay.class)
    public JAXBElement<Pay.PaymnentValidationRequest> createPayPaymnentValidationRequest(Pay.PaymnentValidationRequest value) {
        return new JAXBElement<Pay.PaymnentValidationRequest>(_PayPaymnentValidationRequest_QNAME, Pay.PaymnentValidationRequest.class, Pay.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayResponse.PayResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PayResult", scope = PayResponse.class)
    public JAXBElement<PayResponse.PayResult> createPayResponsePayResult(PayResponse.PayResult value) {
        return new JAXBElement<PayResponse.PayResult>(_PayResponsePayResult_QNAME, PayResponse.PayResult.class, PayResponse.class, value);
    }

}
