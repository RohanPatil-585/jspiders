package practice;

import java.util.Scanner;

public class pattern6 
{
	public static void main(String[] args) 
	{
		int i,j;
		char a = 97;
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter tne value for n = ");
		int n = s1.nextInt();
		
		for (int k = 0; k <=n; k++) 
		{
			for (int k2 = 0; k2 <=k; k2++)
			{
				System.out.print(a++);
			}
			System.out.println(" ");
		}
	}
}
