package practice;

public class multythreadingmain 
{
	public static void main(String[] args) 
	{
		multythreading m2 = new multythreading();
		consumer c1 = new consumer(m2);
		consumer c2 = new consumer(m2);
		consumer c3 = new consumer(m2);
		producer p1 = new producer(m2);
		
		c1.setName("c1.thread");
		c2.setName("c2.thread");
		c3.setName("c3.thread");
		p1.setName("p1.thread");
		
		c1.start();
		c2.start();
		c3.start();
		try 
		{
			Thread.sleep(5000);
		} catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p1.start();
		System.out.println("x value = "+m2.getx());
	}
}
