package com.kafka.KafkaPractice.service;

import com.kafka.KafkaPractice.entity.Customer;
import com.kafka.KafkaPractice.repository.MessageRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {
    private Logger log = LoggerFactory.getLogger(MessageConsumer.class);

    @Autowired
    private MessageRepository messageRepo;

   /* @KafkaListener(topics = "${myapp.kafka.topic}", groupId = "xyz")
    public void consume(String message) {
        log.info("MESSAGE RECEIVED AT CONSUMER END -> " + message);
        messageRepo.addMessage(message);
    }*/

    @KafkaListener(topics = "${myapp.kafka.topic}", groupId = "xyz")
    public void consume123(Customer message) {
        log.info("Object RECEIVED AT CONSUMER END -> " + message.toString());
        messageRepo.addMessage(message.toString());
    }
}
