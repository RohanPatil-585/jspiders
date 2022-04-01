package practice;

public class uffizio_p5 
{
	public static void main(String[] args) 
	{
		int n = 5;
		int m = n+n-1;
//		int a = 0;
//		int b = 1;
		char a = 97;
		char b = 98;
		char c = 97;
		for (int i = 0; i <= n; i++) 
		{
			for (int j = 0; j <= m; j++) 
			{
				if(j>=n-i+1 && j<=n+i-1)
				{
					//System.out.print(c++);
					if(j%2==0)
					{
						System.out.print(a);
					}
					else
					{
						System.out.print("c");
					}
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
