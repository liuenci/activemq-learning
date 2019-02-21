package com.liuencier.activemq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@Slf4j
public class Producer {
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @RequestMapping("/sendMsg")
    public void sendMsg(String msg) {
        jmsMessagingTemplate.convertAndSend("my_msg", msg);
        log.info("msg发送成功");
    }

    @RequestMapping("/sendMap")
    public void sendMap() {
        Map map = new HashMap<>();
        map.put("mobile", "1234");
        map.put("content", "cier");
        jmsMessagingTemplate.convertAndSend("my_map", map);
        log.info("map发送成功");
    }
}
