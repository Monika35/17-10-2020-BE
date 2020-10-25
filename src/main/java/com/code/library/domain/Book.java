package com.code.library.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="book", catalog = "elib")
public class Book implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_book")
    private Integer id;

    @Column(name="title")
    private String title;

    @Column(name="isbn")
    private String isbn;

    @Column(name="book_description")
    private String description;

    @Column(name="img")
    private String img;

//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "type_id", referencedColumnName = "type_id")
//    private Type type;

//    @OneToMany(mappedBy = "book")
//    private List<SampleBook> sampleBooks;


    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getDescription() {
        return description;
    }

    public String getImg() {
        return img;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Book(String title, String isbn, String description, String img) {
        this.title = title;
        this.isbn = isbn;
        this.description = description;
        this.img = img;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", description='" + description + '\'' +
                ", img='" + img + '\'' +
                '}';
    }
}
