package numbers;

import java.util.Scanner;
class perfect
{
	public static void main(String[] args) 
	{
		int sum=0;
		
		Scanner s1 = new Scanner(System.in);
		System.out.print("enter the number = ");
		int number = s1.nextInt();
		int k = number;
		for(int i=1;i<number;i++)
		{
			if(number%i==0)
			{
				sum=sum+i;
				System.out.print(i+" ");
			}
		}
			if (sum == k)
			{
				System.out.println("given no is perfect ");
			}
			else
			{
				System.out.println("given no is not perfect");
			}
		
	}
}
