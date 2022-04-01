package string_programs;

public class ChangeCaseAtSpacificPosition 
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
	
	public static String changeCase(String str)
	{
		char[] ch = str.toCharArray();
		str = "";
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]>='a' && ch[i]<='z')
			{
				str = str + (char)(ch[i]-32);
			}
			else if(ch[i]>='A' && ch[i]<='Z')
			{
				str = str + (char)(ch[i]+32);
			}
		}
		return str;
	}

	public static void main(String[] args) 
	{
		String str = "rohan dipak ronak jay divyesh nitesh sadab";
		String[] array = split(str);
		char[] ch = str.toCharArray();
		str = "";
		
		for (int i = 0; i < array.length; i++) 
		{
			if(i == array.length/2)
			{
				String chanstr = changeCase(array[i]);
				str = str + chanstr+" ";
				
			}
			else
			{
				str = str + array[i]+" ";
			}
		} 
		
		System.out.println(str);		
	}
}