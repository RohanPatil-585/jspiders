package org.interView.sarthaaApp;

public class UpperCaseToLowerCase 
{
	public static String Lowercase(String str)
	{
		char ch[]=str.toCharArray();
		str="";
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]>='A' && ch[i]<='Z')
			{
				ch[i]=(char)(ch[i]+32);
			}
			
		}
		str=new String(ch);
		System.out.println(str);
		return str;
	}
	public static String upperCase(String str)
	{
		char ch[]=str.toCharArray();
		str="";
		for (int i = 0; i < ch.length; i++)
		{
			if(ch[i]>='a' && ch[i]<='z')
			{
				ch[i]=(char)(ch[i]-32);
			}
			
		}
		str=new String(ch);
		System.out.println(str);
		return str;
	}
	public static void main(String[] args)
	{
		String str="SADAB HOSSAIN PRAMANIK";
		Lowercase(str);
		upperCase(str);
		
	}

}
