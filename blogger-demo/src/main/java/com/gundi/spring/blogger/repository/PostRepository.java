package com.gundi.spring.blogger.repository;

import java.util.List;

import com.gundi.spring.blogger.domain.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

	/*
	 * I will return the last post that was created.
	 */
	Post findFirstByOrderByPostedOnDesc();

	List<Post> findAllByOrderByPostedOnDesc();

	Post findBySlug(String slug);

}
