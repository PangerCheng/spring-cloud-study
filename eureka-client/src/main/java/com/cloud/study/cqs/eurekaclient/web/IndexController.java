package com.cloud.study.cqs.eurekaclient.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class IndexController {

    @Value("${server.port}")
    private int port;

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${test.title}")
    private String title;

    @RequestMapping("index")
    public String index(){
        return String.format("Hello to %s,port:%d,title=%s",applicationName,port,title);
    }
}
