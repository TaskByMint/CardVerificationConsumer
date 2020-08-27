package com.mint.CardVerificationConsumer.controller;


import com.mint.CardVerificationConsumer.services.Consumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/card-scheme")
public class ConsumerController {

    @Autowired
    Consumer consumer;


   @GetMapping(value = "/consume")
    public String verifyCard() {

            String message = consumer.getConsumedMessage();
            return message;

    }




}
