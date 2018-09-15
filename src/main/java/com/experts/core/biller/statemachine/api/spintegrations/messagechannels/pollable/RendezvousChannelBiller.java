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

import org.springframework.integration.channel.RendezvousChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;


import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;



@EnableIntegration
public class RendezvousChannelBiller implements SpringIntegrationBillerConstants {
    /* Constant(s): */
    protected static final Log LOGGER = LogFactory.getLog(RendezvousChannelBiller.class);


    public void sendFirstThenReceiveTest() throws Exception {
        final RendezvousChannel theRendezvousChannel;
        final Message<String> theInputMessage;
        final Message<?> theOutputMessage;
        final AtomicBoolean theMessageSendResultAtomic = new AtomicBoolean();
        final Semaphore theSendThreadFinishedSemaphore = new Semaphore(1);

        theInputMessage = MessageBuilder.withPayload(GREETING_STRING).build();

        // <editor-fold desc="Answer Section" defaultstate="collapsed">
        theRendezvousChannel = new RendezvousChannel();
        /* Set the name of the channel which will be included in exceptions and log messages. */
        theRendezvousChannel.setComponentName(RENDEZVOUS_CHANNEL_NAME);

        /*
         * Need to invoke the send operation in a separate thread,
         * since it is blocking with rendezvous message channels.
         */
        theSendThreadFinishedSemaphore.acquire();
        final Thread theSendThread = new Thread(() -> {
            final boolean theSendResult = theRendezvousChannel.send(theInputMessage);
            theMessageSendResultAtomic.set(theSendResult);
            theSendThreadFinishedSemaphore.release();
        });
        theSendThread.start();

        theOutputMessage =
            theRendezvousChannel.receive(RECEIVE_TIMEOUT_5000_MILLISECONDS);
        final Object theOutputMessagePayload = theOutputMessage.getPayload();
        // </editor-fold>

        /*Assert.assertEquals("Input and output payloads should be the same",
            GREETING_STRING,
            theOutputMessagePayload);*/
        /*
         * Must wait until sending thread completely finished what it should do
         * in order to avoid test failures.
         */
        theSendThreadFinishedSemaphore.acquire();
        /*Assert.assertTrue("The message sending should be successful",
            theMessageSendResultAtomic.get());*/
    }


    public void receiveFirstThenSendTest() throws Exception {
        final RendezvousChannel theRendezvousChannel;
        final Message<String> theInputMessage;
        final AtomicReference<Message> theOutputMessageReference =
            new AtomicReference<>();

        theInputMessage = MessageBuilder.withPayload(GREETING_STRING).build();

        // <editor-fold desc="Answer Section" defaultstate="collapsed">
        theRendezvousChannel = new RendezvousChannel();
        /* Set the name of the channel which will be included in exceptions and log messages. */
        theRendezvousChannel.setComponentName(RENDEZVOUS_CHANNEL_NAME);

        /*
         * Need to invoke the receive operation in a separate thread,
         * since it is blocking with rendezvous message channels.
         * In addition, an AtomicReference is used to convey the received
         * message to the "outside world".
         */
        final Thread theReceiveThread =
            new Thread(() -> theOutputMessageReference.set(theRendezvousChannel.receive(
                RECEIVE_TIMEOUT_5000_MILLISECONDS)));
        theReceiveThread.start();

        theRendezvousChannel.send(theInputMessage);

        /* Wait for the receiving thread to finish executing. */
        theReceiveThread.join();

        final Object theOutputMessagePayload =
            theOutputMessageReference.get().getPayload();
        // </editor-fold>

        /*Assert.assertEquals("Input and output payloads should be the same",
            GREETING_STRING,
            theOutputMessagePayload);*/
    }



    public void sendAndReceiveWithTimeoutTest() throws Exception {
        final RendezvousChannel theRendezvousChannel;
        final Message<String> theInputMessage;
        final Message<?> theOutputMessage;
        final boolean theMessageSendResult;

        theInputMessage = MessageBuilder.withPayload(GREETING_STRING).build();

        // <editor-fold desc="Answer Section" defaultstate="collapsed">
        theRendezvousChannel = new RendezvousChannel();
        /* Set the name of the channel which will be included in exceptions and log messages. */
        theRendezvousChannel.setComponentName(RENDEZVOUS_CHANNEL_NAME);

        /*
         * The send method is called in the same thread as no receive will
         * be attempted until after it has timed out.
         */
        theMessageSendResult = theRendezvousChannel.send(theInputMessage,
            SEND_TIMEOUT_500_MILLISECONDS);

        /* The receive method is also called in the same thread. */
        theOutputMessage =
            theRendezvousChannel.receive(RECEIVE_TIMEOUT_500_MILLISECONDS);
        // </editor-fold>

        /*Assert.assertFalse("The message sending should be unsuccessful",
            theMessageSendResult);
        Assert.assertNull("No message should have been received", theOutputMessage);*/
    }


    public void requestReplyTest() throws Exception {
        final RendezvousChannel theRequestRendezvousChannel;
        final RendezvousChannel theReplyRendezvousChannel;
        final Message<String> theClientRequestMessage;
        final Message<String> theClientReplyMessage;

        // <editor-fold desc="Answer Section" defaultstate="collapsed">
        theRequestRendezvousChannel = new RendezvousChannel();
        theRequestRendezvousChannel.setComponentName(RENDEZVOUS_CHANNEL_NAME);
        /*
         * Use an anonymous rendezvous message channel for the reply, since
         * there really is no need to name this message channel.
         */
        theReplyRendezvousChannel = new RendezvousChannel();

        /*
         * Need to construct the message to the service after the reply channel
         * has been created, in order to set the reply channel on the message.
         */
        theClientRequestMessage = MessageBuilder.withPayload(GREETING_STRING)
            .setReplyChannel(theReplyRendezvousChannel)
            .build();

        /*
         * Service that receives and responds to messages is run in its own thread.
         * Again, this is due to sending and receiving to/from rendezvous message
         * channels are blocking operations.
         */
        final Thread theServiceThread = new Thread(() -> {
            /* Receive the request message. */
            final Message<?> theServiceReceivedMessage =
                theRequestRendezvousChannel.receive();

            /* Verify the request message payload. */
            final String theReceivedMessagePayload =
                (String) theServiceReceivedMessage.getPayload();
           /* Assert.assertEquals("Request message payload should match",
                GREETING_STRING,
                theReceivedMessagePayload);*/

            /* Send a reply message to the reply channel. */
            final MessageChannel theReplyMessageChannel =
                (MessageChannel) theServiceReceivedMessage.getHeaders()
                    .getReplyChannel();
            final Message<String> theServiceReplyMessage =
                MessageBuilder.withPayload(RESPONSE_MESSAGE_PAYLOAD).build();
            theReplyMessageChannel.send(theServiceReplyMessage);
        });
        theServiceThread.start();

        theRequestRendezvousChannel.send(theClientRequestMessage);
        theClientReplyMessage =
            (Message<String>) theReplyRendezvousChannel.receive();
        final Object theClientReplyMessagePayload =
            theClientReplyMessage.getPayload();
        // </editor-fold>

        /*Assert.assertEquals("Reply message payload should match",
            RESPONSE_MESSAGE_PAYLOAD,
            theClientReplyMessagePayload);*/
    }
}
