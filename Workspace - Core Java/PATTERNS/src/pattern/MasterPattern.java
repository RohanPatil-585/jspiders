package pattern;

public class MasterPattern 
{
	public static void main(String[] args)
	{
		
		int n = 5;
		int m = n+n-1;
		System.out.println("n = "+n);
		System.out.println("m = "+m);
		
		System.out.println("============ 5 * 5 box ===========");
		
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("============ upside left triangle ===========");
		
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j <= i; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("============ upside right triangle ===========");
		
		for (int i = 0; i < 5; i++)
		{
			for (int j = 5; j >=0; j--) 
			{
				if(j<=i)
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
		
		System.out.println("============ downside left triangle ===========");
		
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 5; j >=1; j--) 
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
		
		System.out.println();
		
		System.out.println("============ downside right triangle ===========");       
		
		for (int i = 0; i < 5; i++)
		{
			for (int j = 5; j >=0; j--) 
			{
				if(j<=i)
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
		
		System.out.println("============ upside triangle ===========");
		
		for (int i = 0; i <= n; i++)
		{
			for (int j = 0; j <= m; j++) 
			{
				if(j>=n-i+1 && j<=n+i-1)
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
		for (int i = n-1; i >=0; i--)
		{
			for (int j = 0; j<m; j++) 
			{
				if(j>=n-i+1 && j<=n+i-1)
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