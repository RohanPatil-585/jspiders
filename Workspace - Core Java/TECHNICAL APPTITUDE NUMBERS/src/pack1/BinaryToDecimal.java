package pack1;

public class BinaryToDecimal 
{
	public static void main(String... args)
	{
		int bin=10101,count=0;
		String dec="";
		
		while(bin>0)
		{
			int r=bin%10;
			bin=bin/10;
			if(r!=0)
			{
				dec=dec+power(2,count);
			}
			count++;
		}
		System.out.println(dec);	
	}
		static int power(int n,int r)
		{
			int res=1;
			while(r>0)
			{
				res=res*n;
				r--;
			}
			return res;
		}
		
		//System.out.println("int value: "+b);	
}
