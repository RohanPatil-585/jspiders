package pack1;

public class demo2 
{
	public static demo2 d2 = null;
	static
	{
		d2 = new demo2();
	}
	
	private demo2()
	{
		
	}
	
	public static demo2 getInstance()
	{
		return d2;
	}
	
	public static void main(String[] args) 
	{
		demo2 d2 = demo2.getInstance();
		demo2 d3 = demo2.getInstance();
		demo2 d4 = demo2.getInstance();
		
		System.out.println("address = "+d2);
		System.out.println("address = "+d3);
		System.out.println("address = "+d4);
		
	}
}
