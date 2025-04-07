package com.example.demoApplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    // Basic GET method that returns a string
    @GetMapping("/test")
    public String getTestMessage() {
        return "Hello, this is a test response!";
    }
}