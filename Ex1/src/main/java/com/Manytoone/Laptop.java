package com.Manytoone;
import javax.persistence.*;

@Entity
@Table(name="Laptop")
public class Laptop {

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int LaptopId;
		
		@Column(name="Brand")
		private String LaptopBrand;
		
		@Column(name="Model")
		private String LaptopModel;
		
		@ManyToOne(cascade=CascadeType.ALL)
		@JoinColumn(name="user_Id",referencedColumnName="UserId")
		private User user;

		public int getLaptopId() {
			return LaptopId;
		}

		public void setLaptopId(int laptopId) {
			LaptopId = laptopId;
		}

		public String getLaptopBrand() {
			return LaptopBrand;
		}

		public void setLaptopBrand(String laptopBrand) {
			LaptopBrand = laptopBrand;
		}

		public String getLaptopModel() {
			return LaptopModel;
		}

		public void setLaptopModel(String laptopModel) {
			LaptopModel = laptopModel;
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}
		
		
}
