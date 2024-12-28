//Encapsulation using getter & setter
package project1;
class E{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
public class Encapsulation {
     
	public static void main(String[] args) {
		E e=new E();
		e.setName("sheik");
		e.setAge(21);
		System.out.println("Name :"+e.getName());
		System.out.println("Age :"+e.getAge());
	}

}
