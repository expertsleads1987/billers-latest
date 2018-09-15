package com.experts.core.biller.statemachine.api.spintegrations.gateway;

import com.experts.core.biller.statemachine.api.spintegrations.gateway.shared.SpringIntegrationBillerConstants;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.aggregator.AggregatingMessageHandler;
import org.springframework.integration.aggregator.CorrelationStrategy;
import org.springframework.integration.aggregator.DefaultAggregatingMessageGroupProcessor;
import org.springframework.integration.aggregator.HeaderAttributeCorrelationStrategy;
import org.springframework.integration.aggregator.MessageCountReleaseStrategy;
import org.springframework.integration.aggregator.MessageGroupProcessor;
import org.springframework.integration.aggregator.ReleaseStrategy;
import org.springframework.integration.channel.QueueChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.integration.config.EnableIntegrationManagement;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;


import java.util.List;


@EnableIntegrationManagement
@EnableIntegration
@Configuration
public class AggregatingMessageHandlerCore  implements SpringIntegrationBillerConstants {

    protected static final Log LOGGER = LogFactory.getLog(AggregatingMessageHandler.class);

    protected static final String CORRELATION_HEADER_NAME = "myCorrelationHeader";
    protected static final String CORRELATION_HEADER_MATCHING_VALUE = "corr1";
    protected static final String CORRELATION_HEADER_SINGLE_VALUE = "corr2";


    @Autowired
    protected BeanFactory beanFactory;


    public void messageAggregationTest() {
        final Message<String> theInputMessage1;
        final Message<String> theInputMessage2;
        final Message<String> theInputMessage3;
        final QueueChannel theAggregatorOutputChannel;
        final QueueChannel theAggregatorDiscardChannel;
        final MessageGroupProcessor theMessageGroupProcessor;
        final CorrelationStrategy theCorrelationStrategy;
        final ReleaseStrategy theReleaseStrategy;
        final AggregatingMessageHandler theAggregatingMessageHandler;

        /*
         * Message channels on which output and discarded messages from the aggregator
         * will be delivered.
         */
        theAggregatorOutputChannel = new QueueChannel();
        theAggregatorOutputChannel.setComponentName("Aggregator Output Channel");
        theAggregatorDiscardChannel = new QueueChannel();
        theAggregatorDiscardChannel.setComponentName("Aggregator Discard Channel");

        /* Messages that are to be sent to the aggregator. */
        theInputMessage1 = MessageBuilder
                .withPayload(GREETING_STRING + "1")
                .setHeader(CORRELATION_HEADER_NAME, CORRELATION_HEADER_MATCHING_VALUE)
                .build();
        theInputMessage2 = MessageBuilder
                .withPayload(GREETING_STRING + "2")
                .setHeader(CORRELATION_HEADER_NAME, CORRELATION_HEADER_MATCHING_VALUE)
                .build();
        theInputMessage3 = MessageBuilder
                .withPayload(GREETING_STRING + "3")
                .setHeader(CORRELATION_HEADER_NAME, CORRELATION_HEADER_SINGLE_VALUE)
                .build();


        theMessageGroupProcessor = new DefaultAggregatingMessageGroupProcessor();


        theCorrelationStrategy = new HeaderAttributeCorrelationStrategy(CORRELATION_HEADER_NAME);


        theReleaseStrategy = new MessageCountReleaseStrategy(2);

        theAggregatingMessageHandler = new AggregatingMessageHandler(theMessageGroupProcessor);
        theAggregatingMessageHandler.setCorrelationStrategy(theCorrelationStrategy);
        theAggregatingMessageHandler.setOutputChannel(theAggregatorOutputChannel);
        theAggregatingMessageHandler.setDiscardChannel(theAggregatorDiscardChannel);
        theAggregatingMessageHandler.setBeanFactory(beanFactory);
        theAggregatingMessageHandler.setExpireGroupsUponCompletion(true);
        theAggregatingMessageHandler.setSendPartialResultOnExpiry(true);
        theAggregatingMessageHandler.setReleasePartialSequences(false);
        theAggregatingMessageHandler.setReleaseStrategy(theReleaseStrategy);
        theAggregatingMessageHandler.afterPropertiesSet();
        theAggregatingMessageHandler.start();

        /* Send the three input messages to the aggregator. */
        theAggregatingMessageHandler.handleMessage(theInputMessage1);
        theAggregatingMessageHandler.handleMessage(theInputMessage3);
        theAggregatingMessageHandler.handleMessage(theInputMessage2);
        // </editor-fold>

        /*await().atMost(2, TimeUnit.SECONDS).until(
                () -> theAggregatorOutputChannel.getQueueSize() >= 1);*/

        /* Verify number of messages on the two message channels used by the aggregator. */
        final int theAggregatorOutputChannelSize = theAggregatorOutputChannel.getQueueSize();
        final int theAggregatorDiscardChannelSize = theAggregatorDiscardChannel.getQueueSize();
        /*Assert.assertTrue("No messages should be posted to the discard message channel",
                theAggregatorDiscardChannelSize == 0);
        Assert.assertTrue("One messages should be available on the output message channel",
                theAggregatorOutputChannelSize == 1);*/

        /*
         * Retrieve lists of payloads from the aggregated message.
         * An aggregated message have a list of the original payload type, String in this
         * example, in the payload and one shared group of headers.
         */
        final Message<List<String>> theAggregateMessage =
                (Message<List<String>>) theAggregatorOutputChannel.receive();
        final List<String> theAggregateMessagePayloads = theAggregateMessage.getPayload();

        /* Verify that grouped messages have expected payloads. */
        /*Matchers
                .containsInAnyOrder(GREETING_STRING + "1", GREETING_STRING + "2")
                .matches(theAggregateMessagePayloads);*/
    }
}