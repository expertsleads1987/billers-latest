
package generated.accountinquiry.cxf.ws.accountinquiry;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated.accountinquiry.cxf.ws.accountinquiry package. 
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

    private final static QName _AccountInquiryGuid_QNAME = new QName("http://tempuri.org/", "guid");
    private final static QName _AccountInquiryTokenKey_QNAME = new QName("http://tempuri.org/", "tokenKey");
    private final static QName _AccountInquiryAccountInquiryRequest_QNAME = new QName("http://tempuri.org/", "accountInquiryRequest");
    private final static QName _AccountInquiryResponseAccountInquiryResult_QNAME = new QName("http://tempuri.org/", "AccountInquiryResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated.accountinquiry.cxf.ws.accountinquiry
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AccountInquiry }
     * 
     */
    public AccountInquiry createAccountInquiry() {
        return new AccountInquiry();
    }

    /**
     * Create an instance of {@link AccountInquiryResponse }
     * 
     */
    public AccountInquiryResponse createAccountInquiryResponse() {
        return new AccountInquiryResponse();
    }

    /**
     * Create an instance of {@link AccountInquiry.AccountInquiryRequest }
     * 
     */
    public AccountInquiry.AccountInquiryRequest createAccountInquiryAccountInquiryRequest() {
        return new AccountInquiry.AccountInquiryRequest();
    }

    /**
     * Create an instance of {@link AccountInquiryResponse.AccountInquiryResult }
     * 
     */
    public AccountInquiryResponse.AccountInquiryResult createAccountInquiryResponseAccountInquiryResult() {
        return new AccountInquiryResponse.AccountInquiryResult();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "guid", scope = AccountInquiry.class)
    public JAXBElement<String> createAccountInquiryGuid(String value) {
        return new JAXBElement<String>(_AccountInquiryGuid_QNAME, String.class, AccountInquiry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "tokenKey", scope = AccountInquiry.class)
    public JAXBElement<String> createAccountInquiryTokenKey(String value) {
        return new JAXBElement<String>(_AccountInquiryTokenKey_QNAME, String.class, AccountInquiry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountInquiry.AccountInquiryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "accountInquiryRequest", scope = AccountInquiry.class)
    public JAXBElement<AccountInquiry.AccountInquiryRequest> createAccountInquiryAccountInquiryRequest(AccountInquiry.AccountInquiryRequest value) {
        return new JAXBElement<AccountInquiry.AccountInquiryRequest>(_AccountInquiryAccountInquiryRequest_QNAME, AccountInquiry.AccountInquiryRequest.class, AccountInquiry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountInquiryResponse.AccountInquiryResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AccountInquiryResult", scope = AccountInquiryResponse.class)
    public JAXBElement<AccountInquiryResponse.AccountInquiryResult> createAccountInquiryResponseAccountInquiryResult(AccountInquiryResponse.AccountInquiryResult value) {
        return new JAXBElement<AccountInquiryResponse.AccountInquiryResult>(_AccountInquiryResponseAccountInquiryResult_QNAME, AccountInquiryResponse.AccountInquiryResult.class, AccountInquiryResponse.class, value);
    }

}
