package numbers;

import java.util.Scanner;
class swap 
{
	static int swapp(int a, int b)
	{
			a=a+b;
			b=a-b;
			a=a-b;
			return 0;
	}
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the value of x = ");
		int x=s1.nextInt();
		System.out.println("enter the value of y = ");
		int y=s1.nextInt();
		int p = swapp(x,y);
		System.out.println();
	}
}