package com.example.demo2;


import net.bytebuddy.matcher.ElementMatcher;
import org.apache.tomcat.jni.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
public class EmployeeController {
@Autowired
EmployeeRepository employeeRepository;
@Autowired
FindUser findUser;
@Autowired
StudentRepository studentRepository;

    @GetMapping(value="/b")


    public Employee See(@RequestAttribute String id){

        System.out.println("id");
           return findUser.findById(1);
    }
    @GetMapping(value="/student")

    public Student getStudent(){

        Student student=new Student(1,"Kasun");

        studentRepository.save(student);
        return student;
    }






}
