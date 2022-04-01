package infosys;

public class SpecialNumber 
{
	public static void main(String[] args) 
	{
		int number = 39;
		int reminder;
		int sum = 0;
		int mul = 1;
		int total = 0;
		int num = number;
		while(number>0)
		{
			reminder = number % 10;
			sum = sum + reminder;
			mul = mul * reminder;
			number = number / 10;
			total = sum+mul;
		}
		if(total == num)
		{
			System.out.println("given no is special...");
		}
		else
		{
			System.out.println("given no is not special...");
		}
	}
}
