package editplus_patterns;
import java.util.Scanner;
class pattern14 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.print("enter the value of row = ");
		int n=s1.nextInt();
		//int m=n+n-1;
		int i,j;
		//for(i=1;i<=n;i++)
		for(i=n;i>=1;i--)
		{
				//for(j=1;j<=n;j++)
				for(j=1;j<=n;j++)
				{
					//if(i==1 && j==5 || i==2 && j>3 || i==3 && j>2 || i==4 && j>1 || i==5)
					//if(i==1 && j==n || i>1 && j>=n-i+1)
					if(i>=j)
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
