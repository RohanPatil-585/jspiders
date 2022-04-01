package string_programs;

public class Substr 
{
	public static void main(String[] args) 
	{
		String str = "iamrohanpatil";
		String substr = "roh";
		char[] ch1 = str.toCharArray();
		char[] ch2 = substr.toCharArray();
		
		int k = 0;
		int j = 0;
		for (int i = 0; i < ch1.length; i++) 
		{
			while(i<ch1.length && i<ch2.length)
			{				
				if(ch1[j]==ch2[k])
				{
					k++;
					i++;
				}
			}
		}
		if(k==3)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
