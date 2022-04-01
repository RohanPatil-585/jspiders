package multyThreading;

public class consumerThread extends Thread 
{
	private wait_notify w1;
	public consumerThread(wait_notify w1)
	{
		this.w1=w1;
	}
	public void run()
	{
		w1.consumerX(8);
	}
}
