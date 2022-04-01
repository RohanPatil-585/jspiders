package editplus_patterns;
import java.util.Scanner;
class pattern10
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.print("enter the value = ");
		int num = s1.nextInt();
		int col=num+num-1;
		int i,j;
		for(i=1;i<=num;i++)
		{
			for(j=num;j>=i;j--)
			{
					System.out.print(i);
			}
			System.out.println();
		}
	}
}
