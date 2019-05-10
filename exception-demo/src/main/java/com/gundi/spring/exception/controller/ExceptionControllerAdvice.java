package com.gundi.spring.exception.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ExceptionControllerAdvice {


    @ExceptionHandler(Exception.class)
    public String handleException(HttpServletRequest request, Exception exception, Model model) {
        model.addAttribute("exception", exception);
        return "errorHandler";


    }

}
