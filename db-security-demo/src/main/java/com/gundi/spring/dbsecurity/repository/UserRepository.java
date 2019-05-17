package com.gundi.spring.dbsecurity.repository;

import com.gundi.spring.dbsecurity.domain.User;
import org.springframework.data.repository.CrudRepository;



public interface UserRepository extends CrudRepository<User, Long> {

	User findByEmail(String email);
	
}
