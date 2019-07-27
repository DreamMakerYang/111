package com.lois.topic.customer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "queue1")
public class Customer1 {
    @RabbitHandler
    public void showMessage(String message){
        System.out.println("Customer1111接受到的信息："+message);
    }
}
