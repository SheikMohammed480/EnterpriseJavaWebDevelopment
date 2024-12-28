package com.example.springbootappwithh2database;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


@SpringBootApplication
public class SpringBootAppWithH2DatabaseApplication {

    public static void main(String[] args) {
    	 
        SpringApplication.run(SpringBootAppWithH2DatabaseApplication.class, args);
    }

}