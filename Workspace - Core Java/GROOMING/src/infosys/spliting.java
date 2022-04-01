package infosys;

public class spliting 
{
	public static String[] split(String str)
	{
		char[] ch = str.toCharArray();
		str = "";
		int k=0;
		int count = 1;
		
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
				str = str+ch[i];
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
	
	public static void main(String[] args) 
	{
		String str = "rohan shivaji bhai patil";
		String[] splitarray = split(str);
		
		for (int i = 0; i < splitarray.length; i++) 
		{
			System.out.println(splitarray[i]);
		}
	}
}
