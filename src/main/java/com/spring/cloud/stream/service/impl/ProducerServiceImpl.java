package com.spring.cloud.stream.service.impl;

import com.spring.cloud.stream.service.ProducerService;
import com.spring.cloud.stream.stream.rabbit.Producer;
import com.spring.cloud.stream.stream.rabbit.Reveice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

/**
 * @Title: stream
 * @Package com.spring.cloud.stream.service.impl
 * @Author Julius Zhou
 * @Date 2020-05-14 22:45
 * @Description:
 */
@Service
public class ProducerServiceImpl implements ProducerService {

    private static final Logger log = LoggerFactory.getLogger(ProducerService.class);

    @Autowired
    @Qualifier(Reveice.customChannel)
    private MessageChannel output;

    /**
     * 发送消息到指定主题
     *
     * @param message
     */
    @Override
    public void sendMessage(String message) {
//        messageTemplate = producer.output();
        log.info("发布消息：{}",message);
        Message<String> source = MessageBuilder.withPayload(message).build();
        output.send(source);
    }
}
