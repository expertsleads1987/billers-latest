package com.experts.core.biller.statemachine.api.security.encrypt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.*;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;

@Component("paymentServiceCreationStructure")
@Service("paymentServiceCreationStructure")
public class PaymentServiceCreationStructure {


    String message = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:payment=\"http://localhost:3070/ws/payment\">" + "\n" + "<prepaid:MFEP>" + "\n";
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

    private StringBuffer builder;

    private String transactions;

    private String trxInf;

    private String acctInfo;

    private String billingNo;

    private String billNo;

    private String billerCode;

    private String inqRefNo;

    private String bankTrxID;

    private String pmtStatus;

    private String dueAmt;

    private String paidAmt;

    private String processDate;

    private String accessChannel;

    private String paymentMethod;

    private String paymentType;

    private String currency;

    private String serviceTypeDetails;

    private String serviceType;

    private String payerInfo;

    private String idType;

    private String id;

    private String nation;

    private String name;

    private String phone;

    private String address;

    private String email;

    private String JOEBPPSNo;


    public String toDTO() throws NoSuchAlgorithmException, CertificateException, UnsupportedEncodingException, KeyStoreException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, UnrecoverableKeyException, InvalidKeySpecException, IOException, InvalidKeyException, SignatureException, Exception {

        String sign = soapSecurityHandler.sign();
        String headerClose = "";
        builder = new StringBuffer();
        builder.append(message += headerStr + "\n" +

                "<payment:TmStp>2013-12-25112:55:00</payment:TmStp>"+ "\n" +
                "<payment:GUID>15c72631-60d1-4686-b552-9517ff0335d5</payment:GUID>" + "\n" +
                "<payment:TrsInf>" + "\n" +
                "<payment:SdrCode>9</payment:SdrCode>"+ "\n" +
                "<payment:ResTyp>BNKPMTNTFRS</payment:ResTyp>"+ "\n" +
                "</payment:TrsInf>" + "\n" +
                "<payment:Result>" + "\n" +
                "<payment:ErrorCode>0</payment:ErrorCode>"  + "\n" +
                "<payment:ErrorDesc>Success</payment:ErrorDesc>"  + "\n" +
                "<payment:Severity>Info</payment:Severity>"  + "\n" +
                "</payment:Result>" + "\n" +
                "</payment:MsgHeader>" + "\n" +
                "<payment:MsgBody>" + "\n" +
                "<payment:Transactions>" + "\n" +
                "<payment:TrxInf>" + "\n" +
                "<payment:AccInfo>"+ "\n" +
                "<payment:BillingNo>" +"0658749321" + "<payment:BillingNo>" + "\n" +
                "<payment:BillNo>"+ "05487326" + "<payment:BillNo>" + "\n" +
                "<payment:BillerCode>" + "1" + "<payment:BillerCode>" + "\n" +
                "</payment:AccInfo>"+ "\n" +
                "<payment:BankTrxID>" +"RAJ35465465DFG"+ "</payment:BankTrxID>" + "\n" +
                "<payment:PmtStatus>" + "PmtNew" +"</payment:PmtStatus>" + "\n" +
                "<payment:ProcessDate>" + "2018-9-8T12:03:59" +"</payment:ProcessDate>" + "\n" +
                "<payment:STMTDate>"+ "2018-09-08" + "</payment:STMTDate>" + "\n" +
                "<payment:JOEBPPSTrx>" + "20180908125559" +"</payment:JOEBPPSTrx>" + "\n" +
                "<payment:Currency>"+ "USD" + "</payment:Currency>" + "\n" +
                "<payment:Result>" + "\n" +
                "<payment:ErrorCode>" + "0" + "</payment:ErrorCode>" + "\n" +
                "<payment:ErrorDesc>"+"success" + "</payment:ErrorDesc>" + "\n" +
                "<payment:Severity>Info</payment:Severity>" + "\n" +
                "<payment:Result>" + "\n" +
                "</payment:TrxInf>" + "\n" +
                "</payment:Transactions>"  + "\n" +
                "</soapenv:MsgBody>" + "\n" +
                "</payment:MFEP>"
                );



        String xml = builder.toString();

        /*String Xml = xml+"\n"+"<soapenv:MsgFooter>"
                + "\n"
                + "<bil:Security>"
                + "\n"
                + "<bil:Signature></bil:Signature>"
                + "\n"
                + "</bil:Security>"
                + "\n"
                + "</soapenv:MsgFooter>"
                + "\n"
                + "</bil:MFEP>" + "\n" + "</soapenv:Envelope>";*/

        /*String code = asymmetricCryptographyService.init(Xml);*/
        String code = SOAPSecurityHandler.sign();

        String finCore = "";
        finCore = xml + ""+"\n"+"<soapenv:MsgFooter>"
                + "\n"
                + "<bil:Security>"
                + "\n"
                + "<bil:Signature>"
                + "\n"
                + code
                + "\n"
                + "</bil:Signature>"
                + "\n"
                + "</bil:Security>"
                + "\n"
                + "</soapenv:MsgFooter>"
                + "\n"
                + "</bil:MFEP>" + "\n" + "</soapenv:Envelope>";
       /*Xml.replace("</bil:MFEP>","\n");
       Xml.replace("</soapenv:Envelope>","\n");*/
        // String xml =  macAddressValidatorHandler.sigin(message);
        System.out.println(finCore);
        return finCore;
        /*return  macAddressValidatorHandler.sigin(Xml.trim());*/
        /*return builder.toString();*/

    }
}