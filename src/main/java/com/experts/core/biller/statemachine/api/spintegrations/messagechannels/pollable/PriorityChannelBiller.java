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

package com.experts.core.biller.statemachine.api.spintegrations.messagechannels.pollable;

import com.experts.core.biller.statemachine.api.spintegrations.gateway.shared.SpringIntegrationBillerConstants;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.IntegrationMessageHeaderAccessor;
import org.springframework.integration.channel.PriorityChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.integration.config.EnableIntegrationManagement;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;

import java.util.Comparator;



@EnableIntegration
@Configuration
@EnableIntegrationManagement
public class PriorityChannelBiller implements SpringIntegrationBillerConstants {
    /* Constant(s): */
    protected static final Log LOGGER = LogFactory.getLog(PriorityChannelBiller.class);


    public void successfullyPollingMessageTest() throws Exception {
        final PriorityChannel thePriorityChannel;
        final Message<String> theInputMessage;
        final Message<?> theOutputMessage;

        theInputMessage = MessageBuilder.withPayload(GREETING_STRING).build();

        // <editor-fold desc="Answer Section" defaultstate="collapsed">
        thePriorityChannel = new PriorityChannel();
        /* Set the name of the channel which will be included in exceptions and log messages. */
        thePriorityChannel.setComponentName(PRIORITY_CHANNEL_NAME);

        thePriorityChannel.send(theInputMessage);
        // </editor-fold>

        theOutputMessage =
            thePriorityChannel.receive(RECEIVE_TIMEOUT_5000_MILLISECONDS);
        final Object theOutputMessagePayload = theOutputMessage.getPayload();

        /*Assert.assertEquals("Input and output payloads should be the same",
            GREETING_STRING,
            theOutputMessagePayload);*/
    }


    public void messagesWithDifferentPriority() throws Exception {
        final PriorityChannel thePriorityChannel;
        final Message<String> theInputMessage1;
        final Message<String> theInputMessage2;
        final Message<?> theOutputMessage1;
        final Message<?> theOutputMessage2;

        /*
         * Second message has higher priority than first message.
         * Default priority comparision mechanism is used.
         */
        theInputMessage1 = MessageBuilder.withPayload("1").setPriority(1).build();
        theInputMessage2 = MessageBuilder.withPayload("2").setPriority(2).build();

        // <editor-fold desc="Answer Section" defaultstate="collapsed">
        thePriorityChannel = new PriorityChannel();
        /* Set the name of the channel which will be included in exceptions and log messages. */
        thePriorityChannel.setComponentName(PRIORITY_CHANNEL_NAME);

        thePriorityChannel.send(theInputMessage1);
        thePriorityChannel.send(theInputMessage2);
        // </editor-fold>

        theOutputMessage1 =
            thePriorityChannel.receive(RECEIVE_TIMEOUT_5000_MILLISECONDS);
        theOutputMessage2 =
            thePriorityChannel.receive(RECEIVE_TIMEOUT_5000_MILLISECONDS);
        final Object theOutputMessagePayload1 = theOutputMessage1.getPayload();
        final Object theOutputMessagePayload2 = theOutputMessage2.getPayload();

       /* Assert.assertEquals("Message with higher priority should be received first",
            "2",
            theOutputMessagePayload1);
        Assert.assertEquals("Message with lower priority should be received second",
            "1",
            theOutputMessagePayload2);*/
    }


    public void messagesWithDifferentPriorityCustomPriorityComparator()
        throws Exception {
        final PriorityChannel thePriorityChannel;
        final Message<String> theInputMessage1;
        final Message<String> theInputMessage2;
        final Message<?> theOutputMessage1;
        final Message<?> theOutputMessage2;

        /*
         * Second message has higher priority than first message.
         * Default priority comparision mechanism is used.
         */
        theInputMessage1 = MessageBuilder.withPayload("1")
            .setHeader(CUSTOM_PRIORITY_HEADER, "orange")
            .build();
        theInputMessage2 = MessageBuilder.withPayload("2")
            .setHeader(CUSTOM_PRIORITY_HEADER, "banana")
            .build();

        // <editor-fold desc="Answer Section" defaultstate="collapsed">
        /*
         * Create the custom message priority comparator that retrieves message priority from
         * a custom header and assumes that priority values are strings.
         */
        final Comparator<Message<?>> theMessagePriorityComparator =
            (inMessage1, inMessage2) -> {
                final String thePriority1 =
                    (String) new IntegrationMessageHeaderAccessor(inMessage1).getHeader(
                        CUSTOM_PRIORITY_HEADER);
                final String thePriority2 =
                    (String) new IntegrationMessageHeaderAccessor(inMessage2).getHeader(
                        CUSTOM_PRIORITY_HEADER);
                return thePriority1.compareTo(thePriority2);
            };
        thePriorityChannel = new PriorityChannel(theMessagePriorityComparator);
        /* Set the name of the channel which will be included in exceptions and log messages. */
        thePriorityChannel.setComponentName(PRIORITY_CHANNEL_NAME);

        thePriorityChannel.send(theInputMessage1);
        thePriorityChannel.send(theInputMessage2);
        // </editor-fold>

        theOutputMessage1 =
            thePriorityChannel.receive(RECEIVE_TIMEOUT_5000_MILLISECONDS);
        theOutputMessage2 =
            thePriorityChannel.receive(RECEIVE_TIMEOUT_5000_MILLISECONDS);
        final Object theOutputMessagePayload1 = theOutputMessage1.getPayload();
        final Object theOutputMessagePayload2 = theOutputMessage2.getPayload();

//        Assert.assertEquals("Message with higher priority should be received first",
//            "2",
//            theOutputMessagePayload1);
//        Assert.assertEquals("Message with lower priority should be received second",
//            "1",
//            theOutputMessagePayload2);
    }


    public void messagesWithSamePriority() throws Exception {
        final PriorityChannel thePriorityChannel;
        final Message<String> theInputMessage1;
        final Message<String> theInputMessage2;
        final Message<?> theOutputMessage1;
        final Message<?> theOutputMessage2;

        /*
         * Second message has higher priority than first message.
         * Default priority comparision mechanism is used.
         */
        theInputMessage1 = MessageBuilder.withPayload("1").setPriority(1).build();
        theInputMessage2 = MessageBuilder.withPayload("2").setPriority(1).build();

        // <editor-fold desc="Answer Section" defaultstate="collapsed">
        thePriorityChannel = new PriorityChannel();
        /* Set the name of the channel which will be included in exceptions and log messages. */
        thePriorityChannel.setComponentName(PRIORITY_CHANNEL_NAME);

        thePriorityChannel.send(theInputMessage1);
        thePriorityChannel.send(theInputMessage2);
        // </editor-fold>

        theOutputMessage1 =
            thePriorityChannel.receive(RECEIVE_TIMEOUT_5000_MILLISECONDS);
        theOutputMessage2 =
            thePriorityChannel.receive(RECEIVE_TIMEOUT_5000_MILLISECONDS);
        final Object theOutputMessagePayload1 = theOutputMessage1.getPayload();
        final Object theOutputMessagePayload2 = theOutputMessage2.getPayload();

        /*Assert.assertEquals(
            "Message with same priority should be received in order sent",
            "1",
            theOutputMessagePayload1);
        Assert.assertEquals(
            "Message with same priority should be received in order sent",
            "2",
            theOutputMessagePayload2);*/
    }
}
