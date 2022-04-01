package maventic;

public class DouplicateCharacters 
{
	public static void main(String[] args) 
	{
		String str1 = "programing";
		String str2 = "computer";
		String result = "";
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		for (int i = 0; i < ch1.length; i++) 
		{		
			for (int j = 0; j < ch2.length; j++) 
			{				
				if(ch1[i]==ch2[j])
				{
					ch1[i] = ' ';
					ch2[j] = ' ';
				}
			}
		}
		for (int j2 = 0; j2 < ch2.length; j2++)
		{
			if(ch2[j2] != ' ')
			{
				result = result + ch2[j2];
			}
		}
		System.out.println("result = "+result);
//		String remstr1 = removeSpace(str1);
//		String remstr2 = removeSpace(str2);
//		System.out.println("string 1 = "+remstr1);
//		System.out.println("string 2 = "+remstr2);
	}
}