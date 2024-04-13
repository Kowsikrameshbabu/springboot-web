package com.example.q3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.q3.model.Student;

@RestController
@RequestMapping("/student")
public class StudentController {

    @GetMapping
    public Student getStudent(){
        Student student = new Student(1L, "kowsik", "This is a student description.");
        return student;
       
    }


}
