package com.gundi.spring.blogger.repository;

import com.gundi.spring.blogger.domain.Author;
import org.springframework.data.repository.CrudRepository;



public interface AuthorRepository extends CrudRepository<Author, Long> {


}
