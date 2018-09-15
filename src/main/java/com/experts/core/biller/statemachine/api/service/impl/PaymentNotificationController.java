package com.experts.core.biller.statemachine.api.service.impl;


import com.experts.core.biller.statemachine.api.security.encrypt.PaymentNotificationCreationStructure;
import com.experts.core.biller.statemachine.api.soapService.BillPullServiceRequest;
import com.experts.core.biller.statemachine.api.soapService.BillPullServiceResponse;
import com.experts.core.biller.statemachine.api.soapService.PaymentNotificationRequest;
import com.experts.core.biller.statemachine.api.soapService.PaymentNotificationResponse;
import generated.biller.experts.api.wsdl.notifications.PaymentNotificationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.ws.rs.Produces;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.*;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.List;

@RestController
@Configuration
@Endpoint
@WebService
@HandlerChain(file="handler-chain.xml")
public class PaymentNotificationController {



}
