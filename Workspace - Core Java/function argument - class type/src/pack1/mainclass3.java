package pack1;

class demo3
{
	int x;
	double y;
	
	public demo3(int x, double y)
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
class sample3
{
	void test(demo3 arg1)
	{
		System.out.println("running test()");
		//System.out.println(arg1.x=100);
		//System.out.println(arg1.y=14.90);
		arg1.x=100;
		arg1.y=14.90;
	}
}
public class mainclass3 
{
	public static void main(String[] args) 
	{
		sample3 s3 = new sample3();
		demo3 d3 = new demo3(10,2.6);
		s3.test(d3);
		System.out.println(d3.getX());
		System.out.println(d3.getY());
	}
}
