//package com.code.library.domain;
//
//import com.code.library.dto.StudentRequest;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name="student", catalog ="library")
//public class Student {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "student_id")
//    private Long id;
//    @Column(name = "s_index")
//    private String s_index;
//    @Column(name = "s_name")
//    private String name;
//    @Column(name = "s_surname")
//    private String surname;
//    @Column(name = "program")
//    private String program;
//
//    public Student() {
//    }
//    //@ToDo implement this method !!!
//    public Student(StudentRequest request){
//
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//
//    public String getS_index() {
//        return s_index;
//    }
//
//    public void setS_index(String s_index) {
//        this.s_index = s_index;
//    }
//
//    public String getTitle() {
//        return name;
//    }
//
//    public void setTitle(String name) {
//        this.name = name;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//
//    public String getProgram() {
//        return program;
//    }
//
//    public void setProgram(String program) {
//        this.program = program;
//    }
//}
