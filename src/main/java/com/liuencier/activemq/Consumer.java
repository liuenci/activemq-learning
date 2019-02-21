package com.liuencier.activemq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author liuenci
 */
@Component
@Slf4j
public class Consumer {

    @JmsListener(destination = "my_msg")
    public void readMsg(String text) {
        log.info("接收到消息:{}",text);
    }

    @JmsListener(destination = "my_map")
    public void readMap(Map map) {
        log.info("接收到消息:{}",map);
    }
}
