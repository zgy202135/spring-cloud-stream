package com.spring.cloud.stream.stream.rabbit;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.SubscribableChannel;

/**
 * @Title: stream
 * @Package com.spring.cloud.stream.stream.rabbit
 * @Author Julius Zhou
 * @Date 2020-05-14 22:39
 * @Description:
 */
public interface Reveice extends Sink {

    /**
     * 自定义输入通道（消息消费者）
     */
    String customChannel = "djj";


    /**
     * 绑定消费通道
     * @return
     */
    @Input(Reveice.customChannel)
    SubscribableChannel receive();
}
