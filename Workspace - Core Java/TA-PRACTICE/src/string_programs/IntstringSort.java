package string_programs;

public class IntstringSort 
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
		return array;
	}
	
	public static int parseInt(String str)
	{
		char[] ch = str.toCharArray();
		int temp=0;
		for (int i = 0; i < ch.length; i++) 
		{
			temp = (temp*10) + (ch[i]-48);
		}
		return temp;
	}
	
	public static int[] convert(String str)
	{
		String[] strarray = split(str);
		int[] intarray = new int[strarray.length];
		for (int i = 0; i < intarray.length; i++) 
		{
			//intarray[i]=Integer.parseInt(strarray[i]);
			intarray[i]=IntstringSort.parseInt(strarray[i]);
		}
		return intarray;
	}
	
	public static int[] sorting(int[] arr)
	{
		for (int i = 0; i < arr.length; i++) 
		{
			int temp;
			for (int j = i+1; j < arr.length; j++) 
			{
				if(arr[i]>=arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) 
	{
	//	String str = "0001 123 456 12345678";
		String str = "567 123 765 127797 98789809";
		
		int[] intarray = convert(str);
		int[] sortedarray = sorting(intarray);
		
		for (int i = 0; i < sortedarray.length; i++) 
		{
			System.out.print(sortedarray[i]+" ");
		}
	}
}