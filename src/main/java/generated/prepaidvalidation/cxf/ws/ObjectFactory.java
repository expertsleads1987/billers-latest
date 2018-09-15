
package generated.prepaidvalidation.cxf.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated.prepaidvalidation.cxf.ws package. 
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

    private final static QName _ValidateGuid_QNAME = new QName("http://tempuri.org/", "guid");
    private final static QName _ValidateTokenKey_QNAME = new QName("http://tempuri.org/", "tokenKey");
    private final static QName _ValidatePaymnentValidationRequest_QNAME = new QName("http://tempuri.org/", "paymnentValidationRequest");
    private final static QName _ValidateResponseValidateResult_QNAME = new QName("http://tempuri.org/", "ValidateResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated.prepaidvalidation.cxf.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Validate }
     * 
     */
    public Validate createValidate() {
        return new Validate();
    }

    /**
     * Create an instance of {@link ValidateResponse }
     * 
     */
    public ValidateResponse createValidateResponse() {
        return new ValidateResponse();
    }

    /**
     * Create an instance of {@link Validate.PaymnentValidationRequest }
     * 
     */
    public Validate.PaymnentValidationRequest createValidatePaymnentValidationRequest() {
        return new Validate.PaymnentValidationRequest();
    }

    /**
     * Create an instance of {@link ValidateResponse.ValidateResult }
     * 
     */
    public ValidateResponse.ValidateResult createValidateResponseValidateResult() {
        return new ValidateResponse.ValidateResult();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "guid", scope = Validate.class)
    public JAXBElement<String> createValidateGuid(String value) {
        return new JAXBElement<String>(_ValidateGuid_QNAME, String.class, Validate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "tokenKey", scope = Validate.class)
    public JAXBElement<String> createValidateTokenKey(String value) {
        return new JAXBElement<String>(_ValidateTokenKey_QNAME, String.class, Validate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Validate.PaymnentValidationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "paymnentValidationRequest", scope = Validate.class)
    public JAXBElement<Validate.PaymnentValidationRequest> createValidatePaymnentValidationRequest(Validate.PaymnentValidationRequest value) {
        return new JAXBElement<Validate.PaymnentValidationRequest>(_ValidatePaymnentValidationRequest_QNAME, Validate.PaymnentValidationRequest.class, Validate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateResponse.ValidateResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ValidateResult", scope = ValidateResponse.class)
    public JAXBElement<ValidateResponse.ValidateResult> createValidateResponseValidateResult(ValidateResponse.ValidateResult value) {
        return new JAXBElement<ValidateResponse.ValidateResult>(_ValidateResponseValidateResult_QNAME, ValidateResponse.ValidateResult.class, ValidateResponse.class, value);
    }

}
