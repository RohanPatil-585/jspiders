package pack1;

public class demo1 
{
	static demo1 d1;
	static int count =0;
	
	demo1()
	{
		count++;
	}
	
	public static demo1 getInstance()
	{
		if(count == 0)
		{
			d1=new demo1();
		}
		return d1;
	}
	public static void main(String[] args) 
	{
		demo1 d1 = demo1.getInstance();
		demo1 d2 = demo1.getInstance();
		demo1 d3 = demo1.getInstance();
		
		System.out.println("address = "+d1);
		System.out.println("address = "+d2);
		System.out.println("address = "+d3);
	}
}
