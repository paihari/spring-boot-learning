package com.gundi.spring.externalconfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {

    @Value("${pageController.msg}")
    private String pageControllerMsg;

    @RequestMapping("/")
    public String home() {

        return pageControllerMsg;
    }
}
