package pack1;

class singledemo1
{
	int x = 12;
	void test()
	{
		System.out.println("running test()...");
	}
}
class singledemo2 extends singledemo1
{
	double y = 12.34;
	void disp()
	{
		System.out.println("running disp()...");
	}
}
public class single_class_type 
{
	public static void main(String[] args) 
	{
		singledemo2 d1 = new singledemo2();
		System.out.println(d1.x);
		d1.test();
		
		System.out.println(d1.y);
		d1.disp();
	}
}
