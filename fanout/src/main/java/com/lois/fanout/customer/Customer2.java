package com.lois.fanout.customer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "queue2")
public class Customer2 {
    @RabbitHandler
    public void showMessage(String message){
        System.out.println("Customer2222接受到的信息："+message);
    }
}
