package practis.com.Many_To_One;

import javax.persistence.*;


@Entity  
@Table(name="Address_Detail")  
public class Address {  
    @Id  
    @GeneratedValue(strategy=GenerationType.IDENTITY)  
    @Column(name="Address")
    private int Id; 
    @Column(name="Ad_Line")
    private String addressLine1;    
    @Column(name="City_Detail")
    private String city;
    @Column(name="State_Detail")
    private String state;
    @Column(name="Country_Detail")
    private String country;
    @Column(name="Pincode_Detail")
    private int pincode; 
    
//    @OneToOne 
//    @JoinColumn(name="Emp_id")
//    private Employee employee;  
    public int getId() {  
        return Id;  
    }  
    public void setId(int Id) {  
        this.Id = Id;  
    }  
    public String getAddressLine1() {  
        return addressLine1;  
    }  
    public void setAddressLine1(String addressLine1) {  
        this.addressLine1 = addressLine1;  
    }  
    public String getCity() {  
        return city;  
    }  
    public void setCity(String city) {  
        this.city = city;  
    }  
    public String getState() {  
        return state;  
    }  
    public void setState(String state) {  
        this.state = state;  
    }  
    public String getCountry() {  
        return country;  
    }  
    public void setCountry(String country) {  
        this.country = country;  
    }  
    public int getPincode() {  
        return pincode;  
    }  
    public void setPincode(int pincode) {  
        this.pincode = pincode;  
    }  
//    public Employee getEmployee() {  
//        return employee;  
//    }  
//    public void setEmployee(Employee employee) {  
//        this.employee = employee;  
//    }    
}  