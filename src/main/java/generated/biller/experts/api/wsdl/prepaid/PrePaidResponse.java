
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
 *         &lt;element name="DueAmt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PaidAmt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProcessDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="STMTDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="JOEBPPSTrx" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Result" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ErrorDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Severity" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "dueAmt",
    "paidAmt",
    "processDate",
    "currency",
    "stmtDate",
    "joebppsTrx",
    "result",
    "errorCode",
    "errorDesc",
    "severity"
})
@XmlRootElement(name = "PrePaidResponse")
public class PrePaidResponse {

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
    @XmlElement(name = "DueAmt", required = true)
    protected String dueAmt;
    @XmlElement(name = "PaidAmt", required = true)
    protected String paidAmt;
    @XmlElement(name = "ProcessDate", required = true)
    protected String processDate;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "STMTDate", required = true)
    protected String stmtDate;
    @XmlElement(name = "JOEBPPSTrx", required = true)
    protected String joebppsTrx;
    @XmlElement(name = "Result", required = true)
    protected String result;
    @XmlElement(name = "ErrorCode", required = true)
    protected String errorCode;
    @XmlElement(name = "ErrorDesc", required = true)
    protected String errorDesc;
    @XmlElement(name = "Severity", required = true)
    protected String severity;

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
     * Gets the value of the stmtDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTMTDate() {
        return stmtDate;
    }

    /**
     * Sets the value of the stmtDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTMTDate(String value) {
        this.stmtDate = value;
    }

    /**
     * Gets the value of the joebppsTrx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJOEBPPSTrx() {
        return joebppsTrx;
    }

    /**
     * Sets the value of the joebppsTrx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJOEBPPSTrx(String value) {
        this.joebppsTrx = value;
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

}
