package com.code.library.domain;


import javax.persistence.*;

@Entity
@Table(name = "author", catalog = "elib")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_author")
    private Integer idAuthor;

    @Column(name = "name")
    private String name;

    @Column(name = "country")
    private String country;


    public Author() {
    }

    public Integer getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(Integer idAuthor) {
        this.idAuthor = idAuthor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
