package trickyquestions;

import java.util.Scanner;

public class bulls 
{
	public boolean angry(boolean h_angry, boolean b_angry)
	{
		boolean angry=false;
//		if((h_angry == angry && b_angry == angry) || (h_angry != angry && b_angry != angry) )
//		{
//			angry=true;
//		}
//		else
//		{
//			
//		}
//		return angry;
		return((h_angry == angry && b_angry == angry) || (h_angry != angry && b_angry != angry));
	}
	public static void main(String[] args) 
	{
		bulls b1 = new bulls();
		Scanner s1 = new Scanner(System.in);
		System.out.println("is huddi angry??? ");
		boolean haddi = s1.nextBoolean();
		System.out.println("is buddy angry??? ");
		boolean buddy = s1.nextBoolean();
		boolean ans = b1.angry(haddi, buddy);
		if(ans == true)
		{
			System.out.println("we are in trouble...");
		}
		else
		{
			System.out.println("we are not in trouble...");
		}
	}
}
