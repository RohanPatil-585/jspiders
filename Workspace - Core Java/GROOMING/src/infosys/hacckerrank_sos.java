package infosys;

public class hacckerrank_sos 
{
	public static void main(String[] args) 
	{
		//HACKERANK
		
		String str = "sosspssqssor";
//		String str = "sossor";
		//String str = "syssosspssrssee";
		char[] ch = str.toCharArray();
		str = "";
		int count=0;
		
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]!='s' && ch[i]!='o' && ch[i]!='S' && ch[i]!='O')
			{
				count++;
			}
		}
		System.out.println(count);
	}
}