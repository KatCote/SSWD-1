package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

    @GetMapping("/echo")
    public String echo(String message) {
        return "Echo: " + message;
    }

    @GetMapping("/repeat/{text}")
    public String repeat(@PathVariable String text) {
        return "Repeated: " + text;
    }
}
