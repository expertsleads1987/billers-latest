package com.experts.core.biller.statemachine.api.querydslbeans;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.mysema.query.types.path.DateTimePath;
import com.mysema.query.types.path.NumberPath;
import com.mysema.query.types.path.StringPath;
import lombok.*;
import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
@Setter
@Getter
public class ManVouncherMaster implements Serializable{


    private static final long serialVersionUID = 1111648120;

    @XmlElement(name  = "agreementId" , required = false , nillable = false)
    public String agreementId;

    @XmlElement(name  = "agreementSerial" , required = false , nillable = false)
    public String agreementSerial ;

    @XmlElement(name  = "allowAmt" , required = false , nillable = false)
    public String allowAmt ;

    @XmlElement(name  = "areaId" , required = false , nillable = false)
    public String areaId ;

    @XmlElement(name  = "baseAmt" , required = false , nillable = false)
    public String baseAmt ;

    @XmlElement(name  = "benSystemNo" , required = false , nillable = false)
    public String benSystemNo ;

    @XmlElement(name  = "branchId" , required = false , nillable = false)
    public String branchId ;

    @XmlElement(name  = "calcDate" , required = false , nillable = false)
    public String calcDate ;

    @XmlElement(name  = "classCode" , required = false , nillable = false)
    public String classCode ;

    @XmlElement(name  = "combinCodeCr" , required = false , nillable = false)
    public String combinCodeCr ;

    @XmlElement(name  = "combinCodeDb" , required = false , nillable = false)
    public String combinCodeDb ;

    @XmlElement(name  = "compId" , required = false , nillable = false)
    public String compId ;

    @XmlElement(name  = "constantAmt" , required = false , nillable = false)
    public String constantAmt ;

    @XmlElement(name  = "consumptionAmt" , required = false , nillable = false)
    public String consumptionAmt ;

    @XmlElement(name  = "consumptionQty" , required = false , nillable = false)
    public String consumptionQty ;

    @XmlElement(name  = "consumptionType" , required = false , nillable = false)
    public String consumptionType ;

    @XmlElement(name  = "crateAmt" , required = false , nillable = false)
    public String crateAmt ;

    @XmlElement(name  = "crateDate" , required = false , nillable = false)
    public String crateDate ;

    @XmlElement(name  = "crateTypeCode" , required = false , nillable = false)
    public String crateTypeCode ;

    @XmlElement(name  = "creditAmt" , required = false , nillable = false)
    public String creditAmt ;

    @XmlElement(name  = "creditQty" , required = false , nillable = false)
    public String creditQty ;

    @XmlElement(name  = "currencyId" , required = false , nillable = false)
    public String currencyId ;

    @XmlElement(name  = "customerType" , required = false , nillable = false)
    public String customerType ;

    @XmlElement(name  = "cycleSerial" , required = false , nillable = false)
    public String cycleSerial ;

    @XmlElement(name  = "debtsAmt" , required = false , nillable = false)
    public String debtsAmt ;

    @XmlElement(name  = "debtType" , required = false , nillable = false)
    public String debtType ;

    @XmlElement(name  = "deductionAmt" , required = false , nillable = false)
    public String deductionAmt;

    @XmlElement(name  = "distAreaCode" , required = false , nillable = false)
    public String distAreaCode ;

    @XmlElement(name  = "distributionDay" , required = false , nillable = false)
    public String distributionDay ;

    @XmlElement(name  = "distributionRoute" , required = false , nillable = false)
    public String distributionRoute ;

    @XmlElement(name  = "dstrctCode" , required = false , nillable = false)
    public String dstrctCode ;

    @XmlElement(name  = "dtimeStamp" , required = false , nillable = false)
    public String dtimeStamp ;

    @XmlElement(name  = "duserId" , required = false , nillable = false)
    public String duserId ;

    @XmlElement(name  = "exemptionAmt" , required = false , nillable = false)
    public String exemptionAmt ;

    @XmlElement(name  = "extraAmt" , required = false , nillable = false)
    public String extraAmt ;

    @XmlElement(name  = "feeAmt" , required = false , nillable = false)
    public String feeAmt ;

    @XmlElement(name  = "feeCode" , required = false , nillable = false)
    public String feeCode ;

    @XmlElement(name  = "feesVoucherNo" , required = false , nillable = false)
    public String feesVoucherNo ;

    @XmlElement(name  = "fixedAmt" , required = false , nillable = false)
    public String fixedAmt ;

    @XmlElement(name  = "glBaseAmt" , required = false , nillable = false)
    public String glBaseAmt ;

    @XmlElement(name  = "glCrateAmt" , required = false , nillable = false)
    public String glCrateAmt ;

    @XmlElement(name  = "glCrateDate" , required = false , nillable = false)
    public String glCrateDate ;

    @XmlElement(name  = "glCrateTypeCode" , required = false , nillable = false)
    public String glCrateTypeCode ;

    @XmlElement(name  = "glPosted" , required = false , nillable = false)
    public String glPosted ;

    @XmlElement(name  = "glPostedDate" , required = false , nillable = false)
    public String glPostedDate ;

    @XmlElement(name  = "glPostedUser" , required = false , nillable = false)
    public String glPostedUser ;

    @XmlElement(name  = "glTransNo" , required = false , nillable = false)
    public String glTransNo ;

    @XmlElement(name  = "immovableType" , required = false , nillable = false)
    public String immovableType ;

    @XmlElement(name  = "isOldDebt" , required = false , nillable = false)
    public String isOldDebt ;

    @XmlElement(name  = "isPosted" , required = false , nillable = false)
    public String isPosted ;

    @XmlElement(name  = "isPrinted" , required = false , nillable = false)
    public String isPrinted ;

    @XmlElement(name  = "isUpdated" , required = false , nillable = false)
    public String isUpdated ;

    @XmlElement(name  = "itimeStamp" , required = false , nillable = false)
    public String itimeStamp ;

    @XmlElement(name  = "iuserId" , required = false , nillable = false)
    public String iuserId ;

    @XmlElement(name  = "kvrAmt" , required = false , nillable = false)
    public String kvrAmt ;

    @XmlElement(name  = "lastDueDate" , required = false , nillable = false)
    public String lastDueDate ;

    @XmlElement(name  = "lastFeeDate" , required = false , nillable = false)
    public String lastFeeDate ;

    @XmlElement(name  = "lateAmt" , required = false , nillable = false)
    public String lateAmt ;

    @XmlElement(name  = "lateFeesAmt" , required = false , nillable = false)
    public String lateFeesAmt ;

    @XmlElement(name  = "locatCode" , required = false , nillable = false)
    public String locatCode ;

    @XmlElement(name  = "locationId" , required = false , nillable = false)
    public String locationId;

    @XmlElement(name  = "lowerLimitAmt" , required = false , nillable = false)
    public String lowerLimitAmt ;

    @XmlElement(name  = "maintenanceAmt" , required = false , nillable = false)
    public String maintenanceAmt ;

    @XmlElement(name  = "manVoucherMaster" , required = false , nillable = false)
    public String manVoucherMaster ;

    @XmlElement(name  = "meterFees" , required = false , nillable = false)
    public String meterFees ;

    @XmlElement(name  = "miscellanyAmt" , required = false , nillable = false)
    public String miscellanyAmt ;

    @XmlElement(name  = "netAmt" , required = false , nillable = false)
    public String netAmt ;

    @XmlElement(name  = "newLateAmt" , required = false , nillable = false)
    public String newLateAmt ;

    @XmlElement(name  = "noOfUnits" , required = false , nillable = false)
    public String noOfUnits ;

    @XmlElement(name  = "oldDebtAmt" , required = false , nillable = false)
    public String oldDebtAmt;

    @XmlElement(name  = "oldDebtPaid" , required = false , nillable = false)
    public String oldDebtPaid ;

    @XmlElement(name  = "oldFeeDate" , required = false , nillable = false)
    public String oldFeeDate ;

    @XmlElement(name  = "oldNetAmt" , required = false , nillable = false)
    public String oldNetAmt ;

    @XmlElement(name  = "oldNotes" , required = false , nillable = false)
    public String oldNotes ;

    @XmlElement(name  = "oldVoucherDate" , required = false , nillable = false)
    public String oldVoucherDate;

    @XmlElement(name  = "oldVoucherNo" , required = false , nillable = false)
    public String oldVoucherNo ;

    @XmlElement(name  = "originalPrintNo" , required = false , nillable = false)
    public String originalPrintNo ;

    @XmlElement(name  = "ownerSystemNo" , required = false , nillable = false)
    public String ownerSystemNo ;

    @XmlElement(name  = "paidAmt" , required = false , nillable = false)
    public String paidAmt ;

    @XmlElement(name  = "paidOnLateAmt" , required = false , nillable = false)
    public String paidOnLateAmt ;

    @XmlElement(name  = "paidOnLatePrc" , required = false , nillable = false)
    public String paidOnLatePrc ;

    @XmlElement(name  = "paymentDate" , required = false , nillable = false)
    public String paymentDate ;

    @XmlElement(name  = "periodicalAmt" , required = false , nillable = false)
    public String periodicalAmt ;

    @XmlElement(name  = "prevDiscCheckDone" , required = false , nillable = false)
    public String prevDiscCheckDone ;

    @XmlElement(name  = "prevDiscountAmt" , required = false , nillable = false)
    public String prevDiscountAmt ;

    @XmlElement(name  = "prevDiscountPrevAmt" , required = false , nillable = false)
    public String prevDiscountPrevAmt;

    @XmlElement(name  = "previousAmt" , required = false , nillable = false)
    public String previousAmt ;

    @XmlElement(name  = "previousBaseAmt" , required = false , nillable = false)
    public String previousBaseAmt ;

