package pack1;

class demo1 
{
	void test(int arg1)
	{
		System.out.println("running int arg test() method...");
		System.out.println("arg value is = "+arg1);
	}
	
	void test(double arg1)
	{
		System.out.println("running double arg test() method...");
		System.out.println("arg value is = "+arg1);
	}
	
	void test(int arg1, double arg2)
	{
		System.out.println("running int,double arg test() method...");
		System.out.println("arg1 value is = "+arg1);
		System.out.println("arg2 value is = "+arg2);
	}
}
public class main
{
	public static void main(String[] args)
	{
		demo1 d1 = new demo1();
		d1.test(12);
		d1.test(5.6);
		d1.test(10, 8.1);
	}
}