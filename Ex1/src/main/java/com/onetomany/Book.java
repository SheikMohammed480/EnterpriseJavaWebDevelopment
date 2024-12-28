package com.onetomany;
import javax.persistence.*;

@Entity
@Table(name="Book")
public class Book {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int bookId;
	
	@Column(name="BookName")
	private String BookName;

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return BookName;
	}

	public void setBookName(String BookName) {
		this.BookName = BookName;
	}
	
	
	

}
