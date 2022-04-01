package org.interView.sarthaaApp;

public class StringPalindrom 
{
 public static String reversh(String str)
 {
	 char ch[]=str.toCharArray();
	 str="";
	 for (int i =ch.length-1; i>=0 ; i--) 
	 {
		 str=str+ch[i];
		 
		
	}
	 System.out.println(str);
	 return str;
 }
 public static void isPalindrom (String str)
 {
	 char ch[]=str.toCharArray();
	 int i; int j=0;
	 boolean b=true;
	for(i=0;i<ch.length;i++,j++)
	{
		if(ch[i]!=ch[j])
			b= false;
	       break;
	      
	}
	if(b)
	{
		System.out.println(" it's Palindrom");
	}
	else
	{
		System.out.println(" Not a Palindrom ");
	}
 }
 public static void main(String[] args)
 {
	 String st1="Sadab";
	 isPalindrom(st1);
	
}
}
