package com.gundi.spring.restdatadhypermedia.repository;

import java.util.List;

import com.gundi.spring.restdatadhypermedia.domain.Post;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;



public interface PostRepository extends PagingAndSortingRepository<Post, Long> {

		List<Post> findByTitleContaining(@Param("title") String title);
	
}
