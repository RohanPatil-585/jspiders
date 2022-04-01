package pack1;

public class sequnce4 extends Thread implements Runnable 
{
	public void run()
	{
		System.out.println("printing numbers from 125 to 101 ");
		for(int i=125; i>=101; i--)
		{
			System.out.println("i = "+i);
			try 
			{
				sleep(500);
			} 
			catch 
			(InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
