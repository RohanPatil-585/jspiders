package rohan;

import java.util.Scanner;

public class anagram 
{
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
	
	public static char[] bubbleSort(String str)
	{
		char[] ch = str.toCharArray();
		str = "";
		int n = ch.length-1;
		for (int i = 0; i < ch.length; i++) 
		{
			for (int j = i+1; j < ch.length; j++) 
			{
				char temp;
				if(ch[i]>ch[j])
				{
					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		return ch;
	}
	
	public static String lowerCase(String str)
	{
		char[] ch = str.toCharArray();
		str = "";
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]>='A' && ch[i]<='Z')
			{
				str = str + (char)(ch[i]+32);
			}
			else
			{
				str = str + ch[i];
			}
		}
		return str;
	}
	
	public static String upperCase(String str)
	{
		char[] ch = str.toCharArray();
		str = "";
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]>='a' && ch[i]<='z')
			{
				str = str + (char)(ch[i]-32);
			}
			else
			{
				str = str + ch[i];
			}
		}
		return str;
	}
	
	public static boolean isEquals(String str1 , String str2)
	{
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		ch1 = bubbleSort(str1);
		ch2 = bubbleSort(str2);
		for (int i = 0; i < ch2.length; i++) 
		{
			if(ch1[i]!=ch2[i])
			{
				return false;
			}
		}
		return true;
	}
	
	public static boolean isAnagram(String str1 , String str2)
	{
		str1 = removeSpace(str1);
		str2 = removeSpace(str2);
		if(str1.length() != str2.length())
		{
			return false;
		}
		boolean b = isEquals(str1, str2);
		return b;
	}
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the main string...");
		String mainstring = s1.nextLine();
		System.out.println("enter the substring...");
		String substring = s1.nextLine();
		System.out.println("=== main string ===");
		System.out.println("=== substring ===");
		System.out.println(mainstring);
		System.out.println(substring);
		
		boolean anagram = isAnagram(mainstring, substring);
		if(anagram)
		{
			System.out.println("given string is anagram...");
		}
		else
		{
			System.out.println("given string is not anagram...");
		}		
	}
}