
package generated.token_biller.cxf.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated.token_biller.cxf.ws package. 
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

    private final static QName _AuthenticateGuid_QNAME = new QName("http://tempuri.org/", "guid");
    private final static QName _AuthenticatePassword_QNAME = new QName("http://tempuri.org/", "password");
    private final static QName _AuthenticateResponseAuthenticateResult_QNAME = new QName("http://tempuri.org/", "AuthenticateResult");
    private final static QName _ValidateTokenToken_QNAME = new QName("http://tempuri.org/", "token");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated.token_biller.cxf.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AuthenticateResponse }
     * 
     */
    public AuthenticateResponse createAuthenticateResponse() {
        return new AuthenticateResponse();
    }

    /**
     * Create an instance of {@link Authenticate }
     * 
     */
    public Authenticate createAuthenticate() {
        return new Authenticate();
    }

    /**
     * Create an instance of {@link AuthenticateResponse.AuthenticateResult }
     * 
     */
    public AuthenticateResponse.AuthenticateResult createAuthenticateResponseAuthenticateResult() {
        return new AuthenticateResponse.AuthenticateResult();
    }

    /**
     * Create an instance of {@link ValidateToken }
     * 
     */
    public ValidateToken createValidateToken() {
        return new ValidateToken();
    }

    /**
     * Create an instance of {@link ValidateTokenResponse }
     * 
     */
    public ValidateTokenResponse createValidateTokenResponse() {
        return new ValidateTokenResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "guid", scope = Authenticate.class)
    public JAXBElement<String> createAuthenticateGuid(String value) {
        return new JAXBElement<String>(_AuthenticateGuid_QNAME, String.class, Authenticate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "password", scope = Authenticate.class)
    public JAXBElement<String> createAuthenticatePassword(String value) {
        return new JAXBElement<String>(_AuthenticatePassword_QNAME, String.class, Authenticate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticateResponse.AuthenticateResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AuthenticateResult", scope = AuthenticateResponse.class)
    public JAXBElement<AuthenticateResponse.AuthenticateResult> createAuthenticateResponseAuthenticateResult(AuthenticateResponse.AuthenticateResult value) {
        return new JAXBElement<AuthenticateResponse.AuthenticateResult>(_AuthenticateResponseAuthenticateResult_QNAME, AuthenticateResponse.AuthenticateResult.class, AuthenticateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "password", scope = ValidateToken.class)
    public JAXBElement<String> createValidateTokenPassword(String value) {
        return new JAXBElement<String>(_AuthenticatePassword_QNAME, String.class, ValidateToken.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "token", scope = ValidateToken.class)
    public JAXBElement<String> createValidateTokenToken(String value) {
        return new JAXBElement<String>(_ValidateTokenToken_QNAME, String.class, ValidateToken.class, value);
    }

}
