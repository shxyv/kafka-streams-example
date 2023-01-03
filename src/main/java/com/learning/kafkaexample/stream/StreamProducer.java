package com.learning.kafkaexample.stream;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
public class StreamProducer {

    private final MessageChannel exampleMessageChannel;

    public StreamProducer(@Qualifier(StreamConfiguration.OutputChannel.EXAMPLE_OUTPUT) MessageChannel exampleMessageChannel) {
        this.exampleMessageChannel = exampleMessageChannel;
    }

    public <T> boolean sendExampleMessage(T message) {
        return exampleMessageChannel.send(MessageBuilder.withPayload(message).
                build());
    }


}
