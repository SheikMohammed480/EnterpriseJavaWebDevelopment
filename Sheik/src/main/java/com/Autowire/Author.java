package com.Autowire;

import org.springframework.stereotype.Component;

public class Author {
    private String authorName;

    public Author() {
        this.authorName = "Sheik";  // Default author name
        System.out.println("author constructor calling");
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
