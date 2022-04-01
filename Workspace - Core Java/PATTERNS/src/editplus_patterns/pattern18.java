package editplus_patterns;
import java.util.Scanner;
class pattern18 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		int i,j;
		System.out.print("enter the value of n = ");
		int n = s1.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(j>=i)
				{
						System.out.print(j-i+1);
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
