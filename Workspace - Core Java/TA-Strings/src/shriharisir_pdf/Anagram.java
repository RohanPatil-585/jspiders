
//aim -- Finding the Anagram 

package shriharisir_pdf;

import java.util.Scanner;
class Anagram
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter first sentence:");  
		String st1=sc.nextLine(); 
		System.out.println("Enter second sentence:"); 
		String st2=sc.nextLine();   
		mainAnagram a1=new mainAnagram();
		boolean res=a1.isAnagram(st1,st2);  
		if (res)  
			System.out.println("Strings are anagram");
		else    System.out.println("Strings are not anagram"); 
	}
}
class mainAnagram
{
	boolean isAnagram(String s1,String s2) 
	{
		s1=removeSpace(s1); 
		s2=removeSpace(s2);
		if(s1.length()!=s2.length()) 
			return false; 
		s1=toLowerCase(s1); 
		s2=toLowerCase(s2);
		boolean b=check(s1,s2); 
		return b;  
	}   
	boolean check(String s1,String s2) 
	{
		char ch1[]=s1.toCharArray();   
		char ch2[]=s2.toCharArray();
		ch1=sort(ch1);
		ch2=sort(ch2);
		for (int i=0;i<ch1.length ;i++ )
		{
			if(ch1[i]!=ch2[i])
				return false;
			}
		return true;  
		}   
 
	char[] sort(char ch[]) 
	{
		for (int i=0;i<ch.length ;i++ ) 
		{ 
			for (int j=i+1;j<ch.length ;j++ )  
			{
				if(ch[i]>ch[j])  
				{
					char temp=ch[i];   
					ch[i]=ch[j];  
					ch[j]=temp; 
				}   
			}
		}
		return ch; 
	}   
	String removeSpace(String st) 
	{   
		char ch[]=st.toCharArray(); 
		st=""; 
		for (int i=0;i<ch.length ;i++ ) 
		{
			if(ch[i]!=' ')
				st=st+ch[i];  
		}		
		return st;
	}   
	String toLowerCase(String st)  
	{
		char ch[]=st.toCharArray();   
		for (int i=0;i<ch.length ;i++ )  
		{
			if(ch[i]>=65 && ch[i]<=91)  
				ch[i]=(char) (ch[i]+32); 
		}
		st=new String(ch);
		return st;
	}
} 