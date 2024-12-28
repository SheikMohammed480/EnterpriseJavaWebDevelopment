package com.onetomany;

import java.util.List;

import javax.persistence.*;



@Entity
@Table(name="movies2")
public class Movie {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="movie_name")
	private String movieName;
	
	@OneToMany( cascade=CascadeType.ALL)
	@JoinColumn(name="MoviesId",referencedColumnName="id")
	private List<Actor> actors;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public List<Actor> getActors() {
		return actors;
	}

	public void setActors(List<Actor> actors) {
		this.actors = actors;
	}
	
	
	
	
	
	
}
