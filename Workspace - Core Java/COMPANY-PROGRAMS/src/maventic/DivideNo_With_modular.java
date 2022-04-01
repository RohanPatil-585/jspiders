package maventic;

public class DivideNo_With_modular 
{ 
	public static void main(String[] args) 
	{
		int num=12;
		int div=3;
		int res=0;
		
		while(num>=div)
		{
			res++;
			num=num-div;
			
		}
		System.out.println(" Result is "+res);
		System.out.println(" Now Numer is "+num);
		
	}

}
