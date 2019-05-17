package com.gundi.spring.dbsecurity.service;


import com.gundi.spring.dbsecurity.domain.User;

public interface UserService {

	public User findByEmail(String email);
	
}
