package string_programs;

import java.util.Scanner;

public class countCharNumbers 
{
	public static void main(String[] args) 
	{
		int uc=0, lc=0, sc=0, dc=0, vc=0, cc=0;
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the string...");
		String str = s1.nextLine();
		char[] ch = str.toCharArray();
		str = "";
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]>='A' && ch[i]<='Z')
			{
				uc++;
				if(ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U')
				{
					vc++;
				}
				else
				{
					cc++;
				}
			}
			else if(ch[i]>='a' && ch[i]<='z')
			{
				lc++;
				if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
				{
					vc++;
				}
				else
				{
					cc++;
				}
			}
			else if(ch[i]>='1' && ch[i]<='9')
			{
				dc++;
			}
			else
			{
				sc++;
			}
		}
		System.out.println("uppercase char = "+uc);
		System.out.println("lowercase char = "+lc);
		System.out.println("digits = "+dc);
		System.out.println("special symbols = "+sc);
		System.out.println("vowels = "+vc);
		System.out.println("consonents = "+cc);
	}
}
