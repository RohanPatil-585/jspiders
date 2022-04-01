package infosys;

public class ConsecutiveFirstLogic 
{
	public static String removechar(String str)
	{
		char[] ch = str.toCharArray();
		str = "";
		for (int i = 0; i < ch.length; i++) 
		{
			for (int j = 0; j < ch.length-1; j++) 
			{
				if(ch[j]==ch[j+1])
				{
					ch[j]=' ';
					ch[j+1]=' ';
				}
			}
			if(ch[i]!=' ')
			{
				str = str + ch[i];
			}
		}
		return str;
	}
	public static void main(String[] args) 
	{
		String str = "aaabccddd";
		String remstr = removechar(str);
		System.out.println(remstr);
	}
}