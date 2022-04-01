package has_a;

public class mainclass 
{
	public static void main(String[] args) 
	{
		sample1 s1 = new sample1();
		System.out.println("x value = "+s1.d1.x);
		System.out.println("x value = "+s1.y);
		s1.d1.test();
		s1.disp();
	}
}
