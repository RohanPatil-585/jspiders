package withOverriding;

public class mainclass2 
{
	public static void main(String[] args) 
	{
		student st1 = new student("rohan",007);
		String s1 = st1.toString();
		System.out.println(s1);
		
		System.out.println();
		
		st1.toString();
		System.out.println(st1);
		
		System.out.println();
		
		student st2 = new student("ronak",006);
		String s2 = st2.toString();
		System.out.println(st2);
		
		System.out.println();
		System.out.println(s2);
		st2.toString();
	}
}
