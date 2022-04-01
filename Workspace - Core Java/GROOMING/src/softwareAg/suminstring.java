package softwareAg;

import java.text.ParseException;

public class suminstring 
{
	public static int sumstring(int str)
	{
		int sum=0;
		int res=0;
		while(str>0)
		{
			res=str%10;
			sum=sum+res;
			str=str/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		String st="1234";
		int i=Integer.parseInt(st);
		System.out.println("i="+i); 
		System.out.println(sumstring(i));
		//System.out.println('1'+0);
	}

}
