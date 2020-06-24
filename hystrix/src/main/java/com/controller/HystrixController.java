package com.controller;

import com.feign.Infeign;
import com.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
@RestController
@RequestMapping("/hystrix")
public class HystrixController {
    @Autowired
    private Infeign infeign;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return infeign.findAll();
    }

    @GetMapping("/index")
    public String index(){
        return infeign.index();
    }
}
