package editplus_patterns;
import java.util.Scanner;
class pattern16
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.print("enter the value = ");
		int num = s1.nextInt();
//	    int col=num+num-1;
		int i,j;
		for(i=1;i<=num;i++)
		{
			for(j=num;j>=1;j--)
			{
				//if(i==1 && j==num || j>=num-i+1)
				if(j<=i)
				{
					System.out.print(i-j+1);
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
