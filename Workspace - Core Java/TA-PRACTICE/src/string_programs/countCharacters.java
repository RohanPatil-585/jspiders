package string_programs;

import java.util.Scanner;

public class countCharacters 
{
	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the string...");
		String str = s1.nextLine();
		char[] ch = str.toCharArray();
		str = "";
		
		System.out.println("char \t count");
		for (int i = 0; i < ch.length; i++) 
		{
			int counter = 1;
			int flag = 0;
			for (int j = i+1; j < ch.length; j++) 
			{
				if(ch[i] == ch[j])
				{
					counter++;
				}
			}
			if(ch[i] != ' ')  // rohan ronak
			{				
				for (int j = i-1; j >= 0; j--) 
				{
					if(ch[i] == ch[j])
					{
						flag = 1;
					}
				}
				if(flag == 0)
				{					
					System.out.println(ch[i] +"\t"+ counter);
				}
			}
		}
	}
}