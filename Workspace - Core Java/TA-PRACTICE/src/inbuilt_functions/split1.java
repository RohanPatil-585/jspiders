package inbuilt_functions;
import java.util.Scanner;
public class split1 
{
	static Scanner s1 = new Scanner(System.in);
	public String[] splitfunction(String santance)
	{
		int count = 1;
		String emptystring = "";
		int k = 0;
		String st[];
		
		char ch[] = santance.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i] == ' ')
			{
				count++;
			}
		}
		st = new String[count];
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i] == ' ')
			{
				st[k] = emptystring;
				k++;
				emptystring = "";
			}
			else
			{
				emptystring = emptystring + ch[i];
			}
			if(i == ch.length-1)
			{
				st[k] = emptystring;
			}
		}
		return st;
	}
	public static void main(String[] args)
	{
		split1 spl1 = new split1();
		System.out.println("enter the string... ");
		String str1 = s1.nextLine();
		String[] ansString = spl1.splitfunction(str1);
		for (int i = 0; i < ansString.length; i++) 
		{
			System.out.println(ansString[i]);
		}
	}
}