package palindrom_prime;
import java.util.Scanner;
public class palindrom_prime
{
	//int ans=0, rem=0, count=0;
	
	public void palindrom(int start, int end)
	{
		int ans=0, rem=0, count=0,temp=0;
		for (int i = start; i <end ; i++) 
		{
			int number=i;
			int num=i;
			ans=0;
			while(number>0)
			{
				rem=number%10;
				ans=ans*10+rem;
				number=number/10;
				if(i==ans)
				{
					temp=0;
					for (int j = 2; j < num; j++) 
					{
						if(num%j==0)
						{
							temp=1;
						}
					}
					if(temp==1)
					{
						System.out.println(+i+"number is palindrom but not prime...");
					}
					else
					{
						System.out.println(+i+"number is palindrom and prime...");
					}
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter start number = ");
		int start=s1.nextInt();
		System.out.println("enter end number = ");
		int end=s1.nextInt();
		palindrom_prime p1 = new palindrom_prime();
		p1.palindrom(start, end);
		s1.close();
	}
}
