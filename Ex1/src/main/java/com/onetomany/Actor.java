package com.onetomany;
import javax.persistence.*;

@Entity
@Table(name="Actor2")
public class Actor {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ActorId;
	
	@Column(name="actor_name")
	private String actorName;
	
	@Column(name="actorAge")
	private int age;
	
	@Column(name="salary")
	private String salary;
	
	

	public int getActorId() {
		return ActorId;
	}

	public void setActorId(int actorId) {
		ActorId = actorId;
	}

	public String getActorName() {
		return actorName;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	


	
	

}
