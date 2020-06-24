package com.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/conifg")
public class configcilent {
    @Value("${server.port}")
    private String duankou;
    @RequestMapping("/index")
    public String index(){
        return this.duankou;
    }
}
