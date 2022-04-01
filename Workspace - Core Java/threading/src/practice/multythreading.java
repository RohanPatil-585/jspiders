package practice;

public class multythreading
{
	int x=4;
	
	public int getx()
	{
		return x;
	}
	
	synchronized public void consumer(int arg)
	{
		String cu_thread = Thread.currentThread().getName();
		System.out.println("name of the current thread = "+cu_thread);
		if(x<5)
		{	
			System.out.println("x value is not sufficient to perform the task, wait for thread to update the value");
			try 
			{
				wait();
			} catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("resuming back "+cu_thread);
			x=x-arg;
			System.out.println(x);
		}
		else
		{
			System.out.println(" data sufficient ");
			x=x-arg;
			System.out.println(x);
		}
	}
	synchronized public void producer(int arg)
	{
		String cu_thread = Thread.currentThread().getName();
		System.out.println(cu_thread+"producing the x value ");
		x=x+arg;
		System.out.println("notifyng the threads...");
		notifyAll();
	}
}