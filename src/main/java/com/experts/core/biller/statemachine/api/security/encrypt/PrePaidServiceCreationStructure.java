package com.experts.core.biller.statemachine.api.security.encrypt;

import com.experts.core.biller.statemachine.api.soapService.PaymentNotificationResponse;
import com.experts.core.biller.statemachine.api.soapService.PrePaidServiceResponse;
import generated.biller.experts.api.wsdl.notifications.PaymentNotificationDTO;
import generated.biller.experts.api.wsdl.prepaid.PrePaidPaymentDTO;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.*;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@Component("prePaidServiceCreationStructure")
@NoArgsConstructor
public class PrePaidServiceCreationStructure {

    String message  = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:prepaid=\"http://localhost:3070/ws/prepaid\">" + "\n" +"<prepaid:MFEP>"+"\n";
    private String headerStr = "<soapenv:MsgHeader>\n";
    private String headerEnd = "</soapenv:MsgHeader>\n";
    private String bodyStr = "<soapenv:MsgBody>\n";
    private String bodyEnd = "</soapenv:MsgBody>\n";
    private String footerStr = "</soapenv:MsgFooter>\n";
    private String footerEnd = "</soapenv:MsgFooter>\n";

    private static final String keystoreFile = "biller_core_keystore.jks";

    private static final String keyStorePassword = "opc@2018";
    private static final String alias = "mykey";

    @Autowired
    private SOAPSecurityHandler soapSecurityHandler;

    @Autowired
    private MacAddressValidatorHandler macAddressValidatorHandler;

    @Autowired
    private GenerateKeysService generateKeysService;

    @Autowired
    private AsymmetricCryptographyService asymmetricCryptographyService;


    private String TrxInf;
    private String AcctInfo;
    private String BillingNo;
    private String BillerCode;
    private String BankTrxID;
    private String ValidationCode;
    private String PmtStatus;
    private String DueAmt;
    private String PaidAmt;
    private String ProcessDate;
    private String Currency;
    private String STMTDate;
    private String JOEBPPSTrx;
    private String Result;
    private String ErrorCode;
    private String ErrorDesc;
    private String Severity;
    private StringBuffer builder;
    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

    public String init(PrePaidPaymentDTO dto) throws NoSuchAlgorithmException,CertificateException, UnsupportedEncodingException,KeyStoreException,  NoSuchAlgorithmException , NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, UnrecoverableKeyException, InvalidKeySpecException, IOException, InvalidKeyException, SignatureException , Exception{

        if (dto != null && dto.getArr() != null) {
            PrePaidServiceResponse res = dto.getArr().get(0);




        }
        return toDTO();
    }

