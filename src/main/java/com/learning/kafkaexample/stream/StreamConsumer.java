package com.learning.kafkaexample.stream;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
public class StreamConsumer {

    @StreamListener(value = StreamConfiguration.InputChannel.EXAMPLE_INPUT)
    public <T> void consumeExampleInputChannel(T message) {
        System.out.println(message);
    }


}
