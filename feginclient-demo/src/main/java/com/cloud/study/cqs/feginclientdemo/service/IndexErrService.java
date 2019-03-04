package com.cloud.study.cqs.feginclientdemo.service;

import org.springframework.stereotype.Component;

@Component
public class IndexErrService implements IndexService{
    @Override
    public String index(){
        return "eureka-client服务器异常";
    }
}
