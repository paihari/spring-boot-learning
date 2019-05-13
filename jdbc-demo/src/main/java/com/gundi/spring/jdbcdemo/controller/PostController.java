package com.gundi.spring.jdbcdemo.controller;

import com.gundi.spring.jdbcdemo.service.PostService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
public class PostController {
	
	private static final Logger logger = LoggerFactory.getLogger(PostController.class);
	
	private PostService postService;
	
	@Autowired
	public PostController(PostService postService){
		this.postService = postService;
	}

	@RequestMapping("/list")
	public String listPosts(){

		return postService.list().toString();

	}

	@RequestMapping("/view/{slug}")
	public String view(@PathVariable(value="slug") String slug){

		return postService.getBySlug(slug).toString();
	}
}
