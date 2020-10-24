//package com.code.library.service;
//
//import com.code.library.domain.Borrows;
//import com.code.library.domain.Sample;
//import com.code.library.domain.Student;
//import com.code.library.dto.BorrowRequest;
//import com.code.library.repository.BorrowRepository;
//import com.code.library.repository.SampleRepository;
//import com.code.library.repository.StudentRepository;
//import com.code.library.repository.StudentWithBookRepository;
//import org.springframework.stereotype.Service;
//
//import java.time.LocalDateTime;
//import java.util.List;
//
//@Service
//public class BorrowsService {
//
//    private final BorrowRepository borrowRepository;
//    private final StudentWithBookRepository studentWithBookRepository;
//    private final StudentRepository studentRepository;
//    private final SampleRepository sampleRepository;
//
//
//    public BorrowsService(BorrowRepository borrowRepository, StudentWithBookRepository studentWithBookRepository,
//                          StudentRepository studentRepository, SampleRepository sampleRepository) {
//        this.borrowRepository = borrowRepository;
//        this.studentWithBookRepository = studentWithBookRepository;
//        this.studentRepository = studentRepository;
//        this.sampleRepository = sampleRepository;
//    }
//
//    public Borrows findById(Long id){
//        return borrowRepository.getById(id);
//    }
//
//    public void delete(Long id){
//        Borrows borrows=findById(id);
//        borrowRepository.delete(borrows);
//    }
//
//    public List<Borrows> getAllBorrows(){
//        return borrowRepository.findAll();
//    }
//
//    public void addBorrow(BorrowRequest borrowRequest){
//        Student student = studentRepository.findBySindex(borrowRequest.Sindex);
//        Sample sample = sampleRepository.findById(borrowRequest.sampleId).orElseThrow(RuntimeException::new);
//        borrowRepository.save(new Borrows( LocalDateTime.now().toString(),"" , sample, student));
//    }
//
//    // test branch
//    //Test za COMMIT
////    public void addStudentWithBook(StudentWithBook student){
////        studentWithBookRepository.save(student);
////    }
//}
