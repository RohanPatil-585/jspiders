package mock1;

import java.util.Scanner;

public class palindromeString 
{
	String str;
	String tempstring ="";
	boolean String1=false;
	
	boolean palindrome(String argument)
	{
		char[] ch = argument.toCharArray();
		int n = ch.length-1;
		int cn=0;
		for (int i = n; i >= 0; i--) 
		{
			tempstring = tempstring + ch[i];
		} 
		char ch1[] = tempstring.toCharArray();
		if(tempstring.equals(argument))
		{
			String1=true;
		}
		return String1;
	}
	
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter String..");
		String string=s1.next();
		
		palindromeString pal1 = new palindromeString();
	//	String ans = pal1.palindrome(string);
		boolean Stri=pal1.palindrome(string);
		if(Stri==true)
		{
			System.out.println(string+" given String is palindrom ");
		}
		else
		{
			System.out.println(string+" given string is not palindrom ");
		}
	}
}