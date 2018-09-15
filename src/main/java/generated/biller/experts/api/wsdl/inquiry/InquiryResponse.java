
package generated.biller.experts.api.wsdl.inquiry;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Acct" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Result" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ErrorDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CustId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Nation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="JOEBPPSNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RecCount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BillingRec-repeatable" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BillerCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BillingNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ServiceType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BillingStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NickName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "acct",
    "result",
    "errorCode",
    "errorDesc",
    "custId",
    "idType",
    "id",
    "nation",
    "name",
    "phone",
    "address",
    "email",
    "joebppsNo",
    "recCount",
    "billingRecRepeatable",
    "billerCode",
    "billingNo",
    "serviceType",
    "billingStatus",
    "nickName"
})
@XmlRootElement(name = "InquiryResponse")
public class InquiryResponse {

    @XmlElement(name = "Acct", required = true)
    protected String acct;
    @XmlElement(name = "Result", required = true)
    protected String result;
    @XmlElement(name = "ErrorCode", required = true)
    protected String errorCode;
    @XmlElement(name = "ErrorDesc", required = true)
    protected String errorDesc;
    @XmlElement(name = "CustId", required = true)
    protected String custId;
    @XmlElement(required = true)
    protected String idType;
    @XmlElement(name = "Id", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar id;
    @XmlElement(name = "Nation", required = true)
    protected String nation;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Phone", required = true)
    protected String phone;
    @XmlElement(name = "Address", required = true)
    protected String address;
    @XmlElement(name = "Email", required = true)
    protected String email;
    @XmlElement(name = "JOEBPPSNo", required = true)
    protected String joebppsNo;
    @XmlElement(name = "RecCount", required = true)
    protected String recCount;
    @XmlElement(name = "BillingRec-repeatable", required = true)
    protected String billingRecRepeatable;
    @XmlElement(name = "BillerCode", required = true)
    protected String billerCode;
    @XmlElement(name = "BillingNo", required = true)
    protected String billingNo;
    @XmlElement(name = "ServiceType", required = true)
    protected String serviceType;
    @XmlElement(name = "BillingStatus", required = true)
    protected String billingStatus;
    @XmlElement(name = "NickName", required = true)
    protected String nickName;

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcct(String value) {
        this.acct = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResult(String value) {
        this.result = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the errorDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorDesc() {
        return errorDesc;
    }

    /**
     * Sets the value of the errorDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorDesc(String value) {
        this.errorDesc = value;
    }

    /**
     * Gets the value of the custId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustId() {
        return custId;
    }

    /**
     * Sets the value of the custId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustId(String value) {
        this.custId = value;
    }

    /**
     * Gets the value of the idType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdType() {
        return idType;
    }

    /**
     * Sets the value of the idType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdType(String value) {
        this.idType = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setId(XMLGregorianCalendar value) {
        this.id = value;
    }

    /**
     * Gets the value of the nation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNation() {
        return nation;
    }

    /**
     * Sets the value of the nation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNation(String value) {
        this.nation = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the joebppsNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJOEBPPSNo() {
        return joebppsNo;
    }

    /**
     * Sets the value of the joebppsNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJOEBPPSNo(String value) {
        this.joebppsNo = value;
    }

    /**
     * Gets the value of the recCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecCount() {
        return recCount;
    }

    /**
     * Sets the value of the recCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecCount(String value) {
        this.recCount = value;
    }

    /**
     * Gets the value of the billingRecRepeatable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingRecRepeatable() {
        return billingRecRepeatable;
    }

    /**
     * Sets the value of the billingRecRepeatable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingRecRepeatable(String value) {
        this.billingRecRepeatable = value;
    }

    /**
     * Gets the value of the billerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillerCode() {
        return billerCode;
    }

    /**
     * Sets the value of the billerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillerCode(String value) {
        this.billerCode = value;
    }

    /**
     * Gets the value of the billingNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingNo() {
        return billingNo;
    }

    /**
     * Sets the value of the billingNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingNo(String value) {
        this.billingNo = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceType(String value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the billingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingStatus() {
        return billingStatus;
    }

    /**
     * Sets the value of the billingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingStatus(String value) {
        this.billingStatus = value;
    }

    /**
     * Gets the value of the nickName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * Sets the value of the nickName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNickName(String value) {
        this.nickName = value;
    }

}
