package com.kafka.KafkaPractice.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TopicCreation {
// to create a topic from spring boot application.
    /*@Bean
    public NewTopic topicCreation(){
        return new NewTopic("Mahendra_Topic",5, (short) 1);
    }*/
}
