package com.contorller;

import com.pojo.Student;
import com.server.serverImp.IstudentserverImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/student")
public class Studentcontor {
    @Value("${server.port}")
    private String id;
    @Autowired
    private IstudentserverImp istudentserverImp;
    @GetMapping(value = "/findAll")
    public Collection<Student> findAll(){
        return istudentserverImp.findAll();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") long id){
        return istudentserverImp.findById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student){
        istudentserverImp.saveOrUpdate(student);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student){
        istudentserverImp.saveOrUpdate(student);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id){
        istudentserverImp.deleteById(id);
    }
    @GetMapping("/index")
    public String index(){
        return id;
    }
}
