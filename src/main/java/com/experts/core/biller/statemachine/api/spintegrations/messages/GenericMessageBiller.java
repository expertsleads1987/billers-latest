
package com.experts.core.biller.statemachine.api.spintegrations.messages;

import com.experts.core.biller.statemachine.api.spintegrations.gateway.shared.AbstractEngineParent;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.messaging.support.MessageBuilder;


import java.util.HashMap;
import java.util.Map;


@EnableIntegration
public class GenericMessageBiller extends AbstractEngineParent {

    public void createMessageUsingNew() {
        final Message<String> theMessage;
        final Map<String, Object> theMessageHeadersMap;


        theMessageHeadersMap = new HashMap<>();
        theMessageHeadersMap.put(MESSAGE_HEADER_NAME, MESSAGE_HEADER_VALUE);


        theMessage = new GenericMessage<>(GREETING_STRING, theMessageHeadersMap);



        /* Verify the created message. *//*
        Assert.assertTrue("Message should be a GenericMessage",
            theMessage instanceof GenericMessage);
        Assert.assertEquals("Message payload should be the greeting string",
            GREETING_STRING, theMessage.getPayload());
        Assert.assertEquals("Message should contain three message headers",
            3, theMessage.getHeaders().size());
        Assert.assertTrue("Message should contain expected header",
            theMessage.getHeaders().containsKey(MESSAGE_HEADER_NAME));
        Assert.assertEquals("Message header value should be expected value",
            MESSAGE_HEADER_VALUE, theMessage.getHeaders().get(MESSAGE_HEADER_NAME));*/
        assertContainsTimestampAndIdHeaders(theMessage);
    }


    public void createMessageUsingMessageBuilder() {
        final Message<String> theMessage;


        theMessage = MessageBuilder
            .withPayload(GREETING_STRING)
            .setHeader(MESSAGE_HEADER_NAME, MESSAGE_HEADER_VALUE)
            .build();


        /*Assert.assertTrue("Message should be a GenericMessage",
            theMessage instanceof GenericMessage);
        Assert.assertEquals("Message payload should be the greeting string",
            GREETING_STRING, theMessage.getPayload());
        Assert.assertEquals("Message should contain three message headers",
            3, theMessage.getHeaders().size());
        Assert.assertTrue("Message should contain the expected header",
            theMessage.getHeaders().containsKey(MESSAGE_HEADER_NAME));
        Assert.assertEquals("Message header value should be expected value",
            MESSAGE_HEADER_VALUE, theMessage.getHeaders().get(MESSAGE_HEADER_NAME));*/
        assertContainsTimestampAndIdHeaders(theMessage);
    }


    public void cloningMessageWithMessageBuilderTest() {
        final String theHeaderName = "myHeaderName";
        final String theFirstHeaderValue = "myHeaderValueOne";

        /* Create the first message. */
        final Message<String> theFirstMessage = MessageBuilder
            .withPayload("Hello Integrated World!")
            .setHeader(theHeaderName, theFirstHeaderValue)
            .build();

        // <editor-fold desc="Answer Section" defaultstate="collapsed">
        /*
         * Clone the first message using the {@code MessageBuilder}, creating
         * the second message.
         */
        final Message<String> theSecondMessage = MessageBuilder
            .fromMessage(theFirstMessage)
            .build();
        // </editor-fold>

        /* Verify the result. */
        /*Assert.assertTrue("Cloned message is one and the same instance as the original",
            theFirstMessage == theSecondMessage);*/
    }


    public void cloningMessageAndAddingHeaderWithMessageBuilderTest() {
        final String theHeaderName = "myHeaderName";
        final String theFirstHeaderValue = "myHeaderValueOne";

        /* Create the first message. */
        final Message<String> theFirstMessage = MessageBuilder
            .withPayload("Hello Integrated World!")
            .setHeader(theHeaderName, theFirstHeaderValue)
            .build();

        /* A short delay as to ascertain that the timestamps will be different. */
        shortDelay(20L);
        // <editor-fold desc="Answer Section" defaultstate="collapsed">
        /*
         * Clone the first message using the {@code MessageBuilder}, creating
         * the second message adding a new header.
         */
        final Message<String> theSecondMessage = MessageBuilder
            .fromMessage(theFirstMessage)
            .setHeader("myNewHeader", "myNewHeaderValue")
            .build();
        // </editor-fold>


       /* Assert.assertFalse(
            "Cloned message is not one and the same instance as the original",
            theFirstMessage == theSecondMessage);
        Assert.assertEquals("Payloads should be equal",
            theFirstMessage.getPayload(), theSecondMessage.getPayload());
        Assert.assertEquals(
            "The value of the header from the original message should be equal",
            theFirstMessage.getHeaders().get(theHeaderName),
            theSecondMessage.getHeaders().get(theHeaderName));*/
        assertTimestampAndIdHeadersNotEqual(theFirstMessage, theSecondMessage);
    }


    public void cloningMessageWithNewTest() {
        final String theHeaderName = "myHeaderName";
        final String theFirstHeaderValue = "myHeaderValueOne";


        final Message<String> theFirstMessage = MessageBuilder
            .withPayload("Hello Integrated World!")
            .setHeader(theHeaderName, theFirstHeaderValue)
            .build();


        final Message<String> theSecondMessage = new GenericMessage<>(
            theFirstMessage.getPayload(),
                theFirstMessage.getHeaders());

        /*Assert.assertFalse(
            "Cloned message is not one and the same instance as the original",
            theFirstMessage == theSecondMessage);
        Assert.assertEquals("Payloads should be equal",
            theFirstMessage.getPayload(), theSecondMessage.getPayload());
        Assert.assertEquals(
            "The value of the header from the original message should be equal",
            theFirstMessage.getHeaders().get(theHeaderName),
            theSecondMessage.getHeaders().get(theHeaderName));*/
        assertTimestampAndIdHeadersEqual(theFirstMessage, theSecondMessage);
    }
}
