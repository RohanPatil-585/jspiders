package editplus_patterns;
import java.util.Scanner;
class pattern4
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.print("enter the value = ");
		int num = s1.nextInt();
		int col=num+num-1;
		int i,j;
		for(i=num;i>=1;i--)
		{
			for(j=num;j>=1;j--)
			{
					System.out.print(i);
			}
			System.out.println();
		}
	}
}
