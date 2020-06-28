package com.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.PublicKey;

@RestController
@RequestMapping("/configcilent")
public class MyconfigController {

    /*@Value("${server.port}")
    private String duangkou;

    @RequestMapping("/index")
    public String index(){
        return  this.duangkou;
    }*/
}
