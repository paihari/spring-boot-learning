package com.gundi.spring.mangodb.controller;

import com.gundi.spring.mangodb.domain.Author;
import com.gundi.spring.mangodb.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/authors")
public class AuthorController {
	
	@Autowired
	AuthorRepository authorRepository;

	@RequestMapping("/list")
	@ResponseBody
	public String list(){

		return authorRepository.findAll().toString();
	}
	
}
