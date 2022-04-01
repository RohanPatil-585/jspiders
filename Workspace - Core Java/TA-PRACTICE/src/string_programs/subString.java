package string_programs;

import java.util.Scanner;

public class subString 
{
	public String[] splitFunction(String sentence)
	{
		int count=1;
		int k = 0;
		String blank = "";
		char ch[] = sentence.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i] == ' ')
			{
				count++;
			}
		}
		 String[] st = new String[count];
		for (int i = 0; i <ch.length; i++)
		{
			if(ch[i] == ' ')
			{
				st[k++] = blank;
				blank = "";
			}
			else
			{
				blank = blank + ch[i];
			}
			if(i== ch.length-1)
			{
				st[k] = blank;
			}
		}
		return st;
	}

	public boolean subString(String str1, String str2)
	{
		String[] string1 = splitFunction(str1);
	//	String[] string2 = splitFunction(str2);
		for (int i = 0; i < string1.length; i++) 
		{
			if(string1[i].equals(str2))
			{
			//	System.out.println("substring found...");
				return true;
			}
//			else
//			{
//				System.out.println("substring not found...");
//			}
		}
		return false;
	}
	
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the string...");
		String str = s1.nextLine();
		System.out.println("enter the sub string...");
		String substr = s1.nextLine();
		subString sub1 = new subString();
		boolean result = sub1.subString(str, substr);
		
		if(result)
		{
			System.out.println("sub string found...");
		}
		else
		{
			System.out.println("sub string not found...");
		}
	}
}