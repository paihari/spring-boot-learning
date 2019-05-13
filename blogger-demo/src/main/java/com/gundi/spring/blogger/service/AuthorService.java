package com.gundi.spring.blogger.service;

import com.gundi.spring.blogger.domain.Author;
import com.gundi.spring.blogger.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    private AuthorRepository authorRepository;

    @Autowired
    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Iterable<Author> list() {
        return authorRepository.findAll();
    }
}