    @XmlElement(name  = "prevPaidAmt" , required = false , nillable = false)
    public String prevPaidAmt;

    @XmlElement(name  = "prevToleranceAmt" , required = false , nillable = false)
    public String prevToleranceAmt ;

    @XmlElement(name  = "printCount" , required = false , nillable = false)
    public String printCount ;

    @XmlElement(name  = "printDate" , required = false , nillable = false)
    public String printDate ;

    @XmlElement(name  = "readAreaCode" , required = false , nillable = false)
    public String readAreaCode ;

    @XmlElement(name  = "readingDay" , required = false , nillable = false)
    public String readingDay ;

    @XmlElement(name  = "readingRoute" , required = false , nillable = false)
    public String readingRoute ;

    @XmlElement(name  = "refNo" , required = false , nillable = false)
    public String refNo ;

    @XmlElement(name  = "refType" , required = false , nillable = false)
    public String refType;

    @XmlElement(name  = "remainAmt" , required = false , nillable = false)
    public String remainAmt ;

    @XmlElement(name  = "remainNotPaid" , required = false , nillable = false)
    public String remainNotPaid ;

    @XmlElement(name  = "resorcCode" , required = false , nillable = false)
    public String resorcCode ;

    @XmlElement(name  = "roundAmt" , required = false , nillable = false)
    public String roundAmt ;

    @XmlElement(name  = "routeCode" , required = false , nillable = false)
    public String routeCode ;

    @XmlElement(name  = "sbranchId" , required = false , nillable = false)
    public String sbranchId ;

    @XmlElement(name  = "servsType" , required = false , nillable = false)
    public String servsType ;

    @XmlElement(name  = "sewageAmt" , required = false , nillable = false)
    public String sewageAmt ;

    @XmlElement(name  = "systemNo" , required = false , nillable = false)
    public String systemNo ;

    @XmlElement(name  = "systemVoucherNo" , required = false , nillable = false)
    public String systemVoucherNo ;

    @XmlElement(name  = "usageType" , required = false , nillable = false)
    public String usageType ;

    @XmlElement(name  = "utimeStamp" , required = false , nillable = false)
    public String utimeStamp ;

    @XmlElement(name  = "uuserId" , required = false , nillable = false)
    public String uuserId ;

    @XmlElement(name  = "year" , required = false , nillable = false)
    public String vatAmt ;

    @XmlElement(name  = "year" , required = false , nillable = false)
    public String vatcatCode ;

    @XmlElement(name  = "vatValue" , required = false , nillable = false)
    public String vatValue ;

    @XmlElement(name  = "voucherAmt" , required = false , nillable = false)
    public String voucherAmt;

    @XmlElement(name  = "voucherDate" , required = false , nillable = false)
    public String voucherDate ;

    @XmlElement(name  = "voucherDocNo" , required = false , nillable = false)
    public String voucherDocNo ;

    @XmlElement(name  = "alid" , required = false , nillable = false)
    public String alid ;

    @XmlElement(name  = "voucherNo" , required = false , nillable = false)
    public String voucherNo ;

    @XmlElement(name  = "voucherStatus" , required = false , nillable = false)
    public String voucherStatus;

    @XmlElement(name  = "voucherType" , required = false , nillable = false)
    public String voucherType ;

    @XmlElement(name  = "voucherTypeSeq" , required = false , nillable = false)
    public String voucherTypeSeq ;

    @XmlElement(name  = "year" , required = false , nillable = false)
    public  StringPath year ;

    @XmlElement(name  = "COMP_ID" , required = false , nillable = false)
    private String COMP_ID;

    @XmlElement(name  = "SERVS_TYPE" , required = false , nillable = false)
    private String SERVS_TYPE;

    @XmlElement(name  = "VOUCHER_NO" , required = false , nillable = false)
    private String VOUCHER_NO;

    @XmlElement(name  = "AGREEMENT_ID" , required = false , nillable = false)
	private String AGREEMENT_ID;

    @XmlElement(name  = "CUSTOMER_TYPE" , required = false , nillable = false)
	private String CUSTOMER_TYPE;

    @XmlElement(name  = "DSTRCT_CODE" , required = false , nillable = false)
	private String DSTRCT_CODE;

    @XmlElement(name  = "LOCAT_CODE" , required = false , nillable = false)
	private String LOCAT_CODE;

    @XmlElement(name  = "ROUTE_CODE" , required = false , nillable = false)
	private String ROUTE_CODE;

    @XmlElement(name  = "AGREEMENT_SERIAL" , required = false , nillable = false)
	private String AGREEMENT_SERIAL;

    @XmlElement(name  = "LOCATION_ID" , required = false , nillable = false)
	private String LOCATION_ID;

    @XmlElement(name  = "RESORC_CODE" , required = false , nillable = false)
	private String RESORC_CODE;

    @XmlElement(name  = "CONSUMPTION_TYPE" , required = false , nillable = false)
	private String CONSUMPTION_TYPE;

    @XmlElement(name  = "VATCAT_CODE" , required = false , nillable = false)
	private String VATCAT_CODE;

    @XmlElement(name  = "VAT_VALUE" , required = false , nillable = false)
	private String VAT_VALUE;

    @XmlElement(name  = "CLASS_CODE" , required = false , nillable = false)
	private String CLASS_CODE;

    @XmlElement(name  = "CURRENCY_ID" , required = false , nillable = false)
	private String CURRENCY_ID;

    @XmlElement(name  = "VOUCHER_DOC_NO" , required = false , nillable = false)
	private String VOUCHER_DOC_NO;

    @XmlElement(name  = "IMMOVABLE_TYPE" , required = false , nillable = false)
	private String IMMOVABLE_TYPE;

    @XmlElement(name  = "USAGE_TYPE" , required = false , nillable = false)
	private String USAGE_TYPE;

    @XmlElement(name  = "VOUCHER_TYPE" , required = false , nillable = false)
	private Date VOUCHER_TYPE;

    @XmlElement(name  = "VOUCHER_DATE" , required = false , nillable = false)
	private Date VOUCHER_DATE;

    @XmlElement(name  = "LAST_DUE_DATE" , required = false , nillable = false)
    private Date LAST_DUE_DATE;

    @XmlElement(name  = "PAYMENT_DATE" , required = false , nillable = false)
    private Date PAYMENT_DATE;

    @XmlElement(name  = "VOUCHER_STATUS" , required = false , nillable = false)
    private String VOUCHER_STATUS;

    @XmlElement(name  = "IS_POSTED" , required = false , nillable = false)
	private String IS_POSTED;

    @XmlElement(name  = "IS_PRINTED" , required = false , nillable = false)
	private String IS_PRINTED;

    @XmlElement(name  = "REF_TYPE" , required = false , nillable = false)
    private String REF_TYPE;

    @XmlElement(name  = "REF_NO" , required = false , nillable = false)
	private String REF_NO;

    @XmlElement(name  = "CONSUMPTION_QTY" , required = false , nillable = false)
	private String CONSUMPTION_QTY;

    @XmlElement(name  = "CONSUMPTION_AMT" , required = false , nillable = false)
	private String CONSUMPTION_AMT;

    @XmlElement(name  = "KVR_AMT" , required = false , nillable = false)
	private String KVR_AMT;

    @XmlElement(name  = "LOWER_LIMIT_AMT" , required = false , nillable = false)
	private String LOWER_LIMIT_AMT;

    @XmlElement(name  = "CONSTANT_AMT" , required = false , nillable = false)
	private String CONSTANT_AMT;

    @XmlElement(name  = "PERIODICAL_AMT" , required = false , nillable = false)
	private String PERIODICAL_AMT;

    @XmlElement(name  = "LATE_AMT" , required = false , nillable = false)
	private String LATE_AMT;

    @XmlElement(name  = "LATE_FEES_AMT" , required = false , nillable = false)
	private String LATE_FEES_AMT;

    @XmlElement(name  = "MISCELLANY_AMT" , required = false , nillable = false)
	private String MISCELLANY_AMT;

    @XmlElement(name  = "EXTRA_AMT" , required = false , nillable = false)
	private String EXTRA_AMT;

    @XmlElement(name  = "DEDUCTION_AMT" , required = false , nillable = false)
	private String DEDUCTION_AMT;

    @XmlElement(name  = "EXEMPTION_AMT" , required = false , nillable = false)
	private String EXEMPTION_AMT;

    @XmlElement(name  = "PREVIOUS_AMT" , required = false , nillable = false)
	private String PREVIOUS_AMT;

    @XmlElement(name  = "ROUND_AMT" , required = false , nillable = false)
	private String ROUND_AMT;

    @XmlElement(name  = "VAT_AMT" , required = false , nillable = false)
	private String VAT_AMT;

    @XmlElement(name  = "ALLOW_AMT" , required = false , nillable = false)
	private String ALLOW_AMT;

    @XmlElement(name  = "VOUCHER_AMT" , required = false , nillable = false)
	private String VOUCHER_AMT;

    @XmlElement(name  = "NET_AMT" , required = false , nillable = false)
	private String NET_AMT;

    @XmlElement(name  = "PAID_AMT" , required = false , nillable = false)
	private String PAID_AMT;

    @XmlElement(name  = "CREDIT_QTY" , required = false , nillable = false)
	private String CREDIT_QTY;

    @XmlElement(name  = "CREDIT_AMT" , required = false , nillable = false)
	private String CREDIT_AMT;

    @XmlElement(name  = "CRATE_TYPE_CODE" , required = false , nillable = false)
	private String CRATE_TYPE_CODE;

    @XmlElement(name  = "CRATE_AMT" , required = false , nillable = false)
	private String CRATE_AMT;

