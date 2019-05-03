package com.gundi.spring.profile.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {

    @Value("${spring.profiles.active}")
    private String profile;

    @Value("${msg}")
    private String message;


    @RequestMapping("/")
    public String home() {
        return profile  + "  "  + message;
    }
}
