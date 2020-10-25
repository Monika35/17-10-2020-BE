//package com.code.library.domain;
//
////import jdk.nashorn.internal.ir.annotations.Immutable;
//
//import javax.persistence.*;
//
//@Entity
////@Immutable
//@Table(name = "student_books", catalog = "library")
//public class StudentWithBook {
//
//    @Id
//    @Column(name="id")
//    private Long id;
//
//    @Column(name = "s_index")
//    private String index;
//
//    @Column(name=" s_name")
//    private String name;
//
//    @Column(name="s_surname")
//    private String surname;
//
//    @Column(name = "sample_id")
//    private Long sampleId;
//
//    @Column(name="b_name")
//    private String bookName;
//
//    public StudentWithBook() {
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
//    public String getIndex() {
//        return index;
//    }
//
//    public void setIndex(String index) {
//        this.index = index;
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
//    public Long getSampleId() {
//        return sampleId;
//    }
//
//    public void setSampleId(Long sampleId) {
//        this.sampleId = sampleId;
//    }
//
//    public String getBookName() {
//        return bookName;
//    }
//
//    public void setBookName(String bookName) {
//        this.bookName = bookName;
//    }
//
//    @Override
//    public String toString() {
//        return "StudentWithBook{" +
//                "index=" + index +
//                ", name='" + name + '\'' +
//                ", surname='" + surname + '\'' +
//                ", sampleId=" + sampleId +
//                ", bookName='" + bookName + '\'' +
//                '}';
//    }
//}
