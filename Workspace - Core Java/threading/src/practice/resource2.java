package practice;

public class resource2 extends Thread
{
	sharedResource s1;

	public resource2(sharedResource s1) 
	{
		this.s1 = s1;
	}
	
	public void run()
	{
		s1.resource2();
	}
}
