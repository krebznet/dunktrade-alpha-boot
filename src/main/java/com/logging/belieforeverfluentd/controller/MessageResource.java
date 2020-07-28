package com.logging.belieforeverfluentd.controller;

import com.logging.belieforeverfluentd.model.RequestMessage;

import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.annotation.SubscribeMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageResource {
    // broadcast mode
    @MessageMapping("/broadcast")
    @SendTo("/topic/broadcast")
    public String broadcast(RequestMessage request) {
        return "server: " + request.getBody();
    }

    // subscribe mode
    @SubscribeMapping("/subscribe/{id}")
    public String subscribe(@DestinationVariable Long id) {
        return "subscribe " + id + " success";
    }
}