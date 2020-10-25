package com.code.library.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

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

    @ManyToMany
    @JoinTable(
            name = "book_author",
            joinColumns = { @JoinColumn(name="id_book") },
            inverseJoinColumns = { @JoinColumn(name="id_author") }
    )
    private Set<Author> authors;

    @ManyToMany
    @JoinTable(
            name = "book_genre",
            joinColumns = { @JoinColumn(name="id_book") },
            inverseJoinColumns = { @JoinColumn(name="id_genre") }
    )
    private Set<Genre> genres;

    public Integer getId() {
        return id;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
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

    public Set<Genre> getGenres() {
        return genres;
    }

    public void setGenres(Set<Genre> genres) {
        this.genres = genres;
    }

    public Book(String title, String isbn, String description, String img) {
        this.title = title;
        this.isbn = isbn;
        this.description = description;
        this.img = img;
    }

    public Book(String title, String isbn, String description, String img, Set<Author> authors) {
        this.title = title;
        this.isbn = isbn;
        this.description = description;
        this.img = img;
        this.authors = authors;
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