    public String toDTO() throws NoSuchAlgorithmException ,CertificateException, UnsupportedEncodingException,KeyStoreException,  NoSuchAlgorithmException , NoSuchPaddingException, InvalidKeyException , IllegalBlockSizeException, BadPaddingException, UnrecoverableKeyException , InvalidKeySpecException , IOException , InvalidKeyException, SignatureException , Exception{

        String sign =  soapSecurityHandler.sign();
        String headerClose = "";
        builder = new StringBuffer();
        builder.append(message + "\n" +headerStr  + "<prepaid:TmStp>" + format.format(new Date()) + "</prepaid:TmStp>"
                + "\n"
                + "<prepaid:Guid>" + UUID.randomUUID() + "</prepaid:Guid>"
                + "\n"
                + "<prepaid:TrsInf>"
                + "\n"
                + "<prepaid:SdrCode>"+ "3" + "</prepaid:SdrCode>"
                + "\n"
                + "<prepaid:ResType>" + "BILPULRS" +" </prepaid:ResType> "
                + "\n"
                + "</prepaid:TrsInf>"
                + "\n"
                + "<prepaid:Result>"
                + "\n"
                + "<prepaid:ErrorCode>" + "0" + "</prepaid:ErrorCode>"
                + "\n"
                + "<prepaid:ErrorDesc>" +"Success"+"</prepaid:ErrorDesc> "
                + "\n"
                + "<prepaid:Severity>"+"Info"+"</prepaid:Severity>"
                + "\n"
                + "</prepaid:Result>"
                + "\n"
                + "</soapenv:MsgHeader>"
                + "\n"
                + "<soapenv:MsgBody>"
                + "\n"
                + "<prepaid:Result>"
                + "\n"
                + "<prepaid:ErrorCode>" + "0" + "</prepaid:ErrorCode>"
                + "\n"
                + "<prepaid:ErrorDesc>" +"Success"+"</prepaid:ErrorDesc> "
                + "\n"
                + "<prepaid:Severity>"+"Info"+"</prepaid:Severity>"
                + "\n"
                + "</prepaid:Result>"
                + "\n"
                + "<prepaid:AcctInfo>"
                + "\n"
                + "<prepaid:BillingNo>BillNo2</prepaid:BillingNo>"
                + "\n"
                + "<prepaid:BillerCode>167</prepaid:BillerCode>"
                + "\n"
                + "</prepaid:AcctInfo>"
                + "\n"
                + "<prepaid:DueAmt>71.2</prepaid:DueAmt>"
                + "\n"
                + "<prepaid:FeesAmt>0.2</prepaid:FeesAmt>"
                + "\n"
                + "<prepaid:Currency>EUR</prepaid:Currency>"
                + "\n"
                + "<prepaid:ValidationCode>157997</prepaid:ValidationCode>"
                + "\n"
                + "<prepaid:ServiceTypeDetails>"
                + "\n"
                + "<prepaid:ServiceType>Advance_Payment</prepaid:ServiceType>"
                + "\n"
                + "<prepaid:PrepaidCat>SMART_1JD</prepaid:PrepaidCat>"
                + "\n"
                + "</prepaid:ServiceTypeDetails>"
                + "\n"
                + "</soapenv:MsgBody>"
                + "\n" +
                "</prepaid:MFEP>"+"\n"+"</soapenv:Envelope>");


        String code = GenerateAndVerifySignature.generateSignature(builder.toString());
        StringBuffer next = new StringBuffer();


        next.append(message + "\n" +headerStr  + "<prepaid:TmStp>" + format.format(new Date()) + "</prepaid:TmStp>"
                + "\n"
                + "<prepaid:Guid>" + UUID.randomUUID() + "</prepaid:Guid>"
                + "\n"
                + "<prepaid:TrsInf>"
                + "\n"
                + "<prepaid:SdrCode>"+ "3" + "</prepaid:SdrCode>"
                + "\n"
                + "<prepaid:ResType>" + "BILPULRS" +" </prepaid:ResType> "
                + "\n"
                + "</prepaid:TrsInf>"
                + "\n"
                + "<prepaid:Result>"
                + "\n"
                + "<prepaid:ErrorCode>" + "0" + "</prepaid:ErrorCode>"
                + "\n"
                + "<prepaid:ErrorDesc>" +"Success"+"</prepaid:ErrorDesc> "
                + "\n"
                + "<prepaid:Severity>"+"Info"+"</prepaid:Severity>"
                + "\n"
                + "</prepaid:Result>"
                + "\n"
                + "</soapenv:MsgHeader>"
                + "\n"
                + "<soapenv:MsgBody>"
                + "\n"
                + "<prepaid:Result>"
                + "\n"
                + "<prepaid:ErrorCode>" + "0" + "</prepaid:ErrorCode>"
                + "\n"
                + "<prepaid:ErrorDesc>" +"Success"+"</prepaid:ErrorDesc> "
                + "\n"
                + "<prepaid:Severity>"+"Info"+"</prepaid:Severity>"
                + "\n"
                + "</prepaid:Result>"
                + "\n"
                + "<prepaid:AcctInfo>"
                + "\n"
                + "<prepaid:BillingNo>BillNo2</prepaid:BillingNo>"
                + "\n"
                + "<prepaid:BillerCode>167</prepaid:BillerCode>"
                + "\n"
                + "</prepaid:AcctInfo>"
                + "\n"
                + "<prepaid:DueAmt>71.2</prepaid:DueAmt>"
                + "\n"
                + "<prepaid:FeesAmt>0.2</prepaid:FeesAmt>"
                + "\n"
                + "<prepaid:Currency>EUR</prepaid:Currency>"
                + "\n"
                + "<prepaid:ValidationCode>157997</prepaid:ValidationCode>"
                + "\n"
                + "<prepaid:ServiceTypeDetails>"
                + "\n"
                + "<prepaid:ServiceType>Advance_Payment</prepaid:ServiceType>"
                + "\n"
                + "<prepaid:PrepaidCat>SMART_1JD</prepaid:PrepaidCat>"
                + "\n"
                + "</prepaid:ServiceTypeDetails>"
                + "\n"
                + "</soapenv:MsgBody>"
                + "\n" +
                "<soapenv:MsgFooter>"
                + "\n"
                + "<prepaid:Security>"
                + "\n"
                +"<prepaid:Signature>"
                + "\n"
                + code
                + "\n"
                +"<prepaid:Signature>"
                + "\n"
                + "</prepaid:Security>"
                + "\n"
                + "</soapenv:MsgFooter>"   + "</prepaid:MFEP>"+"\n"+"</soapenv:Envelope>");
        // String footer = message  + "<soapenv:MsgFooter>" +"\n"+"</soapenv:MsgFooter>" + "\n" + "</bil:MFEP>"+"\n"+"</soapenv:Envelope>";


         /*String xml = message+"\n"+"<soapenv:MsgFooter>"
                + "\n"
                + "<bil:Security>"
                + "\n"
                + "<bil:Signature>" + macAddressValidatorHandler.sigin(footer) + "</bil:Signature>"
                + "\n"
                + "</bil:Security>"
                + "\n"
                + "</soapenv:MsgFooter>"
                + "\n"
                + "</bil:MFEP>";*/


        // String xml =  macAddressValidatorHandler.sigin(message);

        return  next.toString();
    }


}
