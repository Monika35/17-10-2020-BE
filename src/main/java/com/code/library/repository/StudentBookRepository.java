package com.code.library.repository;

import com.code.library.domain.StudentWithBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentBookRepository extends JpaRepository<StudentWithBook,Long> {

}
