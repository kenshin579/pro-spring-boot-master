package com.apress.spring.rabbitmq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//todo: 아래 annotation은 어떤 역할을 하나? 그리고 @Autowired와 어떤 관계가 있나?
@Component
public class Producer {
    private static final Logger log = LoggerFactory.getLogger(Producer.class);

    @Autowired
    RabbitTemplate rabbitTemplate;

    public void sendTo(String routingkey, String message) {
        log.info("전송> ...");
        this.rabbitTemplate.convertAndSend(routingkey, message);
    }
}
