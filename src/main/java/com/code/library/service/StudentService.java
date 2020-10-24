//package com.code.library.service;
//
//import com.code.library.domain.Student;
//import com.code.library.domain.StudentWithBook;
//import com.code.library.dto.StudentRequest;
//import com.code.library.repository.StudentBookRepository;
//import com.code.library.repository.StudentRepository;
//import org.springframework.stereotype.Service;
//
//import javax.transaction.Transactional;
//import java.util.List;
//import java.util.logging.Logger;
//
//@Service
//public class StudentService {
//
//    private final StudentRepository studentRepository;
//    private final StudentBookRepository studentBookRepository;
//    private final Logger logger = Logger.getGlobal();
//
//    public StudentService(StudentRepository studentRepository, StudentBookRepository studentBookRepository) {
//        this.studentRepository = studentRepository;
//        this.studentBookRepository = studentBookRepository;
//    }
//
//    public Student createStudent(StudentRequest request) {
//        logger.info("Processing new Student request trying to save Student ["+request+"]");
//        return studentRepository.save(new Student(request));
//    }
//
//    @Transactional
//    public Student updateStudent(StudentRequest request){
//        logger.info("Processing new Student update request trying to update Student ["+request+"]");
//        studentRepository.updateStudent(request.id, request.name);
//     return studentRepository.findById(request.id).map(it-> it).orElseThrow(  RuntimeException::new);
//    }
//
//    public List<StudentWithBook> getStudentsWithBooks(){
//        return this.studentBookRepository.findAll();
//    }
//
//    public void addStudent(Student student){
//        studentRepository.save(student);
//    }
//}
