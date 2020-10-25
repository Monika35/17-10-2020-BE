package com.code.library.dto;

public class GenreRequest {
    private String name;
    private String description;

    public GenreRequest(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public GenreRequest() {
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
}
