package infosys;

public class hacerrankcmnchar
{
	public static void merge(String s1,String s2,String s3)	 //abcdde  baccd  eeabg
	{								
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		String temp="";
		for (int i = 0; i < ch1.length; i++) 
		{
			for (int j = 0; j < ch2.length; j++) 
			{	
				if(ch1[i]==ch2[j])
				{
					temp=temp+ch2[j];
				}
			}
		}
		System.out.println(temp);
	}
	public static String rmv(String str)
	{
		char[] ch1=str.toCharArray();
		str="";
		for (int i = 0; i < ch1.length; i++) 
		{
			for (int j = i+1; j < ch1.length; j++) 
			{
				if(ch1[i]==ch1[j])
				{
					ch1[j]=' ';
				}
				
			}
			str=str+ch1[i];
		}
		return str;
	}
	public static void main(String[] args) {
		String s1="abcdde";
		String s2="baccd";
		String s3="eeabg";
		merge(s1,s2,s3);
		//System.out.println(s1);
	}

}
