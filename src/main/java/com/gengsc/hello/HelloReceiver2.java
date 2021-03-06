package com.gengsc.hello;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * shichaogeng
 * 创建日期：2017/10/30
 * 创建时间: 10:56
 */
@Component
@RabbitListener(queues = "sb.hello")
public class HelloReceiver2 {

    @RabbitHandler
    public void process(String hello) {
        System.out.println("Receiver2  : " + hello);
    }

}