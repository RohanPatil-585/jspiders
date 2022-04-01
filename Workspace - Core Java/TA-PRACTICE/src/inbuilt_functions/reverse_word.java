package inbuilt_functions;

import java.util.Scanner;

public class reverse_word 
{
	static Scanner s1 = new Scanner(System.in);
	public String[] splitfunction(String santance)
	{
		int count = 1;
		String emptystring = "";
		int k = 0;
		String st[];
		
		char ch[] = santance.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i] == ' ')
			{
				count++;
			}
		}
		st = new String[count];
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i] == ' ')
			{
				st[k] = emptystring;
				k++;
				emptystring = "";
			}
			else
			{
				emptystring = emptystring + ch[i];
			}
			if(i == ch.length-1)
			{
				st[k] = emptystring;
			}
		}
		return st;
	}
	
	public String reverseword(String Stringarg)
	{
		String tempstring = "";
		int count = 1;
		char ch[] = Stringarg.toCharArray();
		for (int i = ch.length-1; i >= 0; i--)
		{
			tempstring = tempstring + ch[i];
		}
		return tempstring;
	}
	
	public String reverswordatposition(String Stringargs)
	{
		String[] ch = splitfunction(Stringargs);
		Stringargs = "";
		for (int i = 0; i < ch.length; i++) 
		{
			Stringargs = Stringargs + reverseword(ch[i]) + " "; 
		}
		
		return Stringargs;
	}
	public static void main(String[] args)
	{
		reverse_word rev = new reverse_word();
		System.out.println("enter the string...");
		String str = s1.nextLine();
		
		String[] resultstring = rev.splitfunction(str);
		String ansstring = rev.reverseword(str);
//		System.out.println(ansstring);
		String s2 = rev.reverswordatposition(str);
		System.out.println(s2);
	}
}