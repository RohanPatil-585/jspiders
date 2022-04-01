package numbers;

import java.util.Scanner;
class fibonacci
{
	public static void main(String[] args) 
	{
		int a=0, b=1;
		int c=0;
		Scanner s1 = new Scanner(System.in);
		System.out.print("enter the number = ");
		int number = s1.nextInt();
		System.out.print(a+" "+b);
		for(int i=1;i<=number;i++)
		{
			c=a+b;
			a=b;
			b=c;

			System.out.print(" "+c);
		}

	}
}
