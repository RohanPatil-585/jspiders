package pack1;
import java.util.Scanner;
public class mainperson 
{
	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("enter name = ");
		String name = s1.next();
		
		System.out.println("enter age = ");
		int age = s1.nextInt();
		
		System.out.println("enter rollno = ");
		int rollno = s1.nextInt();
		
		System.out.println("enter marks = ");
		int marks = s1.nextInt();
		
		student st1 = new student(name, age, rollno, marks);
		
		
	}
}
