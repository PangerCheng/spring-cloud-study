package com.cloud.study.cqs.feginclientdemo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "eureka-client",fallback = IndexErrService.class)
public interface IndexService {
    @RequestMapping(value = "/index")
    String index();
}
