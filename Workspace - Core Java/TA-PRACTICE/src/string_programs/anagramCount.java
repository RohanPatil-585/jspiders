package string_programs;

import java.util.Scanner;

public class anagramCount 
{
	int counters = 0;
	public String removeSpace(String santance)
	{
		char[] ch = santance.toCharArray();
		santance = "";
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i] != ' ')
			{				
				santance = santance + ch[i];
			}
		}
	return santance;	
	}
	
	public String lowerCase(String santance)
	{
		char[] ch = santance.toCharArray();
		santance ="";
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i] >= 'A' && ch[i] <= 'Z')
			{
				santance = santance + (char)(ch[i]+32);
			}
			else if(ch[i] >= 'a' && ch[i] <= 'z')
			{
				santance = santance + (char)(ch[i]-32);
			}
		}
		return santance;
	}
	
	public char[] bubbleSort(char[] ch)
	{
		int n = ch.length-1;
		for (int i = 0; i <= ch.length; i++) 
		{
			for (int j = 0; j < n-i; j++) 
			{				
				if(ch[j] > ch[j+1])
				{
					char temp = ch[j];
					ch[j] = ch[j+1];
					ch[j+1] = temp;
				}
			}
		}
		return ch;
	}
	
	public boolean equals(String santance1 , String santance2)
	{
		char[] ch1 = santance1.toCharArray();
		char[] ch2 = santance2.toCharArray();
		
		ch1 = bubbleSort(ch1);
		ch2 = bubbleSort(ch2);
		for (int i = 0; i < ch1.length; i++) 
		{
			if(ch1[i] != ch2[i])
			{
				return false;
			}
		
		}
		return true; 
	}
	
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
		System.out.println("count = "+count);
		return st;
	}
	
	public int anagramCounter(String str)
	{
		int count = 0;
		String[] stringarray = splitFunction(str);
		for (int i = 0; i < stringarray.length; i++) 
		{
			for (int j = i+1; j < stringarray.length; j++) 
			{
				if(stringarray[i].length() == stringarray[j].length())
				{
					boolean result = isAnagram(stringarray[i], stringarray[j]);	
				}	
			}
		}
		return count;
	}
	public boolean isAnagram(String str1, String str2)
	{
		str1 = removeSpace(str1);
		str2 = removeSpace(str2);
		if(str1.length() != str2.length())
		{
			return false;
		}
		boolean b = equals(str1, str2);
		if(b==true)
		{
			counters++;
		}
	//	counters++;
		return b;
	}
	
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		anagramCount ac1 = new anagramCount();
		System.out.println("enter the string1...");
		String string1 = s1.nextLine();
		System.out.println("enter the string2...");
		String string2 = s1.nextLine();
		String resultString1 = ac1.removeSpace(string1);
		String resultString2 = ac1.removeSpace(string2);
		System.out.println("after removing space 1...");
		System.out.println(resultString1);
		System.out.println("after removing space 2...");
		System.out.println(resultString2);
		System.out.println("after lowercase...");
		String lowerstring1 = ac1.lowerCase(resultString1);
		String lowerstring2= ac1.lowerCase(resultString2);
		System.out.println(lowerstring1);
		System.out.println(lowerstring2);
		char[] ch1 = lowerstring1.toCharArray();
		char[] ch2 = lowerstring2.toCharArray();
		char[] lowerch1 = ac1.bubbleSort(ch1);
		char[] lowerch2 = ac1.bubbleSort(ch2);
		System.out.println(lowerch1);
		System.out.println(lowerch2);
		boolean result = ac1.isAnagram(string1, string2);
		if(result == true)
		{
			System.out.println("the string is anagram...");
			//ssac1.counters++;
		}
		else
		{
			System.out.println("the string is not anagram...");
		}
		
		System.out.println();
		int counter = ac1.anagramCounter(string1);
		System.out.println("counter = "+ac1.counters);
	}
}