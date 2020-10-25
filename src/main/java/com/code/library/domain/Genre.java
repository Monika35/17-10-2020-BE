package com.code.library.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="genre", catalog="elib")
public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_genre")
    private int id;

    @Column(unique=true, name="name", nullable = false)
    private String name;

    @Column(name="description", nullable = false)
    private String description;

    @ManyToMany(mappedBy = "genres")
    private Set<Book> books;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Genre(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Genre(String name) {
        this.name = name;
    }

    public Genre() {}
}
