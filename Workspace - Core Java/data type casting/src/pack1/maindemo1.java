package pack1;

public class maindemo1 
{
	public static void main(String[] args) 
	{
		System.out.println("main method started");
		
		int x1 = 12;
		double y1 = 34.12;
		
		int x2 = (int)y1;
		double y2 = (double)x1;
		System.out.println("x2 value is = "+x2);
		System.out.println("y2 value is = "+y2);
		System.out.println("main method ended");
	}
}
