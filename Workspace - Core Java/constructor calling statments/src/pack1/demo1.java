package pack1;

public class demo1 
{
	int p;
	double q;
	
	//overloading constructor
	
	demo1(int arg1, double arg2)
	{
		this(arg2);
		System.out.println("running int arg constructor...");
		p=arg1;
	}
	demo1(double arg2)
	{
		System.out.println("running double value cnstructor...");
		q=arg2;
	}
}
