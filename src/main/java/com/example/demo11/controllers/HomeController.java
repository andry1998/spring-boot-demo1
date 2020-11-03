package com.example.demo11.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {
    @RequestMapping("/api/hi")
    public String hi() {
        return "welcome!";
    }
}
