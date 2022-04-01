package practice;

public class producer extends Thread
{
	multythreading m1;

	public producer(multythreading m1) 
	{
		this.m1 = m1;
	}
	
	public void run()
	{
		m1.producer(20);
	}
}
