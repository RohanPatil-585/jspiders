package string_programs;
public class PutCharBefore 
{
	public static String[] split(String str)
	{
		int k = 0;
		int count = 1;
		char[] ch = str.toCharArray();
		str = "";
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
	
	public static String putChar(String str)
	{
		String result = "";
		String[] array = split(str);
		for (int i = 0; i < array.length; i++) 
		{
			char[] ch = array[i].toCharArray();
			for (int j = 0; j < ch.length; j++) 
			{				
				if(ch[i]=='a')
				{
					ch[i-1] = 'X';
					result = result + ch[i];
				}
				else
				{
					result = result + ch[i];
				}
			}
		}
		return result;
	}
	
	public static void main(String[] args) 
	{
		String str = "rohan patil";
		String[] array = split(str);
		for (int i = 0; i < array.length; i++) 
		{
			System.out.println(array[i]);
		}
		
		System.out.println();
		String append = putChar(str);
		System.out.println("append = "+append);
	}
}