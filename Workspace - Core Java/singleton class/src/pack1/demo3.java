package pack1;

public class demo3 
{
	public static final demo3 d3 = new demo3();
	
	private demo3()
	{
		
	}
	public static demo3 getInstance()
	{
		return d3;		
	}
	
	public static void main(String[] args) 
	{
		demo3 d3 = demo3.getInstance();
		demo3 d4 = demo3.getInstance();
		demo3 d5 = demo3.getInstance();
		System.out.println("address = "+d3);
		System.out.println("address = "+d4);
		System.out.println("address = "+d5);
	}
}
