package com.code.library.dto;

import java.util.List;

public class BookRequest {
    // Book properties
    private String title;
    private String isbn;
    private String img;
    private String description;

    // props for linked objects
    private List<AuthorRequest> authors;
    private List<GenreRequest> genres;

    public BookRequest(String title, String isbn, String img, String description,
                       List<AuthorRequest> authors, List<GenreRequest> genres) {
        this.title = title;
        this.isbn = isbn;
        this.img = img;
        this.description = description;
        this.authors = authors;
        this.genres = genres;
    }

    public BookRequest() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<AuthorRequest> getAuthors() {
        return authors;
    }

    public void setAuthors(List<AuthorRequest> authors) {
        this.authors = authors;
    }

    public List<GenreRequest> getGenres() {
        return genres;
    }

    public void setGenres(List<GenreRequest> genres) {
        this.genres = genres;
    }
}
