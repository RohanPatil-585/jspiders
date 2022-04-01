package palindrom_prime;

import java.util.Scanner;
public class PalindromePrime 
{	
	public void findpaliprime(int start,int end)
	{
		int ans=0,rem=0, temp=0;
		for (int i = start; i < end; i++)
		{
			int number=i;
			int	num1=i;
			ans=0;
			while(number>0)
			{
				rem=number%10;
				ans=ans*10+rem;
				number=number/10;
				if(i==ans)
				{	temp=0;
					for(int j=2;j<num1;j++)
					{ 
						if(num1%j==0)
						{
							temp=1;
						}
					}
					if(temp==1)
					{
						//System.out.println(i+" Number palindrome but not prime");
					}
					else
					{
						System.out.println(i+" Number is prime and palindrome");
					}
				}
			}
		}
	}
	public static void main(String[] args) 
	{	
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Starting Range");
		int sr=s1.nextInt();
		System.out.println("Enter Ending Range");
		int er=s1.nextInt();
		PalindromePrime p1=new PalindromePrime();
		p1.findpaliprime(sr, er);
		s1.close();
	}
}