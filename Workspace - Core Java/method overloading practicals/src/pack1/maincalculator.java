package pack1;

public class maincalculator 
{
	public static void main(String[] args)
	{
		calculator c1 = new calculator();
		c1.add(5.5,5.5 );
		c1.add(10, 5.5);
		c1.add(20, 10);
		c1.add(20.5, 2);
		
		c1.sub(5.5,5.5 );
		c1.sub(10, 5.5);
		c1.sub(20, 10);
		c1.sub(20.5, 2);
		
		c1.mul(5.5,5.5 );
		c1.mul(10, 5.5);
		c1.mul(20, 10);
		c1.mul(20.5, 2);
		
		c1.div(5.5,5.5 );
		c1.div(10, 5.5);
		c1.div(20, 10);
		c1.div(20.5, 2);
	}
}
