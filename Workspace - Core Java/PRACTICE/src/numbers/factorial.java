package numbers;
import java.util.Scanner;
class factorial
{
	static int fact(int f)
	{
		int fac=1;
		for(int i=1;i<=f;i++)
		{
			fac=fac*i;
		}
		return fac;
	}
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.print("enter the value of x = ");
		int x = s1.nextInt();
		int z=fact(x);
		System.out.println("factorial = "+z);
	}
}