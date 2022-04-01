package features;
interface a
{
	int m1(int arg);
	//void m1();
}
public class LemdaFunction 
{
	public static void main(String[] args) 
	{
		a a1 = (int arg)->{System.out.println("hello");
		return arg;
	};
	System.out.println(a1.m1(10));
	}
}
