package pack1;

class demo2
{
	int x;
	double y;
	
	public demo2(int x, double y)
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
class sample2
{
	void test(demo2 arg1)
	{
		System.out.println("running test()");
		System.out.println(arg1.x);
		System.out.println(arg1.y);
	}
}
public class mainclass2 
{
	public static void main(String[] args) 
	{
		sample2 s2 = new sample2();
		demo2 d2 = new demo2(10,2.6);
		s2.test(d2);
		System.out.println(d2.getX());
		System.out.println(d2.getY());
	}
}
