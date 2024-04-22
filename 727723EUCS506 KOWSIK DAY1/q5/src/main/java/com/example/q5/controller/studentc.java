package com.example.q5.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
@RestController
public class studentc {

    @GetMapping("/student")
    public List<student> getStudents(){
        List<student> alist=new ArrayList<>();
        student obj=new student();
        obj.setName("kowsik");
        obj.setMessage("Hi Kowsik,how r u");
        alist.add(obj);
        return alist;
    }
}
