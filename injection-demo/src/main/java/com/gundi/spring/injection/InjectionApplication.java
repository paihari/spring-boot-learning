package com.gundi.spring.injection;

import com.gundi.spring.injection.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InjectionApplication {

    public static void main(String[] args) {
        ApplicationContext ctx =  SpringApplication.run(InjectionApplication.class, args);
        String[] beanNames = ctx.getBeanDefinitionNames();
        for(String name: beanNames) {
            System.out.println(name);
        }
        System.out.println(ctx.getBean("user"));

    }

    @Bean
    public User user () {
        return new User("Hari", "Bantwal");
    }

}