    @XmlElement(name  = "BASE_AMT" , required = false , nillable = false)
	private String BASE_AMT;

    @XmlElement(name  = "CRATE_DATE" , required = false , nillable = false)
	private Date CRATE_DATE;

    @XmlElement(name  = "GL_CRATE_TYPE_CODE" , required = false , nillable = false)
	private String GL_CRATE_TYPE_CODE;

    @XmlElement(name  = "GL_CRATE_AMT" , required = false , nillable = false)
	private String GL_CRATE_AMT;

    @XmlElement(name  = "GL_CRATE_DATE" , required = false , nillable = false)
	private Date GL_CRATE_DATE;

    @XmlElement(name  = "GL_BASE_AMT" , required = false , nillable = false)
    private String GL_BASE_AMT;

    @XmlElement(name  = "GL_POSTED" , required = false , nillable = false)
	private String GL_POSTED;

    @XmlElement(name  = "GL_POSTED_DATE" , required = false , nillable = false)
	private Date GL_POSTED_DATE;

    @XmlElement(name  = "GL_TRANS_NO" , required = false , nillable = false)
	private String GL_TRANS_NO;

    @XmlElement(name  = "GL_POSTED_USER" , required = false , nillable = false)
	private String GL_POSTED_USER;

    @XmlElement(name  = "NO_OF_UNITS" , required = false , nillable = false)
	private String NO_OF_UNITS;

    @XmlElement(name  = "ITIME_STAMP" , required = false , nillable = false)
	private String ITIME_STAMP;

    @XmlElement(name  = "IUSER_ID" , required = false , nillable = false)
	private String IUSER_ID;

    @XmlElement(name  = "UTIME_STAMP" , required = false , nillable = false)
	private Date UTIME_STAMP;

    @XmlElement(name  = "UUSER_ID" , required = false , nillable = false)
    private String UUSER_ID;

    @XmlElement(name  = "DTIME_STAMP" , required = false , nillable = false)
	private Timestamp DTIME_STAMP;

    @XmlElement(name  = "DUSER_ID" , required = false , nillable = false)
	private String DUSER_ID;

    @XmlElement(name  = "VOUCHER_ISVALID" , required = false , nillable = false)
	private String VOUCHER_ISVALID;

    @XmlElement(name  = "REMAIN_AMT" , required = false , nillable = false)
	private String REMAIN_AMT;

    @XmlElement(name  = "LAST_FEE_DATE" , required = false , nillable = false)
	private Date LAST_FEE_DATE;

    @XmlElement(name  = "OLD_FEE_DATE" , required = false , nillable = false)
	private Date OLD_FEE_DATE;

    @XmlElement(name  = "FEES_VOUCHER_NO" , required = false , nillable = false)
	private String FEES_VOUCHER_NO;

    @XmlElement(name  = "PREVIOUS_BASE_AMT" , required = false , nillable = false)
    private String PREVIOUS_BASE_AMT;

    @XmlElement(name  = "SYSTEM_VOUCHER_NO" , required = false , nillable = false)
    private String SYSTEM_VOUCHER_NO;

    @XmlElement(name  = "CYCLE_SERIAL" , required = false , nillable = false)
	private String CYCLE_SERIAL;

    @XmlElement(name  = "ORIGINAL_PRINT_NO" , required = false , nillable = false)
	private String ORIGINAL_PRINT_NO;

    @XmlElement(name  = "CALC_DATE" , required = false , nillable = false)
	private Date CALC_DATE;

    @XmlElement(name  = "VOUCHER_TYPE_SEQ" , required = false , nillable = false)
	private String VOUCHER_TYPE_SEQ;

    @XmlElement(name  = "FEE_AMT" , required = false , nillable = false)
	private String FEE_AMT;

    @XmlElement(name  = "MAINTENANCE_AMT" , required = false , nillable = false)
	private String MAINTENANCE_AMT;

    @XmlElement(name  = "METER_FEES" , required = false , nillable = false)
	private String METER_FEES;

    @XmlElement(name  = "OWNER_SYSTEM_NO" , required = false , nillable = false)
	private String OWNER_SYSTEM_NO;

    @XmlElement(name  = "BEN_SYSTEM_NO" , required = false , nillable = false)
	private String BEN_SYSTEM_NO;

    @XmlElement(name  = "SEWAGE_AMT" , required = false , nillable = false)
	private String SEWAGE_AMT;

    @XmlElement(name  = "DEBTS_AMT" , required = false , nillable = false)
	private String DEBTS_AMT;

    @XmlElement(name  = "YEAR" , required = false , nillable = false)
	private String YEAR;

    @XmlElement(name  = "PRINT_COUNT" , required = false , nillable = false)
	private String PRINT_COUNT;

    @XmlElement(name  = "READING_ROUTE" , required = false , nillable = false)
	private String READING_ROUTE;

    @XmlElement(name  = "DISTRIBUTION_ROUTE" , required = false , nillable = false)
	private String DISTRIBUTION_ROUTE;

    @XmlElement(name  = "DIST_AREA_CODE" , required = false , nillable = false)
	private String DIST_AREA_CODE;

    @XmlElement(name  = "READ_AREA_CODE" , required = false , nillable = false)
	private String READ_AREA_CODE;

    @XmlElement(name  = "DISTRIBUTION_DAY" , required = false , nillable = false)
	private String DISTRIBUTION_DAY;

    @XmlElement(name  = "READING_DAY" , required = false , nillable = false)
	private String READING_DAY;

    @XmlElement(name  = "IS_OLD_DEBT" , required = false , nillable = false)
	private String IS_OLD_DEBT;

    @XmlElement(name  = "OLD_DEBT_AMT" , required = false , nillable = false)
	private String OLD_DEBT_AMT;

    @XmlElement(name  = "OLD_DEBT_PAID" , required = false , nillable = false)
	private String OLD_DEBT_PAID;

    @XmlElement(name  = "DEBT_TYPE" , required = false , nillable = false)
	private String DEBT_TYPE;

    @XmlElement(name  = "FEE_CODE" , required = false , nillable = false)
	private String FEE_CODE;

    @XmlElement(name  = "PREV_DISCOUNT_AMT" , required = false , nillable = false)
	private String PREV_DISCOUNT_AMT;

    @XmlElement(name  = "PREV_DISC_CHECK_DONE" , required = false , nillable = false)
    private String  PREV_DISC_CHECK_DONE;

    @XmlElement(name  = "PREV_TOLERANCE_AMT" , required = false , nillable = false)
    private String PREV_TOLERANCE_AMT;

    @XmlElement(name  = "MAN_VOUCHER_MASTER" , required = false , nillable = false)
	private String MAN_VOUCHER_MASTER;

    @XmlElement(name  = "PREV_DISCOUNT_PREV_AMT" , required = false , nillable = false)
    private String PREV_DISCOUNT_PREV_AMT;

    @XmlElement(name  = "PREV_PAID_AMT" , required = false , nillable = false)
    private String PREV_PAID_AMT;

    @XmlElement(name  = "OLD_VOUCHER_NO" , required = false , nillable = false)
    private String OLD_VOUCHER_NO;

    @XmlElement(name  = "OLD_NOTES" , required = false , nillable = false)
	private String OLD_NOTES;

    @XmlElement(name  = "OLD_VOUCHER_DATE" , required = false , nillable = false)
	private String OLD_VOUCHER_DATE;

    @XmlElement(name  = "IS_UPDATED" , required = false , nillable = false)
	private String IS_UPDATED;

    @XmlElement(name  = "BRANCH_ID" , required = false , nillable = false)
	private String BRANCH_ID;

    @XmlElement(name  = "SBRANCH_ID" , required = false , nillable = false)
	private String SBRANCH_ID;

    @XmlElement(name  = "AREA_ID" , required = false , nillable = false)
	private String AREA_ID;

    @XmlElement(name  = "FIXED_AMT" , required = false , nillable = false)
	private String FIXED_AMT;

    @XmlElement(name  = "NEW_LATE_AMT" , required = false , nillable = false)
	private String NEW_LATE_AMT;

    @XmlElement(name  = "PAID_ON_LATE_AMT" , required = false , nillable = false)
	private String PAID_ON_LATE_AMT;

    @XmlElement(name  = "PAID_ON_LATE_PRC" , required = false , nillable = false)
	private String PAID_ON_LATE_PRC;

    @XmlElement(name  = "REMAIN_NOT_PAID" , required = false , nillable = false)
	private String REMAIN_NOT_PAID;

    @XmlElement(name  = "OLD_NET_AMT" , required = false , nillable = false)
	private String OLD_NET_AMT;

    @XmlElement(name  = "COMBIN_CODE_DB" , required = false , nillable = false)
	private String COMBIN_CODE_DB;

    @XmlElement(name  = "COMBIN_CODE_CR" , required = false , nillable = false)
	private String COMBIN_CODE_CR;

    @XmlElement(name  = "PRINT_DATE" , required = false , nillable = false)
	private Date PRINT_DATE;


    @XmlElement(name  = "billCode" , required = false , nillable = false)
    private String billCode;

    @XmlElement(name  = "billName" , required = false , nillable = false)
    private String billName;

    @XmlElement(name  = "billerName" , required = false , nillable = false)
    private String billerName;

    @XmlElement(name  = "billerCode" , required = false , nillable = false)
    private String billerCode;

    @XmlElement(name  = "billerAddress" , required = false , nillable = false)
    private String billerAddress;

    @XmlElement(name  = "clientId" , required = false , nillable = false)
    private String clientId;

    @XmlElement(name  = "onServiceBy" , required = false , nillable = true)
    private String onServiceBy;

    @XmlElement(name  = "bankId" , required = false , nillable = false)
    private String bankId;

