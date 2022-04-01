package withoutOverriding;

public class mainclass1 
{
	public static void main(String[] args) 
	{
		System.out.println("program started...");
		
		demo1 d1 = new demo1();
		String s1 = d1.toString();
		System.out.println(s1);
		
		System.out.println();
		d1.toString();
		System.out.println("d1.tostring"+d1);
		
		System.out.println();
		
		demo1 d2 = new demo1();
		String s2 = d2.toString();
		System.out.println(s2);
		
		System.out.println();
		d2.toString();
		System.out.println("d2.tostring"+d2);
		System.out.println("program ended...");
	}
}
