//package com.code.library.domain;
//
//import com.code.library.dto.BorrowRequest;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "borrows", catalog = "library")
//public class Borrows {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "borrows_id")
//    private Long id;
//    @Column(name = "takenDate")
//    private String takenDate;
//    @Column(name = "returnDate")
//    private String returnDate;
//
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "sample_id", referencedColumnName = "sample_id")
//    private Sample sample;
//
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "student_id", referencedColumnName = "student_id")
//    private Student student;
//
//    public Borrows(String takenDate, String returnDate, Sample sample, Student student) {
//        this.takenDate = takenDate;
//        this.returnDate = returnDate;
//        this.sample = sample;
//        this.student = student;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public Student getStudent() {
//        return student;
//    }
//
//    public void setStudent(Student student) {
//        this.student = student;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//
//    }
//
//    public String getTakenDate() {
//        return takenDate;
//    }
//
//    public void setTakenDate(String takenDate) {
//        this.takenDate = takenDate;
//    }
//
//    public String getReturnDate() {
//        return returnDate;
//    }
//
//    public void setReturnDate(String returnDate) {
//        this.returnDate = returnDate;
//    }
//
//    public Sample getSample() {
//        return sample;
//    }
//
//    public void setSample(Sample sample) {
//        this.sample = sample;
//    }
//
//}
