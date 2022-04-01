package listexamples2;

public class student 
{
	int rollno;
	String name;
	double marks;
	
	public student(int rollno, String name, double marks) 
	{
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	
	public String toString()
	{
		return "student[rollno ="+rollno+",name ="+name+",marks ="+marks+"]";
	}
}
