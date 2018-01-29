package com.gengsc.topic;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * shichaogeng
 * 创建日期：2017/10/30
 * 创建时间: 11:10
 */
@Component
@RabbitListener(queues = "sb.info.user")
public class TopicUserMessageReceiver {

    @RabbitHandler
    public void process(String msg) {
        System.out.println("TopicUserMessageReceiver  : " +msg);
    }

}