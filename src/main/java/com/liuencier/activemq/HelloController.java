package com.liuencier.activemq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {

    @Autowired
    private Environment environment;

    @RequestMapping("/helloSpringBoot")
    public String hello() {
        return "hello spring boot";
    }

    @RequestMapping("/info")
    public String info() {
        return "info:" + environment.getProperty("url");
    }
}
