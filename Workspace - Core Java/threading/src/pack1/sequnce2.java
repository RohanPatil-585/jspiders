package pack1;

public class sequnce2 extends Thread
{
	public void run()
	{
		System.out.println("printing 10 to 1");
		for (int i = 10; i >=1; i--) 
		{
			System.out.println("i = "+i);
			try 
			{
				sleep(1000);
			}
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
