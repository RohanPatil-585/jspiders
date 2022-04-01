package pack1;

public class Decimal 
{
	public static void main(String[] args) 
	{
		int b=0,r,dec=10;
		String st = " ";
		System.out.println(st);
		while(dec>0)
		{
			r=dec%2;
			dec=dec/10;
			st=r+st;
		}
		System.out.println(st);
	}
}
