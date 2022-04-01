package uffizio;

public class prime
{
	public static void main(String[] args) 
	{
		int number = 13;
		int n = number;
		int flag = 0;
		for (int i = 2; i < number; i++) 
		{
			if(number%i==0)
			{
				System.out.println("factors are = "+i);
				flag = 1;
			}
		}
		if(flag == 1)
		{
			System.out.println("number is not prime number...");
		}
		else
		{
			System.out.println("number is prime number...");
		}
	}
}
