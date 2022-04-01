package multyThreading;

public class sharedResource 
{
	void resource1()
	{
		Thread curth = Thread.currentThread();
		String name = curth.getName();
		System.out.println(name+"printing numbers from 1 to 10...");
		for(int i=1; i<=10;i++)
		{
			System.out.println(name+" i " +i);
			try 
			{
				Thread.sleep(1000);
			} catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	void resource2()
	{
		Thread curth = Thread.currentThread();
		String name = curth.getName();
		System.out.println(name+"printing numbers from 10 to 1...");
		for(int j=10; j>=1;j--)
		{
			System.out.println(name+" j " +j);
			try 
			{
				Thread.sleep(1000);
			} catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
