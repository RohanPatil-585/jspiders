package org.interView.sarthaaApp;

public class String_panagram 
{
	public static String checkPanagram(String str)
	{
		char ch[]=str.toCharArray();
		str="";
		
		for (int i = 0; i < ch.length; i++)
		{ 
			for (int j = i+1; j < ch.length; j++) 
				
			{
				if(ch[i]==ch[j])
				{
					ch[i]=' ';
				}
			}
			if(ch[i]!=' ')
			{
				str=str+ch[i];
				
			}
			
		}
		System.out.println(str);
		str=RemoveSpace(str);
		str=lowerCase_UpperCase(str);
		System.out.println(str);
		return str;
		
	}
	public static String lowerCase_UpperCase(String str)
	{
		char ch[]=str.toCharArray();
		str="";
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]>='a' && ch[i]<='z')
			{
				ch[i]=(char)(ch[i]-32);
			}
			else if(ch[i]>='A' && ch[i]<='Z')
			{
				ch[i]=(char) (ch[i]+32);
			}
			
			
		}
		str=new String(ch);
		System.out.println(str);
		
		return str;
	}
	
	public static String RemoveSpace(String str)
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
		System.out.println(str);
		return str;
	}
	
	public static void main(String[] args) 
	{
		String str="abcd efgh ijkl mnop qrst uvwxyz";
		String res=checkPanagram(str);
		if(res.length()<26)
			System.out.println(" not panagram ");
		else
			System.out.println(" it's panagram");
		lowerCase_UpperCase(str);
		
		
		}
	}


