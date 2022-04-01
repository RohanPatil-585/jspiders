package pack1;

public class mainclass2
{
	public static void main(String[] args) 
	{
		Thread curth = new Thread().currentThread();//getting referance...
		// getting thread...
		
		System.out.println("current thread id = "+curth.getId());
		System.out.println("current thread name = "+curth.getName());
		System.out.println("current thread priority = "+curth.getPriority());
		
	}
}
