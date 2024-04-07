package com.kafka.KafkaPractice.service;
import com.kafka.KafkaPractice.entity.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
@Component
public class MessageProducer {
    private Logger log =LoggerFactory.getLogger(MessageProducer.class);

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    @Value("${myapp.kafka.topic}")
    private String topic;

    public void sendMessage(String message) {
        log.info("MESSAGE SENT FROM PRODUCER END -> " + message);
        kafkaTemplate.send(topic, message);
    }

    public void sendCustomerObject(Customer message) {
        log.info("MESSAGE SENT FROM PRODUCER END -> " + message.toString());
        kafkaTemplate.send(topic, message);
    }
}
