package com.spring.cloud.stream.service;


/**
 * @Title: stream
 * @Package com.spring.cloud.stream.service
 * @Author Julius Zhou
 * @Date 2020-05-14 22:45
 * @Description:
 */
public interface ProducerService {

    /**
     * 发送消息到指定主题
     * @param message
     */
    void sendMessage(String message);
}
