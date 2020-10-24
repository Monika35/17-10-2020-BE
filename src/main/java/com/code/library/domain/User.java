package com.code.library.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "user", catalog = "elib")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Integer idUser;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "user_pass")
    private String user_pass;

    @Column(name = "student_index")
    private String index;

    @Column(name = "program")
    private String program;

    @Column(name = "role")
    private String role;

    public User() {
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUser_pass() {
        return user_pass;
    }

    public void setUser_pass(String password) {
        this.user_pass = password;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public User(String email, String index, String name, String password, String program, String role) {
        this.name = name;
        this.email = email;
        this.user_pass = password;
        this.index = index;
        this.program = program;
        this.role = role;
    }
//    public User(Integer id, String name, String email, String password, String role) {
//        this.idUser = id;
//        this.name = name;
//        this.email = email;
//        this.password = password;
//        this.role = role;
//    }
}
