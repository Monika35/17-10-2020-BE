package com.code.library.repository;

import com.code.library.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
    public Author getByName(String author);

}
