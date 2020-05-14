package com.spring.cloud.stream.stream.rabbit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * @Title: stream
 * @Package com.spring.cloud.stream.stream.rabbit
 * @Author Julius Zhou
 * @Date 2020-05-14 21:57
 * @Description: rabbit消费者
 */
@EnableBinding(value = {Sink.class, Producer.class})
public class SinkReceiver {

    private static final Logger log = LoggerFactory.getLogger(SinkReceiver.class);


    @StreamListener(Reveice.customChannel)
    public void receive(Object message){
        log.info("消费消息：{}",message);
    }
}
