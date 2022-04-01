package uffizio;

public class armstrong 
{
	public static void main(String[] args)
	{
		int number = 153;
		int n = number;
		int k = number;
		int count = 0;
		int result = 0;
		while(number>0)
		{
			number = number/10;
			count++;
		}
		
		while(n>0)
		{
			int sum = 1;
			int temp = n%10;
			for (int i = 0; i < count; i++) 
			{
				sum = sum * temp;
			}
			System.out.println("temp = "+sum);
			n = n/10;
			result = result+sum;
		}
		System.out.println("result = "+result);
		
		if(result == k)
		{
			System.out.println("number is armstrong number...");
		}
		else
		{
			System.out.println("number is not armstrong...");
		}
	}
}
