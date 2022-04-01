package multyThreading;

public class startRsoursceThread
{
	public static void main(String[] args) 
	{		
		sharedResource sr1 = new sharedResource();
		
		//3 threads are sharing one object
		
		threadA t1 = new threadA(sr1);
		threadA t2 = new threadA(sr1);
		threadA t3 = new threadA(sr1);
		
		t1.setName("rohan");
		t2.setName("mahajan");
		t3.setName("ronak");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
