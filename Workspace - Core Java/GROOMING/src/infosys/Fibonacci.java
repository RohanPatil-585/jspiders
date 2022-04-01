package infosys;

public class Fibonacci 
{
	public static void main(String[] args)
	{
		int number = 10;
		int a = 0;
		int b = 1;
		int fib = 0;
		int sum = 0;
		System.out.println("0");
		System.out.println("1");
		for (int i = 1; i <= number; i++) 
		{
			sum = a + b;
			a = b;
			b = sum;
			System.out.println(sum);
		}
	}
	
}
