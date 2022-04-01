package pack1;

public class main1
{
	public static void main(String[] args) 
	{
		System.out.println("main method started...");
		demo1 d1 = new demo1(15,2.5);
		System.out.println("p value is = "+d1.p);
		System.out.println("q value is = "+d1.q);
		
		demo1 d2 = new demo1(25,3.5);
		System.out.println("p value is = "+d2.p);
		System.out.println("q value is = "+d2.q);
		System.out.println("main method ended...");
	}
}
