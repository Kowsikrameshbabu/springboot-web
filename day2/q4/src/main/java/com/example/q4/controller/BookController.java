package com.example.q4.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.q4.model.Book;

@RestController
@RequestMapping("/book")
public class BookController {
    
    @GetMapping
    public Book getBook(){
        Book book = new Book("The Great Soldier", "G. Gyan", new Date());
        return book;
    }
}
