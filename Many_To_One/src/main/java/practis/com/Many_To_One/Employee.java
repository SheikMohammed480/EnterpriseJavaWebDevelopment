package practis.com.Many_To_One;

import javax.persistence.*;

@Entity  
@Table(name="Employee_Details")  
public class Employee {    
		    @Id  
		    @GeneratedValue(strategy=GenerationType.IDENTITY)  
		    @Column(name="Id")
			private int Id;  
		    
		    @Column(name="Name")
			private String name;    
			
		    @Column(name="Email")
			private String email; 
		    
			@ManyToOne(cascade=CascadeType.ALL) 
			@JoinColumn(name="Address")
			private Address address; 
			
			public int getId() {  
			    return Id;  
			}  
			public void setId(int Id) {  
			    this.Id = Id;  
			}  
			public String getName() {  
			    return name;  
			}  
			public void setName(String name) {  
			    this.name = name;  
			}  
			public String getEmail() {  
			    return email;  
			}  
			public void setEmail(String email) {  
			    this.email = email;  
			}  
			public Address getAddress() {  
			    return address;  
			}  
			public void setAddress(Address address) {  
			    this.address = address;  
			}    
}  