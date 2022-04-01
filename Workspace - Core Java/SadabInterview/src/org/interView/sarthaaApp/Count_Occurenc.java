package org.interView.sarthaaApp;

public class Count_Occurenc 
{
	public static void main(String[] args) 
	{
		String str="hi welcom to jspider";
		char ch[]=str.toCharArray();
		String st="";
	
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]!=' ')
			{
				
				st=st+ch[i];
			}
			else
			{
				System.out.println(st+"--->"+st.length());
				st="";
				
				}
			if(i==ch.length-1)
				
			{
				System.out.println(st+"--->"+st.length());
			}
			
		}
		
	}

}
