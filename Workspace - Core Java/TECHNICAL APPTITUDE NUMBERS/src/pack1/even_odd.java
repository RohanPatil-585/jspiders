package pack1;

public class even_odd 
{
	public static void main(String[] args) 
	{
		int start = 100, stop = 200;
		int oddcount = 0, evencount = 0;
		
		for(int i=start; i<stop; i++)
		{
			if(i%2==0)
			{
				evencount+=1;
			}
			else
			{
				oddcount++;
			}
		}
		System.out.println("even numbers = "+evencount);
		System.out.println("odd numbers = "+oddcount);
	}
}
