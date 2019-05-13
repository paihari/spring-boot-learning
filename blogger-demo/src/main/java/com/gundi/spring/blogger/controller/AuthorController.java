package com.gundi.spring.blogger.controller;

import com.gundi.spring.blogger.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authors")
public class AuthorController {

	@Autowired
	AuthorService authorService;

	@RequestMapping("/list")
	public String list(){

		return authorService.list().toString();
	}
	
}
