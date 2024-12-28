package com.onetomany;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Author")

public class Author {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int AuthorId;
	
	@Column(name="AuthorName")
	private String AuthorName;
	
	@Column(name="AuthorAge")
	private int AuthorAge;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="Id",referencedColumnName="AuthorId")
	private List<Book> book;

	public int getAuthorId() {
		return AuthorId;
	}

	public void setAuthorId(int AuthorId) {
		this.AuthorId = AuthorId;
	}

	public String getAuthorName() {
		return AuthorName;
	}

	public void setAuthorName(String AuthorName) {
		this.AuthorName = AuthorName;
	}

	public int getAuthorAge() {
		return AuthorAge;
	}

	public void setAuthorAge(int AuthorAge) {
		this.AuthorAge = AuthorAge;
	}

	public List<Book> getBook() {
		return book;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}


	
	
	
	

}
