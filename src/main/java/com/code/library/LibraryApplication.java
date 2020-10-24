package com.code.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@SpringBootApplication
//@ComponentScan
@EntityScan
public class LibraryApplication {

    public static void main(String[] args) throws SQLException {

//        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/?user=root&password=monika35");
//        PreparedStatement ps = connection.prepareStatement("CREATE DATABASE databasename");
//        int result = ps.executeUpdate();
//        System.out.print();
        SpringApplication.run(LibraryApplication.class, args);
    }

}
