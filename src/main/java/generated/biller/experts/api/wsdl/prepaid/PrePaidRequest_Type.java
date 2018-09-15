
package generated.biller.experts.api.wsdl.prepaid;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="TrxInf" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AcctInfo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BillingNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BillerCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BankTrxID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ValidationCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PmtStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProcessDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BankCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DueAmt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PaidAmt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PrepaidCat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ServiceType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ServiceTypeDetails" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IdType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Nation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="JOEBPPSNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "trxInf",
    "acctInfo",
    "billingNo",
    "billerCode",
    "bankTrxID",
    "validationCode",
    "pmtStatus",
    "processDate",
    "bankCode",
    "dueAmt",
    "paidAmt",
    "paymentMethod",
    "prepaidCat",
    "currency",
    "serviceType",
    "serviceTypeDetails",
    "idType",
    "id",
    "nation",
    "name",
    "phone",
    "address",
    "email",
    "joebppsNo"
})
@XmlRootElement(name = "PrePaidRequest")
public class PrePaidRequest_Type {

    @XmlElement(name = "TrxInf", required = true)
    protected String trxInf;
    @XmlElement(name = "AcctInfo", required = true)
    protected String acctInfo;
    @XmlElement(name = "BillingNo", required = true)
    protected String billingNo;
    @XmlElement(name = "BillerCode", required = true)
    protected String billerCode;
    @XmlElement(name = "BankTrxID", required = true)
    protected String bankTrxID;
    @XmlElement(name = "ValidationCode", required = true)
    protected String validationCode;
    @XmlElement(name = "PmtStatus", required = true)
    protected String pmtStatus;
    @XmlElement(name = "ProcessDate", required = true)
    protected String processDate;
    @XmlElement(name = "BankCode", required = true)
    protected String bankCode;
    @XmlElement(name = "DueAmt", required = true)
    protected String dueAmt;
    @XmlElement(name = "PaidAmt", required = true)
    protected String paidAmt;
    @XmlElement(name = "PaymentMethod", required = true)
    protected String paymentMethod;
    @XmlElement(name = "PrepaidCat", required = true)
    protected String prepaidCat;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "ServiceType", required = true)
    protected String serviceType;
    @XmlElement(name = "ServiceTypeDetails", required = true)
    protected String serviceTypeDetails;
    @XmlElement(name = "IdType", required = true)
    protected String idType;
    @XmlElement(name = "Id", required = true)
    protected String id;
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

    /**
     * Gets the value of the trxInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrxInf() {
        return trxInf;
    }

    /**
     * Sets the value of the trxInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrxInf(String value) {
        this.trxInf = value;
    }

    /**
     * Gets the value of the acctInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctInfo() {
        return acctInfo;
    }

    /**
     * Sets the value of the acctInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctInfo(String value) {
        this.acctInfo = value;
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
     * Gets the value of the bankTrxID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankTrxID() {
        return bankTrxID;
    }

    /**
     * Sets the value of the bankTrxID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankTrxID(String value) {
        this.bankTrxID = value;
    }

    /**
     * Gets the value of the validationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationCode() {
        return validationCode;
    }

    /**
     * Sets the value of the validationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationCode(String value) {
        this.validationCode = value;
    }

    /**
     * Gets the value of the pmtStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtStatus() {
        return pmtStatus;
    }

    /**
     * Sets the value of the pmtStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtStatus(String value) {
        this.pmtStatus = value;
    }

    /**
     * Gets the value of the processDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessDate() {
        return processDate;
    }

    /**
     * Sets the value of the processDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessDate(String value) {
        this.processDate = value;
    }

    /**
     * Gets the value of the bankCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * Sets the value of the bankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCode(String value) {
        this.bankCode = value;
    }

    /**
     * Gets the value of the dueAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDueAmt() {
        return dueAmt;
    }

    /**
     * Sets the value of the dueAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDueAmt(String value) {
        this.dueAmt = value;
    }

    /**
     * Gets the value of the paidAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaidAmt() {
        return paidAmt;
    }

    /**
     * Sets the value of the paidAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaidAmt(String value) {
        this.paidAmt = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethod(String value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the prepaidCat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrepaidCat() {
        return prepaidCat;
    }

    /**
     * Sets the value of the prepaidCat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrepaidCat(String value) {
        this.prepaidCat = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
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
     * Gets the value of the serviceTypeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceTypeDetails() {
        return serviceTypeDetails;
    }

    /**
     * Sets the value of the serviceTypeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceTypeDetails(String value) {
        this.serviceTypeDetails = value;
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
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
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

}
