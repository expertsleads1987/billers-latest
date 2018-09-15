
package generated.biller.experts.api.wsdl.payment;

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
 *         &lt;element name="TrxRefNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CustIDCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OTP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CustIDNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OTPRefNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Transactions" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TrxInf-repeatable" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AcctInfo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BillingNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BillNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BillerCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PmtType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InqRefNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ValidationCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DueAmt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PaidAmt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FeesAmt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AccessChannel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ServiceTypeDetails" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ServiceType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PrepaidCat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StatementNarrative" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ExtraInfo" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "trxRefNo",
    "custIDCode",
    "otp",
    "custIDNo",
    "otpRefNo",
    "transactions",
    "trxInfRepeatable",
    "acctInfo",
    "billingNo",
    "billNo",
    "billerCode",
    "pmtType",
    "inqRefNo",
    "validationCode",
    "dueAmt",
    "paidAmt",
    "feesAmt",
    "currency",
    "accessChannel",
    "paymentMethod",
    "serviceTypeDetails",
    "serviceType",
    "prepaidCat",
    "statementNarrative",
    "extraInfo"
})
@XmlRootElement(name = "PaymentRequest")
public class PaymentRequest_Type {

    @XmlElement(name = "TrxRefNo", required = true)
    protected String trxRefNo;
    @XmlElement(name = "CustIDCode", required = true)
    protected String custIDCode;
    @XmlElement(name = "OTP", required = true)
    protected String otp;
    @XmlElement(name = "CustIDNo", required = true)
    protected String custIDNo;
    @XmlElement(name = "OTPRefNo", required = true)
    protected String otpRefNo;
    @XmlElement(name = "Transactions", required = true)
    protected String transactions;
    @XmlElement(name = "TrxInf-repeatable", required = true)
    protected String trxInfRepeatable;
    @XmlElement(name = "AcctInfo", required = true)
    protected String acctInfo;
    @XmlElement(name = "BillingNo", required = true)
    protected String billingNo;
    @XmlElement(name = "BillNo", required = true)
    protected String billNo;
    @XmlElement(name = "BillerCode", required = true)
    protected String billerCode;
    @XmlElement(name = "PmtType", required = true)
    protected String pmtType;
    @XmlElement(name = "InqRefNo", required = true)
    protected String inqRefNo;
    @XmlElement(name = "ValidationCode", required = true)
    protected String validationCode;
    @XmlElement(name = "DueAmt", required = true)
    protected String dueAmt;
    @XmlElement(name = "PaidAmt", required = true)
    protected String paidAmt;
    @XmlElement(name = "FeesAmt", required = true)
    protected String feesAmt;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "AccessChannel", required = true)
    protected String accessChannel;
    @XmlElement(name = "PaymentMethod", required = true)
    protected String paymentMethod;
    @XmlElement(name = "ServiceTypeDetails", required = true)
    protected String serviceTypeDetails;
    @XmlElement(name = "ServiceType", required = true)
    protected String serviceType;
    @XmlElement(name = "PrepaidCat", required = true)
    protected String prepaidCat;
    @XmlElement(name = "StatementNarrative", required = true)
    protected String statementNarrative;
    @XmlElement(name = "ExtraInfo", required = true)
    protected String extraInfo;

    /**
     * Gets the value of the trxRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrxRefNo() {
        return trxRefNo;
    }

    /**
     * Sets the value of the trxRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrxRefNo(String value) {
        this.trxRefNo = value;
    }

    /**
     * Gets the value of the custIDCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustIDCode() {
        return custIDCode;
    }

    /**
     * Sets the value of the custIDCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustIDCode(String value) {
        this.custIDCode = value;
    }

    /**
     * Gets the value of the otp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTP() {
        return otp;
    }

    /**
     * Sets the value of the otp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTP(String value) {
        this.otp = value;
    }

    /**
     * Gets the value of the custIDNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustIDNo() {
        return custIDNo;
    }

    /**
     * Sets the value of the custIDNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustIDNo(String value) {
        this.custIDNo = value;
    }

    /**
     * Gets the value of the otpRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTPRefNo() {
        return otpRefNo;
    }

    /**
     * Sets the value of the otpRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTPRefNo(String value) {
        this.otpRefNo = value;
    }

    /**
     * Gets the value of the transactions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactions() {
        return transactions;
    }

    /**
     * Sets the value of the transactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactions(String value) {
        this.transactions = value;
    }

    /**
     * Gets the value of the trxInfRepeatable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrxInfRepeatable() {
        return trxInfRepeatable;
    }

    /**
     * Sets the value of the trxInfRepeatable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrxInfRepeatable(String value) {
        this.trxInfRepeatable = value;
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
     * Gets the value of the billNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillNo() {
        return billNo;
    }

    /**
     * Sets the value of the billNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillNo(String value) {
        this.billNo = value;
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
     * Gets the value of the pmtType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtType() {
        return pmtType;
    }

    /**
     * Sets the value of the pmtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtType(String value) {
        this.pmtType = value;
    }

    /**
     * Gets the value of the inqRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInqRefNo() {
        return inqRefNo;
    }

    /**
     * Sets the value of the inqRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInqRefNo(String value) {
        this.inqRefNo = value;
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
     * Gets the value of the feesAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeesAmt() {
        return feesAmt;
    }

    /**
     * Sets the value of the feesAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeesAmt(String value) {
        this.feesAmt = value;
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
     * Gets the value of the accessChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessChannel() {
        return accessChannel;
    }

    /**
     * Sets the value of the accessChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessChannel(String value) {
        this.accessChannel = value;
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
     * Gets the value of the statementNarrative property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatementNarrative() {
        return statementNarrative;
    }

    /**
     * Sets the value of the statementNarrative property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatementNarrative(String value) {
        this.statementNarrative = value;
    }

    /**
     * Gets the value of the extraInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraInfo() {
        return extraInfo;
    }

    /**
     * Sets the value of the extraInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraInfo(String value) {
        this.extraInfo = value;
    }

}
