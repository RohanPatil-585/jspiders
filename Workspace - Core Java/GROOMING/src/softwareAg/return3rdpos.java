package softwareAg;

public class return3rdpos 
{
	public static void backpos(String st1,String st2)
	{
		char[] ch2=st2.toCharArray();
		int cn=0,pos=0,fl=0;
		boolean b=false;
		String[] str=split.split(st1);
		for (int i = 0; i < str.length; i++) 
		{
			char[] ch1=str[i].toCharArray();
			if(eqals(str[i],st2))
			{
				cn++;
				if(cn==3)
				pos=i;	
			}
		}
		if(pos>0)
			System.out.println("3rd position is"+(pos+1));
		else
			System.out.println("no availble 3rd occurance");
	}
	public static boolean eqals(String st1,String st2)
	{
		char[] ch1=st1.toCharArray();
		char[] ch2=st2.toCharArray();
		if(ch1.length==ch2.length)
		{
		for (int i = 0; i < ch2.length; i++) 
		{
				if(ch1[i]!=ch2[i])
				{
					return false;
				}
		}
		}
		else
		{
			return false;
		}
			return true;
	}
	public static void main(String[] args) 
	{
		String s1="dipak";
		String s="dipak dipak rohan rohan dipak";
		backpos(s,s1);
	}
}