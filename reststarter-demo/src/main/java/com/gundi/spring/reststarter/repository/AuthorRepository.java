package com.gundi.spring.reststarter.repository;

import com.gundi.spring.reststarter.domain.Author;
import org.springframework.data.repository.CrudRepository;



public interface AuthorRepository extends CrudRepository<Author, Long> {

}
