package com.feign;

import com.feign.feignImp.Errfeign;
import com.pojo.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@FeignClient(value = "provider",fallback = Errfeign.class)
public interface Infeign {
    @GetMapping("/student/findAll")
    public Collection<Student> findAll();
    @GetMapping("/student/index")
    public String index();
}
