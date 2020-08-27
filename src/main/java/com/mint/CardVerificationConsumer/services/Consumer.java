package com.mint.CardVerificationConsumer.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@Slf4j
public class Consumer {

    String newMessage = "";

    @KafkaListener(topics = "com.ng.vela.even.card_verified", groupId = "group_id")
    public void consume(String message) throws IOException {
        log.info(String.format("#### -> Consumed message -> %s", message));
        newMessage += message+"\n";
    }

    public String getConsumedMessage(){
        return  newMessage;
    }
}
