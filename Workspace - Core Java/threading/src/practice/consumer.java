package practice;

public class consumer extends Thread
{
	multythreading m1;

	public consumer(multythreading m1) 
	{
		this.m1 = m1;
	}
	
	public void run()
	{
		m1.consumer(10);
	}
}
