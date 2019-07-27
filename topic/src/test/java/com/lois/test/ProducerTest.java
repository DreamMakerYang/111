package com.lois.test;

import com.lois.topic.TopicApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TopicApplication.class)
public class ProducerTest {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    public void testSend1(){
        rabbitTemplate.convertAndSend("exchange2","queue1.abc","主题模式测试，routingkey=queue1.abc");
    }

    @Test
    public void testSend2(){
        rabbitTemplate.convertAndSend("exchange2","queue1.queue2.abc","主题模式测试，routingkey=queue1.queue2.abc");
    }
}
