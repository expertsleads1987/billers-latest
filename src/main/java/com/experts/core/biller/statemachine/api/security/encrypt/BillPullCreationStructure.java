package com.experts.core.biller.statemachine.api.security.encrypt;


import com.experts.core.biller.statemachine.api.activemq.standers.Sqls.AGREEMENTINFO;
import com.experts.core.biller.statemachine.api.activemq.standers.Sqls.GET_AGREEMENT_INFO;
import com.experts.core.biller.statemachine.api.activemq.standers.Sqls.JdbcTemplateUtils;
import generated.biller.experts.api.wsdl.pull.BillPullResponseDTO;
import generated.biller.experts.api.wsdl.pull.BillPullServiceResponse;
import lombok.NoArgsConstructor;
import org.apache.commons.lang.StringUtils;
import org.apache.xmlbeans.impl.xb.xsdschema.KeyrefDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.*;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Component("billPullCreationStructure")
@NoArgsConstructor
@Import(JdbcTemplateUtils.class)
public class BillPullCreationStructure {

    /*private StringBuilder message = new StringBuilder();*/

    @Autowired
    private JdbcTemplateUtils jdbcTemplateUtils;

    String message  = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:bil=\"http://localhost:3070/ws/billpull\">" + "\n" +"<bil:MFEP>"+"\n";
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


    @Autowired
    private GenerateAndVerifySignature generateAndVerifySignature;


    @Autowired
    private EncryptByPkService encryptByPkService;

    private String resCount;
    private String billRec;
    private String billingNo;
    private String billNo;
    private String result;
    private String errorDesc;
    private String serverity;
    private String accInfo;
    private String billingStatus;
    private String dueAmount;
    private String currency;
    private String issueDate;
    private String openDate;
    private String dueDate;
    private String expiryDate;
    private String closeDate;
    private String serviceType;
    private String billType;
    private String pmtCost;
    private String allowPart;
    private String lower;
    private String upper;
    private String subPmts;
    private String subPmt;
    private String amount;
    private String bankCode;
    private String accNo;
    private StringBuffer builder;

    @Autowired
    private AGREEMENTINFO agreementinfo;


    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

    public String init(BillPullResponseDTO dto) throws NoSuchAlgorithmException ,CertificateException, UnsupportedEncodingException,KeyStoreException,  NoSuchAlgorithmException , NoSuchPaddingException, InvalidKeyException , IllegalBlockSizeException, BadPaddingException, UnrecoverableKeyException , InvalidKeySpecException , IOException , InvalidKeyException, SignatureException , Exception{

        if (dto != null && dto.getArr() != null) {
            BillPullServiceResponse res = dto.getArr().get(0);
            Map<String,Object> maps = new HashMap<>();

            maps.put("P_CENTER_ID","1");
            maps.put("P_COLLECTOR","99999");
            maps.put("P_AGREEMENT_ID","30514");
            maps.put("P_BALANCE_TYPE", "3");


        /*ObjectMapper oMapper = new ObjectMapper();
        Map<String, Object> map = oMapper.convertValue(info, Map.class);
        System.out.println(map);*/


             agreementinfo =  jdbcTemplateUtils.callStoredFunction("GET_AGREEMENT_INFO", maps , GET_AGREEMENT_INFO.class);
             resCount      = "<bil:ResCount>" + res.getResCount() + "</bil:ResCount>";
             billRec       = "<bil:BillRec>" + res.getBillRec() + "</bil:BillRec>";
             billingNo     = "<bil:BillingNo>" + res.getBillingNo() + " </bil:BillingNo>";
             billNo        = "<bil:BillNo>" + res.getBillNo() + "</bil:BillNo>";
             result        = "<bil:ErrorCode>" + new String (agreementinfo.getResult().getBytes() , Charset.forName("UTF8")) + "</bil:ErrorCode>";
             errorDesc     = "<bil:ErrorDesc>" + res.getErrorDesc() + "</bil:ErrorDesc>";
             serverity     = "<bil:Severity>" + res.getServerity() + "</bil:Severity>";
             accInfo       = "<bil:AccInfo>" + new String (agreementinfo.getName().getBytes() , Charset.forName("UTF8")) + "</bil:AccInfo>";
             billingStatus = "<bil:BillingStatus>" + res.getBillStatus() + "</bil:BillingStatus>";
             dueAmount   = "<bil:DueAmmount>" + res.getDueAmount() + "</bil:DueAmmount>";
             currency    = "<bil:Currency>" + res.getCurrency() + "</bil:Currency>";
             issueDate   = "<bil:IssueDate>" + res.getIssueDate() + "</bil:IssueDate>";
             openDate    = "<bil:OpenDate>" + res.getOpenDate() + "</bil:OpenDate>";
             dueDate     = "<bil:DueDate>" + res.getDueDate() + "</bil:DueDate>";
             expiryDate  = "<bil:ExpiryDate>" + res.getExpiryDate() + "</bil:ExpiryDate>";
             closeDate   = "<bil:CloseDate>" + res.getCloseDate() + "</bil:CloseDate>";
             serviceType = "<bil:ServiceType>" + res.getServiceType() + "</bil:ServiceType>";
             billType    = "<bil:BillType>" + res.getBillType() + "</bil:BillType>";
             pmtCost    = "<bil:PmtCost>"+agreementinfo.getBalance()+"</bil:PmtCost>";
             allowPart   = "<bil:AllowPart>" + res.getAllowPart() + "</bil:AllowPart>";
             lower       = "<bil:Lower>" + res.getAllowPart() + "</bil:Lower>";
             upper       = "<bil:Upper>" + res.getUpper() + "</bil:Upper>";
             subPmts     = "<bil:SubPmts>" + res.getSubPmts() + "</bil:SubPmts>";
             subPmt      = "<bil:SubPmt>" + res.getSubPmt() + "</bil:SubPmt>";
             amount      = "<bil:Amount>" + res.getAmount() + "</bil:Amount>";
             bankCode    = "<bil:bil:BankCode>" + res.getBankCode() + "</bil:BankCode>";
             accNo       = "<bil:AccNo>" + res.getAccNo() + "</bil:AccNo>";



        }

       return  toDTO();

    }


