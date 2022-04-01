package numbers;

import java.util.Scanner;
class triangle 
{
	static double area(double base, double height)
	{
			double res=(1.0/2.0)*(base*height);
			return res;
	}
	public static void main(String[] args) 
	{
		double a;
		double b;

		Scanner s1=new Scanner(System.in);
		System.out.print("enter the base=");
		a = s1.nextDouble();

		System.out.print("enter the height=");
		b = s1.nextDouble();
		
				double x=area(a,b);
		// passing value of a and b to area function...
		// accessing the return value to x variable...
		System.out.println("base="+a);
		System.out.println("height="+b);
		System.out.println("area="+x);
	}
}