package com.example.q1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    
    @Autowired
    private final AppConfig ac;

  
    public ApiController(AppConfig ac){
        this.ac=ac;
    }

    @GetMapping
    public String info(){
        return "App Name:"+ac.getAppName()+",Version:"+ac.getAppVersion();
    }

}
