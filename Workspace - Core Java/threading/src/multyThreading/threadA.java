package multyThreading;

public class threadA extends Thread 
{
	sharedResource sr;
	threadA(sharedResource sr) 
	{
		this.sr=sr;
	}
	
	public void run()
	{
		sr.resource1();
		//sr.resource2();
	}
}
