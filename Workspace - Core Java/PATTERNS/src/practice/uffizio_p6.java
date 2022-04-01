package practice;

public class uffizio_p6 
{
	public static void main(String[] args) 
	{
		int n = 5;
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
	}
}
