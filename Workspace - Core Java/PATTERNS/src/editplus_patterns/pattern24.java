package editplus_patterns;
import java.util.Scanner;
class pattern24
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		int i,j,k=1;
		System.out.print("enter the value of n = ");
		int n = s1.nextInt();
		int m=n+n-1;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=m;j++)
			{
				if((i==1 && j==n)||(i>1 && j>=n-i+1 && j<=n+i-1))
				{
					System.out.print(k);

				}
				else
				{
						System.out.print(" ");
				}
			}
			k=k+2;
			System.out.println();
		}
	}
}