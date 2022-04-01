package infosys;

public class firstMatchLastUnmatch 
{
	public static void main(String[] args) 
	{
		String str = "java isjava";
		char[] ch = str.toCharArray();
		int count=0;
		for (int i = 0; i < ch.length; i++) 
		{
			for (int j = i+1; j < ch.length; j++)
			{
				if(ch[i]==ch[j])
				{
					if(count == 0 && ch[i]!=' ')
					{						
						System.out.print(ch[i]);
						count++;
						break;
					}
				}
			}
		}
		count=0;							// 0 1 2 3 4 5 6 7 8 9 10     index
		for (int i = 0; i < ch.length; i++) // j a v a   i s j a v  a
		{
			int flag=0;
		
			for (int j = i+1; j < ch.length-1; j++) 
			{
				if(ch[i]==ch[j])
				{
					flag = 1;
					break;
				}
			}
					for (int k = i-1; k >=0; k--) 
					{
						if(ch[i]==ch[k])
						{
							flag = 1;
							break;
						}
					}
					
					if(flag == 0)
					{
						if(count == 0 && ch[i]!=' ')
						{							
							System.out.println(ch[i]);
							count++;
						}
					}
		}
	}
}