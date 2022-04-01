package numbers;

import java.util.Scanner;

public class specialNumbers 
{
		static int spe(int num)
		{
			Scanner s1 = new Scanner(System.in);
		//	System.out.print("enter the number = ");
		//	int num = s1.nextInt();
			int sum=0, mul=1;
			int res=0;
			while(num>0)
			{
				int temp = num%10;
				sum = sum+temp;
				mul=mul*temp;
				num = num/10;
				res = sum+mul;
			}
			return res;

		}
		public static void main(String[] args) 
		{
			Scanner s1 = new Scanner(System.in);
			System.out.println("enter n value = ");
			int n = s1.nextInt();
			int p = spe(n);
			System.out.println("ans = "+p);
			if(p == n)
			{
					System.out.println("special no...");
			}
			else
			{
					System.out.println("none special...");
			}
		}
	}
