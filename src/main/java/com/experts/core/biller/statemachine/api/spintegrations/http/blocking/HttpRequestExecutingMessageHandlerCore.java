/*
 * Copyright 2017 Ivan Krizsan
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.experts.core.biller.statemachine.api.spintegrations.http.blocking;


import com.experts.core.biller.statemachine.api.spintegrations.gateway.shared.SpringIntegrationBillerConstants;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.integration.channel.QueueChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.integration.config.EnableIntegrationManagement;
import org.springframework.integration.http.HttpHeaders;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHandlingException;

import org.springframework.stereotype.Component;
import org.springframework.web.client.DefaultResponseErrorHandler;
import org.springframework.web.client.RestTemplate;


import java.io.IOException;


@EnableIntegration
@EnableIntegrationManagement
@Configuration
@Component
public class HttpRequestExecutingMessageHandlerCore implements SpringIntegrationBillerConstants {

    protected static final String REQUEST_URL = "http://www.ivankrizsan.se";


    @Autowired
    protected BeanFactory beanFactory;


    public void sendOutboundHttpRequestTest() {
        final Message<String> theRequestMessage;
        final Message<?> theReplyMessage;
        final QueueChannel theHttpOutboundHandlerReplyChannel;
        final org.springframework.integration.http.outbound.HttpRequestExecutingMessageHandler theHttpOutboundHandler;
        final String theHttpReplyStatusCode;
        final RestTemplate theHttpOutboundHandlerRestTemplate = new RestTemplate();


        /*final MockRestServiceServer theMockRestServiceServer = MockRestServiceServer
            .bindTo(theHttpOutboundHandlerRestTemplate)
            .build();
        theMockRestServiceServer
            .expect(once(), requestTo(REQUEST_URL))
            .andExpect(method(HttpMethod.GET))
            .andRespond(withSuccess("This is a good response", MediaType.TEXT_PLAIN));*/


        theHttpOutboundHandlerReplyChannel = new QueueChannel();

        /* Create and configure the HTTP outbound message handler. */
        theHttpOutboundHandler = new org.springframework.integration.http.outbound.HttpRequestExecutingMessageHandler(
            REQUEST_URL, theHttpOutboundHandlerRestTemplate);
        theHttpOutboundHandler.setHttpMethod(HttpMethod.GET);
        theHttpOutboundHandler.setOutputChannel(theHttpOutboundHandlerReplyChannel);
        theHttpOutboundHandler.setExpectReply(true);
        theHttpOutboundHandler.setBeanFactory(beanFactory);
        theHttpOutboundHandler.afterPropertiesSet();

        /*
         * Create the request message. Since the outbound HTTP request will be a GET request
         * the message payload will not be used and is thus set to empty string.
         */
        theRequestMessage = MessageBuilder.withPayload("").build();

        theHttpOutboundHandler.handleMessage(theRequestMessage);
        // </editor-fold>

        /*await().atMost(2, TimeUnit.SECONDS).until(() ->
            theHttpOutboundHandlerReplyChannel.getQueueSize() > 0);*/

        /* Check that the HTTP status indicates a successful request. */
        theReplyMessage = theHttpOutboundHandlerReplyChannel.receive();
        theHttpReplyStatusCode = theReplyMessage.getHeaders().get(HttpHeaders.STATUS_CODE)
            .toString();
        /*Assert.assertEquals("HTTP status code should indicate a successful request",
            "200", theHttpReplyStatusCode);*/
    }


    public void sendOutboundHttpRequestConnectionRefused() {
        final Message<String> theRequestMessage;
        final QueueChannel theHttpOutboundHandlerReplyChannel;
        final org.springframework.integration.http.outbound.HttpRequestExecutingMessageHandler theHttpOutboundHandler;
        Throwable theExceptionRootCause = null;
        final RestTemplate theHttpOutboundHandlerRestTemplate = new RestTemplate();


       /* final MockRestServiceServer theMockRestServiceServer = MockRestServiceServer
            .bindTo(theHttpOutboundHandlerRestTemplate)
            .build();
        theMockRestServiceServer
            .expect(once(), requestTo(REQUEST_URL))
            .andExpect(method(HttpMethod.GET))
            .andRespond(inRequest -> {
                throw new MessageHandlingException(null, "A client error occurred!",
                    new ConnectException("Connection refused"));
            });*/

        // <editor-fold desc="Answer Section" defaultstate="collapsed">
        /*
         * Create the request and reply message channels used to communicate with the
         * HTTP request executing message handler.
         */
        theHttpOutboundHandlerReplyChannel = new QueueChannel();

        /* Create and configure the HTTP outbound message handler. */
        theHttpOutboundHandler = new org.springframework.integration.http.outbound.HttpRequestExecutingMessageHandler(
            REQUEST_URL, theHttpOutboundHandlerRestTemplate);
        theHttpOutboundHandler.setHttpMethod(HttpMethod.GET);
        theHttpOutboundHandler.setOutputChannel(theHttpOutboundHandlerReplyChannel);
        theHttpOutboundHandler.setExpectReply(true);
        theHttpOutboundHandler.setBeanFactory(beanFactory);
        theHttpOutboundHandler.afterPropertiesSet();

        /*
         * Create the request message. Since the outbound HTTP request will be a GET request
         * the message payload will not be used and is thus set to empty string.
         */
        theRequestMessage = MessageBuilder.withPayload("").build();

        try {
            /* Send the request message to the HTTP outbound message handler. */
            theHttpOutboundHandler.handleMessage(theRequestMessage);
        } catch (final MessageHandlingException theException) {
            /* Store the root cause for later verification. */
            theExceptionRootCause = theException.getRootCause();
        }

        /*Assert.assertNotNull("An exception should have been thrown - make sure "
            + "no local service is listening on the port!", theExceptionRootCause);*/

        /*Assert.assertTrue("The root cause should be a ConnectException",
            theExceptionRootCause instanceof ConnectException);
        Assert.assertTrue("The ConnectException should indicate connection refused",
            theExceptionRootCause.getMessage().contains("Connection refused"));*/
    }


    public void sendOutboundHttpRequestBadRequestResponseDefaultErrorHandlerTest() {
        final Message<String> theRequestMessage;
        final QueueChannel theHttpOutboundHandlerReplyChannel;
        final org.springframework.integration.http.outbound.HttpRequestExecutingMessageHandler theHttpOutboundHandler;
        final RestTemplate theHttpOutboundHandlerRestTemplate = new RestTemplate();
        Throwable theRootCause = null;


       /* final MockRestServiceServer theMockRestServiceServer = MockRestServiceServer
            .bindTo(theHttpOutboundHandlerRestTemplate)
            .build();
        theMockRestServiceServer
            .expect(once(), requestTo(REQUEST_URL))
            .andExpect(method(HttpMethod.GET))
            .andRespond(withBadRequest());*/


        theHttpOutboundHandlerReplyChannel = new QueueChannel();

        /* Create and configure the HTTP outbound message handler. */
        theHttpOutboundHandler = new org.springframework.integration.http.outbound.HttpRequestExecutingMessageHandler(
            REQUEST_URL, theHttpOutboundHandlerRestTemplate);
        theHttpOutboundHandler.setHttpMethod(HttpMethod.GET);
        theHttpOutboundHandler.setOutputChannel(theHttpOutboundHandlerReplyChannel);
        theHttpOutboundHandler.setExpectReply(true);
        theHttpOutboundHandler.setBeanFactory(beanFactory);
        theHttpOutboundHandler.afterPropertiesSet();

        /*
         * Create the request message. Since the outbound HTTP request will be a GET request
         * the message payload will not be used and is thus set to empty string.
         */
        theRequestMessage = MessageBuilder.withPayload("").build();

        /* Send the outbound HTTP request. */
        try {
            theHttpOutboundHandler.handleMessage(theRequestMessage);
        } catch (final MessageHandlingException theException) {
            theRootCause = theException.getRootCause();
        }
        // </editor-fold>

        /* Verify the thrown exception. */
       /* Assert.assertNotNull("An exception should have been thrown", theRootCause);
        Assert.assertTrue("The exception should indicate a response with HTTP status 400",
            theRootCause.getMessage().contains("400"));*/
    }


    public void sendOutboundHttpRequestBadRequestResponseNoOpErrorHandlerTest() {
        final Message<String> theRequestMessage;
        final Message<?> theReplyMessage;
        final String theHttpReplyStatusCode;
        final QueueChannel theHttpOutboundHandlerReplyChannel;
        final org.springframework.integration.http.outbound.HttpRequestExecutingMessageHandler theHttpOutboundHandler;
        final RestTemplate theHttpOutboundHandlerRestTemplate = new RestTemplate();
        final DefaultResponseErrorHandler theNoOpErrorHandler;

        /*
         * Create and configure the mock server that will respond to requests from the
         * HttpRequestExecutingMessageHandler.
         */
        /*final MockRestServiceServer theMockRestServiceServer = MockRestServiceServer
            .bindTo(theHttpOutboundHandlerRestTemplate)
            .build();
        theMockRestServiceServer
            .expect(once(), requestTo(REQUEST_URL))
            .andExpect(method(HttpMethod.GET))
            .andRespond(withBadRequest());*/


        theNoOpErrorHandler = new DefaultResponseErrorHandler() {
            @Override
            public void handleError(final ClientHttpResponse inResponse) throws IOException {
                /* Never throw an exception when there is an error. */
            }
        };

        /*
         * Create the request and reply message channels used to communicate with the
         * HTTP request executing message handler.
         */
        theHttpOutboundHandlerReplyChannel = new QueueChannel();

        /* Create and configure the HTTP outbound message handler. */
        theHttpOutboundHandler = new org.springframework.integration.http.outbound.HttpRequestExecutingMessageHandler(
            REQUEST_URL, theHttpOutboundHandlerRestTemplate);
        theHttpOutboundHandler.setHttpMethod(HttpMethod.GET);
        theHttpOutboundHandler.setOutputChannel(theHttpOutboundHandlerReplyChannel);
        theHttpOutboundHandler.setExpectReply(true);
        theHttpOutboundHandler.setBeanFactory(beanFactory);
        theHttpOutboundHandler.setErrorHandler(theNoOpErrorHandler);
        theHttpOutboundHandler.afterPropertiesSet();

        /*
         * Create the request message. Since the outbound HTTP request will be a GET request
         * the message payload will not be used and is thus set to empty string.
         */
        theRequestMessage = MessageBuilder.withPayload("").build();

        /* Send the outbound HTTP request. Note: No try-catch. */
        theHttpOutboundHandler.handleMessage(theRequestMessage);
        // </editor-fold>

        /* Check that the HTTP status indicates a failed request. */
        theReplyMessage = theHttpOutboundHandlerReplyChannel.receive();
        theHttpReplyStatusCode = theReplyMessage.getHeaders().get(HttpHeaders.STATUS_CODE)
            .toString();
       /* Assert.assertEquals("HTTP status code should indicate a HTTP status 400",
            "400", theHttpReplyStatusCode);*/
    }
}
