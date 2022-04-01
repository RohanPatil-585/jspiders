package pack1;

public class mainclass 
{
	public static void main(String[] args) 
	{
		Thread t1 = new Thread();
		t1.setName("my thread");
		t1.setPriority(9);
		
		System.out.println("id = "+t1.getId());
		System.out.println("name = "+t1.getName());
		System.out.println("priority = "+t1.getPriority());
		
	}
}
