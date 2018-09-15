
package generated.paymentinquiry.cxf.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated.paymentinquiry.cxf.ws package. 
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

    private final static QName _InquireGuid_QNAME = new QName("http://tempuri.org/", "guid");
    private final static QName _InquireTokenKey_QNAME = new QName("http://tempuri.org/", "tokenKey");
    private final static QName _InquirePaymentInquireRequest_QNAME = new QName("http://tempuri.org/", "paymentInquireRequest");
    private final static QName _InquireResponseInquireResult_QNAME = new QName("http://tempuri.org/", "InquireResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated.paymentinquiry.cxf.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Inquire }
     * 
     */
    public Inquire createInquire() {
        return new Inquire();
    }

    /**
     * Create an instance of {@link InquireResponse }
     * 
     */
    public InquireResponse createInquireResponse() {
        return new InquireResponse();
    }

    /**
     * Create an instance of {@link Inquire.PaymentInquireRequest }
     * 
     */
    public Inquire.PaymentInquireRequest createInquirePaymentInquireRequest() {
        return new Inquire.PaymentInquireRequest();
    }

    /**
     * Create an instance of {@link InquireResponse.InquireResult }
     * 
     */
    public InquireResponse.InquireResult createInquireResponseInquireResult() {
        return new InquireResponse.InquireResult();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "guid", scope = Inquire.class)
    public JAXBElement<String> createInquireGuid(String value) {
        return new JAXBElement<String>(_InquireGuid_QNAME, String.class, Inquire.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "tokenKey", scope = Inquire.class)
    public JAXBElement<String> createInquireTokenKey(String value) {
        return new JAXBElement<String>(_InquireTokenKey_QNAME, String.class, Inquire.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Inquire.PaymentInquireRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "paymentInquireRequest", scope = Inquire.class)
    public JAXBElement<Inquire.PaymentInquireRequest> createInquirePaymentInquireRequest(Inquire.PaymentInquireRequest value) {
        return new JAXBElement<Inquire.PaymentInquireRequest>(_InquirePaymentInquireRequest_QNAME, Inquire.PaymentInquireRequest.class, Inquire.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InquireResponse.InquireResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "InquireResult", scope = InquireResponse.class)
    public JAXBElement<InquireResponse.InquireResult> createInquireResponseInquireResult(InquireResponse.InquireResult value) {
        return new JAXBElement<InquireResponse.InquireResult>(_InquireResponseInquireResult_QNAME, InquireResponse.InquireResult.class, InquireResponse.class, value);
    }

}
