package pack1;

public class demo 
{
	int p;
	double q;
	
	//overloading constructor
	demo(int arg1)
	{
		this(2.5);
		System.out.println("running int arg constructor...");
		p=arg1;
	}
	demo(double arg2)
	{
		System.out.println("running double arg constructor...");
		q=arg2;
	}
}
