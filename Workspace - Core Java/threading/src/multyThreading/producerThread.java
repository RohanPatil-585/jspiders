package multyThreading;

public class producerThread extends Thread 
{
	private wait_notify w1;
	public producerThread(wait_notify w1)
	{
		this.w1=w1;
	}
	public void run()
	{
		w1.producerx(20);
	}
}
