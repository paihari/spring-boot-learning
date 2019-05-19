package com.gundi.spring.resterror.repository;

import com.gundi.spring.resterror.domain.Author;
import org.springframework.data.repository.CrudRepository;



public interface AuthorRepository extends CrudRepository<Author, Long> {

}
