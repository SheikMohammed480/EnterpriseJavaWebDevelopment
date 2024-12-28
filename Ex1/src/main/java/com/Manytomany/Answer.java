package com.Manytomany;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="answers")
public class Answer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="response")
	private String response;
	
	@ManyToMany(mappedBy = "answers")
	private Set<Question> questions = new HashSet<>();
	
	// Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public Set<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(Set<Question> questions) {
		this.questions = questions;
	}
}