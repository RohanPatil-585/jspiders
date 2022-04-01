package pack2;

import pack1.demo3;
//import pack1.demo2;
public class demo4 extends demo3
{
	int x = 34;
	
	public void display()
	{
		int x = 45;
		
		System.out.println("local x variable value is = "+x);
		
		System.out.println("current class member x value is = "+this.x);
		
		System.out.println("super class member x values = "+super.x);
	}
}
