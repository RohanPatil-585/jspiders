package package1;

import java.util.Scanner;

public class SpecialNumber //39 - is special number
{	
	int number;
	int rem=0,sum=0,mul=1,ans=0;
	boolean a1=false;
	boolean spec(int num)
	{
		number=num;
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			mul=mul*rem;
			num=num/10;
			 ans=sum+mul;
		}
		if(number==ans)
		{
			a1=true;
		}
		System.out.println("given number is = "+number);
		System.out.println("answer is = "+ans);
	
	return a1;
	}
	public static void main(String[] args) 
	{
		SpecialNumber spe=new SpecialNumber();
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Number");
		int n1=s1.nextInt();
		boolean p1=spe.spec(n1);
		if(p1==true)
		{
			System.out.println("Given Number is Special Number");
		}
		else
		{
			System.out.println("Given Number is not Special Number");
		}	
		s1.close();
	}
}