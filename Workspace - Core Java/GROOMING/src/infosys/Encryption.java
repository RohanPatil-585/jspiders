package infosys;

public class Encryption 
{
	public static void encrypt(String str, int num)
	{
		char[] ch = str.toCharArray();
		str = "";
		for (int i = 0; i < ch.length; i++) 
		{
			for (int j = 0; j < num; j++) 
			{			
				if(ch[i]>='a' && ch[i]<='z')
				{
						ch[i]++;
						if(ch[i]>'z')
						{
							ch[i]='a';
						}
				}
				else if(ch[i]>='0' && ch[i]<='9')
				{
					
					ch[i]++;
					if(ch[i]>'9')
					{
						ch[i]='0';
					}
				}
				else
				{
					ch[i]++;
					if(ch[i]>'/')
					{
						ch[i]='.';
					}
				}
			}
		}
		for (int i = 0; i < ch.length; i++) 
		{
			System.out.print(ch[i]+" ");
		}
	}
	
	public static void main(String[] args) 
	{
		String str = "rohan 619 #%$";
		String str1 = "rohan shivajij patil";
		System.out.println(str1);
		System.out.println();
		encrypt(str1, 2);
	}
}
