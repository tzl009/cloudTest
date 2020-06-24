package com.feign.feignImp;

import com.feign.Infeign;
import com.pojo.Student;
import org.springframework.stereotype.Component;

import java.util.Collection;
@Component
public class Errfeign implements Infeign {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "别访问啦....快回家吃饭..........";
    }
}
