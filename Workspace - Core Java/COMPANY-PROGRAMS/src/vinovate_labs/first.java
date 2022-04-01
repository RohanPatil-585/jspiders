package vinovate_labs;

public class first 
{
	public String removechar(String str)
	{
		char[] ch = str.toCharArray();
		str = "";
		for (int i = 0; i < ch.length; i++) 
		{					
			for (int j = 0; j < ch.length-1; j++) 
			{				
				if(ch[j] == ch[j+1])
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
		first f1 = new first();
		String result = f1.removechar("aaabccddd");
		System.out.println("output = "+result);
		System.out.println();
		String mainresult = f1.removechar(result);
		System.out.println("output = "+mainresult);
	}
}