package com.learning.kafkaexample.controller;

import com.learning.kafkaexample.stream.StreamProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/stream")
public class StreamController {

    private final StreamProducer streamProducer;

    @PostMapping
    public <T> boolean sendExampleMessage(@RequestBody T message) {
        return streamProducer.sendExampleMessage(message);
    }


}
