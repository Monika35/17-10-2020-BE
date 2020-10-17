package com.code.library.domain;

import javax.persistence.*;

@Entity
@Table(name = "sample", catalog = "library")
public class Sample {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sample_id")
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "book_id", referencedColumnName = "book_id")
    private Book book;

    public Sample() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
