package numbers;

import java.util.Scanner;
class armstrong
{
	public static void main(String[] args) 
	{
		int sum=0;
		Scanner s1 = new Scanner(System.in);
		
		
		System.out.println("enter the number = ");
		int number = s1.nextInt(); 
		int s=number;
		int count=0;
		int temp1=1;
		int temp=1;
		int n = number;
		while(number > 0)
		{
			number = number/10;
			count++;
			System.out.println("count = "+count);
			
		}

		while(s > 0)
		{
			temp = s%10;
			for(int i=1;i<=count;i++)
			{
			temp1  = temp*temp1;
			System.out.println("temp1 = "+temp1);
			//sum = sum+pow;
			}
		

			s = s/10;
			sum=sum+temp1;
			System.out.println("sum = "+sum);
			temp1=1;	
			}

		if(sum == n)
		{
			System.out.println("no is armstrong...");
		}
		else
		{
			System.out.println("no is not armstrong...");
		}
	}
}