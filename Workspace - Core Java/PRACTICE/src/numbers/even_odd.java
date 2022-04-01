package numbers;

class even_odd 
{
	static void evenodd(int num)
	{
			if(num%2==0)
			{
				System.out.println("number is EVEN");		
			}
			else
			{
				System.out.println("number is ODD");
			}
	}
	public static void main(String[] args) 
	{
		evenodd(10);
	}
}