    public String toDTO() throws  NoSuchAlgorithmException ,CertificateException, UnsupportedEncodingException,KeyStoreException,  NoSuchAlgorithmException , NoSuchPaddingException, InvalidKeyException , IllegalBlockSizeException, BadPaddingException, UnrecoverableKeyException , InvalidKeySpecException , IOException , InvalidKeyException, SignatureException , Exception{

        String sign =  soapSecurityHandler.sign();
        String headerClose = "";
        builder = new StringBuffer();

        builder.append(message + "\n" +headerStr  + "<bil:TmStp>" + format.format(new Date()) + "</bil:TmStp>"
                + "\n"
                + "<bil:Guid>" + UUID.randomUUID() + "</bil:Guid>"
                + "\n"
                + "<bil:TrsInf>"
                + "\n"
                + "<bil:SdrCode>"+ "3" + "</bil:SdrCode>"
                + "\n"
                + "<bil:ResType>" + "BILPULRS" +" </bil:ResType> "
                + "\n"
                + "</bil:TrsInf>"
                + "\n"
                + "<bil:Result>"
                + "\n"
                + "<bil:ErrorCode>" + "0" + "</bil:ErrorCode>"
                + "\n"
                + "<bil:ErrorDesc>" +new String(agreementinfo.getResult().getBytes(),Charset.forName("UTF8"))+"</bil:ErrorDesc> "
                + "\n"
                + "<bil:Severity>"+"Info"+"</bil:Severity>"
                + "\n"
                + "</bil:Result>"
                + "\n"
                + "</soapenv:MsgHeader>"
                + "\n"
                + "<soapenv:MsgBody>"
                + "\n"
                + resCount
                + "\n"
                + "<bil:BillRecs>"
                + "\n"
                + "<bil:BillRec>"
                + "<bil:AccInfo>"
                + billingNo
                + "\n"
                + billNo
                + "</bil:AccInfo>"
                + "\n"
                + billingStatus
                + "\n"
                + dueAmount
                + "\n"
                + currency
                + "\n"
                + issueDate
                + "\n"
                + dueDate
                + "\n"
                + serviceType
                + "\n"
                + "<bil:PmtCost>"
                + "\n"
                + allowPart
                + "\n"
                + lower
                + "\n"
                + upper
                + "\n"
                + "</bil:PmtCost>"
                + "\n"
                + "</bil:BillRec>"
                + "\n"
                + "</bil:BillRecs>"
                + "\n"
                + "</soapenv:MsgBody>"
                + "\n" +"</bil:MFEP>" + "\n" + "</soapenv:Envelope>"
                );


         String xml = builder.toString();

         String Xml = xml+"\n"+"<soapenv:MsgFooter>"
                + "\n"
                + "<bil:Security>"
                + "\n"
                + "<bil:Signature></bil:Signature>"
                + "\n"
                + "</bil:Security>"
                + "\n"
                + "</soapenv:MsgFooter>"
                + "\n"
                + "</bil:MFEP>" + "\n" + "</soapenv:Envelope>";

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
    }
}
