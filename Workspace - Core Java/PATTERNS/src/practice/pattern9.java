package practice;

import java.util.Scanner;

public class pattern9 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter n value = ");
		int n = s1.nextInt();
		
		for (int i = 1; i <=n; i++)
		{
			for (int j = n; j >=i; j--) 
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
