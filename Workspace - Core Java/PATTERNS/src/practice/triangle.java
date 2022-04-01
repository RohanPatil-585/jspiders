package practice;

import java.util.Scanner;

public class triangle 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter n value = ");
		int n = s1.nextInt();
		
		int m = n+n-1;
		
		for (int i = 0; i <n; i++) 
		{
			for (int j = 0; j <m; j++) 
			{
				if(i==0 && j==n-1 || i>0 && j>=n-i-1 && j<=n+i-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		for (int i = n-2; i >=0 ; i--)
		{
			for (int j = 0; j <=m; j++)
			{
				if(j>=n-i-1 && j<=n+i-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