    @XmlElement(name  = "bankName" , required = false , nillable = false)
    private String bankName;

    @XmlElement(name  = "bankAddress" , required = false , nillable = false)
    private String bankAddress;

    @XmlElement(name  = "bankCode" , required = false , nillable = false)
    private String bankCode;

	public String getAgreementId() {
		return agreementId;
	}

	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}

	public String getAgreementSerial() {
		return agreementSerial;
	}

	public void setAgreementSerial(String agreementSerial) {
		this.agreementSerial = agreementSerial;
	}

	public String getAllowAmt() {
		return allowAmt;
	}

	public void setAllowAmt(String allowAmt) {
		this.allowAmt = allowAmt;
	}

	public String getAreaId() {
		return areaId;
	}

	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}

	public String getBaseAmt() {
		return baseAmt;
	}

	public void setBaseAmt(String baseAmt) {
		this.baseAmt = baseAmt;
	}

	public String getBenSystemNo() {
		return benSystemNo;
	}

	public void setBenSystemNo(String benSystemNo) {
		this.benSystemNo = benSystemNo;
	}

	public String getBranchId() {
		return branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	public String getCalcDate() {
		return calcDate;
	}

	public void setCalcDate(String calcDate) {
		this.calcDate = calcDate;
	}

	public String getClassCode() {
		return classCode;
	}

	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}

	public String getCombinCodeCr() {
		return combinCodeCr;
	}

	public void setCombinCodeCr(String combinCodeCr) {
		this.combinCodeCr = combinCodeCr;
	}

	public String getCombinCodeDb() {
		return combinCodeDb;
	}

	public void setCombinCodeDb(String combinCodeDb) {
		this.combinCodeDb = combinCodeDb;
	}

	public String getCompId() {
		return compId;
	}

	public void setCompId(String compId) {
		this.compId = compId;
	}

	public String getConstantAmt() {
		return constantAmt;
	}

	public void setConstantAmt(String constantAmt) {
		this.constantAmt = constantAmt;
	}

	public String getConsumptionAmt() {
		return consumptionAmt;
	}

	public void setConsumptionAmt(String consumptionAmt) {
		this.consumptionAmt = consumptionAmt;
	}

	public String getConsumptionQty() {
		return consumptionQty;
	}

	public void setConsumptionQty(String consumptionQty) {
		this.consumptionQty = consumptionQty;
	}

	public String getConsumptionType() {
		return consumptionType;
	}

	public void setConsumptionType(String consumptionType) {
		this.consumptionType = consumptionType;
	}

	public String getCrateAmt() {
		return crateAmt;
	}

	public void setCrateAmt(String crateAmt) {
		this.crateAmt = crateAmt;
	}

	public String getCrateDate() {
		return crateDate;
	}

	public void setCrateDate(String crateDate) {
		this.crateDate = crateDate;
	}

	public String getCrateTypeCode() {
		return crateTypeCode;
	}

	public void setCrateTypeCode(String crateTypeCode) {
		this.crateTypeCode = crateTypeCode;
	}

	public String getCreditAmt() {
		return creditAmt;
	}

	public void setCreditAmt(String creditAmt) {
		this.creditAmt = creditAmt;
	}

	public String getCreditQty() {
		return creditQty;
	}

	public void setCreditQty(String creditQty) {
		this.creditQty = creditQty;
	}

	public String getCurrencyId() {
		return currencyId;
	}

	public void setCurrencyId(String currencyId) {
		this.currencyId = currencyId;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public String getCycleSerial() {
		return cycleSerial;
	}

	public void setCycleSerial(String cycleSerial) {
		this.cycleSerial = cycleSerial;
	}

	public String getDebtsAmt() {
		return debtsAmt;
	}

	public void setDebtsAmt(String debtsAmt) {
		this.debtsAmt = debtsAmt;
	}

	public String getDebtType() {
		return debtType;
	}

	public void setDebtType(String debtType) {
		this.debtType = debtType;
	}

	public String getDeductionAmt() {
		return deductionAmt;
	}

	public void setDeductionAmt(String deductionAmt) {
		this.deductionAmt = deductionAmt;
	}

	public String getDistAreaCode() {
		return distAreaCode;
	}

	public void setDistAreaCode(String distAreaCode) {
		this.distAreaCode = distAreaCode;
	}

	public String getDistributionDay() {
		return distributionDay;
	}

	public void setDistributionDay(String distributionDay) {
		this.distributionDay = distributionDay;
	}

	public String getDistributionRoute() {
		return distributionRoute;
	}

	public void setDistributionRoute(String distributionRoute) {
		this.distributionRoute = distributionRoute;
	}

	public String getDstrctCode() {
		return dstrctCode;
	}

	public void setDstrctCode(String dstrctCode) {
		this.dstrctCode = dstrctCode;
	}

	public String getDtimeStamp() {
		return dtimeStamp;
	}

	public void setDtimeStamp(String dtimeStamp) {
		this.dtimeStamp = dtimeStamp;
	}

	public String getDuserId() {
		return duserId;
	}

	public void setDuserId(String duserId) {
		this.duserId = duserId;
	}

	public String getExemptionAmt() {
		return exemptionAmt;
	}

	public void setExemptionAmt(String exemptionAmt) {
		this.exemptionAmt = exemptionAmt;
	}

	public String getExtraAmt() {
		return extraAmt;
	}

	public void setExtraAmt(String extraAmt) {
		this.extraAmt = extraAmt;
	}

	public String getFeeAmt() {
		return feeAmt;
	}

	public void setFeeAmt(String feeAmt) {
		this.feeAmt = feeAmt;
	}

	public String getFeeCode() {
		return feeCode;
	}

	public void setFeeCode(String feeCode) {
		this.feeCode = feeCode;
	}

	public String getFeesVoucherNo() {
		return feesVoucherNo;
	}

	public void setFeesVoucherNo(String feesVoucherNo) {
		this.feesVoucherNo = feesVoucherNo;
	}

	public String getFixedAmt() {
		return fixedAmt;
	}

	public void setFixedAmt(String fixedAmt) {
		this.fixedAmt = fixedAmt;
	}

	public String getGlBaseAmt() {
		return glBaseAmt;
	}

	public void setGlBaseAmt(String glBaseAmt) {
		this.glBaseAmt = glBaseAmt;
	}

	public String getGlCrateAmt() {
		return glCrateAmt;
	}

	public void setGlCrateAmt(String glCrateAmt) {
		this.glCrateAmt = glCrateAmt;
	}

	public String getGlCrateDate() {
		return glCrateDate;
	}

	public void setGlCrateDate(String glCrateDate) {
		this.glCrateDate = glCrateDate;
	}

	public String getGlCrateTypeCode() {
		return glCrateTypeCode;
	}

	public void setGlCrateTypeCode(String glCrateTypeCode) {
		this.glCrateTypeCode = glCrateTypeCode;
	}

	public String getGlPosted() {
		return glPosted;
	}

	public void setGlPosted(String glPosted) {
		this.glPosted = glPosted;
	}

	public String getGlPostedDate() {
		return glPostedDate;
	}

	public void setGlPostedDate(String glPostedDate) {
		this.glPostedDate = glPostedDate;
	}

	public String getGlPostedUser() {
		return glPostedUser;
	}

	public void setGlPostedUser(String glPostedUser) {
		this.glPostedUser = glPostedUser;
	}

	public String getGlTransNo() {
		return glTransNo;
	}

	public void setGlTransNo(String glTransNo) {
		this.glTransNo = glTransNo;
	}

	public String getImmovableType() {
		return immovableType;
	}

	public void setImmovableType(String immovableType) {
		this.immovableType = immovableType;
	}

	public String getIsOldDebt() {
		return isOldDebt;
	}

	public void setIsOldDebt(String isOldDebt) {
		this.isOldDebt = isOldDebt;
	}

	public String getIsPosted() {
		return isPosted;
	}

	public void setIsPosted(String isPosted) {
		this.isPosted = isPosted;
	}

	public String getIsPrinted() {
		return isPrinted;
	}

	public void setIsPrinted(String isPrinted) {
		this.isPrinted = isPrinted;
	}

	public String getIsUpdated() {
		return isUpdated;
	}

	public void setIsUpdated(String isUpdated) {
		this.isUpdated = isUpdated;
	}

	public String getItimeStamp() {
		return itimeStamp;
	}

	public void setItimeStamp(String itimeStamp) {
		this.itimeStamp = itimeStamp;
	}

	public String getIuserId() {
		return iuserId;
	}

	public void setIuserId(String iuserId) {
		this.iuserId = iuserId;
	}

	public String getKvrAmt() {
		return kvrAmt;
	}

	public void setKvrAmt(String kvrAmt) {
		this.kvrAmt = kvrAmt;
	}

	public String getLastDueDate() {
		return lastDueDate;
	}

	public void setLastDueDate(String lastDueDate) {
		this.lastDueDate = lastDueDate;
	}

	public String getLastFeeDate() {
		return lastFeeDate;
	}

	public void setLastFeeDate(String lastFeeDate) {
		this.lastFeeDate = lastFeeDate;
	}

	public String getLateAmt() {
		return lateAmt;
	}

	public void setLateAmt(String lateAmt) {
		this.lateAmt = lateAmt;
	}

	public String getLateFeesAmt() {
		return lateFeesAmt;
	}

	public void setLateFeesAmt(String lateFeesAmt) {
		this.lateFeesAmt = lateFeesAmt;
	}

	public String getLocatCode() {
		return locatCode;
	}

	public void setLocatCode(String locatCode) {
		this.locatCode = locatCode;
	}

	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	public String getLowerLimitAmt() {
		return lowerLimitAmt;
	}

	public void setLowerLimitAmt(String lowerLimitAmt) {
		this.lowerLimitAmt = lowerLimitAmt;
	}

	public String getMaintenanceAmt() {
		return maintenanceAmt;
	}

	public void setMaintenanceAmt(String maintenanceAmt) {
		this.maintenanceAmt = maintenanceAmt;
	}

	public String getManVoucherMaster() {
		return manVoucherMaster;
	}

	public void setManVoucherMaster(String manVoucherMaster) {
		this.manVoucherMaster = manVoucherMaster;
	}

	public String getMeterFees() {
		return meterFees;
	}

	public void setMeterFees(String meterFees) {
		this.meterFees = meterFees;
	}

	public String getMiscellanyAmt() {
		return miscellanyAmt;
	}

	public void setMiscellanyAmt(String miscellanyAmt) {
		this.miscellanyAmt = miscellanyAmt;
	}

	public String getNetAmt() {
		return netAmt;
	}

	public void setNetAmt(String netAmt) {
		this.netAmt = netAmt;
	}

	public String getNewLateAmt() {
		return newLateAmt;
	}

	public void setNewLateAmt(String newLateAmt) {
		this.newLateAmt = newLateAmt;
	}

	public String getNoOfUnits() {
		return noOfUnits;
	}

	public void setNoOfUnits(String noOfUnits) {
		this.noOfUnits = noOfUnits;
	}

	public String getOldDebtAmt() {
		return oldDebtAmt;
	}

	public void setOldDebtAmt(String oldDebtAmt) {
		this.oldDebtAmt = oldDebtAmt;
	}

	public String getOldDebtPaid() {
		return oldDebtPaid;
	}

	public void setOldDebtPaid(String oldDebtPaid) {
		this.oldDebtPaid = oldDebtPaid;
	}

	public String getOldFeeDate() {
		return oldFeeDate;
	}

	public void setOldFeeDate(String oldFeeDate) {
		this.oldFeeDate = oldFeeDate;
	}

	public String getOldNetAmt() {
		return oldNetAmt;
	}

	public void setOldNetAmt(String oldNetAmt) {
		this.oldNetAmt = oldNetAmt;
	}

	public String getOldNotes() {
		return oldNotes;
	}

	public void setOldNotes(String oldNotes) {
		this.oldNotes = oldNotes;
	}

	public String getOldVoucherDate() {
		return oldVoucherDate;
	}

	public void setOldVoucherDate(String oldVoucherDate) {
		this.oldVoucherDate = oldVoucherDate;
	}

	public String getOldVoucherNo() {
		return oldVoucherNo;
	}

	public void setOldVoucherNo(String oldVoucherNo) {
		this.oldVoucherNo = oldVoucherNo;
	}

	public String getOriginalPrintNo() {
		return originalPrintNo;
	}

	public void setOriginalPrintNo(String originalPrintNo) {
		this.originalPrintNo = originalPrintNo;
	}

	public String getOwnerSystemNo() {
		return ownerSystemNo;
	}

	public void setOwnerSystemNo(String ownerSystemNo) {
		this.ownerSystemNo = ownerSystemNo;
	}

	public String getPaidAmt() {
		return paidAmt;
	}

	public void setPaidAmt(String paidAmt) {
		this.paidAmt = paidAmt;
	}

	public String getPaidOnLateAmt() {
		return paidOnLateAmt;
	}

	public void setPaidOnLateAmt(String paidOnLateAmt) {
		this.paidOnLateAmt = paidOnLateAmt;
	}

	public String getPaidOnLatePrc() {
		return paidOnLatePrc;
	}

	public void setPaidOnLatePrc(String paidOnLatePrc) {
		this.paidOnLatePrc = paidOnLatePrc;
	}

	public String getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getPeriodicalAmt() {
		return periodicalAmt;
	}

	public void setPeriodicalAmt(String periodicalAmt) {
		this.periodicalAmt = periodicalAmt;
	}

	public String getPrevDiscCheckDone() {
		return prevDiscCheckDone;
	}

	public void setPrevDiscCheckDone(String prevDiscCheckDone) {
		this.prevDiscCheckDone = prevDiscCheckDone;
	}

	public String getPrevDiscountAmt() {
		return prevDiscountAmt;
	}

	public void setPrevDiscountAmt(String prevDiscountAmt) {
		this.prevDiscountAmt = prevDiscountAmt;
	}

	public String getPrevDiscountPrevAmt() {
		return prevDiscountPrevAmt;
	}

	public void setPrevDiscountPrevAmt(String prevDiscountPrevAmt) {
		this.prevDiscountPrevAmt = prevDiscountPrevAmt;
	}

	public String getPreviousAmt() {
		return previousAmt;
	}

	public void setPreviousAmt(String previousAmt) {
		this.previousAmt = previousAmt;
	}

	public String getPreviousBaseAmt() {
		return previousBaseAmt;
	}

	public void setPreviousBaseAmt(String previousBaseAmt) {
		this.previousBaseAmt = previousBaseAmt;
	}

	public String getPrevPaidAmt() {
		return prevPaidAmt;
	}

	public void setPrevPaidAmt(String prevPaidAmt) {
		this.prevPaidAmt = prevPaidAmt;
	}

	public String getPrevToleranceAmt() {
		return prevToleranceAmt;
	}

	public void setPrevToleranceAmt(String prevToleranceAmt) {
		this.prevToleranceAmt = prevToleranceAmt;
	}

	public String getPrintCount() {
		return printCount;
	}

	public void setPrintCount(String printCount) {
		this.printCount = printCount;
	}

	public String getPrintDate() {
		return printDate;
	}

	public void setPrintDate(String printDate) {
		this.printDate = printDate;
	}

	public String getReadAreaCode() {
		return readAreaCode;
	}

	public void setReadAreaCode(String readAreaCode) {
		this.readAreaCode = readAreaCode;
	}

	public String getReadingDay() {
		return readingDay;
	}

	public void setReadingDay(String readingDay) {
		this.readingDay = readingDay;
	}

	public String getReadingRoute() {
		return readingRoute;
	}

	public void setReadingRoute(String readingRoute) {
		this.readingRoute = readingRoute;
	}

	public String getRefNo() {
		return refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	public String getRefType() {
		return refType;
	}

	public void setRefType(String refType) {
		this.refType = refType;
	}

	public String getRemainAmt() {
		return remainAmt;
	}

	public void setRemainAmt(String remainAmt) {
		this.remainAmt = remainAmt;
	}

	public String getRemainNotPaid() {
		return remainNotPaid;
	}

	public void setRemainNotPaid(String remainNotPaid) {
		this.remainNotPaid = remainNotPaid;
	}

	public String getResorcCode() {
		return resorcCode;
	}

	public void setResorcCode(String resorcCode) {
		this.resorcCode = resorcCode;
	}

	public String getRoundAmt() {
		return roundAmt;
	}

	public void setRoundAmt(String roundAmt) {
		this.roundAmt = roundAmt;
	}

	public String getRouteCode() {
		return routeCode;
	}

	public void setRouteCode(String routeCode) {
		this.routeCode = routeCode;
	}

	public String getSbranchId() {
		return sbranchId;
	}

	public void setSbranchId(String sbranchId) {
		this.sbranchId = sbranchId;
	}

	public String getServsType() {
		return servsType;
	}

	public void setServsType(String servsType) {
		this.servsType = servsType;
	}

	public String getSewageAmt() {
		return sewageAmt;
	}

	public void setSewageAmt(String sewageAmt) {
		this.sewageAmt = sewageAmt;
	}

	public String getSystemNo() {
		return systemNo;
	}

	public void setSystemNo(String systemNo) {
		this.systemNo = systemNo;
	}

	public String getSystemVoucherNo() {
		return systemVoucherNo;
	}

	public void setSystemVoucherNo(String systemVoucherNo) {
		this.systemVoucherNo = systemVoucherNo;
	}

	public String getUsageType() {
		return usageType;
	}

	public void setUsageType(String usageType) {
		this.usageType = usageType;
	}

	public String getUtimeStamp() {
		return utimeStamp;
	}

	public void setUtimeStamp(String utimeStamp) {
		this.utimeStamp = utimeStamp;
	}

	public String getUuserId() {
		return uuserId;
	}

	public void setUuserId(String uuserId) {
		this.uuserId = uuserId;
	}

	public String getVatAmt() {
		return vatAmt;
	}

	public void setVatAmt(String vatAmt) {
		this.vatAmt = vatAmt;
	}

	public String getVatcatCode() {
		return vatcatCode;
	}

	public void setVatcatCode(String vatcatCode) {
		this.vatcatCode = vatcatCode;
	}

	public String getVatValue() {
		return vatValue;
	}

	public void setVatValue(String vatValue) {
		this.vatValue = vatValue;
	}

	public String getVoucherAmt() {
		return voucherAmt;
	}

	public void setVoucherAmt(String voucherAmt) {
		this.voucherAmt = voucherAmt;
	}

	public String getVoucherDate() {
		return voucherDate;
	}

	public void setVoucherDate(String voucherDate) {
		this.voucherDate = voucherDate;
	}

	public String getVoucherDocNo() {
		return voucherDocNo;
	}

	public void setVoucherDocNo(String voucherDocNo) {
		this.voucherDocNo = voucherDocNo;
	}

	public String getAlid() {
		return alid;
	}

	public void setAlid(String alid) {
		this.alid = alid;
	}

	public String getVoucherNo() {
		return voucherNo;
	}

	public void setVoucherNo(String voucherNo) {
		this.voucherNo = voucherNo;
	}

	public String getVoucherStatus() {
		return voucherStatus;
	}

	public void setVoucherStatus(String voucherStatus) {
		this.voucherStatus = voucherStatus;
	}

	public String getVoucherType() {
		return voucherType;
	}

	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}

	public String getVoucherTypeSeq() {
		return voucherTypeSeq;
	}

	public void setVoucherTypeSeq(String voucherTypeSeq) {
		this.voucherTypeSeq = voucherTypeSeq;
	}

	public StringPath getYear() {
		return year;
	}

	public void setYear(StringPath year) {
		this.year = year;
	}

	public String getCOMP_ID() {
		return COMP_ID;
	}

	public void setCOMP_ID(String cOMP_ID) {
		COMP_ID = cOMP_ID;
	}

	public String getSERVS_TYPE() {
		return SERVS_TYPE;
	}

	public void setSERVS_TYPE(String sERVS_TYPE) {
		SERVS_TYPE = sERVS_TYPE;
	}

	public String getVOUCHER_NO() {
		return VOUCHER_NO;
	}

	public void setVOUCHER_NO(String vOUCHER_NO) {
		VOUCHER_NO = vOUCHER_NO;
	}

	public String getAGREEMENT_ID() {
		return AGREEMENT_ID;
	}

	public void setAGREEMENT_ID(String aGREEMENT_ID) {
		AGREEMENT_ID = aGREEMENT_ID;
	}

	public String getCUSTOMER_TYPE() {
		return CUSTOMER_TYPE;
	}

	public void setCUSTOMER_TYPE(String cUSTOMER_TYPE) {
		CUSTOMER_TYPE = cUSTOMER_TYPE;
	}

	public String getDSTRCT_CODE() {
		return DSTRCT_CODE;
	}

	public void setDSTRCT_CODE(String dSTRCT_CODE) {
		DSTRCT_CODE = dSTRCT_CODE;
	}

	public String getLOCAT_CODE() {
		return LOCAT_CODE;
	}

	public void setLOCAT_CODE(String lOCAT_CODE) {
		LOCAT_CODE = lOCAT_CODE;
	}

	public String getROUTE_CODE() {
		return ROUTE_CODE;
	}

	public void setROUTE_CODE(String rOUTE_CODE) {
		ROUTE_CODE = rOUTE_CODE;
	}

	public String getAGREEMENT_SERIAL() {
		return AGREEMENT_SERIAL;
	}

	public void setAGREEMENT_SERIAL(String aGREEMENT_SERIAL) {
		AGREEMENT_SERIAL = aGREEMENT_SERIAL;
	}

	public String getLOCATION_ID() {
		return LOCATION_ID;
	}

	public void setLOCATION_ID(String lOCATION_ID) {
		LOCATION_ID = lOCATION_ID;
	}

	public String getRESORC_CODE() {
		return RESORC_CODE;
	}

	public void setRESORC_CODE(String rESORC_CODE) {
		RESORC_CODE = rESORC_CODE;
	}

	public String getCONSUMPTION_TYPE() {
		return CONSUMPTION_TYPE;
	}

	public void setCONSUMPTION_TYPE(String cONSUMPTION_TYPE) {
		CONSUMPTION_TYPE = cONSUMPTION_TYPE;
	}

	public String getVATCAT_CODE() {
		return VATCAT_CODE;
	}

	public void setVATCAT_CODE(String vATCAT_CODE) {
		VATCAT_CODE = vATCAT_CODE;
	}

	public String getVAT_VALUE() {
		return VAT_VALUE;
	}

	public void setVAT_VALUE(String vAT_VALUE) {
		VAT_VALUE = vAT_VALUE;
	}

	public String getCLASS_CODE() {
		return CLASS_CODE;
	}

	public void setCLASS_CODE(String cLASS_CODE) {
		CLASS_CODE = cLASS_CODE;
	}

	public String getCURRENCY_ID() {
		return CURRENCY_ID;
	}

	public void setCURRENCY_ID(String cURRENCY_ID) {
		CURRENCY_ID = cURRENCY_ID;
	}

	public String getVOUCHER_DOC_NO() {
		return VOUCHER_DOC_NO;
	}

	public void setVOUCHER_DOC_NO(String vOUCHER_DOC_NO) {
		VOUCHER_DOC_NO = vOUCHER_DOC_NO;
	}

	public String getIMMOVABLE_TYPE() {
		return IMMOVABLE_TYPE;
	}

	public void setIMMOVABLE_TYPE(String iMMOVABLE_TYPE) {
		IMMOVABLE_TYPE = iMMOVABLE_TYPE;
	}

	public String getUSAGE_TYPE() {
		return USAGE_TYPE;
	}

	public void setUSAGE_TYPE(String uSAGE_TYPE) {
		USAGE_TYPE = uSAGE_TYPE;
	}

	public Date getVOUCHER_TYPE() {
		return VOUCHER_TYPE;
	}

	public void setVOUCHER_TYPE(Date vOUCHER_TYPE) {
		VOUCHER_TYPE = vOUCHER_TYPE;
	}

	public Date getVOUCHER_DATE() {
		return VOUCHER_DATE;
	}

	public void setVOUCHER_DATE(Date vOUCHER_DATE) {
		VOUCHER_DATE = vOUCHER_DATE;
	}

	public Date getLAST_DUE_DATE() {
		return LAST_DUE_DATE;
	}

	public void setLAST_DUE_DATE(Date lAST_DUE_DATE) {
		LAST_DUE_DATE = lAST_DUE_DATE;
	}

	public Date getPAYMENT_DATE() {
		return PAYMENT_DATE;
	}

	public void setPAYMENT_DATE(Date pAYMENT_DATE) {
		PAYMENT_DATE = pAYMENT_DATE;
	}

	public String getVOUCHER_STATUS() {
		return VOUCHER_STATUS;
	}

	public void setVOUCHER_STATUS(String vOUCHER_STATUS) {
		VOUCHER_STATUS = vOUCHER_STATUS;
	}

	public String getIS_POSTED() {
		return IS_POSTED;
	}

	public void setIS_POSTED(String iS_POSTED) {
		IS_POSTED = iS_POSTED;
	}

	public String getIS_PRINTED() {
		return IS_PRINTED;
	}

	public void setIS_PRINTED(String iS_PRINTED) {
		IS_PRINTED = iS_PRINTED;
	}

	public String getREF_TYPE() {
		return REF_TYPE;
	}

	public void setREF_TYPE(String rEF_TYPE) {
		REF_TYPE = rEF_TYPE;
	}

	public String getREF_NO() {
		return REF_NO;
	}

	public void setREF_NO(String rEF_NO) {
		REF_NO = rEF_NO;
	}

	public String getCONSUMPTION_QTY() {
		return CONSUMPTION_QTY;
	}

	public void setCONSUMPTION_QTY(String cONSUMPTION_QTY) {
		CONSUMPTION_QTY = cONSUMPTION_QTY;
	}

	public String getCONSUMPTION_AMT() {
		return CONSUMPTION_AMT;
	}

	public void setCONSUMPTION_AMT(String cONSUMPTION_AMT) {
		CONSUMPTION_AMT = cONSUMPTION_AMT;
	}

	public String getKVR_AMT() {
		return KVR_AMT;
	}

	public void setKVR_AMT(String kVR_AMT) {
		KVR_AMT = kVR_AMT;
	}

	public String getLOWER_LIMIT_AMT() {
		return LOWER_LIMIT_AMT;
	}

	public void setLOWER_LIMIT_AMT(String lOWER_LIMIT_AMT) {
		LOWER_LIMIT_AMT = lOWER_LIMIT_AMT;
	}

	public String getCONSTANT_AMT() {
		return CONSTANT_AMT;
	}

	public void setCONSTANT_AMT(String cONSTANT_AMT) {
		CONSTANT_AMT = cONSTANT_AMT;
	}

	public String getPERIODICAL_AMT() {
		return PERIODICAL_AMT;
	}

	public void setPERIODICAL_AMT(String pERIODICAL_AMT) {
		PERIODICAL_AMT = pERIODICAL_AMT;
	}

	public String getLATE_AMT() {
		return LATE_AMT;
	}

	public void setLATE_AMT(String lATE_AMT) {
		LATE_AMT = lATE_AMT;
	}

	public String getLATE_FEES_AMT() {
		return LATE_FEES_AMT;
	}

	public void setLATE_FEES_AMT(String lATE_FEES_AMT) {
		LATE_FEES_AMT = lATE_FEES_AMT;
	}

	public String getMISCELLANY_AMT() {
		return MISCELLANY_AMT;
	}

	public void setMISCELLANY_AMT(String mISCELLANY_AMT) {
		MISCELLANY_AMT = mISCELLANY_AMT;
	}

	public String getEXTRA_AMT() {
		return EXTRA_AMT;
	}

	public void setEXTRA_AMT(String eXTRA_AMT) {
		EXTRA_AMT = eXTRA_AMT;
	}

	public String getDEDUCTION_AMT() {
		return DEDUCTION_AMT;
	}

	public void setDEDUCTION_AMT(String dEDUCTION_AMT) {
		DEDUCTION_AMT = dEDUCTION_AMT;
	}

	public String getEXEMPTION_AMT() {
		return EXEMPTION_AMT;
	}

	public void setEXEMPTION_AMT(String eXEMPTION_AMT) {
		EXEMPTION_AMT = eXEMPTION_AMT;
	}

	public String getPREVIOUS_AMT() {
		return PREVIOUS_AMT;
	}

	public void setPREVIOUS_AMT(String pREVIOUS_AMT) {
		PREVIOUS_AMT = pREVIOUS_AMT;
	}

	public String getROUND_AMT() {
		return ROUND_AMT;
	}

	public void setROUND_AMT(String rOUND_AMT) {
		ROUND_AMT = rOUND_AMT;
	}

	public String getVAT_AMT() {
		return VAT_AMT;
	}

	public void setVAT_AMT(String vAT_AMT) {
		VAT_AMT = vAT_AMT;
	}

	public String getALLOW_AMT() {
		return ALLOW_AMT;
	}

	public void setALLOW_AMT(String aLLOW_AMT) {
		ALLOW_AMT = aLLOW_AMT;
	}

	public String getVOUCHER_AMT() {
		return VOUCHER_AMT;
	}

	public void setVOUCHER_AMT(String vOUCHER_AMT) {
		VOUCHER_AMT = vOUCHER_AMT;
	}

	public String getNET_AMT() {
		return NET_AMT;
	}

	public void setNET_AMT(String nET_AMT) {
		NET_AMT = nET_AMT;
	}

	public String getPAID_AMT() {
		return PAID_AMT;
	}

	public void setPAID_AMT(String pAID_AMT) {
		PAID_AMT = pAID_AMT;
	}

	public String getCREDIT_QTY() {
		return CREDIT_QTY;
	}

	public void setCREDIT_QTY(String cREDIT_QTY) {
		CREDIT_QTY = cREDIT_QTY;
	}

	public String getCREDIT_AMT() {
		return CREDIT_AMT;
	}

	public void setCREDIT_AMT(String cREDIT_AMT) {
		CREDIT_AMT = cREDIT_AMT;
	}

	public String getCRATE_TYPE_CODE() {
		return CRATE_TYPE_CODE;
	}

	public void setCRATE_TYPE_CODE(String cRATE_TYPE_CODE) {
		CRATE_TYPE_CODE = cRATE_TYPE_CODE;
	}

	public String getCRATE_AMT() {
		return CRATE_AMT;
	}

	public void setCRATE_AMT(String cRATE_AMT) {
		CRATE_AMT = cRATE_AMT;
	}

	public String getBASE_AMT() {
		return BASE_AMT;
	}

	public void setBASE_AMT(String bASE_AMT) {
		BASE_AMT = bASE_AMT;
	}

	public Date getCRATE_DATE() {
		return CRATE_DATE;
	}

	public void setCRATE_DATE(Date cRATE_DATE) {
		CRATE_DATE = cRATE_DATE;
	}

	public String getGL_CRATE_TYPE_CODE() {
		return GL_CRATE_TYPE_CODE;
	}

	public void setGL_CRATE_TYPE_CODE(String gL_CRATE_TYPE_CODE) {
		GL_CRATE_TYPE_CODE = gL_CRATE_TYPE_CODE;
	}

	public String getGL_CRATE_AMT() {
		return GL_CRATE_AMT;
	}

	public void setGL_CRATE_AMT(String gL_CRATE_AMT) {
		GL_CRATE_AMT = gL_CRATE_AMT;
	}

	public Date getGL_CRATE_DATE() {
		return GL_CRATE_DATE;
	}

	public void setGL_CRATE_DATE(Date gL_CRATE_DATE) {
		GL_CRATE_DATE = gL_CRATE_DATE;
	}

	public String getGL_BASE_AMT() {
		return GL_BASE_AMT;
	}

	public void setGL_BASE_AMT(String gL_BASE_AMT) {
		GL_BASE_AMT = gL_BASE_AMT;
	}

	public String getGL_POSTED() {
		return GL_POSTED;
	}

	public void setGL_POSTED(String gL_POSTED) {
		GL_POSTED = gL_POSTED;
	}

	public Date getGL_POSTED_DATE() {
		return GL_POSTED_DATE;
	}

	public void setGL_POSTED_DATE(Date gL_POSTED_DATE) {
		GL_POSTED_DATE = gL_POSTED_DATE;
	}

	public String getGL_TRANS_NO() {
		return GL_TRANS_NO;
	}

	public void setGL_TRANS_NO(String gL_TRANS_NO) {
		GL_TRANS_NO = gL_TRANS_NO;
	}

	public String getGL_POSTED_USER() {
		return GL_POSTED_USER;
	}

	public void setGL_POSTED_USER(String gL_POSTED_USER) {
		GL_POSTED_USER = gL_POSTED_USER;
	}

	public String getNO_OF_UNITS() {
		return NO_OF_UNITS;
	}

	public void setNO_OF_UNITS(String nO_OF_UNITS) {
		NO_OF_UNITS = nO_OF_UNITS;
	}

	public String getITIME_STAMP() {
		return ITIME_STAMP;
	}

	public void setITIME_STAMP(String iTIME_STAMP) {
		ITIME_STAMP = iTIME_STAMP;
	}

	public String getIUSER_ID() {
		return IUSER_ID;
	}

	public void setIUSER_ID(String iUSER_ID) {
		IUSER_ID = iUSER_ID;
	}

	public Date getUTIME_STAMP() {
		return UTIME_STAMP;
	}

	public void setUTIME_STAMP(Date uTIME_STAMP) {
		UTIME_STAMP = uTIME_STAMP;
	}

	public String getUUSER_ID() {
		return UUSER_ID;
	}

	public void setUUSER_ID(String uUSER_ID) {
		UUSER_ID = uUSER_ID;
	}

	public Timestamp getDTIME_STAMP() {
		return DTIME_STAMP;
	}

	public void setDTIME_STAMP(Timestamp dTIME_STAMP) {
		DTIME_STAMP = dTIME_STAMP;
	}

	public String getDUSER_ID() {
		return DUSER_ID;
	}

	public void setDUSER_ID(String dUSER_ID) {
		DUSER_ID = dUSER_ID;
	}

	public String getVOUCHER_ISVALID() {
		return VOUCHER_ISVALID;
	}

	public void setVOUCHER_ISVALID(String vOUCHER_ISVALID) {
		VOUCHER_ISVALID = vOUCHER_ISVALID;
	}

	public String getREMAIN_AMT() {
		return REMAIN_AMT;
	}

	public void setREMAIN_AMT(String rEMAIN_AMT) {
		REMAIN_AMT = rEMAIN_AMT;
	}

	public Date getLAST_FEE_DATE() {
		return LAST_FEE_DATE;
	}

	public void setLAST_FEE_DATE(Date lAST_FEE_DATE) {
		LAST_FEE_DATE = lAST_FEE_DATE;
	}

	public Date getOLD_FEE_DATE() {
		return OLD_FEE_DATE;
	}

	public void setOLD_FEE_DATE(Date oLD_FEE_DATE) {
		OLD_FEE_DATE = oLD_FEE_DATE;
	}

	public String getFEES_VOUCHER_NO() {
		return FEES_VOUCHER_NO;
	}

	public void setFEES_VOUCHER_NO(String fEES_VOUCHER_NO) {
		FEES_VOUCHER_NO = fEES_VOUCHER_NO;
	}

	public String getPREVIOUS_BASE_AMT() {
		return PREVIOUS_BASE_AMT;
	}

	public void setPREVIOUS_BASE_AMT(String pREVIOUS_BASE_AMT) {
		PREVIOUS_BASE_AMT = pREVIOUS_BASE_AMT;
	}

	public String getSYSTEM_VOUCHER_NO() {
		return SYSTEM_VOUCHER_NO;
	}

	public void setSYSTEM_VOUCHER_NO(String sYSTEM_VOUCHER_NO) {
		SYSTEM_VOUCHER_NO = sYSTEM_VOUCHER_NO;
	}

	public String getCYCLE_SERIAL() {
		return CYCLE_SERIAL;
	}

	public void setCYCLE_SERIAL(String cYCLE_SERIAL) {
		CYCLE_SERIAL = cYCLE_SERIAL;
	}

	public String getORIGINAL_PRINT_NO() {
		return ORIGINAL_PRINT_NO;
	}

	public void setORIGINAL_PRINT_NO(String oRIGINAL_PRINT_NO) {
		ORIGINAL_PRINT_NO = oRIGINAL_PRINT_NO;
	}

	public Date getCALC_DATE() {
		return CALC_DATE;
	}

	public void setCALC_DATE(Date cALC_DATE) {
		CALC_DATE = cALC_DATE;
	}

	public String getVOUCHER_TYPE_SEQ() {
		return VOUCHER_TYPE_SEQ;
	}

	public void setVOUCHER_TYPE_SEQ(String vOUCHER_TYPE_SEQ) {
		VOUCHER_TYPE_SEQ = vOUCHER_TYPE_SEQ;
	}

	public String getFEE_AMT() {
		return FEE_AMT;
	}

	public void setFEE_AMT(String fEE_AMT) {
		FEE_AMT = fEE_AMT;
	}

	public String getMAINTENANCE_AMT() {
		return MAINTENANCE_AMT;
	}

	public void setMAINTENANCE_AMT(String mAINTENANCE_AMT) {
		MAINTENANCE_AMT = mAINTENANCE_AMT;
	}

	public String getMETER_FEES() {
		return METER_FEES;
	}

	public void setMETER_FEES(String mETER_FEES) {
		METER_FEES = mETER_FEES;
	}

	public String getOWNER_SYSTEM_NO() {
		return OWNER_SYSTEM_NO;
	}

	public void setOWNER_SYSTEM_NO(String oWNER_SYSTEM_NO) {
		OWNER_SYSTEM_NO = oWNER_SYSTEM_NO;
	}

	public String getBEN_SYSTEM_NO() {
		return BEN_SYSTEM_NO;
	}

	public void setBEN_SYSTEM_NO(String bEN_SYSTEM_NO) {
		BEN_SYSTEM_NO = bEN_SYSTEM_NO;
	}

	public String getSEWAGE_AMT() {
		return SEWAGE_AMT;
	}

	public void setSEWAGE_AMT(String sEWAGE_AMT) {
		SEWAGE_AMT = sEWAGE_AMT;
	}

	public String getDEBTS_AMT() {
		return DEBTS_AMT;
	}

	public void setDEBTS_AMT(String dEBTS_AMT) {
		DEBTS_AMT = dEBTS_AMT;
	}

	public String getYEAR() {
		return YEAR;
	}

	public void setYEAR(String yEAR) {
		YEAR = yEAR;
	}

	public String getPRINT_COUNT() {
		return PRINT_COUNT;
	}

	public void setPRINT_COUNT(String pRINT_COUNT) {
		PRINT_COUNT = pRINT_COUNT;
	}

	public String getREADING_ROUTE() {
		return READING_ROUTE;
	}

	public void setREADING_ROUTE(String rEADING_ROUTE) {
		READING_ROUTE = rEADING_ROUTE;
	}

	public String getDISTRIBUTION_ROUTE() {
		return DISTRIBUTION_ROUTE;
	}

	public void setDISTRIBUTION_ROUTE(String dISTRIBUTION_ROUTE) {
		DISTRIBUTION_ROUTE = dISTRIBUTION_ROUTE;
	}

	public String getDIST_AREA_CODE() {
		return DIST_AREA_CODE;
	}

	public void setDIST_AREA_CODE(String dIST_AREA_CODE) {
		DIST_AREA_CODE = dIST_AREA_CODE;
	}

	public String getREAD_AREA_CODE() {
		return READ_AREA_CODE;
	}

	public void setREAD_AREA_CODE(String rEAD_AREA_CODE) {
		READ_AREA_CODE = rEAD_AREA_CODE;
	}

	public String getDISTRIBUTION_DAY() {
		return DISTRIBUTION_DAY;
	}

	public void setDISTRIBUTION_DAY(String dISTRIBUTION_DAY) {
		DISTRIBUTION_DAY = dISTRIBUTION_DAY;
	}

	public String getREADING_DAY() {
		return READING_DAY;
	}

	public void setREADING_DAY(String rEADING_DAY) {
		READING_DAY = rEADING_DAY;
	}

	public String getIS_OLD_DEBT() {
		return IS_OLD_DEBT;
	}

	public void setIS_OLD_DEBT(String iS_OLD_DEBT) {
		IS_OLD_DEBT = iS_OLD_DEBT;
	}

	public String getOLD_DEBT_AMT() {
		return OLD_DEBT_AMT;
	}

	public void setOLD_DEBT_AMT(String oLD_DEBT_AMT) {
		OLD_DEBT_AMT = oLD_DEBT_AMT;
	}

	public String getOLD_DEBT_PAID() {
		return OLD_DEBT_PAID;
	}

	public void setOLD_DEBT_PAID(String oLD_DEBT_PAID) {
		OLD_DEBT_PAID = oLD_DEBT_PAID;
	}

	public String getDEBT_TYPE() {
		return DEBT_TYPE;
	}

	public void setDEBT_TYPE(String dEBT_TYPE) {
		DEBT_TYPE = dEBT_TYPE;
	}

	public String getFEE_CODE() {
		return FEE_CODE;
	}

	public void setFEE_CODE(String fEE_CODE) {
		FEE_CODE = fEE_CODE;
	}

	public String getPREV_DISCOUNT_AMT() {
		return PREV_DISCOUNT_AMT;
	}

	public void setPREV_DISCOUNT_AMT(String pREV_DISCOUNT_AMT) {
		PREV_DISCOUNT_AMT = pREV_DISCOUNT_AMT;
	}

	public String getPREV_DISC_CHECK_DONE() {
		return PREV_DISC_CHECK_DONE;
	}

	public void setPREV_DISC_CHECK_DONE(String pREV_DISC_CHECK_DONE) {
		PREV_DISC_CHECK_DONE = pREV_DISC_CHECK_DONE;
	}

	public String getPREV_TOLERANCE_AMT() {
		return PREV_TOLERANCE_AMT;
	}

	public void setPREV_TOLERANCE_AMT(String pREV_TOLERANCE_AMT) {
		PREV_TOLERANCE_AMT = pREV_TOLERANCE_AMT;
	}

	public String getMAN_VOUCHER_MASTER() {
		return MAN_VOUCHER_MASTER;
	}

	public void setMAN_VOUCHER_MASTER(String mAN_VOUCHER_MASTER) {
		MAN_VOUCHER_MASTER = mAN_VOUCHER_MASTER;
	}

	public String getPREV_DISCOUNT_PREV_AMT() {
		return PREV_DISCOUNT_PREV_AMT;
	}

	public void setPREV_DISCOUNT_PREV_AMT(String pREV_DISCOUNT_PREV_AMT) {
		PREV_DISCOUNT_PREV_AMT = pREV_DISCOUNT_PREV_AMT;
	}

	public String getPREV_PAID_AMT() {
		return PREV_PAID_AMT;
	}

	public void setPREV_PAID_AMT(String pREV_PAID_AMT) {
		PREV_PAID_AMT = pREV_PAID_AMT;
	}

	public String getOLD_VOUCHER_NO() {
		return OLD_VOUCHER_NO;
	}

	public void setOLD_VOUCHER_NO(String oLD_VOUCHER_NO) {
		OLD_VOUCHER_NO = oLD_VOUCHER_NO;
	}

	public String getOLD_NOTES() {
		return OLD_NOTES;
	}

	public void setOLD_NOTES(String oLD_NOTES) {
		OLD_NOTES = oLD_NOTES;
	}

	public String getOLD_VOUCHER_DATE() {
		return OLD_VOUCHER_DATE;
	}

	public void setOLD_VOUCHER_DATE(String oLD_VOUCHER_DATE) {
		OLD_VOUCHER_DATE = oLD_VOUCHER_DATE;
	}

	public String getIS_UPDATED() {
		return IS_UPDATED;
	}

	public void setIS_UPDATED(String iS_UPDATED) {
		IS_UPDATED = iS_UPDATED;
	}

	public String getBRANCH_ID() {
		return BRANCH_ID;
	}

	public void setBRANCH_ID(String bRANCH_ID) {
		BRANCH_ID = bRANCH_ID;
	}

	public String getSBRANCH_ID() {
		return SBRANCH_ID;
	}

	public void setSBRANCH_ID(String sBRANCH_ID) {
		SBRANCH_ID = sBRANCH_ID;
	}

	public String getAREA_ID() {
		return AREA_ID;
	}

	public void setAREA_ID(String aREA_ID) {
		AREA_ID = aREA_ID;
	}

	public String getFIXED_AMT() {
		return FIXED_AMT;
	}

	public void setFIXED_AMT(String fIXED_AMT) {
		FIXED_AMT = fIXED_AMT;
	}

	public String getNEW_LATE_AMT() {
		return NEW_LATE_AMT;
	}

	public void setNEW_LATE_AMT(String nEW_LATE_AMT) {
		NEW_LATE_AMT = nEW_LATE_AMT;
	}

	public String getPAID_ON_LATE_AMT() {
		return PAID_ON_LATE_AMT;
	}

	public void setPAID_ON_LATE_AMT(String pAID_ON_LATE_AMT) {
		PAID_ON_LATE_AMT = pAID_ON_LATE_AMT;
	}

	public String getPAID_ON_LATE_PRC() {
		return PAID_ON_LATE_PRC;
	}

	public void setPAID_ON_LATE_PRC(String pAID_ON_LATE_PRC) {
		PAID_ON_LATE_PRC = pAID_ON_LATE_PRC;
	}

	public String getREMAIN_NOT_PAID() {
		return REMAIN_NOT_PAID;
	}

	public void setREMAIN_NOT_PAID(String rEMAIN_NOT_PAID) {
		REMAIN_NOT_PAID = rEMAIN_NOT_PAID;
	}

	public String getOLD_NET_AMT() {
		return OLD_NET_AMT;
	}

	public void setOLD_NET_AMT(String oLD_NET_AMT) {
		OLD_NET_AMT = oLD_NET_AMT;
	}

	public String getCOMBIN_CODE_DB() {
		return COMBIN_CODE_DB;
	}

	public void setCOMBIN_CODE_DB(String cOMBIN_CODE_DB) {
		COMBIN_CODE_DB = cOMBIN_CODE_DB;
	}

	public String getCOMBIN_CODE_CR() {
		return COMBIN_CODE_CR;
	}

	public void setCOMBIN_CODE_CR(String cOMBIN_CODE_CR) {
		COMBIN_CODE_CR = cOMBIN_CODE_CR;
	}

	public Date getPRINT_DATE() {
		return PRINT_DATE;
	}

	public void setPRINT_DATE(Date pRINT_DATE) {
		PRINT_DATE = pRINT_DATE;
	}

	public String getBillCode() {
		return billCode;
	}

	public void setBillCode(String billCode) {
		this.billCode = billCode;
	}

	public String getBillName() {
		return billName;
	}

	public void setBillName(String billName) {
		this.billName = billName;
	}

	public String getBillerName() {
		return billerName;
	}

	public void setBillerName(String billerName) {
		this.billerName = billerName;
	}

	public String getBillerCode() {
		return billerCode;
	}

	public void setBillerCode(String billerCode) {
		this.billerCode = billerCode;
	}

	public String getBillerAddress() {
		return billerAddress;
	}

	public void setBillerAddress(String billerAddress) {
		this.billerAddress = billerAddress;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getOnServiceBy() {
		return onServiceBy;
	}

	public void setOnServiceBy(String onServiceBy) {
		this.onServiceBy = onServiceBy;
	}

	public String getBankId() {
		return bankId;
	}

	public void setBankId(String bankId) {
		this.bankId = bankId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankAddress() {
		return bankAddress;
	}

	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}



}
