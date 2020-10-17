package com.code.library.repository;

import com.code.library.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface StudentRepository extends JpaRepository<Student, Long> {

    Student getById(Long id);

    @Modifying
    @Query(value = "UPDATE Student s SET s.name = :name WHERE s.id = :id")
    int updateStudent(@Param("id")Long id, @Param("name")String name);

    @Query(value= "select s from Student as s where s.s_index = :s_index")
    Student findBySindex(@Param("s_index") String s_index);
}
