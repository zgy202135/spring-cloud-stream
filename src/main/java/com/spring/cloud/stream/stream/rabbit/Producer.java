package com.spring.cloud.stream.stream.rabbit;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
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

    @Output(Reveice.customChannel)
    MessageChannel output();
}
