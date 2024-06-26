package com.kafka.KafkaPractice.controller;

import com.kafka.KafkaPractice.entity.Customer;
import com.kafka.KafkaPractice.repository.MessageRepository;
import com.kafka.KafkaPractice.service.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaRestController {
    @Autowired
    private MessageProducer producer;

    @Autowired
    private MessageRepository messageRepo;

    //Send message to kafka
    @GetMapping("/send")
    public String sendMsg(
            @RequestParam("msg") String message) {
        producer.sendMessage(message);
        return "" +"'+message +'" + " sent successfully!";
    }

    @GetMapping("/sendObject")
    public String sendMsg(
            @RequestBody Customer message) {
        producer.sendCustomerObject(message);
        return "" +"'+message +'" + " sent successfully!";
    }

    //Read all messages
    @GetMapping("/getAll")
    public String getAllMessages() {
        return messageRepo.getAllMessages() ;
    }
}
