package string;

public class AllInOne 
{
	public static String revrse(String str)
	{
		char[] ch = str.toCharArray();
		str="";
		for (int i = ch.length-1; i>=0; i--)
		{
			str = str + ch[i];
		}
		return str;
	}
	
	public static String removeSpace(String str)
	{
		char[] ch = str.toCharArray();
		str = "";
		for (int i = 0; i < ch.length; i++)
		{
			if(ch[i]!=' ')
			{
				str = str + ch[i];
			}
		}
		return str;
	}
	
	public static String[] split(String str)
	{
		char[] ch = str.toCharArray();
		int count = 1;
		int k = 0;
		str = "";
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
				str="";
			}
			if(i==ch.length-1)
			{
				array[k++]=str;
			}
		}
		return array;
	}
	public static void main(String[] args)
	{
		String str = "rohan shivaji patil";
		String result = revrse(str);
		System.out.println(result);
		System.out.println();
		System.out.println("removed space================================");
		String removedspacestr = removeSpace(result);
		System.out.println(removedspacestr);
		System.out.println();
		System.out.println("split========================================");
		String split[] = split(str);
		for (int i = 0; i < split.length; i++) 
		{
			System.out.println(split[i]);
		}
	}
}