package infosys;

public class Armstrong 
{
	public static void main(String[] args) 
	{
		int number = 153;
		int num = number;
		int sum = 0;
		int mul = 1;
		int count = 0;
		int reminder = 1;
		int no=number;
		int total = 0;
		
		while(number>0)
		{
			number = number/10;
			count++;
		}
		
		while(num>0)
		{
			reminder = num%10;
			for (int i = 1; i <= count; i++) 
			{
				mul = reminder * mul;
				System.out.println("multiplicaton = "+mul);
			}
			
			num = num/10;
			total = total + mul;
			System.out.println("sum = "+total);
			mul=1;
		}
		
		if(total == no)
		{
			System.out.println("given number is armstrong....");
		}
		else
		{
			System.out.println("given number is not armstrong....");
		}
	}
}
