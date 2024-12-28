package project1;

public class MultiThread1 implements Runnable {//interface
	//multiThreading is a technique to perform one or more process at same time
	/*improve performance,efficiency,increase utilization of CPU,
	 * enhanced user experience,more responsive,concurrent processing(simultaneously)*/
	private Thread t;
	private String threadName;
	
	MultiThread1(String threadName)
	{
		this.threadName=threadName;
	}
	
	public void start()
	{
	System.out.println("Starting "+threadName);	
	if(t==null)// thread means task or activity
	{
		t=new Thread(this,threadName);
		t.start();//t=1
	}
	}
	public void run()
	{
		System.out.println("running"+threadName);
		try{for(int i=0;i<=2;i++)//how many times that the thread repeat itself
		{
			System.out.println("Thread:"+threadName+","+i);
			Thread.sleep(10);
		}
		
	}
		catch(InterruptedException e)
		{
			System.out.println("thread:"+threadName+"interrupted");
		}
		System.out.println("ending"+threadName);
		}

	public static void main(String[] args) {
		MultiThread1 m1=new MultiThread1("fathima");
		m1.start();
		MultiThread1 m2=new MultiThread1("sharmila");
		m2.start();
		MultiThread1 m3=new MultiThread1("sheik");
		m3.start();
		
	}

}
