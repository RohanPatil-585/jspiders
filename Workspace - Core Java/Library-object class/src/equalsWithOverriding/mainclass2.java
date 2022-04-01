package equalsWithOverriding;

public class mainclass2 
{
	public static void main(String[] args) 
	{
		student st1 = new student("rohan", 007);
		student st2 = new student("ronak", 006);
		
		int n1 = st1.hashCode();
		System.out.println(n1);
		System.out.println(st1);
		
		System.out.println();

		int n2 = st2.hashCode();
		System.out.println(n2);
		System.out.println(st2);
		
		System.out.println(n1 == n2);// compairs hashcode of n1 object with hashcode of n2 object.
		
		System.out.println(st1.equals(st2)); // compares hashcode of st1 object with hashcode of st2 object.
	//	st1.equals(st2);   //this will again print student class
	}
}
