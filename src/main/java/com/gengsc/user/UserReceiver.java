package com.gengsc.user;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * shichaogeng
 * 创建日期：2017/10/30
 * 创建时间: 11:03
 */

@Component
@RabbitListener(queues = "sb.user")
public class UserReceiver {

    @RabbitHandler
    public void process(User user) {
        System.out.println("user receive  : " + user.getName()+"/"+user.getPass());
    }

}
