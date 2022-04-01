package editplus_patterns;
import java.util.Scanner;
class pattern19 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		int i,j;
		System.out.print("enter the value n = ");
		int n = s1.nextInt();
		for(i=n;i>=1;i--)
		{
			for(j=n;j>=1;j--)
			{
				if(j<=i)
				{
						System.out.print(i);
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
