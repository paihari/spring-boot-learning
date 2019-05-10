package com.gundi.spring.h2;

import com.gundi.spring.h2.domain.Post;
import com.gundi.spring.h2.repository.PostRepository;
import com.gundi.spring.h2.service.DataLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class H2Application {

    private static final Logger logger = LoggerFactory.getLogger(H2Application.class);

    public static void main(String[] args) {
        SpringApplication.run(H2Application.class, args);
    }


    @Autowired
    PostRepository postRepository;

    @Autowired
    DataLoader dataLoader;

    @PostConstruct
    void seePosts() {
        logger.info("seePosts method called ...");
        for(Post post: postRepository.findAll()) {
            logger.info(post.toString());
        }

    }

}
