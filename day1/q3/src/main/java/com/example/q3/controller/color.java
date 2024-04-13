package com.example.q3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class color {
    @GetMapping("/color")
    public String getColor(@RequestParam(required=false) String color){
        return "color "+color;
    }
}
