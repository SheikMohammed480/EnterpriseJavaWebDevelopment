// Movie.java
package onetomany;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Movies1")
public class Movie {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Movie_Name")
    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "movie_id", referencedColumnName = "id") // Define the foreign key constraint
    private List<Actors> actors;

    // Constructors, getters, and setters
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Actors> getActors() {
		return actors;
	}

	public void setActors(List<Actors> actors) {
		this.actors = actors;
	}

	
}
