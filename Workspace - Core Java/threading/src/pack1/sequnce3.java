package pack1;

public class sequnce3 extends Thread implements Runnable 
{	
	public void run()
	{
		System.out.println("printing numbers from 101 to 110 ");
		for(int i=101; i<=110; i++)
		{
			System.out.println("i = "+i);
			try
			{
				sleep(500);
			}
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
