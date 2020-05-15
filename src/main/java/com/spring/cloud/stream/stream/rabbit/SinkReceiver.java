package com.spring.cloud.stream.stream.rabbit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.cloud.stream.messaging.Source;

/**
 * @Title: stream
 * @Package com.spring.cloud.stream.stream.rabbit
 * @Author Julius Zhou
 * @Date 2020-05-14 21:57
 * @Description: rabbit消费者
 */
@EnableBinding(value = {Producer.class})
public class SinkReceiver {



}
