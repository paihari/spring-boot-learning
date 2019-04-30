package com.gundi.api.reststarter.repository;

import com.gundi.api.reststarter.domain.Author;
import org.springframework.data.repository.CrudRepository;



public interface AuthorRepository extends CrudRepository<Author, Long> {

}
