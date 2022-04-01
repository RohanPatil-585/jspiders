package practice;

public class resource1 extends Thread 
{
	sharedResource s1;

	public resource1(sharedResource s1) 
	{
		this.s1 = s1;
	}
	
	public void run()
	{
		s1.resource1();
		s1.resource2();
	}
}
