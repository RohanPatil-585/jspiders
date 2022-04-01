package pack1;
class calculator2
{
	void square(int num)
	{
		System.out.println("running suare(int) ");
		int res = num * num;
		System.out.println("square is = "+res);
	}
	
	void square(double num)
	{
		System.out.println("running square(double)");
		double res = num * num;
		System.out.println("square is = "+res);
	}
}
public class maincalculator1
{
	public static void main(String[] args) 
	{
		calculator2 c2 = new calculator2();
		c2.square((double)6);
		c2.square((int)10.5);
	}
}