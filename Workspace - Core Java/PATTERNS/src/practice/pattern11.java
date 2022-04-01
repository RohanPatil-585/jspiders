package practice;

import java.util.Scanner;

public class pattern11 
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
				if(j>=i)
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