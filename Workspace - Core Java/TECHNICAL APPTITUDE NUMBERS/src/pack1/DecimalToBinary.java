package pack1;

public class DecimalToBinary 
{
	public static void main(String[] args) 
	{
		int bin=0,dec=25,reminder;
		String st = " ";
		while(dec>0)
		{
			reminder=dec%2;
			dec=dec/2;
			st=st+reminder;
		}
		System.out.println("binary ="+st);
	}
}
