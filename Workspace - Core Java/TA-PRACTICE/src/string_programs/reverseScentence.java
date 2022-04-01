package string_programs;

import java.util.Scanner;

public class reverseScentence 
{
	public String[] split(String santance)
	{
		String tempstring[];
		String str = "";
		char[] ch = santance.toCharArray();
		int count = 1;
		int k = 0;
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i] == ' ')
			{
				count++;
			}
		}
		tempstring = new String[count];
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i] == ' ')
			{
				tempstring[k++] = str;
				str = "";
			}
			else
			{
				str = str + ch[i];
			}
			if(i == ch.length-1)
			{
				tempstring[k] = str;
			}
		}
		return tempstring;
	}
	
	public String reverse(String str)
	{
		char[] ch = str.toCharArray();
		str = "";
		for (int i = ch.length-1; i >= 0; i--) 
		{
			str = str + ch[i];
		}
		return str;
		
	}
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the string...");
		String str = s1.nextLine();
		reverseScentence r1 = new reverseScentence();
		String[] string1 = r1.split(str);
		for (int i = 0; i < string1.length; i++) 
		{
			System.out.println(string1[i]);
		}
		
		System.out.println();
		
		for (int i = string1.length-1; i >= 0; i--) 
		{
			System.out.print(string1[i] +" ");
		}
		System.out.println();
		for (int i = string1.length-1; i >= 0; i--) 
		{
			System.out.print(r1.reverse(string1[i])+" ");
		}
	}
}