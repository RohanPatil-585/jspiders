package recursion;

public class OneToTen 
{
	public static void print(int number)
	{
		int n =10;
		System.out.println(number++);
		if(number<=n)
		{
			print(number);
		}
	}
	public static void main(String[] args) 
	{
		print(1);
	}
}
