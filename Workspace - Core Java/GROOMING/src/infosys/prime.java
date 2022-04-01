package infosys;

public class prime 
{
	public static void main(String[] args) 
	{
		int number = 5;
		int flag = 0;
		for (int i = 2; i < number; i++)
		{
			if(number%i==0)
			{
				flag=1;
			}
		}
		if(flag==1)
		{
			System.out.println("given no is not prime....");
		}
		else
		{
			System.out.println("given no is prime...");
		}
	}
}