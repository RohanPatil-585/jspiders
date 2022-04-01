package numbers;
import java.util.Scanner;
class  max
{
	static void findmax(int a, int b, int c)
	{
		if(a>b && a>c)
		{
			System.out.println("a is max ");
		}
		else if(b>c && b>a)
		{
				System.out.println("b is max ");
		}
		else
		{
				System.out.println("c is max");
		}
	}
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.print("enter value of x = ");
		int x = s1.nextInt();
		System.out.print("enter value of y = ");
		int y = s1.nextInt();
		System.out.print("enter value of z = ");
		int z = s1.nextInt();
		findmax(x,y,z);
	}
}
