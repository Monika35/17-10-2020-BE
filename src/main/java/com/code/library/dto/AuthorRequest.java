package com.code.library.dto;

public class AuthorRequest {
    private String name;
    private String country;

    public AuthorRequest(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public AuthorRequest() {
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
