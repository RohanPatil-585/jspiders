package practice;

import java.util.Scanner;

public class uffizio_p1 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter n value = ");
		int n = s1.nextInt();
		
		for (int i = 1; i <= n; i++) 
		{
			char a = 97;
			int b = 1;
			
			for (int j = 1; j <= i; j++) 
			{
				b=b*2;
				System.out.print(b);
			}
			System.out.println();
		}
	}
}
