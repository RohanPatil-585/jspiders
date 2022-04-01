package inbuilt_functions;

import java.util.Scanner;

public class string_reverse
{
	static Scanner s1 = new Scanner(System.in);
	public String[] splitfunction(String santance)
	{
		int count = 1;
		String emptystring = "";
		int k = 0;
		String st[];
		
		char ch[] = santance.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i] == ' ')
			{
				count++;
			}
		}
		st = new String[count];
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i] == ' ')
			{
				st[k] = emptystring;
				k++;
				emptystring = "";
			}
			else
			{
				emptystring = emptystring + ch[i];
			}
			if(i == ch.length-1)
			{
				st[k] = emptystring;
			}
		}
		return st;
	}
	public static String revrse(String str){
		
		char[] c1=str.toCharArray();
		str="";
		for (int i = c1.length-1; i >= 0; i--) 
		{
			str=str+c1[i];
		}
	return str;
	}
	
	public String reverse(String array)
	{	
	String[] sp=splitfunction(array);
		String tempstring = "";
		for (int i = sp.length-1; i>=0; i--) 
		{
			tempstring = tempstring+reverse(sp[i]) + " ";
		}
		
		return tempstring;
	}
	
	public static void main(String[] args) 
	{
		
		System.out.println("enter the string");
		String str1 = s1.nextLine();
		String s1=revrse(str1);
		System.out.println(s1);
		
	}
}