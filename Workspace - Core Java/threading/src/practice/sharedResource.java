package practice;

public class sharedResource 
{
	synchronized public void resource1()
	{
		String cur_thread = Thread.currentThread().getName();
		System.out.println(cur_thread+" is running....");
		System.out.println(cur_thread +" printing 1 t0 10 ...");
		for (int i = 0; i < 10; i++)
		{
			System.out.println("i = "+i);
			try
			{
				Thread.sleep(2000);
			} catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	synchronized public void resource2()
	{
		String cur_thread = Thread.currentThread().getName();
		System.out.println(cur_thread+" is running....");
		System.out.println(cur_thread +" printing 10 t0 1 ...");
		for (int i = 10; i >0 ; i--) 
		{
			System.out.println("j = "+i);
			try
			{
				Thread.sleep(2000);
			} catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}