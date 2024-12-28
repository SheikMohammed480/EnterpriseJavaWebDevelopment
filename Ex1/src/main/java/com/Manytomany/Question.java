package com.Manytomany;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="question")
public class Question {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="qname")
	private String qname;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="qans",
	joinColumns= {@JoinColumn(name="question_id")},
	inverseJoinColumns= {@JoinColumn(name="answer_id")})
	private Set<Answer> answers = new HashSet<>();

	// Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQname() {
		return qname;
	}

	public void setQname(String qname) {
		this.qname = qname;
	}

	public Set<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(Set<Answer> answers) {
		this.answers = answers;
	}
}