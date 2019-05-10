package com.gundi.spring.h2.repository;

import com.gundi.spring.h2.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
