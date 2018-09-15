package com.experts.core.biller.statemachine.api.service.clients;

import generated.paymentinquiry.cxf.ws.IPaymentInquiry;
import generated.paymentinquiry.cxf.ws.Inquire;
import generated.paymentinquiry.cxf.ws.ObjectFactory;
import generated.paymentinquiry.cxf.ws.PaymentInquiry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import java.util.UUID;

@Component
public class InquiryClientInquiryApi {

    private static final Logger LOGGER = LoggerFactory.getLogger(InquiryClientInquiryApi.class);

    @Autowired
    private WebServiceTemplate webServiceTemplate;

    public String sayHello(String firstName, String lastName) {
        ObjectFactory factory = new ObjectFactory();
        Inquire creation = factory.createInquire();

        creation.setGuid(factory.createInquireGuid(UUID.randomUUID().toString()));
        PaymentInquiry payment = new PaymentInquiry();


       Inquire.PaymentInquireRequest request =   factory.createInquirePaymentInquireRequest();


        JAXBElement<Inquire.PaymentInquireRequest>  element =  new JAXBElement(new QName("http://tempuri.org/", "paymentInquireRequest"),
                new String("").getClass(),request);

        creation.setPaymentInquireRequest(element);


        JAXBElement<String>  token =   factory.createInquireTokenKey("opc@2018@#$564546645654654464545465456465456455654654654654455646546546455");


        JAXBElement<Inquire.PaymentInquireRequest>  tok =  new JAXBElement(new QName("http://tempuri.org/", "tokenKey"),
                new String("").getClass(),token);

        creation.setTokenKey(token);


        Inquire greeting = (Inquire) webServiceTemplate.marshalSendAndReceive(creation);
        System.out.println("------------------------------------------------- Success Calls");
        return "success";
    }

}
