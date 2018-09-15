package com.experts.core.biller.statemachine.api.spintegrations.gateway;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.ChannelInterceptor;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;


public class LoggingAndCountingChannelInterceptor implements ChannelInterceptor {
    protected static final Log LOGGER =
            LogFactory.getLog(LoggingAndCountingChannelInterceptor.class);

    /* Instance variable(s): */
    protected AtomicInteger mPreSendMessageCount = new AtomicInteger();
    protected AtomicInteger mPostSendMessageCount = new AtomicInteger();
    protected AtomicInteger mAfterSendCompletionMessageCount = new AtomicInteger();
    protected AtomicInteger mPreReceiveMessageCount = new AtomicInteger();
    protected AtomicInteger mPostReceiveMessageCount = new AtomicInteger();
    protected AtomicInteger mAfterReceiveCompletionMessageCount = new AtomicInteger();

    @Override
    public Message<?> preSend(final Message<?> inMessage,
                              final MessageChannel inChannel) {
        logMessageWithChannelAndPayload("Before message sent.",
                inMessage,
                inChannel,
                (Object[]) null);
        mPreSendMessageCount.incrementAndGet();
        return inMessage;
    }

    @Override
    public void postSend(final Message<?> inMessage, final MessageChannel inChannel,
                         final boolean inSent) {
        logMessageWithChannelAndPayload("After message sent.",
                inMessage,
                inChannel,
                (Object[]) null);
        mPostSendMessageCount.incrementAndGet();
    }

    @Override
    public void afterSendCompletion(final Message<?> inMessage,
                                    final MessageChannel inChannel,
                                    final boolean inSent,
                                    final Exception inException) {
        logMessageWithChannelAndPayload(
                "After completion of message sending. Exception: {0}.",
                inMessage,
                inChannel,
                inException);
        mAfterSendCompletionMessageCount.incrementAndGet();
    }

    @Override
    public boolean preReceive(final MessageChannel inChannel) {
        /* Only applies to pollable channels. */
        logMessageWithChannelAndPayload("Pre-receive.",
                null,
                inChannel,
                (Object[]) null);
        mPreReceiveMessageCount.incrementAndGet();

        /* Returning true means go ahead with the receive. */
        return true;
    }

    @Override
    public Message<?> postReceive(final Message<?> inMessage,
                                  final MessageChannel inChannel) {
        /* Only applies to pollable channels. */
        logMessageWithChannelAndPayload("Post-receive.",
                null,
                inChannel,
                (Object[]) null);
        mPostReceiveMessageCount.incrementAndGet();
        return inMessage;
    }

    @Override
    public void afterReceiveCompletion(final Message<?> inMessage,
                                       final MessageChannel inChannel,
                                       final Exception inException) {
        LOGGER.info(
                "After message receive completion. Channel: " + inChannel.toString()
                        + " Payload: " + inMessage.getPayload()
                        + " Exception: " + inException);
        mAfterReceiveCompletionMessageCount.incrementAndGet();
    }

    public int getPreSendMessageCount() {
        return mPreSendMessageCount.get();
    }

    public int getPostSendMessageCount() {
        return mPostSendMessageCount.get();
    }

    public int getAfterSendCompletionMessageCount() {
        return mAfterSendCompletionMessageCount.get();
    }

    public int getPreReceiveMessageCount() {
        return mPreReceiveMessageCount.get();
    }

    public int getPostReceiveMessageCount() {
        return mPostReceiveMessageCount.get();
    }

    public int getAfterReceiveCompletionMessageCount() {
        return mAfterReceiveCompletionMessageCount.get();
    }

    /**
     * Logs a Spring Integration message consisting of the supplied Spring
     * Integration message channel and payload of the supplied message with the
     * supplied log message appended.
     * The supplied log message can contain placeholders as specified by
     * {@code MessageFormat} which will be replaced by the string representation
     * of supplied objects.
     *
     * @param inLogMessage String containing log message with optional placeholders.
     * @param inMessage Spring Integration message which payload to log. May be null.
     * @param inMessageChannel Spring Integration message channel which to log.
     * May be null.
     * @param inAdditionalInMessage Objects which string representation(s) are to
     * be inserted into log message, or null.
     */
    protected void logMessageWithChannelAndPayload(final String inLogMessage,
                                                   final Message<?> inMessage,
                                                   final MessageChannel inMessageChannel,
                                                   final Object... inAdditionalInMessage) {
        if (LOGGER.isInfoEnabled()) {
            final int theAppendMsgParamsStartIndex =
                    (inAdditionalInMessage != null) ? inAdditionalInMessage.length : 0;

            String theLogMessage =
                    new StringBuilder().append(inLogMessage)
                            .append(" Channel: {")
                            .append(theAppendMsgParamsStartIndex)
                            .append("}. Payload: {")
                            .append(theAppendMsgParamsStartIndex + 1)
                            .append("}")
                            .toString();

            final Object[] theLogMessageParameters;
            if (inAdditionalInMessage != null) {
                theLogMessageParameters = Arrays.copyOf(inAdditionalInMessage,
                        inAdditionalInMessage.length + 2);
            } else {
                theLogMessageParameters = new Object[2];
            }

            theLogMessageParameters[theAppendMsgParamsStartIndex] =
                    (inMessageChannel != null)
                            ? inMessageChannel.toString() : "null message channel";
            theLogMessageParameters[theAppendMsgParamsStartIndex + 1] =
                    (inMessage != null) ? inMessage.getPayload()
                            : "null message";
            theLogMessage =
                    MessageFormat.format(theLogMessage, theLogMessageParameters);
            LOGGER.info(theLogMessage);
        }
    }
}