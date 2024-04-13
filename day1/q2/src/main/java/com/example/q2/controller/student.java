package com.example.q2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class student {

    @GetMapping("name")
    public String getName( @RequestParam(required=false) String name){
        return "Student Name :"+name;
    }

}
