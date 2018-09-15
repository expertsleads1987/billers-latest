
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
 *         &lt;element name="Result" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PmtType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Severity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TrxRefNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CustIDNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Transactions" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TrxInf-repeatable" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AcctInfo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BillingNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BillNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BillerCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InqRefNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ValidationCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DueAmt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PaidAmt" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "result",
    "pmtType",
    "severity",
    "trxRefNo",
    "custIDNo",
    "idType",
    "transactions",
    "trxInfRepeatable",
    "errorCode",
    "acctInfo",
    "billingNo",
    "billNo",
    "billerCode",
    "inqRefNo",
    "validationCode",
    "dueAmt",
    "paidAmt",
    "extraInfo"
})
@XmlRootElement(name = "PaymentResponse")
public class PaymentResponse {

    @XmlElement(name = "Result", required = true)
    protected String result;
    @XmlElement(name = "PmtType", required = true)
    protected String pmtType;
    @XmlElement(name = "Severity", required = true)
    protected String severity;
    @XmlElement(name = "TrxRefNo", required = true)
    protected String trxRefNo;
    @XmlElement(name = "CustIDNo", required = true)
    protected String custIDNo;
    @XmlElement(required = true)
    protected String idType;
    @XmlElement(name = "Transactions", required = true)
    protected String transactions;
    @XmlElement(name = "TrxInf-repeatable", required = true)
    protected String trxInfRepeatable;
    @XmlElement(name = "ErrorCode", required = true)
    protected String errorCode;
    @XmlElement(name = "AcctInfo", required = true)
    protected String acctInfo;
    @XmlElement(name = "BillingNo", required = true)
    protected String billingNo;
    @XmlElement(name = "BillNo", required = true)
    protected String billNo;
    @XmlElement(name = "BillerCode", required = true)
    protected String billerCode;
    @XmlElement(name = "InqRefNo", required = true)
    protected String inqRefNo;
    @XmlElement(name = "ValidationCode", required = true)
    protected String validationCode;
    @XmlElement(name = "DueAmt", required = true)
    protected String dueAmt;
    @XmlElement(name = "PaidAmt", required = true)
    protected String paidAmt;
    @XmlElement(name = "ExtraInfo", required = true)
    protected String extraInfo;

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
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeverity(String value) {
        this.severity = value;
    }

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
