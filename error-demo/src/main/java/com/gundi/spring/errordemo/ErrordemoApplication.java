package com.gundi.spring.errordemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;

@SpringBootApplication
public class ErrordemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(ErrordemoApplication.class, args);
    }

//    @Bean
//    public ServletWebServerFactory containerCustomizer(){
//        return ( container -> {
//            ErrorPage custom404Page = new ErrorPage(HttpStatus.NOT_FOUND,"/404");
//            //container.
//            //container.addErrorPages(custom404Page);
//        });
//    }

}
