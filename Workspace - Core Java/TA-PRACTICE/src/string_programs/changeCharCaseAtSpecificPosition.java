package string_programs;

public class changeCharCaseAtSpecificPosition
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
	
	public static String changecase(String str)
	{
		char[] ch = str.toCharArray();
		String temp = "";
		
		for (int i = 0; i < ch.length; i++) 
		{
			if(i==str.length()/2)
			{
				if(ch[i]>='a' && ch[i]<='z')
				{					
					temp = temp + (char)(ch[i]-32);
				}
				else if(ch[i]>='A' && ch[i]<='Z')
				{					
					temp = temp + (char)(ch[i]+32);
				}
			}
			else
			{
				temp = temp + ch[i];
			}
		}
		return temp;
	}
	public static void main(String[] args) 
	{
		String str = "rohan dipak ronak jay divyesh nitesh sadab";
		String[] splitstr = split(str);
		String result="";
		for (int i = 0; i < splitstr.length; i++) 
		{
			String changedstr = changecase(splitstr[i]);
			result = result + changedstr+" ";
		}
		
		System.out.println(result);
	}
}