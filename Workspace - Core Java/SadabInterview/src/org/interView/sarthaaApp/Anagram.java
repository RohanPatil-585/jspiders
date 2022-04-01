package org.interView.sarthaaApp;

import java.util.Scanner;

public class Anagram
{
	public static String removeSpace(String str)
	{
		char ch[]=str.toCharArray();
		str="";
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]!=' ')
			{
				str=str+ch[i];
			}
			
		}
		
		return str;
	}
	public static String lowerCase(String str)
	{
		char ch[]=str.toCharArray();
		 
		for (int i = 0; i < ch.length; i++)
		{
			if(ch[i]>=65 && ch[i]<=96 )
			{
				ch[i]=(char) (ch[i]+32);
				
			}
			
			str=new String(ch);
			
		}
	return str;
	}
	public static char[]Sort(char[] ch1)
	{
		
		for (int i = 0; i < ch1.length; i++) 
		{
			for (int j = i+1; j < ch1.length; j++) 
			{
				if(ch1[i]>ch1[j])
				{
					char temp=ch1[i];
					ch1[i]=ch1[j];
					ch1[j]=temp;
				}
				
			}
			
		}
		
		return ch1;
	}
	public static boolean Check(String st1,String st2)
	{
		char ch1[]=st1.toCharArray();
		char ch2[]=st2.toCharArray();
		ch1=Sort(ch1);
		ch2=Sort(ch2);
		for (int i = 0; i < ch2.length; i++) 
		{
			if(ch1[i]!=ch2[i])
			{
				return false;
			}
			
		}
		return true;
	
		
	}
	public static boolean isAnnagram(String s1,String s2)
	{
		s1=removeSpace(s1);
		s2=removeSpace(s2);
		if(s1.length()!=s2.length())
		
			return false;
		s1=lowerCase(s1);
		s2=lowerCase(s2);
		boolean b=Check(s1, s2);
		return b;
		
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" eneter 1st String here");
		String s1=sc.nextLine();
		System.out.println(" eneter 2nd String here ");
		String s2=sc.nextLine();
		Anagram a1=new Anagram();
		boolean res=a1.isAnnagram(s1, s2);
		if(res)
		{
			System.out.println(" String  is Anagram ");
		}
		else
			System.out.println(" String not a Annagram");
	

	}

}
