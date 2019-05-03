package com.gundi.spring.profile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ProfileApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext ctx = SpringApplication.run(ProfileApplication.class, args);
        System.out.println(ctx.getBean("dataSource"));

    }

}
