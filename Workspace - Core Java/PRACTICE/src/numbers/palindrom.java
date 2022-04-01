package numbers;

import java.util.Scanner;
class palindrom 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the number = ");
		int number = s1.nextInt();
		int sum=0;
		int m=number;
		int temp=1;
		while(number>0)
		{
			temp=number%10;
			sum=(sum*10)+temp;
			System.out.println("temp = "+temp);
			number=number/10;
		}
		if(sum == m)
		{
			System.out.println("given no is palindrom");
			System.out.println(m);
		}
		else
		{
			System.out.println("given no is not palindrom");
		}
	}
}
