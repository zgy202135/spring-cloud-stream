package com.spring.cloud.stream.controller;

import com.spring.cloud.stream.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title: stream
 * @Package com.spring.cloud.stream.controller
 * @Author Julius Zhou
 * @Date 2020-05-14 22:27
 * @Description: stream控制器
 */
@RestController
public class StreamController {

    @Autowired
    private ProducerService producerService;


    @PutMapping("/stream/producer")
    public void Producer(@RequestBody String message){
        producerService.sendMessage(message);
    }
}
