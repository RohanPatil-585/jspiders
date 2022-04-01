package multyThreading;

public class startThread 
{
	public static void main(String[] args) 
	{
		wait_notify w1 = new wait_notify();
		consumerThread c1 = new consumerThread(w1);
		consumerThread c2 = new consumerThread(w1);
		consumerThread c3 = new consumerThread(w1);
		producerThread p1 = new producerThread(w1);
		
		c1.setName("c1.thread");
		c2.setName("c2.thread");
		c3.setName("c3.thread");
		p1.setName("p1.thread");
		
		c1.start();
		c2.start();
		c3.start();
		
		try 
		{
			Thread.sleep(2000);
		}
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p1.start();
		System.out.println("x value is ="+w1.getX());
	}
}
