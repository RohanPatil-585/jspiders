package pack1;

class demo1 
{
	int x = 10;
	void test()
	{
		System.out.println("runnning test() method...");
	}
}
class demo2 extends demo1
{
	double y =2.6;
	void disp()
	{
		System.out.println("running disp() method...");
	}
}
public class main1
{
	public static void main(String[] args)
	{
		demo1 d1 = new demo2();
		
		demo2 d2 =(demo2) new demo1();
	}
}
