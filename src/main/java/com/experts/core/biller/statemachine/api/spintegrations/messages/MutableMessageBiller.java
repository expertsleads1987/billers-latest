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

package com.experts.core.biller.statemachine.api.spintegrations.messages;


import com.experts.core.biller.statemachine.api.spintegrations.gateway.shared.AbstractEngineParent;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.integration.support.MutableMessage;
import org.springframework.integration.support.MutableMessageBuilder;
import org.springframework.messaging.Message;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@EnableIntegration

public class MutableMessageBiller extends AbstractEngineParent {
    /* Constant(s): */

    public void createMessageUsingNew() {
        final Message<String> theMessage;
        final Map<String, Object> theMessageHeadersMap;

        // <editor-fold desc="Answer Section" defaultstate="collapsed">
        /*
         * Create and populate the map that holds the message headers
         * that are to be set on the message.
         */
        theMessageHeadersMap = new HashMap<>();
        theMessageHeadersMap.put(MESSAGE_HEADER_NAME, MESSAGE_HEADER_VALUE);

        /* Create the message. */
        theMessage = new MutableMessage<>(GREETING_STRING, theMessageHeadersMap);
        // </editor-fold>

        /* Verify the created message. */
        /*Assert.assertTrue("Message should be a MutableMessage",
            theMessage instanceof MutableMessage);
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

        // <editor-fold desc="Answer Section" defaultstate="collapsed">
        /* Create the message. */
        theMessage = MutableMessageBuilder
            .withPayload(GREETING_STRING)
            .setHeader(MESSAGE_HEADER_NAME, MESSAGE_HEADER_VALUE)
            .build();

        // </editor-fold>

       /* *//* Verify the created message. *//*
        Assert.assertTrue("Message should be a MutableMessage",
            theMessage instanceof MutableMessage);
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



    public void cloningMutableMessageWithMutableMessageBuilderTest() {
        final String theHeaderName = "myHeaderName";
        final String theFirstHeaderValue = "myHeaderValueOne";
        final String theSecondHeaderValue = "myHeaderValueTwo";

        /* Create the first message. */
        final Message<String> theFirstMessage = MutableMessageBuilder
            .withPayload("Hello Integrated World!")
            .setHeader(theHeaderName, theFirstHeaderValue)
            .build();

        /*
         * Create the second message using the {@code MutableMessageBuilder}
         * and creating a copy of the first message.
         */
        final Message<String> theSecondMessage = MutableMessageBuilder
            .fromMessage(theFirstMessage)
            .build();

        /* Check that the header value of the second message is the same as that of the first. */
        /*Assert.assertEquals(
            "Message header in first and second message should contain the same value",
            theFirstMessage.getHeaders().get(theHeaderName),
            theSecondMessage.getHeaders().get(theHeaderName));*/

        /*
         * Modify what one would believe is the header in the second message (only)
         * but what turns out to be the headers of both the messages.
         */
        theSecondMessage.getHeaders().put(theHeaderName, theSecondHeaderValue);

        /*
         * Here's the counter-intuitive behaviour:
         * Modifying the header value of the first message affects both the messages since
         * they share one and the same {@code MessageHeaders} object.
         * Note that this behaviour is intended according to https://jira.spring.io/browse/INT-4314
         * The assertion is thus expected to fail.
         */
        /*Assert.assertNotEquals(theFirstMessage.getHeaders().get(theHeaderName),
            theSecondMessage.getHeaders().get(theHeaderName));*/
    }


