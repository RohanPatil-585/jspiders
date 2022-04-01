package student;
import java.util.Scanner;
public class student 
{
	private int id;
	private String name;
	private double marks;
	public student(int id, String name, double marks) 
	{
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
}

class mainstudent
{
	
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the size of the array = ");
		int size = s1.nextInt();
		student[] stu = new student[size];
		for(int i=0; i<stu.length; i++)
		{
			System.out.println("enter student id = ");
			int id = s1.nextInt();
			
			System.out.println("enter student name = ");
			String name = s1.next();
			
			System.out.println("enter student marks = ");
			double marks = s1.nextDouble();
			
			stu[i]=new student(id,name,marks);
		}
		
		System.out.println();
		
		System.out.println("displaying student record......");
		
		System.out.println();
		
		for (int i = 0; i < stu.length; i++) 
		{
			System.out.println(stu[i].getId()+"\t"+stu[i].getName()+"\t"+stu[i].getMarks());
		}
	}
}