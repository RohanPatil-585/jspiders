package string_programs;

public class StringSort
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
		
	public static String sorting(String str1,String str2)
	{
		char[] ch1 = str1.toCharArray();   //rohan ronak
		char[] ch2 = str2.toCharArray();
		for (int i = 0; i < ch1.length; i++) 
		{
			while(i<ch1.length || i<ch2.length)
			{				
				if(ch1[i]==ch2[i])
				{
					if(i==ch1.length-1 || i==ch2.length-1)
					{
						return str1;
					}
					else
					{					
						i++;
					}
				}//rohan rohan
				else if(ch1[i]<ch2[i])
				{
					return str1;
				}
				else if(ch1[i]>ch2[i])
				{
					return str2;
				}
			}
		}
		return null;
	}
	public static void main(String[] args) 
	{
		String str = "rohan ronak jay divyesh dipak rohan nitesh pritesh aashish mahajan keyur";
		//String str ="jay dipak aashish ronak rohan divyesh keyur pritesh manoj nitesh";
		String[] array = split(str);
		for (int i = 0; i < array.length; i++)
		{
			for (int j = i+1; j <= array.length-1; j++) 
			{
				String temp = array[i];
				array[i]=sorting(array[i], array[j]);
				if(array[i]!=temp)
				{
					array[j]=temp;
				}
			}
		} 
		
		for (int i = 0; i < array.length; i++) 
		{
			System.out.print(array[i]+" ");
		}
	}
}