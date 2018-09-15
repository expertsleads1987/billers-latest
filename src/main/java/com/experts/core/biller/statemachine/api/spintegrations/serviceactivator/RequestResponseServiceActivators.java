

package com.experts.core.biller.statemachine.api.spintegrations.serviceactivator;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;




public class RequestResponseServiceActivators {

    @ServiceActivator(
        requiresReply = "true",
        inputChannel = ServiceActivatorBillerConfiguration.SERVICEACTIVATOR_ONE_INPUT_CHANNEL,
        outputChannel = ServiceActivatorBillerConfiguration.SERVICEACTIVATOR_ONE_OUTPUT_CHANNEL)
    public Message<String> handleRequestResponseMessageWithOutputChannel(
        final Message<String> inRequestMessage) {

        /* Generate an error if there is a certain payload. */
        if (ServiceActivatorBillerConfiguration.PAYLOAD_ERROR.equals(inRequestMessage.getPayload())) {
            throw new IllegalStateException("Service activator one received a bad request!");
        }

        /* Create a response indicating successful processing by the service handler. */
        final Message<String> theResponseMessage = MessageBuilder
            .withPayload(ServiceActivatorBillerConfiguration.SERVICEACTIVATOR_ONE_RESPONSE)
            .build();
        return theResponseMessage;
    }


    @ServiceActivator(
        requiresReply = "true",
        inputChannel = ServiceActivatorBillerConfiguration.SERVICEACTIVATOR_TWO_INPUT_CHANNEL)
    public Message<String> handleRequestResponsemessageWithoutOutputChannel(
        final Message<String> inRequestMessage) {
        final Message<String> theResponseMessage = MessageBuilder
            .withPayload(ServiceActivatorBillerConfiguration.SERVICEACTIVATOR_TWO_RESPONSE)
            .build();
        return theResponseMessage;
    }
}
