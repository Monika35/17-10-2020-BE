package com.code.library.repository;

import com.code.library.domain.Borrows;
import com.code.library.dto.Student_Borrow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface BorrowRepository extends JpaRepository<Borrows,Long> {

//    @Query("SELECT new com.code.library.dto.Student_Borrow(b.takenDate) FROM Borrows b")
//    public List<Student_Borrow> getJoinInformation();

    //OVA RABOTI
//    @Query("SELECT new com.code.library.dto.Student_Borrow(s.name , b.takenDate) FROM Borrows b JOIN b.student  s")
//    public List<Student_Borrow> getJoinInformation();

        @Query("SELECT new com.code.library.dto.Student_Borrow(s.name , b.takenDate, bo.name) FROM  Student s,Borrows b,Sample sa,Book bo")
        public List<Student_Borrow> getJoinInformation();

     Borrows getById(Long id);
    //raboti so WHERE
//    @Query("SELECT new com.code.library.dto.Student_Borrow(s.name , b.takenDate) FROM Borrows b JOIN b.student  s WHERE b.student=1")
//    public List<Student_Borrow> getJoinInformation();

//
}
