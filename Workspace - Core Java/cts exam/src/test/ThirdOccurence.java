package test;

import java.util.Spliterator;

public class ThirdOccurence 
{
	static int pos = 0;
	static int count = 0;
	public static String[] splitFunction(String sentence)
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
		System.out.println("count = "+count);
		return st;
	}
	
	public static boolean wordpresent(String str1,String str2)
	{
		String[] splitstr = splitFunction(str1);
		for (int i = 0; i < splitstr.length; i++) 
		{
			if(splitstr[i].equals(str2))
			{
				return true;
			}
			pos = i;
		}
		return false;
	}
	public static void main(String[] args) 
	{
		String str1 = "rohan rohan patil";
		String str2 = "patil";
		boolean result = wordpresent(str1, str2);
		if(result)
		{
			System.out.println("word is present");
		}
		else
		{
			System.out.println("word is not present");
		}
		System.out.println("pos = "+pos);
	}
}