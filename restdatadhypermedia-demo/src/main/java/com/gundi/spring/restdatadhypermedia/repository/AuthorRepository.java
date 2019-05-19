package com.gundi.spring.restdatadhypermedia.repository;

import com.gundi.spring.restdatadhypermedia.domain.Author;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface AuthorRepository extends PagingAndSortingRepository<Author, Long> {

}