    public void cloningMutableMessageWithConstructorTest() {
        final String theHeaderName = "myHeaderName";
        final String theFirstHeaderValue = "myHeaderValueOne";
        final String theSecondHeaderValue = "myHeaderValueTwo";

        /* Create the first message. */
        final Message<String> theFirstMessage = MutableMessageBuilder
            .withPayload("Hello Integrated World!")
            .setHeader(theHeaderName, theFirstHeaderValue)
            .build();

        /*
         * Create the second message using the {@code MutableMessageBuilder}
         * with the same payload and headers as the first message.
         */
        final Message<String> theSecondMessage = new MutableMessage<String>(
            theFirstMessage.getPayload(), theFirstMessage.getHeaders());

        /* Check that the header value of the second message is the same as that of the first. */
        /*Assert.assertEquals(
            "Message header in first and second message should contain the same value",
            theFirstMessage.getHeaders().get(theHeaderName),
            theSecondMessage.getHeaders().get(theHeaderName));*/

        /* Modify the value of the message header in the second message. */
        theSecondMessage.getHeaders().put(theHeaderName, theSecondHeaderValue);

        /* Verify that the value of the message header in the first and second message differ. */
        /*Assert.assertNotEquals(
            "The value of the header from the first and second message should not be equal",
            theFirstMessage.getHeaders().get(theHeaderName),
            theSecondMessage.getHeaders().get(theHeaderName));*/

        /* Verify that message id and timestamp are the same in the two messages. */
        assertTimestampAndIdHeadersEqual(theFirstMessage, theSecondMessage);
    }


    public void cloningMutableMessageWithMutableMessageBuilderAlternativeTest() {
        final String theHeaderName = "myHeaderName";
        final String theFirstHeaderValue = "myHeaderValueOne";
        final String theSecondHeaderValue = "myHeaderValueTwo";

        /* Create the first message. */
        final Message<String> theFirstMessage = MutableMessageBuilder
            .withPayload("Hello Integrated World!")
            .setHeader(theHeaderName, theFirstHeaderValue)
            .build();

        /*
         * Create the second message using the {@code MutableMessageBuilder}
         * with the same payload and headers as the first message.
         * Note that the payload is set using the withPayload method of the builder
         * and the message headers are set using the copyHeaders method.
         */
        final Message<String> theSecondMessage = MutableMessageBuilder
            .withPayload(theFirstMessage.getPayload())
            .copyHeaders(theFirstMessage.getHeaders())
            .build();

        /* Check that the header value of the second message is the same as that of the first. */
        /*Assert.assertEquals(
            "Message header in first and second message should contain the same value",
            theFirstMessage.getHeaders().get(theHeaderName),
            theSecondMessage.getHeaders().get(theHeaderName));*/

        /* Modify the header in the second message. */
        theSecondMessage.getHeaders().put(theHeaderName, theSecondHeaderValue);

        /* Check that the value of the message header is different in the two messages. */
        /*Assert.assertNotEquals(
            "The value of the header from the first and second message should not be equal",
            theFirstMessage.getHeaders().get(theHeaderName),
            theSecondMessage.getHeaders().get(theHeaderName));*/

        assertTimestampAndIdHeadersEqual(theFirstMessage, theSecondMessage);
    }


    public void modifyHeadersTest() {
        final Message<String> theMessage;

        // <editor-fold desc="Answer Section" defaultstate="collapsed">
        /* Create a message with one message header. */
        theMessage = MutableMessageBuilder
            .withPayload(GREETING_STRING)
            .setHeader(MESSAGE_HEADER_NAME, MESSAGE_HEADER_VALUE)
            .build();

        /* Attempt to modify a message header in the message. */
        theMessage.getHeaders().put(MESSAGE_HEADER_NAME, "");
        // </editor-fold>

        /*Assert.assertEquals("Message header value should be modified", "",
            theMessage.getHeaders().get(MESSAGE_HEADER_NAME));*/
    }


