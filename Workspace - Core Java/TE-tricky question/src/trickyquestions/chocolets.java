package trickyquestions;
import java.util.Scanner;
public class chocolets 
{
	public int chocolates(int ramesh, int suresh)
	{
		int sum=0;
		if(ramesh == suresh)
		{
			ramesh=ramesh*2;
			suresh=suresh*2;
			sum=ramesh+suresh;
		}
		else
		{
			sum=ramesh+suresh;
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter ramesh's chocolets = ");
		int rc = s1.nextInt();
		System.out.println("enter suresh's chocolets = ");
		int sc = s1.nextInt();
		chocolets ch = new chocolets();
		int sum = ch.chocolates(rc, sc);
		System.out.println("total chocolates = "+sum);
	}
}
