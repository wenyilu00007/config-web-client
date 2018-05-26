package com.example.configwebclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wenyilu on 2018/5/26.
 */
@RefreshScope
@RestController
public class TestController {

    @Autowired
    private Environment env;
    @Value("${from}")
    private String from;

    @GetMapping("/from")
    public String from(){
        return this.from+"============"+env.getProperty("from");
    }
}
