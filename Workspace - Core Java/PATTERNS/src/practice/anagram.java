package practice;

import java.util.Scanner;

public class anagram 
{
	
	public static String reverse(String str)
	{
		char[] ch = str.toCharArray();
		str = "";
		for (int i = ch.length-1; i >=0; i--)
		{
			str = str + ch[i];
		}
		return str;
	}
	
	public static String removeSpace(String str)
	{
		char[] ch = str.toCharArray();
		str = "";
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]!=' ')
			{
				str = str + ch[i];
			}
		}
		return str;
	}
	
	public static String lowercase(String str)
	{
		char[] ch = str.toCharArray();
		str = "";
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]>='A' && ch[i]<='Z')
			{
				str = str + (char) (ch[i]+32);
			}
			else
			{
				str = str + ch[i];
			}
		}
		return str;
	}
	
	public static String uppercase(String str)
	{
		char[] ch = str.toCharArray();
		str = "";
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]>='a' && ch[i]<='z')
			{
				str = str + (char) (ch[i]-32);
			}
			else
			{
				str = str + ch[i];
			}
		}
		return str;
	}
	
	public static char[] sort(String str)
	{
		char[] ch = str.toCharArray();
		str = "";
		for (int i = 0; i < ch.length; i++)
		{
			for (int j = 0; j < ch.length; j++) 
			{
				if(ch[i]<=ch[j])
				{
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		return ch;
	}
	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the string 1 ...");
		String string1 = s1.nextLine();
		System.out.println("enter the string 2 ...");
		String string2 = s1.nextLine();
		
		System.out.println("string reverse..................");
		System.out.println(reverse(string1)); 
		System.out.println(reverse(string2));
		
		System.out.println("string removed space........................");
		System.out.println(removeSpace(string1));
		System.out.println(removeSpace(string2));
		
		System.out.println("string lowercase........................");
		System.out.println(lowercase(string1));
		System.out.println(lowercase(string2));
		
		System.out.println("string uppercase........................");
		System.out.println(uppercase(string1));
		System.out.println(uppercase(string2));
		
		System.out.println("sorting........................");
		System.out.println(sort(string1));
		System.out.println(sort(string2));
	}
}
