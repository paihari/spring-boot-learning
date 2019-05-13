package com.gundi.spring.mangodb.repository;

import java.math.BigInteger;

import com.gundi.spring.mangodb.domain.Author;
import org.springframework.data.repository.CrudRepository;



public interface AuthorRepository extends CrudRepository<Author, BigInteger> {

}
