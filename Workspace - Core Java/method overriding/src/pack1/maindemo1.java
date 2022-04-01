package pack1;

class demo1 
{
	void test()
	{
		System.out.println("running test()...");
	}
}
class demo2 extends demo1
{
	void test()
	{
		System.out.println("test is overrided in demo class ");
	}
}
public class maindemo1
{
	public static void main(String[] args)
	{
		demo2 d2 = new demo2();
		d2.test();
	}
}