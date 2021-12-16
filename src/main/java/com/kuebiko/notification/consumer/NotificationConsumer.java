package com.kuebiko.notification.consumer;

import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class NotificationConsumer {

    @KafkaListener(topics = "order-events", groupId = "oe")
    public void onMessage(String message){
        System.out.println(message);

    }
}
