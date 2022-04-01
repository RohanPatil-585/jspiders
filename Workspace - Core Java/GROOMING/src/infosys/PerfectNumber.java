package infosys;

public class PerfectNumber 
{
	public static void main(String[] args) 
	{
		int number = 9;
		int sum = 0;
		int factors;
		int no = number;
		for (int i = 1; i < number; i++) 
		{
			if(number%i==0)
			{
				sum = sum + i;
				System.out.println("factors = "+i);
			}
		}
		if(sum == no)
		{
			System.out.println("no is perfect...");
		}
		else
		{
			System.out.println("no is not perfect...");
		}
	}
}
