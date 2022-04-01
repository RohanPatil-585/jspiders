package infosys;

public class RemoveDouplicateWord 
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
	
	public static boolean equals(String str1 , String str2)
	{
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		boolean b = true;
		if(ch1.length == ch2.length)
		{
			for (int i = 0; i < ch2.length; i++) 
			{		
				
					if(ch1[i]!=ch2[i])
					{
						b=false;
						break;
					}
			}
		}
		else
		{
			b=false;
		}
		return b;
	}
	
	public static void main(String[] args) 
	{
		//String str = "rohan dipak ronak divyesh rohan jay nitesh";
		String str = "rohan patil rohan dipak ronak";
		String[] splitarray = split(str);
		for (int i = 0; i <= splitarray.length; i++) 
		{
			for (int j = i+1; j < splitarray.length; j++) 
			{
				if(equals(splitarray[i], splitarray[j]))
				{
					splitarray[j]="";
				}
			}
		}
		
		for (int i = 0; i < splitarray.length; i++)
		{
			System.out.println(splitarray[i]);
		}
	}
}