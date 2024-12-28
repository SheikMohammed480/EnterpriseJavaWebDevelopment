package project1;
import java.util.Scanner;
class Student{
	String name;
	int age;
	int roll;
	int m1,m2,total,avg;
	
	void getDetails()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your name:");
		name=s.nextLine();
		System.out.println("Enter age:");
		age=s.nextInt();
		System.out.println("Enter your roll_no:");
		roll=s.nextInt();
		System.out.println("Enter your 2 subjects marks:");
		m1=s.nextInt();
		m2=s.nextInt();
		
	}
	void calc() {
		total=m1+m2;
		avg=total/2;
				
	}
	
}
class printDetails extends Student{
	void showDetails()
	{
	//	getDetails();
		//calc();
		System.out.println("Name: "+name );
		System.out.println("Age: "+age);
		System.out.println("Roll-no: "+roll);
		System.out.println("Total: "+total);
		System.out.println("Average: "+avg);
	}
}
public class Inherit {

	public static void main(String[] args) {
		printDetails p=new printDetails();
		p.getDetails();
		p.calc();
		p.showDetails();
	}

}
