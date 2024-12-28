package project1;
abstract class Dog1{//abstract class can contain normal method & abstract method declaration 
	
	abstract void makeSound();//abstract method declaration
	
	public void eat()
	{
		System.out.println("dog is eating");//normal or instance method
	}
}
class Animal1 extends Dog1{
	public  void makeSound()
	{
		System.out.println("dog is barking");
		
	}
}
public class Abstraction {

	public static void main(String[] args) {
		Animal1 a=new Animal1();
		a.makeSound();
		a.eat();
			
	}

}
