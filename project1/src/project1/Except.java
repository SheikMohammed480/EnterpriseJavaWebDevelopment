package project1;

public class Except {

	public static void main(String[] args) throws Exception {
		try {
			System.out.println(3/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("divisible by 0");
			e.printStackTrace();
		}
		finally {
			 System.out.println("finally block");
		 }
		int a=10,b=0;
		
			if(a/b==0)
			{
				System.out.println("divisible");
				
			}
		
		else
		{
			throw new Exception("divisble by 0");
			
		}
		System.out.println("sheik is good boy");
		Thread.sleep(1000);
		System.out.println("no no sheik is very good boy");
	}

}
