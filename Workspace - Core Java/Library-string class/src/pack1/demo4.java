package pack1;

public class demo4 
{
	public static void main(String[] args) 
	{
		String str = "rohan s patil";
		System.out.println("given string is = "+str);
		
		String[] strarr = str.split(" ");
		System.out.println("total words = "+strarr.length);
		
		for(int i=0; i < strarr.length; i++)
		{
			System.out.println(strarr[i]+"-->"+strarr[i].length());
		}
	}
}
