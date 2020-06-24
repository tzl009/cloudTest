package com.server;

import com.pojo.Student;

import java.util.Collection;

public interface Istudentserver {
    public Collection<Student> findAll();
    public Student findById(long id);
    public void saveOrUpdate(Student student);
    public void deleteById(long id);
}
