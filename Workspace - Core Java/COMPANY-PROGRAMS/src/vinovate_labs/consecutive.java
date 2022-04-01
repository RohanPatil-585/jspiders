package vinovate_labs;

public class consecutive 
{
	public static void main(String[] args) 
	{
		String str = "aabcccddda";
		
		char[] ch = str.toCharArray();
		System.out.println("length of character array = "+ch.length);
		str = "";
		int count = 1;
		for (int i = 0; i < ch.length; i++) 
		{
			if(i<ch.length-1)
			{
				int j=ch[i];
				while(j==ch[i+1])
				{
					count++;
					if(i==ch.length && ch[i]==ch[i+1])
					{
						break;
					}
					i++;
				}
				System.out.println(ch[i]+" "+count);
				count=1;
			}
			else if(i==ch.length-1 && ch[i]!=ch[i-1])
			{
				System.out.println(ch[i]+" "+count);
			}
		}
	}
}
