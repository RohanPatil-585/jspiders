package numbers;

import java.util.Scanner;
class prime 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter no = ");
		int number = s1.nextInt();
		int flag=0;
		for(int i=2;i<number;i++)
		{
			if(number%i==0)
			{
				flag=1;
			}
		}
		if(flag == 1)
		{
			System.out.println("given number is not prime");
		}
		else
		{
				System.out.println("number is prime");	
		}
	}
}