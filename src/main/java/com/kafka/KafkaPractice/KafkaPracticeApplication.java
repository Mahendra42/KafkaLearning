package com.kafka.KafkaPractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class KafkaPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaPracticeApplication.class, args);
		System.out.println("Kafka Application started Successfully..");
    }

}
