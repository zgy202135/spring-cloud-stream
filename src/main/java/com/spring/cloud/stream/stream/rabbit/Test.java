package com.spring.cloud.stream.stream.rabbit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * @Package: com.spring.cloud.stream.stream.rabbit
 * @ClassName: Test
 * @Author: Julius
 * @Description: ${description}
 * @Date: 2020/5/15 16:58
 * @Version: 1.0
 */
@EnableBinding(Producer.class)
public class Test {
    private static final Logger log = LoggerFactory.getLogger(Test.class);
    @StreamListener("exchangeOut")
    public void receive(Object message){
        log.info("消费消息：{}",message);
    }
}
