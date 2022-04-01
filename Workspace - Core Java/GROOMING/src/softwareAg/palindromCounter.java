package softwareAg;

public class palindromCounter 
{
	int count = 0;
	public static String reverse(String str)
	{
		char[] ch = str.toCharArray();
		str ="";
		for (int i = ch.length-1; i >= 0; i--) 
		{
			str = str + ch[i];
		}
		return str;
	}
	
	public boolean palindrom(String str)
	{
		String reversedstring =reverse(str);
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
	
	public static String[] split(String str)
	{
		char[] ch = str.toCharArray();
		str ="";
		int count = 1;
		int k = 0;
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i] == ' ')
			{
				count++;
			}
		}
		
		String[] array = new String[count];
		
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i] == ' ')
			{
				array[k++] = str;
				str ="";
			}
			else
			{
				str = str + ch[i];
			}
			if(i== ch.length-1)
			{
				array[k] = str;
			}
		}
		return array;
	}
	
	public boolean counter(String str)
	{
		String[] array = split(str);
		for (int i = 0; i < array.length; i++) 
		{
			System.out.println(array[i]);
		}
		boolean b = false;
		for (int i = 0; i < array.length; i++) 
		{
			String reversedstring =reverse(array[i]);
			char[] ch1 = reversedstring.toCharArray();
			char[] ch = array[i].toCharArray();
			
			for (int j = 0; j < ch.length; j++) 
			{
					if(ch[j] != ch1[j])
					{
						b = true;
						break;
					}
					else
					{
						if(j==ch.length-1)
						{
							count++;
							System.out.println(count);
						}
					}
			}
		}
		return b;
	}
	public static void main(String[] args) 
	{
		palindromCounter p1 = new palindromCounter();
		String str = "madam at saras";
		String resultstring = reverse(str);
		System.out.println("reversed string = "+resultstring);
		
		boolean palicount  = p1.counter(str);
		if(palicount == false)
		{
			System.out.println("given string is palindrom...");
		
		}
		else
		{
			System.out.println("given string is not palindrom");
		}		
	}
}