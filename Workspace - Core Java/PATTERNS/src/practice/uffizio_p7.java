package practice;

public class uffizio_p7 
{
	public static void main(String[] args)
	{
		int  n = 5;
		int m = 9;
		for (int i = 0; i < n; i++) 
		{
			for (int j = 0; j < m; j++) 
			{
				if(j==n-i-1 || j==n+i-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i = n-2; i >=0; i--) 
		{
			for (int j = 0; j < m; j++) 
			{
				if(j==n-i-1 || j==n+i-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = n; i >=0; i--) 
		{
			for (int j = n; j <= m; j++) 
			{
				if(i==0 && j==n-1 || i>0 && j>=n+i-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
