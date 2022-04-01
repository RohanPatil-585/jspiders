package string;

import java.util.Scanner;

public class AllInOne2 
{
	public static String reverse(String str)
	{
		char[] ch = str.toCharArray();
		str = "";
		for (int i = ch.length-1; i >=0 ; i--) 
		{
			str = str + ch[i];
		}
		return str;
	}
	
	public static String removespace(String str)
	{
		char ch[] = str.toCharArray();
		str = "";
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]!=' ')
			{
				str = str + ch[i];
			}
		}
		return str;
	}
	
	public static String[] split(String str)
	{
		char ch[] = str.toCharArray();
		str = "";
		int k = 0;
		int count = 1;
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]==' ' && ch[i-1]!=' ')
			{
				count++;
			}
		}
		String array[] = new String[count];
		for (int i = 0; i < ch.length; i++)
		{
			if(ch[i]!=' ')
			{
				str = str + ch[i];
			}
			else if(ch[i]==' ' && ch[i-1]!=' ')
			{
				array[k++]=str;
				str="";
			}
			if(i==ch.length-1)
			{
				array[k++]=str;
			}
		}
		return array;
	}
	
	public static String[] wordReverse(String str)
	{
		String splitedarray[] = split(str);
		for (int i = 0; i < splitedarray.length; i++) 
		{
			if(splitedarray[i]!=" ")
			{
				splitedarray[i] = reverse(splitedarray[i]);
			}
		}
		return splitedarray;
	}
	
	public static String[] wordSwap(String str)
	{
		String splitedarray[] = split(str);
		
		for (int i = 0; i < splitedarray.length; i++) 
		{
			int k = splitedarray.length-1;
			for (int j = 0; j < splitedarray.length/2; j++)
			{
				String splitedtemp=splitedarray[i];
				splitedarray[i]=splitedarray[k--];
				splitedarray[k--]=splitedtemp;
			}
		}
		return splitedarray;
	}
	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the String........");
		String str = s1.nextLine();
		
		System.out.println();
		System.out.println("String reverse.............");
		String reverseString = reverse(str);
		System.out.println(reverseString);
		
		System.out.println();
		System.out.println("String remove space.............");
		String removeSpace = removespace(reverseString);
		System.out.println(removeSpace);
		
		System.out.println();
		System.out.println("String split array.............");
		String splitArray[] = split(str);
		for (int i = 0; i < splitArray.length; i++) 
		{
			System.out.println(splitArray[i]);
		}
		
		System.out.println();
		System.out.println("String word reverse.............");
		String wordReverse[] = wordReverse(str);
		for (int i = 0; i < wordReverse.length; i++) 
		{
			System.out.println(wordReverse[i]);
		}
		
		System.out.println();
		System.out.println("String word swap.............");
		String[] wordswap = wordSwap(str);
		for (int i = 0; i < wordswap.length; i++) 
		{
			System.out.print(wordswap[i]);
		}
	}
}
