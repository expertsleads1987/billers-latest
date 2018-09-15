package com.experts.core.biller.statemachine.api.service.impl;

import com.experts.core.biller.statemachine.api.activemq.standers.Sqls.AGREEMENTINFO;
import com.experts.core.biller.statemachine.api.activemq.standers.Sqls.GET_AGREEMENT_INFO;
import com.experts.core.biller.statemachine.api.activemq.standers.Sqls.JdbcTemplateUtils;
import com.experts.core.biller.statemachine.api.security.encrypt.AsymmetricCryptographyService;
import com.experts.core.biller.statemachine.api.security.encrypt.BillPullCreationStructure;
import com.experts.core.biller.statemachine.api.security.encrypt.GenerateKeysService;
import com.experts.core.biller.statemachine.api.security.encrypt.PaymentNotificationCreationStructure;
import com.experts.core.biller.statemachine.api.soapService.PaymentNotificationRequest;
import com.experts.core.biller.statemachine.api.soapService.PaymentNotificationResponse;
import generated.biller.experts.api.wsdl.notifications.PaymentNotificationDTO;
import generated.biller.experts.api.wsdl.pull.BillPullResponseDTO;
import generated.biller.experts.api.wsdl.pull.BillPullServiceRequest;
import generated.biller.experts.api.wsdl.pull.BillPullServiceResponse;
import generated.biller.experts.api.wsdl.pull.ObjectFactory;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.springframework.ws.soap.server.endpoint.annotation.SoapAction;
import org.springframework.ws.soap.server.endpoint.annotation.SoapHeader;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.*;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;
import java.util.*;

@RestController
@Endpoint
@WebService
@Configuration
@ComponentScan(basePackageClasses = {BillPullCreationStructure.class , PaymentNotificationCreationStructure.class})
@HandlerChain(file="handler-chain.xml")
@Import(JdbcTemplateUtils.class)
public class PaymentBillPullController {

    private final ObjectFactory JAXB_OBJECT_FACTORY = new ObjectFactory();

    @Autowired
    private BillPullCreationStructure billPullCreationStructure;

    @Autowired
    private JdbcTemplateUtils jdbcTemplateUtils;

    @RequestMapping(name  = "/billpull" , method = RequestMethod.POST , produces = {"application/xml"})
    @WebMethod(operationName = "billpull" , action = "search")
    @Produces("application/xml")
    @PayloadRoot(namespace = "http://localhost:3070/billpull", localPart = "BillPullServiceRequest")
    public  @ResponsePayload String billpull(@RequestPayload BillPullServiceRequest request)throws NoSuchAlgorithmException ,CertificateException, UnsupportedEncodingException,KeyStoreException,  NoSuchAlgorithmException , NoSuchPaddingException, InvalidKeyException , IllegalBlockSizeException, BadPaddingException, UnrecoverableKeyException , InvalidKeySpecException , IOException , InvalidKeyException, SignatureException , Exception {

        BillPullServiceResponse response = new BillPullServiceResponse();
     /*
    NodeList nl =
    doc.getElementsByTagNameNS(XMLSignature.XMLNS, "Signature");
    if (nl.getLength() == 0) {
    throw new Exception("Cannot find Signature element");
    }

    // Create a DOMValidateContext and specify a KeySelector
    // and document context.
    DOMValidateContext valContext = new DOMValidateContext
    (new X509KeySelector(), nl.item(0));

    // Unmarshal the XMLSignature.
    XMLSignature signature = fac.unmarshalXMLSignature(valContext);

    // Validate the XMLSignature.
    boolean coreValidity = signature.validate(valContext);
    */

        response.setAccInfo("TestInfoAccount");
        response.setAccNo("1875496663");
        response.setAllowPart("feedback");
        response.setAmount("1587");
        response.setBankCode("154BB");
        response.setBillingNo("1478Gh");
        response.setBillNo("1236985GH");
        response.setBillRec("Rec");
        response.setBillStatus("Pending");
        response.setBillType("Electric");
        response.setCloseDate("2018-7-24");
        response.setCurrency("JD");
        response.setErrorCode("Passed");
        response.setExpiryDate("2018-07-28");
        response.setOpenDate("2018-07-23");
        response.setPmtConst("1451");
        response.setServiceType("ServiceType");
        response.setSubPmt("1548");
        response.setLower("1548");
        response.setUpper("2000");

        BillPullResponseDTO dto = new BillPullResponseDTO();
        List<BillPullServiceResponse> res =  new ArrayList<BillPullServiceResponse>();
        res.add(response);
        dto.setArr(res);

        /*GET_AGREEMENT_INFO info = new GET_AGREEMENT_INFO();
        info.setP_AGREEMENT_ID("1");
        info.setP_BALANCE("100");
        info.setP_BALANCE_TYPE("3");
        info.setP_CENTER_ID("1");
        info.setP_COLLECTOR("100");
        info.setP_NAME("YATAYA");
        info.setP_RESULT("success");*/




       String xml =   billPullCreationStructure.init(dto);
       System.out.println(xml);
       return xml;


    }

    @Autowired
    private PaymentNotificationCreationStructure paymentNotificationCreationStructure;

    @RequestMapping(value = "/notification" , method = RequestMethod.POST , produces = {"application/xml"})
    @WebMethod(action = "notification" , operationName = "search")
    @PayloadRoot(namespace = "http://localhost:3070/notification" , localPart = "PaymentNotificationRequest")
    @Produces("application/xml")
    public @ResponsePayload String notification(@RequestPayload PaymentNotificationRequest request ) throws NoSuchAlgorithmException,CertificateException, UnsupportedEncodingException,KeyStoreException,  NoSuchAlgorithmException , NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, UnrecoverableKeyException, InvalidKeySpecException, IOException, InvalidKeyException, SignatureException , Exception{
        System.out.println("*****************************************************************");
        PaymentNotificationResponse response = new PaymentNotificationResponse();

        response.setErrorCode("Passed");
        response.setIdType("1254GH");
        response.setJOEBPPSTrx("Sr.Technical-Lead");
        response.setResult("Successful");
        response.setSeverity("Severity");
        response.setSTMTDate("2018-07-25");
        response.setTransactions("1-00568GH");
        response.setTrxInf("Passed");

        PaymentNotificationDTO dto = new PaymentNotificationDTO();
        dto.setArr(Arrays.asList(response));
        String xml = paymentNotificationCreationStructure.toDTO();
        System.out.println("------------------->>>>>"+ xml);

        return xml;

    }

}
