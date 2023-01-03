package com.learning.kafkaexample.stream;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

@Component
@EnableBinding({StreamConfiguration.InputChannel.class, StreamConfiguration.OutputChannel.class})
public class StreamConfiguration {

    public interface InputChannel {

        String EXAMPLE_INPUT = "example";

        @Input(EXAMPLE_INPUT)
        MessageChannel exampleInputChannel();

    }


    public interface OutputChannel {

        String EXAMPLE_OUTPUT = "example";

        @Output(EXAMPLE_OUTPUT)
        MessageChannel exampleOutputChannel();

    }


}
