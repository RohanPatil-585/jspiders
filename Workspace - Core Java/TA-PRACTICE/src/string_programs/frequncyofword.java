package string_programs;

public class frequncyofword 
{
	public static String[] split(String str)
	{
		int cn=0;
		char[] ch=str.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]==' ' && ch[i-1]!=' ')
				cn++;
		}
		String[] st=new String[cn+1];
		int k=0;
		String temp="";
		for (int i = 0; i < ch.length; i++)
			if(ch[i]!=' ')
				temp=temp+ch[i];
			else if(ch[i]==' ' && ch[i-1]!=' ')
			{
				st[k++]=temp;
				temp="";
			}
		st[k++]=temp;
		return st;
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
	public static void freword(String str)
	{
		
		String[] st=split(str);
		for (int i = 0; i < st.length; i++)
		{
			int cn=1,fl=0;
			for (int j =i+1; j<st.length; j++)
			{
				if(eqals(st[i],st[j]))
					cn++;
			}
			for (int j = i-1; j >=0; j--)
			{
				if(eqals(st[i],st[j]))
					fl=1;
			}
				if(fl==0)
				{
					System.out.println(st[i]+" "+cn);
				}
		}
	}
	public static void main(String[] args) 
	{
		String st="dipak rohan dipak patil dipak rohan dipak";
		freword(st);
	}
}