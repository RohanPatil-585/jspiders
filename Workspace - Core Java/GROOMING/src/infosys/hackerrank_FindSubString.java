package infosys;

public class hackerrank_FindSubString 
{
	public static void hackersubstr(String str1,String str2)
	{
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		int i=0;
		int j = 0;
		for (int k = 0; k < ch1.length; k++)
		{
			while(i<ch1.length && j<ch2.length)
			{
				if(ch1[i]==ch2[j])
				{
					i++;
					j++;
				}
				else
				{
					i++;
				}
			}
		}
		if(j==ch2.length)
		{
			System.out.println("String matching...");
		}
		else
		{
			System.out.println("string not matching...");
		}
	}
	public static void main(String[] args) 
	{
		String str1 = "hereiamstackerrank";
		String str2 = "hackerrank";
		hackersubstr(str1, str2);
	}
}