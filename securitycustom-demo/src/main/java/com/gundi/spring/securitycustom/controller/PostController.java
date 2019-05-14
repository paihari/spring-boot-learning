package com.gundi.spring.securitycustom.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

	//@Secured("ROLE_USER")
	@RequestMapping("/posts/")
	public String list(){
		return "list posts...";
	}

	@Secured("ROLE_ADMIN")
	@RequestMapping("/admin/posts/create")
	public String addPost(){
		return "add posts...";
	}
	
}
