package com.gundi.spring.h2.repository;

import com.gundi.spring.h2.domain.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {


}
