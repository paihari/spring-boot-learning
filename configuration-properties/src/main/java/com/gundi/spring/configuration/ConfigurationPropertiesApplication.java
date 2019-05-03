package com.gundi.spring.configuration;

import com.gundi.spring.configuration.config.MyAppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ConfigurationPropertiesApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext ctx = SpringApplication.run(ConfigurationPropertiesApplication.class, args);
        MyAppConfig appConfig = (MyAppConfig) ctx.getBean("myAppConfig");
        System.out.println(appConfig);
    }

}
