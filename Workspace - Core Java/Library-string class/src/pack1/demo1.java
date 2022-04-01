package pack1;

public class demo1 
{
	public static void main(String[] args) 
	{
		String s1 = new String("jspiders");
		String s2 = new String("jspiders");
		
		System.out.println(s1);
		System.out.println(s2);
		
		int n1 = s1.hashCode();
		int n2 = s2.hashCode();
		
		System.out.println(n1);
		System.out.println(n2);
		
		System.out.println(s1 == s2);
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1.equals(s2));
	}
}
