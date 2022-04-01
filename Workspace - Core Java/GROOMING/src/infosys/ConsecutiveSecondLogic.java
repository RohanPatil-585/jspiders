package infosys;

public class ConsecutiveSecondLogic 
{
	public static void main(String[] args) 
	{
		String str = "aaabccddd";
		char[] ch = str.toCharArray();
		str = "";		
		
		for (int i = 0; i <ch.length; i++) 
		{
			for (int j = i+1; j < ch.length-1; j++) 
			{				
				if(ch[i]==ch[j])
				{
					ch[i]=' ';
					ch[j]=' ';
				}
			}
			if(ch[i]!=' ')
			{
				str = str + ch[i];
			}
		}
		System.out.println(str);
	}
}