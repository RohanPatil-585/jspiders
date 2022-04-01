package infosys;

public class CountEachChar 
{
	public static void main(String[] args) 
	{
		String str = "rohan ronak";
		char[] ch = str.toCharArray();
		str = "";
		int count = 1;
		int flag = 0;
		System.out.println("char"+"\t" +"occurance");
		for (int i = 0; i < ch.length; i++) 
		{
			for (int j = i+1; j < ch.length; j++) 
			{
				if(ch[i]==ch[j])
				{
					count++;
				}
			}
			
			if(ch[i]!=' ')
			{
				for (int j = i; j > 0 ; j--) 
				{
					if(ch[i]==ch[j-1])
					{						
						flag = 1;
					}
				}
				if(flag == 0)
				{
					System.out.println(ch[i] +"\t"+count);
				}
			}
			flag = 0;
			count = 1;
		}
	}

}