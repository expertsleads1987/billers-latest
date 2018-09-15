package com.experts.core.biller.statemachine.api.security.encrypt;


import com.experts.core.biller.statemachine.api.soapService.PaymentNotificationResponse;
import generated.biller.experts.api.wsdl.notifications.PaymentNotificationDTO;
import generated.biller.experts.api.wsdl.pull.BillPullResponseDTO;
import generated.biller.experts.api.wsdl.pull.BillPullServiceResponse;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.xml.bind.annotation.XmlElement;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.*;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@Component("paymentNotificationCreationStructure")
@NoArgsConstructor
public class PaymentNotificationCreationStructure {

    private String message = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:not=\"http://localhost:3070/ws/notifaction\">" + "\n" +"<not:MFEP>"+"\n";
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


    /*private String transactions;
    private String trxInf;
    private String acctInfo;
    private String billNo;
    private String billingNo;
    private String billerCode;
    private String JOEBPPSTrx;
    private String BankTrxID;
    private String billStatus;
    private String PmtSrc;
    private String BankCode;
    private String PmtStatus;
    private String DueAmt;
    private String PaidAmt;
    private String FeesAmt;
    private String FeesOnBiller;
    private String ProcessDate;
    private String STMTDate;
    private String AccessChannel;
    private String PaymentMethod;
    private String ServiceType;
    private String SubPmts;
    private String subPmt;
    private String Amount;
    private String SetBnkCode;
    private String PayerInfo;
    private String IdType;
    private String Id;
    private String Nation;
    private String Name;
    private String Phone;
    private String Address;
    private String Email;
    private String JOEBPPSNo;*/

    private String Transactions;
    private String TrxInf;
    private String JOEBPPSTrx;
    private String STMTDate;
    private String Result;
    private String idType;
    private String ErrorCode;
    private String Severity;
    private StringBuffer builderNot;

    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

    @Autowired
    private GenerateKeysService generateKeysService;

    @Autowired
    private AsymmetricCryptographyService asymmetricCryptographyService;

    public String init(PaymentNotificationDTO dto) throws NoSuchAlgorithmException,CertificateException, UnsupportedEncodingException,KeyStoreException,  NoSuchAlgorithmException , NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, UnrecoverableKeyException, InvalidKeySpecException, IOException, InvalidKeyException, SignatureException , Exception{

        if (dto != null && dto.getArr() != null) {
            PaymentNotificationResponse res = dto.getArr().get(0);
        }
        return toDTO();
    }

    public String toDTO() throws NoSuchAlgorithmException ,CertificateException, UnsupportedEncodingException,KeyStoreException,  NoSuchAlgorithmException , NoSuchPaddingException, InvalidKeyException , IllegalBlockSizeException, BadPaddingException, UnrecoverableKeyException , InvalidKeySpecException , IOException , InvalidKeyException, SignatureException , Exception{

        String sign =  soapSecurityHandler.sign();
        String headerClose = "";
        builderNot = new StringBuffer();
        builderNot.append(message += headerStr + "\n" +

                "<not:TmStp>2013-12-25112:55:00</not:TmStp>"+ "\n" +
                "<not:GUID>15c72631-60d1-4686-b552-9517ff0335d5</not:GUID>" + "\n" +
                "<not:TrsInf>" + "\n" +
                "<not:SdrCode>9</not:SdrCode>"+ "\n" +
                "<not:ResTyp>BNKPMTNTFRS</not:ResTyp>"+ "\n" +
                "</not:TrsInf>" + "\n" +
                "<not:Result>" + "\n" +
                "<not:ErrorCode>0</not:ErrorCode>"  + "\n" +
                "<not:ErrorDesc>Success</not:ErrorDesc>"  + "\n" +
                "<not:Severity>Info</not:Severity>"  + "\n" +
                "</not:Result>" + "\n" +
                "</not:MsgHeader>" + "\n" +
                "<not:MsgBody>" + "\n" +
                "<not:Transactions>" + "\n" +
                "<not:TrxInf>" + "\n" +
                "<not:JOEBPPSTrx>1509</not:JOEBPPSTrx>" + "\n" +
                "<not:ProcessDate>2013-12-25T12:53:00</not:ProcessDate>" + "\n" +
                "<not:STMTDate>2013-12-25</not:STMTDate>"  + "\n" +
                "<not:Result>" + "\n" +
                "<not:ErrorCode>0</not:ErrorCode>" + "\n" +
                "<not:ErrorDesc>Success</not:ErrorDesc>" + "\n" +
                "<not:Severity>Info</not:Severity>" + "\n" +
                "</not:Result>" + "\n" +
                "</not:TrxInf>" + "\n" +
                "</not:Transactions>"  + "\n" +
                "</soapenv:MsgBody>" + "\n" +
                "</not:MFEP>"
                 +"\n"+"</soapenv:Envelope>");

        StringBuffer builderNext = new StringBuffer();
        String code = GenerateAndVerifySignature.generateSignature(builderNot.toString());
        builderNext.append(message += headerStr + "\n" +

                "<not:TmStp>2013-12-25112:55:00</not:TmStp>"+ "\n" +
                "<not:GUID>15c72631-60d1-4686-b552-9517ff0335d5</not:GUID>" + "\n" +
                "<not:TrsInf>" + "\n" +
                "<not:SdrCode>9</not:SdrCode>"+ "\n" +
                "<not:ResTyp>BNKPMTNTFRS</not:ResTyp>"+ "\n" +
                "</not:TrsInf>" + "\n" +
                "<not:Result>" + "\n" +
                "<not:ErrorCode>0</not:ErrorCode>"  + "\n" +
                "<not:ErrorDesc>Success</not:ErrorDesc>"  + "\n" +
                "<not:Severity>Info</not:Severity>"  + "\n" +
                "</not:Result>" + "\n" +
                "</not:MsgHeader>" + "\n" +
                "<not:MsgBody>" + "\n" +
                "<not:Transactions>" + "\n" +
                "<not:TrxInf>" + "\n" +
                "<not:JOEBPPSTrx>1509</not:JOEBPPSTrx>" + "\n" +
                "<not:ProcessDate>2013-12-25T12:53:00</not:ProcessDate>" + "\n" +
                "<not:STMTDate>2013-12-25</not:STMTDate>"  + "\n" +
                "<not:Result>" + "\n" +
                "<not:ErrorCode>0</not:ErrorCode>" + "\n" +
                "<not:ErrorDesc>Success</not:ErrorDesc>" + "\n" +
                "<not:Severity>Info</not:Severity>" + "\n" +
                "</not:Result>" + "\n" +
                "</not:TrxInf>" + "\n" +
                "</not:Transactions>"  + "\n" +
                "</soapenv:MsgBody>" + "\n"+"<soapenv:MsgFooter>"
                + "\n"
                + "<not:Security>"
                + "\n"
                + "<not:Signature>"
                + "\n"
                + code
                + "\n"
                + "</not:Signature>"
                + "\n"
                + "</not:Security>"
                + "\n"
                + "</soapenv:MsgFooter>"
                + "\n"
                + "</not:MFEP>" + "\n" + "</soapenv:Envelope>");

        System.out.println(builderNext.toString());
        return  builderNext.toString();
    }

}
