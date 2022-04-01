package string_programs;

import java.util.Scanner;

public class anagram 
{
	public String removeSpace(String santance)
	{
		char ch[] = santance.toCharArray();
		santance = "";
		for (int i = 0; i <= ch.length-1; i++) 
		{
				if(ch[i] != ' ')
				{					
				//	tempstring = tempstring + ch[i];
					santance = santance + ch[i];
				}
		}
		return santance;
	}
	
	public String lowercase(String santance)
	{
		char ch[] = santance.toCharArray();
		santance = "";
		for (int i = 0; i <= ch.length-1; i++) 
		{
			if(ch[i] >= 'A' && ch[i] <= 'Z')
			{
				santance = santance + (char)(ch[i]+32);
			}
			else
			{
				santance = santance + (char)(ch[i]);
			}
		}
		return santance;
	}
	
	public String upperCase(String santance)
	{
		char[] ch = santance.toCharArray();
		santance = "";
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]>='a' && ch[i]<='z')
			{
				santance = santance + (char)(ch[i]-62);
			}
			else
			{
				santance = santance + (char)(ch[i]);
			}
		}
		return santance;
	}
	
	public char[] bubbleSort(char[] ch)
	{
		int cn = 0;
		char temp;
		int n = ch.length-1;
		for (int i = 0; i <= ch.length; i++) 
		{
			for (int j = 0; j < n-i; j++) 
			{			
				if(ch[j] > ch[j+1])
				{
					temp =  ch[j];
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

	public boolean isAnagram(String st1 , String st2)
	{
		st1 = removeSpace(st1);
		st2 = removeSpace(st2);
		if(st1.length() != st2.length())
		{
			return false;
		}
		boolean b = equals(st1, st2);
		return b;
	}
	
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		
		anagram a1 = new anagram();
		System.out.println("enter the string...");
		String str1 = s1.nextLine();
		String string1 = a1.removeSpace(str1);
		
		System.out.println("enter the string...");
		String str2 = s1.nextLine();
		String string2 = a1.removeSpace(str2);
		
		System.out.println(string1);
		System.out.println(string2);
		
		String lowercase1 = a1.lowercase(string1);
		String lowercase2 = a1.lowercase(string2);
		
		System.out.println();
		System.out.println(lowercase1);
		System.out.println(lowercase2);
		
		String upper1 = a1.upperCase(string1);
		String upper2 = a1.upperCase(string2);
		System.out.println();
		System.out.println(upper1);
		System.out.println(upper2);
		
		char[] charray1 = lowercase1.toCharArray();
		char[] charray2 = lowercase2.toCharArray();
		
		char[] sort1 = a1.bubbleSort(charray1);
		char[] sort2 = a1.bubbleSort(charray2);
		
		System.out.println();
		System.out.println(sort1);
		System.out.println(sort2);
		
		boolean result = a1.isAnagram(str1, str2);
		if(result)
		{
			System.out.println("the string is anagram...");
		}
		else
		{
			System.out.println("the string is not anagram...");
		}
	}
}