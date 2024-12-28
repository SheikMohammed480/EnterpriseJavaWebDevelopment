package project1;
class Student1{
	String name;
	int age;
	int roll;
	/*Student1(){
		name="sheik";
		age=21;
		roll=101;
		System.out.println("Name:"+name);
		System.out.println("age : "+age);
	    System.out.println("Roll-no: "+roll);
	}	*/
	Student1(Student1 s){//copy constructor Don't need to give & like c++
		name=s.name;
		age=s.age;
		roll=s.roll;
		System.out.println("Name:"+name);
		System.out.println("age : "+age);
	    System.out.println("roll-no: "+roll);
	}
	
	Student1(String name,int age,int roll){
		this.name=name;
		this.age=age;
		this.roll=roll;//this.variable refers to instance variable when parameter &variable both have same name
		System.out.println("Name:"+name);
		System.out.println("age : "+age);
	    System.out.println("roll-no: "+roll);
	}
	
}

public class Constructor {

	public static void main(String[] args) {
		
		Student1 s=new Student1("sheik",21,101);
		Student1 s1=new Student1(s);//copy constructor
	    
	    

	}

}
