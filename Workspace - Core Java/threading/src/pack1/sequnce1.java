package pack1;

public class sequnce1 extends Thread
{
	public void run()
	{
		System.out.println("printing numbers from 1 to 25 ");
		for (int i = 1; i <= 10; i++) 
		{
			System.out.println("i = "+i);
			try 
			{
				sleep(1000);
			} catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
