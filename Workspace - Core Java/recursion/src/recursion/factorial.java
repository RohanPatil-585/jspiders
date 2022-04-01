package recursion;

public class factorial 
{
	static int fact=1,num=5;
	public static int fact(int num)
	{
		fact = fact*(num--);
		
			if(num>0)
			{
				fact(num);
			}
		return fact;
	}
	public static void main(String[] args) 
	{
		int result = fact(num);
		System.out.println(fact);
	}
}