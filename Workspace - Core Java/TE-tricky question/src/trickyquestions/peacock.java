package trickyquestions;

import java.util.Scanner;

public class peacock 
{
	public boolean hatch(int time)
	{
	//	boolean hatch = false;
//		if(time<7 || time>20)
//		{
//			hatch = true;
//		}
	//	return hatch;
		return ((time<7 || time>20) && time<23);
	}
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		peacock p1 = new peacock();
		System.out.println("Enter the time");
		int t1=s1.nextInt();
		boolean t2=p1.hatch(t1);
		if (t2==true) 
		{
			System.out.println("Peacock dancing");	
		}
		else
		{
			System.out.println("Peacock not dancing");
		}
	}
}