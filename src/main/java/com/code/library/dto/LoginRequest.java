package com.code.library.dto;

import java.io.Serializable;

public class LoginRequest implements Serializable {
    private String email;
    private String userPass;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public LoginRequest() {}

    public LoginRequest(String email, String userPass) {
        this.email = email;
        this.userPass = userPass;
    }
}
