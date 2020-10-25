package com.code.library.service;

import com.code.library.domain.Author;
import com.code.library.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public List<Author> getAll() {
        return authorRepository.findAll();
    }

    public Author getOrCreateAuthor(String name) {
        Author author = authorRepository.getByName(name);
        if (author != null) {
            return author;
        }
        System.out.println("existing author " + name);
        author = new Author(name);
        return authorRepository.save(author);
    }
}
