package pack1;

public class DecimalToHexadecimal 
{
	public static void main(String[] args) 
	{
		int dec=255,reminder;
		String str = " ";
		while(dec>0)
		{
			reminder = dec%16;
			dec=dec/16;
			if(reminder>9 && reminder<16)
			{
				str = (char)(reminder+55)+str;
			}
			else
			{
				str=reminder+str;
			}
		}
		System.out.println("hexadecimal value is = "+str);
	}
}
