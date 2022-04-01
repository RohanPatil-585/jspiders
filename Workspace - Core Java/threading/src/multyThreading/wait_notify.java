package multyThreading;

public class wait_notify 
{
	private int x=4;
	public int getX()
	{
		return x;
	}
	
	synchronized public void consumerX(int arg)
	{
		String th_name = Thread.currentThread().getName();
		System.out.println(th_name+ " running..");
		if(x<5)
		{
			System.out.println("x value is not sufficient to perform the operation , wait untill thred update the x value..");
			try
			{
				wait();
			} 
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(th_name+ " resumming back");
			x=x-arg;
			System.out.println(x);
		}
		else
		{
			System.out.println("data sufficient...");
			x=x-arg;
		}
	}
	
	synchronized public void producerx(int arg)
	{
		String th_name = Thread.currentThread().getName();
		System.out.println(th_name+"producing x value..");
		x=x+arg;
		System.out.println(th_name+"notifying the threads...");
		notifyAll();
	}
}