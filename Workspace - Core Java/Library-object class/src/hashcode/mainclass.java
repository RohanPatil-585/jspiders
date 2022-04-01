package hashcode;

public class mainclass
{
	public static void main(String[] args) 
	{
		student st1 = new student("rohan", 007);
		student st2 = new student("ronak", 006);
		
		int n1 = st1.hashCode();
		System.out.println("n1 = "+n1);
		System.out.println("st1 ="+st1);
		
		System.out.println();
		
		int n2 = st2.hashCode();
		System.out.println("n2"+n2);
		System.out.println("st2"+st2);
		
	}
}
