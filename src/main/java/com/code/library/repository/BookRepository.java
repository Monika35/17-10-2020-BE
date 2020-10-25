package com.code.library.repository;

import com.code.library.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {
    Book getById(Integer id);

    List<Book> findAll();

//    List<Book> findBy_AuthorName();
}
