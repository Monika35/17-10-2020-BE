package com.code.library.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="book", catalog = "library")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="book_id")
    private Long id;
    @Column(name="b_name")
    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "type_id", referencedColumnName = "type_id")
    private Type type;

//    @OneToMany(mappedBy = "book")
//    private List<SampleBook> sampleBooks;

    public Book() {
    }

    public Book(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
