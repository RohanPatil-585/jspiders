package infosys;

public class Pattern 
{
	public static void main(String[] args) 
	{
		int n = 5;
		int m = n+n-1;
		
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
	}
}
