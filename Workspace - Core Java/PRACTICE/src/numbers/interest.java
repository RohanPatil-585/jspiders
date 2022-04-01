package numbers;

class interest 
{
	static void interest(double p, double t, double r)
	{
		double simple_interest=(p*t*r)/100;
		System.out.println("simple interest = "+simple_interest);
	}
	public static void main(String[] args) 
	{
		interest(5000,2,12);
	}
}
