package com.example.demo2;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController()
public class EmployeeController {

    @GetMapping(value="/b")
    public String viewEmployee(){
        System.out.println("Method invoked");
        return "yasitha";
    }
}
