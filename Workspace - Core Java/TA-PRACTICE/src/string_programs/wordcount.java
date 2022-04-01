package string_programs;

import java.util.Scanner;

public class wordcount 
{
	public String[] splitFunction(String sentence)
	{
		int count=1;
		int k = 0;
		String blank ="";
		char ch[] = sentence.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i] == ' ' && ch[i-1]!=' ')
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
				blank ="";
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
	
	public void wordcount(String str)
	{
		String[] string = splitFunction(str);
		System.out.println(string.length);
	}
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the string...");
		String str = s1.nextLine();
		wordcount w1 = new wordcount();
		w1.wordcount(str);
	}
}