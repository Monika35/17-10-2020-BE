//package com.code.library.api;
//
//import com.code.library.domain.Student;
//import com.code.library.domain.StudentWithBook;
//import com.code.library.service.StudentService;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping(path = "/api/students")
//@CrossOrigin
//public class StudentController {
//
//    private final StudentService studentService;
//
//    public StudentController(StudentService studentService) {
//        this.studentService = studentService;
//    }
//
//    @GetMapping(value = "/")
//    public List<StudentWithBook> getStudentsWithBooks(){
//        return studentService.getStudentsWithBooks();
//    }
//
//    @RequestMapping(method = RequestMethod.POST,value = "/post")
//    public void addStudent(@RequestBody Student student){
//        studentService.addStudent(student);
//    }
//
//}
