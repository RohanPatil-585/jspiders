package infosys;

public class WordSwap 
{
	public static String[] split(String str)
	{
		char[] ch = str.toCharArray();
		str = "";
		int count = 1;
		int k = 0;
		
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
				str = "";
			}
			if(i==ch.length-1)
			{
				array[k++]=str;
			}
		}
		return array;
	}
	
	public static String[] swap(String str)
	{
		String[] array = split(str);
		int k = array.length-1;	
		
		for (int i = 0; i < array.length/2; i++) 
		{
				if(i%2==0)
				{
					String temp = array[i];
					array[i] = array[k];
					array[k] = temp;
					k--;
					k--;			
				}
			
		}
		return array;
	}
	
	public static void main(String[] args) 
	{
		String str = "rohan diapk jay divyesh ronak sadab nitesh";
		char[] ch = str.toCharArray();
		int count = 1;
		int flag = 0;
		
		System.out.println();
		String[] array = swap(str);
		for (int i = 0; i < array.length; i++) 
		{
				System.out.print(array[i]+" ");
		}
	}
}