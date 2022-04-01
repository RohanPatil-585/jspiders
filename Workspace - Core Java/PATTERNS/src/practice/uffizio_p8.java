package practice;

public class uffizio_p8 
{
	public static void main(String[] args)
	{
		int n = 5;
		int m = n+n-1;
		System.out.println("=== upper left side ===");
		for (int i = 1; i <= n; i++) 
		{
			for (int j = 1; j <= i; j++) 
			{			
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("=== upper right side ===");
		
		for (int i = 0; i <= n; i++) 
		{
			for (int j = n; j >= 0; j--) 
			{
				if(j<i)
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
		
		System.out.println("=== lower left side ===");
		
		for (int i = 0; i < n; i++)
		{
			for (int j = n; j > i; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("=== lower right side ===");
		
		for (int i = 0; i < n; i++) 
		{
			for (int j = 0; j < n; j++) 
			{
				if(j>=i)
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
		
		System.out.println("===triangle===");
		
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < m; j++) 
			{
				if(j>=n-i-1 && j<=n+i-1)
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
		
		System.out.println("=== dowen side triangle ===");
		char b = 97;
		char c = 65;
		for (int i = n-1; i >= 0; i--) 
		{
			int a = 1;
			
			for (int j = 0; j < m; j++) 
			{
				if(j>=n-i-1 && j<=n+i-1)
				{
					System.out.print(c++);
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
