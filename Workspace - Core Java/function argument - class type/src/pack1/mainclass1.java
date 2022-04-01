package pack1;

class demo1
{
	private int x;
	private double y;
	
	public demo1(int x, double y)
	{
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
}
class sample1
{
	void test(demo1 arg1)
	{
		System.out.println("running test()");
		System.out.println(arg1.getX());
		System.out.println(arg1.getY());
	}
}
public class mainclass1 
{
	public static void main(String[] args) 
	{
		sample1 s1 = new sample1();
		s1.test(new demo1(10,2.6));
	}
}
