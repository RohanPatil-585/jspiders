package pack1;
class calculator
{
	void square(int num)
	{
		int ans = num * num;
		System.out.println("square is = "+ans);
	}
}
public class maincalculator 
{
	public static void main(String[] args) 
	{
		calculator c1 = new calculator();
		c1.square((int)6.6);
	}
}
