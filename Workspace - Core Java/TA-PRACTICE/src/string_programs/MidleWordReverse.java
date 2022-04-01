package string_programs;

import inbuilt_functions.reverse_word;

public class MidleWordReverse 
{
	public static String midReverse(String str)
	{
		char[] ch = str.toCharArray();
		str = "";
		for (int i = ch.length-1; i >= 0; i--) 
		{
			str = str + ch[i];
		}		
		return str;
	}
	
	public static String[] split(String str)
	{
		int count = 1;
		char[] ch = str.toCharArray();
		str = "";
		int k = 0;
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]==' ')
			{
				count++;
			}
		}
		
		String[] array = new String[count];
		
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]==' ')
			{
				array[k++]=str;
				str="";
			}
			else
			{
				str = str + ch[i];
			}
			if(i==ch.length-1)
			{
				array[k]=str;
			}
		}
	//	System.out.println("count = "+count);
		return array;
	}
	
	public static String[] swaping(String str)
	{
		String[] array = split(str);
	//	String stri = midReverse(array[array.length/2]);
		int k = array.length-1;
		for (int i = 0; i <= array.length/2; i++) 
		{
			if(i==array.length/2 )
			{
				array[i]=midReverse(array[i]);
			}
			else
			{
				String temp = array[i];
				array[i] = array[k];
				array[k] = temp;
				k--;
			}
		}
		return array;
	}
	public static void main(String[] args) 
	{
		String str = "rohan sadab ronak jay dipak";
		String[] array = split(str);
		for (int i = 0; i < array.length; i++) 
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
		String[] result = swaping(str);
		for (int i = 0; i < result.length; i++) 
		{			
			System.out.print(result[i]+" ");
		}
	}
}