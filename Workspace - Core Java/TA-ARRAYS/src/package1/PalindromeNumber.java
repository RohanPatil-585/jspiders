package package1;

import java.util.Scanner;

public class PalindromeNumber 
{
	int num,ans=0,rem=0;
	boolean a1=false;
	boolean palindrome(int number)
	{
		num=number;
		while(number>0)
		{
			rem=number%10;
			ans=ans*10+rem;
			number=number/10;
		}
		if(ans==num)
		{
			a1=true;
		}
		return a1;
	}
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Number");
		int p=s1.nextInt();
		PalindromeNumber p1=new PalindromeNumber();
		boolean num1=p1.palindrome(p);
		if(num1==true)
		{
			System.out.println(p+" given number  is palindrome");
		}
		else
		{
			System.out.println(p+" given number  is not palindrome");
		}
		s1.close();
	}
}	