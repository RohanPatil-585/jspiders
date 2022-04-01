package ufiizio;

public class WordFrequency 
{
	public static String[] split(String str)
	{
		char[] ch = str.toCharArray();
		str = "";
		int count = 1;
		int k = 0;
		
		int counter = 1;
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]==' ' && ch[i-1]!=' ')
			{
				count++;
			}
		}
		
		String[] array = new String[count];
		
		for (int i = 0; i < ch.length; i++)
		{
			if(ch[i]!=' ')
			{
				str = str + ch[i];
			}
			else if(ch[i]==' ' && ch[i-1]!=' ')
			{
				array[k++]=str;
				str = "";
			}
			if(i==ch.length-1)
			{
				array[k++]=str;
			}
		}
		System.out.println(count);
		return array;
	}
	
	public static boolean equals(String str1, String str2)
	{
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		if(ch1.length==ch2.length)
		{
			for (int i = 0; i < ch2.length; i++)   // rohan rohan
			{
					if(ch1[i]!=ch2[i])
					{
						return false;
					}
			}
		}
		else
		{
			return false;
		}
			return true;

	}
	
	public static void frequency(String str)
	{
		String[] array = split(str);
		for (int i = 0; i < array.length; i++)
		{
			int cn = 1;
			int flag = 0;
			for (int j = i+1; j < array.length; j++)
			{
				if(equals(array[i],array[j]))
				{
					cn++;
				}
			}
			for (int j = i-1; j >=0; j--) 
			{
				if(equals(array[i], array[j]))
				{
					flag = 1;
				}
			}
			if(flag == 0)
			{
				System.out.println(array[i] +"--> " +cn);
			}
		}
	}
	public static void main(String[] args)
	{
		String str1 = "rohan shivaji patil rohan shivaji patil patil";
		String[] array = split(str1);
		for (int i = 0; i < array.length; i++) 
		{
			System.out.println(array[i]);
		}
		
		frequency(str1);
		
	}
}