package pack1;
import java.util.Scanner;
public class assignment1 
{
	public static void main(String[] args) 
	{
		int evencount=0;
		int evencount_3 = 0;
		int evencount_5 = 0;
		int evencount_7 = 0;
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("enter starting number =");
		int sno = s1.nextInt();
		
		System.out.println("enter ending number =");
		int eno = s1.nextInt();
		
		for(int i=sno; i<eno; i++)
		{
			if(i%2==0)
			{
			//	System.out.println("even nos :"+i);
				int num=i;
			//	evencount++;
				if(num%3==0)
				{
					evencount_3++;
				}
				else if(num%5==0)
				{
					evencount_5++;
				}
				else if(num%7==0)
				{
					evencount_7++;
				}
			}
		}
	//	System.out.println("total even nos ="+evencount);
		System.out.println("even no that are divisible by 3 ="+evencount_3);
		System.out.println("even no that are divisible by 5 ="+evencount_5);
		System.out.println("even no that are divisible by 7 ="+evencount_7);
	}
}
