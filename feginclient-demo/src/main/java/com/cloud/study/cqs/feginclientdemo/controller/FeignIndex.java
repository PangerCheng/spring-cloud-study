package com.cloud.study.cqs.feginclientdemo.controller;

import com.cloud.study.cqs.feginclientdemo.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignIndex {

    @Autowired
    private IndexService indexService;

    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return indexService.index();
    }

}
