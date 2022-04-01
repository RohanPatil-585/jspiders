package package1;

import java.util.Scanner;

public class Evenodd357 
{
	public static void main(String[] args) 
	{		
		Scanner s1 = new Scanner(System.in);
		int Startvalue=s1.nextInt();
		int lastvalue=s1.nextInt();
		int count=0;
		for(int i=Startvalue;i<=lastvalue;i++)
		{
		
			if(i%3==0 || i%5==0 || i%7==0)
			{
				count++;
				System.out.println("Count is="+count);
			}
		}
		s1.close();
	}
}