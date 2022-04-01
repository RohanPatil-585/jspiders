package pack1;

public class sequnce4_main 
{
	public static void main(String[] args) 
	{
		sequnce4 s1 = new sequnce4();
		sequnce4 s2 = new sequnce4();
																		
		Thread t1 = new Thread(s1); // passing runnable type object. 	
		Thread t2 = new Thread(s2); // passing runnable type object.	
																		
		t1.start();					
		t2.start();
	}
}
