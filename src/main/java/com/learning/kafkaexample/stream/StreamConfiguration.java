package com.learning.kafkaexample.stream;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

@Component
@EnableBinding({StreamConfiguration.InputChannel.class, StreamConfiguration.OutputChannel.class})
public class StreamConfiguration {

    public interface InputChannel {

    }


    public interface OutputChannel {

        String EXAMPLE_OUTPUT = "example-output";

        @Output(EXAMPLE_OUTPUT)
        MessageChannel channelExample();

    }


}
