package rohan;

import java.lang.reflect.Array;

public class SingleLineAnagram 
{
	public static String[] split(String str)
	{
		char[] ch = str.toCharArray();
		str = "";
		int count = 1;
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
				str = "";
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
		return array;
	}
	
	public static String removespace(String str)
	{
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]!=' ')
			{
				str = str + ch[i];
			}
		}
		return str;
	}
	
	public static String reverse(String str)
	{
		char[] ch = str.toCharArray();
		str = "";
		for (int i =ch.length-1; i>=0; i--) 
		{
			str = str + ch[i];
		}
		return str;
	}
	
	public static char[] sorting(String str)
	{
		char[] ch = str.toCharArray();
		str = "";
		for (int i = 0; i < ch.length; i++) 
		{
			for (int j = i+1; j < ch.length; j++)
			{
				if(ch[i]>ch[j])
				{
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		return ch;
	}
	
	public static String lowercase(String str)
	{
		char[] ch = str.toCharArray();
		str = "";
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]>='A' && ch[i]<='Z')
			{
				str = str + (char)(ch[i]+32);
			}
			else
			{
				str = str + ch[i];
			}
		}
		return str;
	}
	
	public static boolean isequals(String str1, String str2)
	{
		char[] sort1 = sorting(str1);
		char[] sort2 = sorting(str2);
		
		for (int i = 0; i < sort2.length; i++) 
		{
			if(sort1[i] != sort2[i])
			{
				return false;
			}
		}
		return true;
	}
	
	public static boolean isanagram(String str1, String str2)
	{
		String rem1 = removespace(str1);
		String rem2 = removespace(str2);
		
		if(rem1.length() != rem2.length())
		{
			return false;
		}
		String low1 = lowercase(rem1);
		String low2 = lowercase(rem2);
		boolean b1 = isequals(low1, low2);
		return b1;
	}
	
	public static void anagram(String str)
	{
		int count = 1;
		int k = 0;
		String tempstr = "";
		String[] split = split(str);
		boolean b1 = false;
		for (int i = 0; i < split.length; i++) 
		{
			for (int j =i+1; j <= split.length-1; j++) 
			{
				 b1 = isanagram(split[i], split[j]);
				 if(b1)
				 {
					 System.out.println(split[i]+split[j]);
					 count++; 
					 tempstr = tempstr + (split[i]+split[j]+" ");
				 }
			}
		}
		System.out.println("=======");
		String[] array1 = split(tempstr);
		for (int j = 0; j < array1.length; j++) 
		{
			for (int j2 = j+1; j2 <= array1.length-1; j2++) 
			{
				if(array1[j].length()>=array1[j2].length())
				{
					System.out.println(array1[j]);
				}
				else
				{
					System.out.println(array1[j2]);
				}
			}
			break;
		}
	}
	public static void main(String[] args) 
	{
		String str = "dipak kapid pratik kitarp lakhota atohkal";
		anagram(str);
	}
}