package com.experts.core.biller.statemachine.api.spintegrations.gateway.bridge;


import com.experts.core.biller.statemachine.api.spintegrations.gateway.shared.SpringIntegrationBillerConstants;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.channel.QueueChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.integration.config.EnableIntegrationManagement;
import org.springframework.integration.endpoint.PollingConsumer;
import org.springframework.integration.handler.BridgeHandler;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;


@EnableIntegration
@EnableIntegrationManagement
@IntegrationComponentScan
public class BridgeHandlerCoreBiller implements SpringIntegrationBillerConstants {

    @Autowired
    protected BeanFactory beanFactory;


    public void bridgeTwoQueueChannelsTest() {
        final QueueChannel theBridgeInputChannel = new QueueChannel();
        final QueueChannel theBridgeOutputChannel = new QueueChannel();
        final Message<String> theInputMessage;
        final Message<?> theOutputMessage;
        final PollingConsumer thePollingConsumer;
        final BridgeHandler theBridgeHandler;

        theInputMessage = MessageBuilder.withPayload(GREETING_STRING).build();

        // <editor-fold desc="Answer Section" defaultstate="collapsed">
        /*
         * Create the bridge handler and set its output message channel.
         * Note that an input message channel cannot be configured on the handler.
         */
        theBridgeHandler = new BridgeHandler();
        theBridgeHandler.setOutputChannel(theBridgeOutputChannel);

        /*
         * This is the programmatic equivalent to annotating a bridge handler bean with the
         * @ServiceActivator annotation.
         */
        thePollingConsumer = new PollingConsumer(theBridgeInputChannel, theBridgeHandler);
        thePollingConsumer.setBeanFactory(beanFactory);
        thePollingConsumer.start();
        // </editor-fold>

        /* Send a message to the message channel that the bridge receives messages from. */
        theBridgeInputChannel.send(theInputMessage);

        theOutputMessage = theBridgeOutputChannel.receive(2000L);

        /* Verify received message. *//*
        Assert.assertNotNull("A message should have been received on the output message channel",
                theOutputMessage != null);
        Assert.assertEquals("Output message payload should be same as input message payload",
                GREETING_STRING, theOutputMessage.getPayload());*/
    }
}