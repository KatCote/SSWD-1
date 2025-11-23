package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello!";
    }

    @GetMapping("/greet")
    public String greet(String name) {
        if (name == null) {
            return "Hello, Guest!";
        }
        return "Hello, " + name + "!";
    }
}