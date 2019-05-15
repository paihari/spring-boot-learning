package com.gundi.spring.securityjpa.service;


import com.gundi.spring.securityjpa.domain.User;

public interface UserService {

	public User findByEmail(String email);
	
}
