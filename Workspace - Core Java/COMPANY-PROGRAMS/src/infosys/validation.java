package infosys;

import java.util.Scanner;

public class validation 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter username");
		String str = s1.next();
		int flag = 0;
		
		char[] ch = str.toCharArray();
		//System.out.println(str.length());
		str = "";
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch.length>=8 && ch.length<=30)
			{				
				if((i == 0 && ch[i]>='a' && ch[i]<='z' || ch[i]>='A' && ch[i]<='Z') || (i!=0 && ch[i]=='_'))
				{					
						flag = 1;
				}
				else if(ch[i]>='!' && ch[i]<='/')
				{
					flag = 0;
				}
			}
		}
		if(flag==1)
		{
			System.out.println("valid string...");
		}
		else
		{
			System.out.println("unvalid string...");
		}
	}
}