    public void comparingMessagesTest() {
        final Message<String> theReferenceMessage;
        final Message<String> theSameAsFirstMessage;
        final Message<String> theDifferentHeaderMessage;
        final Message<String> theDifferentPayloadMessage;
        final Map<String, Object> theReferenceMessageHeaders;

        /* Reference message headers. */
        theReferenceMessageHeaders = new HashMap<>();
        theReferenceMessageHeaders.put(MESSAGE_HEADER_NAME, MESSAGE_HEADER_VALUE);

        /* Reference message. */
        theReferenceMessage = MutableMessageBuilder
            .withPayload(GREETING_STRING)
            .setHeader(MESSAGE_HEADER_NAME, MESSAGE_HEADER_VALUE)
            .build();

        /*
         * Create the following messages:
         * theSameAsFirstMessage - Identical to the reference message except
         * for perhaps timestamp and id message headers.
         * theDifferentHeaderMessage - Same payload as reference message, message
         * header value different for the single header.
         * theDifferentPayloadMessage - Different payload, message headers
         * identical to reference message.
         */
        // <editor-fold desc="Answer Section" defaultstate="collapsed">
        /* Message with same payload and headers as the reference message. */
        theSameAsFirstMessage = new MutableMessage<>(GREETING_STRING,
            theReferenceMessageHeaders);

        /* Message that has a different header value message. */
        theDifferentHeaderMessage = new MutableMessage<>(
            GREETING_STRING, theReferenceMessageHeaders);
        theDifferentHeaderMessage.getHeaders().put(MESSAGE_HEADER_NAME,
            MESSAGE_HEADER_VALUE + "1");

        /* Message which has a different payload. */
        theDifferentPayloadMessage = new MutableMessage<>(GREETING_STRING + "1",
            theReferenceMessageHeaders);
        // </editor-fold>

        /*
         * Since {@code MutableMessageBuilder} will create messages that share one
         * and the same instance of {@code MessageHeaders} if a message is created
         * from an existing message. I want to ensure that this is not the case and
         * explicitly verify the message headers object of each message.
         */
        final Set<Integer> theMessageHeadersSet = new HashSet<>();
        theMessageHeadersSet.add(
            System.identityHashCode(theReferenceMessage.getHeaders()));
        theMessageHeadersSet.add(
            System.identityHashCode(theSameAsFirstMessage.getHeaders()));
        theMessageHeadersSet.add(
            System.identityHashCode(theDifferentHeaderMessage.getHeaders()));
        theMessageHeadersSet.add(
            System.identityHashCode(theDifferentPayloadMessage.getHeaders()));

       /* Assert.assertEquals(
            "Each message should have a message headers object of its own",
            4, theMessageHeadersSet.size());

        *//* Compare the reference message to each of the other messages. *//*
        Assert.assertTrue(
            "One and the same message shall be equal",
            compareMessagesDisregardIdAndTimestampHeaders(theReferenceMessage,
                theReferenceMessage));
        Assert.assertTrue(
            "Two messages created in the same way have different ids and"
                + " will not be equal",
            compareMessagesDisregardIdAndTimestampHeaders(theReferenceMessage,
                theSameAsFirstMessage));
        Assert.assertFalse(
            "Two messages created with different headers shall not be equal",
            compareMessagesDisregardIdAndTimestampHeaders(theReferenceMessage,
                theDifferentHeaderMessage));
        Assert.assertFalse(
            "Two messages created with different payloads shall not be equal",
            compareMessagesDisregardIdAndTimestampHeaders(theReferenceMessage,
                theDifferentPayloadMessage));*/
    }


    public void modifyPayloadTest() {
        final Message<ArrayList<String>> theMessage;
        final ArrayList<String> theListPayload;

        // <editor-fold desc="Answer Section" defaultstate="collapsed">
        /* Create a message with a list as payload. */
        theListPayload = new ArrayList<>();
        theListPayload.add("First list payload entry");
        theMessage = MessageBuilder
            .withPayload(theListPayload)
            .build();

        /* Attempt to modify the payload of the message. */
        theMessage.getPayload().add("Second list payload entry");
        // </editor-fold>

        /*Assert.assertEquals("Payload list should contain two entries",
            2, theMessage.getPayload().size());*/
    }
}
