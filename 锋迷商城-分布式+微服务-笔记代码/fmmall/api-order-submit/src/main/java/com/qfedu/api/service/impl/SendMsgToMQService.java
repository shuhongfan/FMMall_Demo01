package com.qfedu.api.service.impl;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SendMsgToMQService {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void sendMsg(String orderId){
        amqpTemplate.convertAndSend("ex6","key1",orderId);
    }

}
