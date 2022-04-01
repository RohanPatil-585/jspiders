package string_programs;

public class ParseInteger 
{
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
	public static void main(String[] args) 
	{
		String str = "123456";		
		int  intstr = parseInt(str);
		System.out.print(intstr);
		
	}
}