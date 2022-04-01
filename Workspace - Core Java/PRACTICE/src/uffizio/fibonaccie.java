package uffizio;

public class fibonaccie
{
	public static void main(String[] args)
	{
		int number = 10;
		int n = number;
		int k = number;
		int a = 0;
		int b = 1;
		int c = 0;
		System.out.println(a);
		System.out.println(b);
		for (int i = 0; i < number; i++)
		{
			c = a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
	}
}
