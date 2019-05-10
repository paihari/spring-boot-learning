package com.gundi.spring.exception.controller;

import com.gundi.spring.exception.domain.Post;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("/posts")
public class PostController {


    private static final Logger logger = LoggerFactory.getLogger(PostController.class);


    @RequestMapping("/get/{slug}")
    public String getPosts(@PathVariable(value = "slug") String slug )throws  Exception {
        Post post = null;
        if(post == null ) {
            throw new Exception("Could not find slug " + slug);
        }
        return "post";
    }

    /*

    @ExceptionHandler(Exception.class)
    public String handleException(HttpServletRequest request, Exception exception, Model model) {
        model.addAttribute("errorMessage", exception.getMessage());
        return "postError";


    }
*/


}
