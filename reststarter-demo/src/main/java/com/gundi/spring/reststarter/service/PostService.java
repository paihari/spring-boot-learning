package com.gundi.spring.reststarter.service;


import com.gundi.spring.reststarter.domain.Post;

public interface PostService {
	
	Iterable<Post> list();
	
	Post create(Post post);
	
	Post read(long id);
	
	Post update(long id, Post post);
	
	void delete(long id);
}
