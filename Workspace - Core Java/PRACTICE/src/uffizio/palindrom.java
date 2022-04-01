package uffizio;

public class palindrom 
{
	public static void main(String[] args)
	{
		int number = 121;
		int k = number;
		int sum = 0;
		while(number > 0)
		{
			int temp = number%10;
			sum = (sum*10)+temp;
			number = number/10;
		}
		
		if(k == sum)
		{
			System.out.println("number is prime number...");
		}
		else
		{
			System.out.println("number is not prime number...");
		}
	}
}
