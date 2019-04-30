package com.gundi.spring.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @RequestMapping("/")
    public String home() {
        return "Hello, Spring Boot";
    }
}
