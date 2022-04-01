package pack1;

public class demo3 
{
	public static void main(String[] args) 
	{
		String str = "rohan_ashis_dipak_ronak_jay";
		
		System.out.println("given string is ="+str);
		String[] strarr = str.split("_");
		
		for(int i=0; i<strarr.length; i++)
		{
			System.out.println(strarr[i]);
		}
		
		for(int i=0; i<strarr.length; i++)
		{
			System.out.println(strarr[i]+"-->"+strarr[i].length());
		}
	}
}
