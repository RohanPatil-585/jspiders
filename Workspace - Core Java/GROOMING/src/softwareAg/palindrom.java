package softwareAg;

public class palindrom 
{
	public static String reverse(String str)
	{
		char[] ch = str.toCharArray();
		str = "";
		for (int i = ch.length-1; i >= 0; i--) 
		{
			str = str + ch[i];
		}
		return str;
	}
	
	public boolean palindrom(String str)
	{
		String reversedstring = palindrom.reverse(str);
		char[] ch1 = reversedstring.toCharArray();
		char[] ch = str.toCharArray();
		boolean b = false;
		for (int i = 0; i < ch.length; i++) 
		{
			
				if(ch[i] != ch1[i])
				{
					b = true;
					break;
				}
		}
		return b;
	}
	
	public static void main(String[] args) 
	{
		palindrom p1 = new palindrom();
		String str = "dipak";
		String resultstring = p1.reverse(str);
		System.out.println(resultstring);
		
		System.out.println();
		boolean pali = p1.palindrom(str);
		if(pali == false)
		{
			System.out.println("given string is palindrom...");
		}
		else
		{
			System.out.println("given string is not palindrom");
		}
	}
}
