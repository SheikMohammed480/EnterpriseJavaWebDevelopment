package com.Autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Book {
    private String bookName;
    private int price;
    
    
    public Book()
    {
    	System.out.println("book default constructor");
    }
    
    
   
   @Autowired
    private Author author;

    public Book(String bookName, int price, Author author) {
    	System.out.println("constructor autowiring");
		this.bookName = bookName;
		this.price = price;
		this.author = author;
	}

	public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Author getAuthor() {
        return author;
    }

    // Setter Injection for author
    
    public void setAuthor(Author author) {
        this.author = author;
    }

    
}
