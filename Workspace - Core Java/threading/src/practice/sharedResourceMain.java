package practice;

import multyThreading.wait_notify;

public class sharedResourceMain 
{
	public static void main(String[] args) 
	{
		sharedResource s1 = new sharedResource();
		
		resource1 r1 = new resource1(s1);
		resource1 r2 = new resource1(s1);
		resource1 r3 = new resource1(s1);
		resource2 r4 = new resource2(s1);
		
		r1.setName("r1.thread");
		r2.setName("r1.thread");
		r3.setName("r1.thread");
		r4.setName("r4.thread");
		
		r1.start();
		r2.start();
		r3.start();
		try 
		{
			Thread.sleep(2000);
		} catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		r4.start();
	}
}
