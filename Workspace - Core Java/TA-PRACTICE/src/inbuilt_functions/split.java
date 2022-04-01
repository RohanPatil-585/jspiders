package inbuilt_functions;

import java.util.Scanner;

public class split 
{
	Scanner s1 = new Scanner(System.in);
	
	public String[] splitFunction(String sentence)
	{
		int count=1;
		int k = 0;
		String blank = "";
		char ch[] = sentence.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i] == ' ')
			{
				count++;
			}
		}
		String[] st = new String[count];
		for (int i = 0; i <ch.length; i++)
		{
			if(ch[i] == ' ')
			{
				st[k++] = blank;
				blank = "";
			}
			else
			{
				blank = blank + ch[i];
			}
			if(i== ch.length-1)
			{
				st[k] = blank;
			}
		}
		System.out.println("count = "+count);
		return st;
	}
	public static void main(String[] args) 
	{
		String st = "rohan shivajibhai      patil";
		split sp1 = new split();
		String[] stringarray = sp1.splitFunction(st);
		System.out.println("length"+stringarray.length);
		for (int i = 0; i < stringarray.length; i++) 
		{
			System.out.print(stringarray[i]);
		}
		System.out.println();
	}
}