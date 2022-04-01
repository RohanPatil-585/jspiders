package uffizio;

public class specialno 
{
	public static void main(String[] args) 
	{
		int number = 29;
		int n = number;
		int k = number;
		int sum = 0;
		int mul = 1;
		int total = 0;
		while(number>0)
		{
			int temp = number%10;
			sum = sum + temp;
			mul = mul * temp;
			number = number/10;
		}
		total = sum + mul;
		if(k == total)
		{
			System.out.println("number is special number...");
		}
		else
		{
			System.out.println("number is not special..");
		}
	}
}
