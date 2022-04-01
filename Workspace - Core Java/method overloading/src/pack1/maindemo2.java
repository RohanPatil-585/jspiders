package pack1;

class demo2 
{
	void disp()
	{
		System.out.println("running disp() method...");
	}
}
class demo3 extends demo2
{
	// in demo3 class disp() method is overloaded
	void disp(int arg)
	{
		System.out.println("running disp(int) method...");
		System.out.println("arg1 value is = "+arg);
	}
}
public class maindemo2
{
	public static void main(String[] args) 
	{
		demo3 d1 = new demo3();
		d1.disp();
		d1.disp(14);
	}
}