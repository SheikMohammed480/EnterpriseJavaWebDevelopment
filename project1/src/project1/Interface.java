package project1;
interface Animal{
	 public void eat();
	 public void makeSound();
}
interface Bird{
	public void fly();
	public void makeSound();
}
 class Dog2 implements Animal,Bird{
	public void eat()
	{
		System.out.println("dog is eating");
	}
	public void makesound()
	{
		System.out.println("dog is barking lol lol!!");
	}
	public void fly()
	{
		System.out.println("bird is flying");
	}
	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		
	}
}
public class Interface {

	public static void main(String[] args) {
		Dog2 d=new Dog2();
		d.eat();
		d.makesound();
		d.fly();

	}

}
