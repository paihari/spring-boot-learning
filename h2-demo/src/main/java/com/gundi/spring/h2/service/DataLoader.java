package com.gundi.spring.h2.service;

import java.util.Date;

import javax.annotation.PostConstruct;

import com.gundi.spring.h2.domain.Author;
import com.gundi.spring.h2.domain.Post;
import com.gundi.spring.h2.repository.AuthorRepository;
import com.gundi.spring.h2.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class DataLoader {

	private PostRepository postRepository;
	private AuthorRepository authorRepository;
	
	@Autowired
	public DataLoader(PostRepository postRepository,AuthorRepository authorRepository){
		this.postRepository = postRepository;
		this.authorRepository = authorRepository;
	}
	
	@PostConstruct
	private void loadData(){
		// create an author
		Author dv = new Author("Hari","Bantwal");
		authorRepository.save(dv);
		
		// create a post
		Post post = new Post("Spring Data Rocks!");
		post.setBody("Post Body here...");
		post.setPostedOn(new Date());
		post.setAuthor(dv);
		postRepository.save(post);
	}
	
}
