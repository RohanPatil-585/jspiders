package practice;

import java.util.Scanner;

public class binary 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter n value = ");
		int n = s1.nextInt();
		for (int i = 1; i <= n; i++) 
		{
			for (int j = 1; j <= n; j++) 
			{
				if(i%2==0)
				{
					if(j%2==0)
					{
						System.out.print("1");
					}
					else
					{
						System.out.print("0");
					}
				}
				else
				{
					if(j%2!=0)
					{
						System.out.print("1");
					}
					else
					{
						System.out.print("0");
					}
				}
			}
			System.out.println(" ");
		}
	}
}
