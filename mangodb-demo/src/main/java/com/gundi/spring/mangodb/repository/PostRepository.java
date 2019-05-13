package com.gundi.spring.mangodb.repository;

import java.math.BigInteger;
import java.util.List;

import com.gundi.spring.mangodb.domain.Post;
import org.springframework.data.repository.CrudRepository;



public interface PostRepository extends CrudRepository<Post, BigInteger> {

	Post findFirstByOrderByPostedOnDesc();

	List<Post> findAllByOrderByPostedOnDesc();

	Post findBySlug(String slug);

}
