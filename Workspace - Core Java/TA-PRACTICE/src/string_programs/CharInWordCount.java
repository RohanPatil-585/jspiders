package string_programs;

import java.util.Scanner;

public class CharInWordCount
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
			int counter = 0;
			while(i<ch.length && ch[i] != ' ')
			{
				str = str + ch[i];
				i++;
				counter++;
			}
			str = str + counter +" ";
		}
		System.out.println(str);
	}
}