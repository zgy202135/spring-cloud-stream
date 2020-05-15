package com.spring.cloud.stream.stream.rabbit;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.stereotype.Component;

import javax.xml.transform.Source;

/**
 * @Title: stream
 * @Package com.spring.cloud.stream.stream.rabbit
 * @Author Julius Zhou
 * @Date 2020-05-14 22:23
 * @Description: 定义发布者接口
 */
@Component
public interface Producer extends Source {
    /**
     *
     * @return
     */
    @Output("exchangeOut")
    MessageChannel output();

    /**
     * 绑定消费通道
     * @return
     */
    @Input("exchangeOut1")
    SubscribableChannel receive();
}
