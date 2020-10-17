package com.code.library.repository;

import com.code.library.domain.BookWithAuthor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookWithAuthorRepository extends JpaRepository<BookWithAuthor,Long> {

    Optional<BookWithAuthor> findById(Long id);
}
