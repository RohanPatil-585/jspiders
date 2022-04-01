package string_programs;

import java.util.Scanner;

public class firstcharUpper
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the string...");
		String str = s1.nextLine();
		char[] ch = str.toCharArray();
		str = "";
		for (int i = 0; i < ch.length; i++) 
		{
			if(i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' ')
			{
				if(ch[i]>='a' && ch[i]<='z')
				{
					ch[i] = (char) (ch[i]-32);
				}
			}
			else if(ch[i]>='A' && ch[i]<='Z')
			{
					ch[i] = (char) (ch[i]+32);
			}
			str = str + ch[i];
		}
		System.out.println(str);
	}
}